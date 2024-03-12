import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class93 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field973;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field977;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field969;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field966;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field974;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field975;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field962;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field979;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field972;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field976;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field968;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field965;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field967;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field963;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field978;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field971;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field964;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field970;

	static {
		field973 = new class93();
		field977 = new class93();
		field969 = new class93();
		field966 = new class93();
		field974 = new class93();
		field975 = new class93();
		field962 = new class93();
		field979 = new class93();
		field972 = new class93();
		field976 = new class93();
		field968 = new class93();
		field965 = new class93();
		field967 = new class93();
		field963 = new class93();
		field978 = new class93();
		field971 = new class93();
		field964 = new class93();
		field970 = new class93();
	}

	class93() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IZI)Lfc;",
		garbageValue = "-1532755804"
	)
	public static class140 method509(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}

			if (var7 == null) {
				var4 = false;
			}

			if (!var4) {
				return null;
			} else {
				if (GrandExchangeOfferUnitPriceComparator.field3691 == null) {
					class520.field4196 = Runtime.getRuntime().availableProcessors();
					GrandExchangeOfferUnitPriceComparator.field3691 = new ThreadPoolExecutor(0, class520.field4196, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class520.field4196 * 100 + 100), new class137());
				}

				try {
					return new class140(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfr;B)V",
		garbageValue = "5"
	)
	static void method511(float var0, float var1, float var2, float var3, class132 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1287 = var7 - var6 - var8;
		var4.field1290 = var8 + var8 + var8;
		var4.field1283 = var5 + var5 + var5;
		var4.field1285 = var0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	static final int method510() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "534540991"
	)
	static int method512(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-884462320"
	)
	static int method514(int var0, Script var1, boolean var2) {
		if (var0 == 6200) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.field663 = (short)Skeleton.method1500(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
			if (Client.field663 <= 0) {
				Client.field663 = 256;
			}

			Client.field664 = (short)Skeleton.method1500(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (Client.field664 <= 0) {
				Client.field664 = 256;
			}

			return 1;
		} else if (var0 == 6201) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			Interpreter.Interpreter_intStackSize -= 4;
			Client.field668 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.field668 <= 0) {
				Client.field668 = 1;
			}

			Client.field666 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.field666 <= 0) {
				Client.field666 = 32767;
			} else if (Client.field666 < Client.field668) {
				Client.field666 = Client.field668;
			}

			Client.field669 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (Client.field669 <= 0) {
				Client.field669 = 1;
			}

			Client.field667 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			if (Client.field667 <= 0) {
				Client.field667 = 32767;
			} else if (Client.field667 < Client.field669) {
				Client.field667 = Client.field669;
			}

			return 1;
		} else if (var0 == 6203) {
			if (Client.viewportWidget != null) {
				class148.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == 6205) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = JagNetThread.method2027(Client.field663);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = JagNetThread.method2027(Client.field664);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArea.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1517887348"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = SoundSystem.method210();
		if (var0 == -3) {
			SecureUrlRequester.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			SecureUrlRequester.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			SecureUrlRequester.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			JagexCache.method1113(3);
			Login.field787 = 1;
		} else if (var0 == 4) {
			class150.method794(0);
		} else if (var0 == 5) {
			Login.field787 = 2;
			SecureUrlRequester.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field398) {
				Client.field398 = true;
				class371.method1964();
				return;
			}

			SecureUrlRequester.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			SecureUrlRequester.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			SecureUrlRequester.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			SecureUrlRequester.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			SecureUrlRequester.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			SecureUrlRequester.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			SecureUrlRequester.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			SecureUrlRequester.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			SecureUrlRequester.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			SecureUrlRequester.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			SecureUrlRequester.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			JagexCache.method1113(33);
		} else if (var0 == 17) {
			SecureUrlRequester.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class150.method794(1);
		} else if (var0 == 19) {
			SecureUrlRequester.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			SecureUrlRequester.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			SecureUrlRequester.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			SecureUrlRequester.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			SecureUrlRequester.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			SecureUrlRequester.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			SecureUrlRequester.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			SecureUrlRequester.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			SecureUrlRequester.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class150.method794(2);
		} else if (var0 == 37) {
			SecureUrlRequester.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			SecureUrlRequester.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			SecureUrlRequester.setLoginResponseString("This world is running a", "closed beta. Please", "use a different world.");
		} else if (var0 == 55) {
			JagexCache.method1113(8);
		} else {
			if (var0 == 56) {
				SecureUrlRequester.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				Interpreter.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				SecureUrlRequester.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				Interpreter.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				SecureUrlRequester.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				JagexCache.method1113(7);
			} else {
				if (var0 == 62) {
					Interpreter.updateGameState(10);
					JagexCache.method1113(9);
					SecureUrlRequester.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					Interpreter.updateGameState(10);
					JagexCache.method1113(9);
					SecureUrlRequester.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					Interpreter.updateGameState(10);
					JagexCache.method1113(9);
					SecureUrlRequester.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					Interpreter.updateGameState(10);
					JagexCache.method1113(7);
					SecureUrlRequester.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					Interpreter.updateGameState(10);
					JagexCache.method1113(6);
					SecureUrlRequester.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					Interpreter.updateGameState(10);
					JagexCache.method1113(32);
				} else {
					SecureUrlRequester.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		Interpreter.updateGameState(10);
		boolean var2 = var1 != SoundSystem.method210();
		if (!var2 && Client.field676.method2691()) {
			JagexCache.method1113(9);
		}

	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "25"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1456462183"
	)
	static final void method516(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class316.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method869()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = ViewportMouse.getPacketBufferNode(ClientPacket.field2587, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class145.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
