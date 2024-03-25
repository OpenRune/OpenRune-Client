/*
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
package net.runelite.client.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicProgressBarUI;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.laf.RuneLiteLAF;
import net.runelite.client.util.ImageUtil;

@Slf4j
public class SplashScreen extends JFrame implements ActionListener
{
	private static final int WIDTH = 200;
	private static final int PAD = 10;

	private static SplashScreen INSTANCE;

	private final JLabel action = new JLabel("Loading");
	private final JProgressBar progress = new JProgressBar();
	private final JLabel subAction = new JLabel();
	private Timer timer;
	public static final Dimension FRAME_SIZE = new Dimension(600, 350);

	private volatile double overallProgress = 0;
	private volatile String actionText = "Loading";
	private volatile String subActionText = "";
	private volatile String progressText = null;

	@Getter
	private final MessagePanel messagePanel = new MessagePanel();

	private SplashScreenType splashScreenType;

	private SplashScreen(SplashScreenType type)
	{
		splashScreenType = type;
		setTitle("OpenRune Launcher");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setIconImages(Arrays.asList(ClientUI.ICON_128, ClientUI.ICON_16));
		if (type == SplashScreenType.RUNELITE) {
			setLayout(null);
			Container pane = getContentPane();
			pane.setBackground(ColorScheme.DARKER_GRAY_COLOR);

			Font font = new Font(Font.DIALOG, Font.PLAIN, 12);

			BufferedImage logo = ImageUtil.loadImageResource(SplashScreen.class, "runelite_splash_2.png");
			JLabel logoLabel = new JLabel(new ImageIcon(logo));
			pane.add(logoLabel);
			logoLabel.setBounds(0, 0, WIDTH, WIDTH);

			int y = WIDTH;

			pane.add(action);
			action.setForeground(Color.WHITE);
			action.setBounds(0, y, WIDTH, 16);
			action.setHorizontalAlignment(SwingConstants.CENTER);
			action.setFont(font);
			y += action.getHeight() + PAD;

			pane.add(progress);
			progress.setForeground(ColorScheme.BRAND_BLUE);
			progress.setBackground(ColorScheme.BRAND_BLUE.darker().darker());
			progress.setBorder(new EmptyBorder(0, 0, 0, 0));
			progress.setBounds(0, y, WIDTH, 14);
			progress.setFont(font);
			progress.setUI(new BasicProgressBarUI()
			{
				@Override
				protected Color getSelectionBackground()
				{
					return Color.BLACK;
				}

				@Override
				protected Color getSelectionForeground()
				{
					return Color.BLACK;
				}
			});
			y += 12 + PAD;

			pane.add(subAction);
			subAction.setForeground(Color.LIGHT_GRAY);
			subAction.setBounds(0, y, WIDTH, 16);
			subAction.setHorizontalAlignment(SwingConstants.CENTER);
			subAction.setFont(font);
			y += subAction.getHeight() + PAD;

			setSize(WIDTH, y);
			setLocationRelativeTo(null);

			timer = new Timer(100, this);
			timer.setRepeats(true);
			timer.start();

			setVisible(true);
		} else {
			final JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			panel.setPreferredSize(FRAME_SIZE);

			panel.add(new InfoPanelSplash(), BorderLayout.EAST);
			panel.add(messagePanel, BorderLayout.WEST);

			this.setContentPane(panel);
			pack();

			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		action.setText(actionText);
		subAction.setText(subActionText);
		progress.setMaximum(1000);
		progress.setValue((int) (overallProgress * 1000));

		String progressText = this.progressText;
		if (progressText == null)
		{
			progress.setStringPainted(false);
		}
		else
		{
			progress.setStringPainted(true);
			progress.setString(progressText);
		}
	}

	public static boolean isOpen()
	{
		return INSTANCE != null;
	}

	public static void init(SplashScreenType type)
	{
		try
		{
			SwingUtilities.invokeAndWait(() ->
			{
				if (INSTANCE != null)
				{
					return;
				}

				try
				{
					boolean hasLAF = UIManager.getLookAndFeel() instanceof RuneLiteLAF;
					if (!hasLAF)
					{
						UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					}
					INSTANCE = new SplashScreen(type);
				}
				catch (Exception e)
				{
					log.warn("Unable to start splash screen", e);
				}
			});
		}
		catch (InterruptedException | InvocationTargetException bs)
		{
			throw new RuntimeException(bs);
		}
	}

	public static void stop()
	{
		SwingUtilities.invokeLater(() ->
		{
			if (INSTANCE == null)
			{
				return;
			}

			INSTANCE.timer.stop();
			// The CLOSE_ALL_WINDOWS quit strategy on MacOS dispatches WINDOW_CLOSING events to each frame
			// from Window.getWindows. However, getWindows uses weak refs and relies on gc to remove windows
			// from its list, causing events to get dispatched to disposed frames. The frames handle the events
			// regardless of being disposed and will run the configured close operation. Set the close operation
			// to DO_NOTHING_ON_CLOSE prior to disposing to prevent this.
			INSTANCE.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			INSTANCE.dispose();
			INSTANCE = null;
		});
	}

	public static void stage(double overallProgress, @Nullable String actionText, String subActionText)
	{
		stage(overallProgress, actionText, subActionText, null);
	}

	public static void stage(double startProgress, double endProgress,
		@Nullable String actionText, String subActionText,
		int done, int total, boolean mib)
	{
		String progress;
		if (mib)
		{
			final double MiB = 1024 * 1024;
			final double CEIL = 1.d / 10.d;
			progress = String.format("%.1f / %.1f MiB", done / MiB, (total / MiB) + CEIL);
		}
		else
		{
			progress = done + " / " + total;
		}
		stage(startProgress + ((endProgress - startProgress) * done / total), actionText, subActionText, progress);
	}

	private void setBarText(final String text)
	{
		final JProgressBar bar = messagePanel.getBar();
		bar.setString(text);
		bar.setStringPainted(text != null);
		bar.revalidate();
		bar.repaint();
	}

	private void setMessage(final String msg, final double value, String barText)
	{
		messagePanel.getBarLabel().setText(msg);
		messagePanel.getBar().setMaximum(1000);
		messagePanel.getBar().setValue((int) (value * 1000));
		setBarText(barText);

		this.getContentPane().revalidate();
		this.getContentPane().repaint();
	}


	public static void stage(double overallProgress, @Nullable String actionText, String subActionText, @Nullable String progressText)
	{
		if (INSTANCE != null)
		{
			if (INSTANCE.splashScreenType.equals(SplashScreenType.OPENOSRS)) {
				INSTANCE.setMessage(subActionText, overallProgress,progressText);
			} else {
				INSTANCE.overallProgress = overallProgress;
				if (actionText != null)
				{
					INSTANCE.actionText = actionText;
				}
				INSTANCE.subActionText = subActionText;
				INSTANCE.progressText = progressText;
			}
		}
	}
}
