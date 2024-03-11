/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2019 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.rs;

import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.openosrs.client.OpenOSRS;
import java.applet.Applet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.function.Supplier;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import javax.swing.SwingUtilities;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.RuneLite;
import net.runelite.client.RuntimeConfig;
import net.runelite.client.RuntimeConfigLoader;
import static net.runelite.client.rs.ClientUpdateCheckMode.AUTO;
import static net.runelite.client.rs.ClientUpdateCheckMode.NONE;
import static net.runelite.client.rs.ClientUpdateCheckMode.VANILLA;
import net.runelite.client.ui.FatalErrorDialog;
import net.runelite.client.ui.SplashScreen;
import okhttp3.OkHttpClient;

@Slf4j
@SuppressWarnings({"deprecation", "removal"})
public class ClientLoader implements Supplier<Applet>
{
	private static final String INJECTED_CLIENT_NAME = "/injected-client.oprs";
	private static File LOCK_FILE = new File(RuneLite.CACHE_DIR, "cache.lock");
	private static File VANILLA_CACHE = new File(RuneLite.CACHE_DIR, "vanilla.cache");
	private static File PATCHED_CACHE = new File(RuneLite.CACHE_DIR, "patched.cache");

	private final OkHttpClient okHttpClient;
	private ClientUpdateCheckMode updateCheckMode;
	private final RuntimeConfigLoader runtimeConfigLoader;
	private final String javConfigUrl;

	private Object client;

	public ClientLoader(OkHttpClient okHttpClient, ClientUpdateCheckMode updateCheckMode, RuntimeConfigLoader runtimeConfigLoader, String javConfigUrl)
	{
		this.okHttpClient = okHttpClient;
		this.updateCheckMode = updateCheckMode;
		this.runtimeConfigLoader = runtimeConfigLoader;
		this.javConfigUrl = javConfigUrl;
	}

	@Override
	public synchronized Applet get()
	{
		if (client == null)
		{
			client = doLoad();
		}

		if (client instanceof Throwable)
		{
			throw new RuntimeException((Throwable) client);
		}
		return (Applet) client;
	}

	private Object doLoad()
	{
		if (updateCheckMode == NONE)
		{
			return null;
		}

		try
		{
			SplashScreen.stage(0, null, "Fetching applet viewer config");
			RSConfig config = new RSConfig();

			SplashScreen.stage(.05, null, "Waiting for other clients to start");

			LOCK_FILE.getParentFile().mkdirs();
			ClassLoader classLoader;
			try (FileChannel lockfile = FileChannel.open(LOCK_FILE.toPath(),
				StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
				FileLock flock = lockfile.lock())
			{
				SplashScreen.stage(.15, null, "Downloading Old School RuneScape");

				SplashScreen.stage(.40, null, "Loading client");

				File oprsInjected = new File(System.getProperty("user.home") + "/.openosrs/cache/injected-client.jar");
				if (updateCheckMode == AUTO)
				{
					writeInjectedClient(oprsInjected);
				}

				File jarFile = updateCheckMode == AUTO ? oprsInjected : VANILLA_CACHE;
				// create the classloader for the jar while we hold the lock, and eagerly load and link all classes
				// in the jar. Otherwise the jar can change on disk and can break future classloads.
				classLoader = createJarClassLoader(jarFile);
			}

			SplashScreen.stage(.465, "Starting", "Starting Old School RuneScape");

			Applet rs = loadClient(config, classLoader);

			SplashScreen.stage(.5, null, "Starting core classes");

			return rs;
		}
		catch (OutageException e)
		{
			return e;
		}
		catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException
			   | SecurityException e)
		{
			log.error("Error loading RS!", e);

			if (!checkOutages())
			{
				SwingUtilities.invokeLater(() -> FatalErrorDialog.showNetErrorWindow("loading the client", e));
			}
			return e;
		}
	}

	private void writeInjectedClient(File cachedInjected) throws IOException
	{
		String cachedHash = "";
		try
		{
			cachedHash = com.google.common.io.Files.asByteSource(cachedInjected).hash(Hashing.sha256()).toString();
		}
		catch (IOException ex)
		{
			if (!(ex instanceof FileNotFoundException))
			{
				log.error("Failed to calculate hash for cached file, falling back to vanilla", ex);
				updateCheckMode = VANILLA;
				return;
			}
		}

		byte[] currentInjected = ByteStreams.toByteArray(ClientLoader.class.getResourceAsStream(INJECTED_CLIENT_NAME));
		String currentHash = Hashing.sha256().hashBytes(currentInjected).toString();

		if (!cachedInjected.exists() || !currentHash.equals(cachedHash))
		{
			cachedInjected.getParentFile().mkdirs();
			Files.write(cachedInjected.toPath(), currentInjected);
		}
	}

	private ClassLoader createJarClassLoader(File jar) throws IOException, ClassNotFoundException
	{
		try (JarFile jarFile = new JarFile(jar))
		{
			ClassLoader classLoader = new ClassLoader(ClientLoader.class.getClassLoader())
			{
				@Override
				protected Class<?> findClass(String name) throws ClassNotFoundException
				{
					String entryName = name.replace('.', '/').concat(".class");
					JarEntry jarEntry;

					try
					{
						jarEntry = jarFile.getJarEntry(entryName);
					}
					catch (IllegalStateException ex)
					{
						throw new ClassNotFoundException(name, ex);
					}

					if (jarEntry == null)
					{
						throw new ClassNotFoundException(name);
					}

					try
					{
						InputStream inputStream = jarFile.getInputStream(jarEntry);
						if (inputStream == null)
						{
							throw new ClassNotFoundException(name);
						}

						byte[] bytes = ByteStreams.toByteArray(inputStream);
						return defineClass(name, bytes, 0, bytes.length);
					}
					catch (IOException e)
					{
						throw new ClassNotFoundException(null, e);
					}
				}
			};

			// load all of the classes in this jar; after the jar is closed the classloader
			// will no longer be able to look up classes
			Enumeration<JarEntry> entries = jarFile.entries();
			while (entries.hasMoreElements())
			{
				JarEntry jarEntry = entries.nextElement();
				String name = jarEntry.getName();
				if (name.endsWith(".class"))
				{
					name = name.substring(0, name.length() - 6);
					classLoader.loadClass(name.replace('/', '.'));
				}
			}

			return classLoader;
		}
	}

	private Applet loadClient(RSConfig config, ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException
	{
		String initialClass = "Client";
		Class<?> clientClass = classLoader.loadClass(initialClass);

		Applet rs = (Applet) clientClass.newInstance();
		rs.setStub(new RSAppletStub(config, runtimeConfigLoader));

		if (rs instanceof Client)
		{
			log.info("injected-client {}", OpenOSRS.SYSTEM_VERSION);
		}

		return rs;
	}

	private static class OutageException extends RuntimeException
	{
		private OutageException(Throwable cause)
		{
			super(cause);
		}
	}

	private boolean checkOutages()
	{
		RuntimeConfig rtc = runtimeConfigLoader.tryGet();
		if (rtc != null)
		{
			return rtc.showOutageMessage();
		}
		return false;
	}
}
