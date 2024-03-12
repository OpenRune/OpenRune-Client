import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("aq")
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("aw")
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("al")
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "90246290"
	)
	static void method1370() {
		if (Login.clearLoginScreen) {
			class155.titleboxSprite = null;
			Login.titlebuttonSprite = null;
			Login.runesSprite = null;
			Login.leftTitleSprite = null;
			WorldMapLabelSize.rightTitleSprite = null;
			Login.logoSprite = null;
			class169.title_muteSprite = null;
			class128.options_buttons_0Sprite = null;
			class472.options_buttons_2Sprite = null;
			Timer.worldSelectBackSprites = null;
			class162.worldSelectFlagSprites = null;
			World.worldSelectArrows = null;
			Frames.worldSelectStars = null;
			ModeWhere.field3715 = null;
			class325.loginScreenRunesAnimation.method541();
			class169.method882(0, 100);
			Fonts.method2519().method2018(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-848566446"
	)
	public static int method1369(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 14 & 3L);
		return var1;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Ldi;B)V",
		garbageValue = "-69"
	)
	static void method1371(class93 var0) {
		if (Client.field438 != var0) {
			Client.field438 = var0;
		}
	}
}
