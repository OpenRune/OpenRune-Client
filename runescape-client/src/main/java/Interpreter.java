import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ar")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("as")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("aa")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("az")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ao")
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("au")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("ah")
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("am")
	static int field737;
	@ObfuscatedName("ad")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("at")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ae")
	static boolean field734;
	@ObfuscatedName("ac")
	static boolean field733;
	@ObfuscatedName("ab")
	static ArrayList field745;
	@ObfuscatedName("av")
	static int field739;
	@ObfuscatedName("bd")
	static final double field748;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field734 = false;
		field733 = false;
		field745 = new ArrayList();
		field739 = 0;
		field748 = Math.log(2.0D);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "1463854705"
	)
	static IndexedSprite method421() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class548.SpriteBuffer_spriteWidth;
		var0.height = class548.SpriteBuffer_spriteHeight;
		var0.xOffset = class548.SpriteBuffer_xOffsets[0];
		var0.yOffset = class548.SpriteBuffer_yOffsets[0];
		var0.subWidth = class235.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class548.SpriteBuffer_spriteHeights[0];
		var0.palette = AbstractSocket.SpriteBuffer_spritePalette;
		var0.pixels = class548.SpriteBuffer_pixels[0];
		class548.SpriteBuffer_xOffsets = null;
		class548.SpriteBuffer_yOffsets = null;
		class235.SpriteBuffer_spriteWidths = null;
		class548.SpriteBuffer_spriteHeights = null;
		AbstractSocket.SpriteBuffer_spritePalette = null;
		class548.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lof;IS)V",
		garbageValue = "10274"
	)
	public static void method422(AbstractArchive var0, int var1) {
		if (!class321.field2858.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class321.field2858.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field2946 = false;
				var4.field2943 = false;
				var4.field2944 = false;
				var4.field2941 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field2947 = 0.0F;
				var2.add(var4);
			}

			PacketWriter.method648(var2, class321.musicPlayerStatus, class321.field2856, class321.field2854, class321.field2855, false);
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1265886763"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field622.method1168();
			}

			if (Client.gameState == 0) {
				class193.client.method148();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class407.method2107(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field468 = 0;
				Client.field467 = 0;
				Client.timer.method2232(var0);
				if (var0 != 20) {
					ScriptEvent.setAuthenticationScheme(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class324.field2902 != null) {
				class324.field2902.close();
				class324.field2902 = null;
			}

			if (Client.gameState == 25) {
				Client.field473 = 0;
				Client.field475 = 0;
				Client.field476 = 1;
				Client.field474 = 0;
				Client.field478 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = Client.gameState == 11 ? 4 : 0;
					class344.method1795(ScriptFrame.archive10, class311.archive8, false, var3);
				} else if (var0 == 11) {
					class344.method1795(ScriptFrame.archive10, class311.archive8, false, 4);
				} else if (var0 == 50) {
					SecureUrlRequester.setLoginResponseString("", "Updating date of birth...", "");
					class344.method1795(ScriptFrame.archive10, class311.archive8, false, 7);
				} else if (var0 != 0) {
					WorldMapDecoration.method1370();
				}
			} else {
				boolean var1 = class30.clientPreferences.method576() >= Client.field450;
				int var2 = var1 ? 0 : 12;
				class344.method1795(ScriptFrame.archive10, class311.archive8, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
