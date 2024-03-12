import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
public class class538 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	public static final class538 field4303;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	public static final class538 field4304;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static final class538 field4306;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static final class538 field4305;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static final class538 field4307;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static final class538 field4308;
	@ObfuscatedName("aa")
	final int field4309;
	@ObfuscatedName("az")
	final int field4310;

	static {
		field4303 = new class538(2, 0);
		field4304 = new class538(0, 2);
		field4306 = new class538(1, 5);
		field4305 = new class538(4, 6);
		field4307 = new class538(5, 7);
		field4308 = new class538(3, 8);
	}

	class538(int var1, int var2) {
		this.field4309 = var1;
		this.field4310 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4310;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1025371396"
	)
	public boolean method2691() {
		return this == field4304;
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2144369700"
	)
	static int method2692() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field574;
		} else {
			return 10000;
		}
	}
}
