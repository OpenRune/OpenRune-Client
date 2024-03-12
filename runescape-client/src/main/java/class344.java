import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class344 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	UrlRequest field2986;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	SpritePixels field2987;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;)V"
	)
	class344(String var1, UrlRequester var2) {
		try {
			this.field2986 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field2986 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Leb;)V"
	)
	class344(UrlRequest var1) {
		this.field2986 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-750205083"
	)
	SpritePixels method1793() {
		if (this.field2987 == null && this.field2986 != null && this.field2986.isDone()) {
			if (this.field2986.getResponse() != null) {
				this.field2987 = class202.method1018(this.field2986.getResponse());
			}

			this.field2986 = null;
		}

		return this.field2987;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "335968278"
	)
	public static boolean method1794(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class403.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;ZII)V",
		garbageValue = "-1416277523"
	)
	static void method1795(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				JagexCache.method1113(4);
			}

		} else {
			if (var3 == 0) {
				PacketBufferNode.method1679(var2);
			} else {
				JagexCache.method1113(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = class202.method1018(var4);
			WorldMapLabelSize.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			class213.method1111(var1, Client.worldProperties);
			class155.titleboxSprite = class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field811 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class90.field916 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = FloorOverlayDefinition.getFont(var1, "runes", "");
			class169.title_muteSprite = FloorOverlayDefinition.getFont(var1, "title_mute", "");
			class128.options_buttons_0Sprite = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			UserComparator2.field4312 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class472.options_buttons_2Sprite = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class557.field4387 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			FriendSystem.field711 = class128.options_buttons_0Sprite.subWidth;
			class316.field2827 = class128.options_buttons_0Sprite.subHeight;
			class325.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field804 = new String[8];
				Login.field788 = 0;
			}

			class36.otpMedium = 0;
			MenuAction.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!class30.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var5 = new ArrayList();
				var5.add(new MusicSong(Renderable.archive6, "scape main", "", 255, false));
				PacketWriter.method648(var5, 0, 0, 0, 100, false);
			} else {
				class169.method882(0, 0);
			}

			GrandExchangeOfferOwnWorldComparator.method350();
			Fonts.method2519().method2018(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			Login.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			WorldMapLabelSize.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
		}
	}
}
