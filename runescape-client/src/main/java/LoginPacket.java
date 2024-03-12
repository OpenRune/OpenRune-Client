import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("LoginPacket")
public class LoginPacket extends class145 {
	@ObfuscatedName("af")
	public static short[][] field1358;
	@ObfuscatedName("aq")
	long field1360;
	@ObfuscatedName("aw")
	String field1359;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	LoginPacket(class148 var1) {
		this.this$0 = var1;
		this.field1360 = -1L;
		this.field1359 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1360 = var1.readLong();
		}

		this.field1359 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method820(this.field1360, this.field1359, 0);
	}

	@ObfuscatedName("aq")
	public static final void method764(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				GrandExchangeOfferOwnWorldComparator.method346(var0 - 1L);
				GrandExchangeOfferOwnWorldComparator.method346(1L);
			} else {
				GrandExchangeOfferOwnWorldComparator.method346(var0);
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FFFFFFFFI)V",
		garbageValue = "-2128666244"
	)
	static void method768(class132 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			var0.field1280 = var1;
			float var9 = var4 - var1;
			float var10 = var8 - var5;
			float var11 = var2 - var1;
			float var12 = 0.0F;
			float var13 = 0.0F;
			if ((double)var11 != 0.0D) {
				var12 = (var6 - var5) / var11;
			}

			var11 = var4 - var3;
			if ((double)var11 != 0.0D) {
				var13 = (var8 - var7) / var11;
			}

			float var14 = 1.0F / (var9 * var9);
			float var15 = var12 * var9;
			float var16 = var13 * var9;
			var0.field1288 = (var15 + var16 - var10 - var10) * var14 / var9;
			var0.field1289 = (var10 + var10 + var10 - var15 - var15 - var16) * var14;
			var0.field1286 = var12;
			var0.field1284 = var5;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	static void method767() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class30.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class30.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "720920902"
	)
	static void method769() {
		Varps.compass = null;
		ItemComposition.redHintArrowSprite = null;
		AbstractSocket.mapSceneSprites = null;
		class13.headIconPkSprites = null;
		class168.headIconPrayerSprites = null;
		ChatChannel.headIconHintSprites = null;
		Players.mapDotSprites = null;
		GrandExchangeOfferOwnWorldComparator.crossSprites = null;
		class246.field2076 = null;
		ClanChannelMember.scrollBarSprites = null;
		WorldMapCacheName.field2156 = null;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ldx;B)V",
		garbageValue = "104"
	)
	static void method770(NPC var0) {
		var0.field1015 = var0.definition.size;
		var0.field1039 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field1597;
		var0.field1008 = var0.definition.field1590;
		var0.field1007 = var0.definition.field1600;
		var0.field1024 = var0.definition.field1603;
		var0.field1011 = var0.definition.field1591;
		var0.field1019 = var0.definition.field1589;
		var0.field1012 = var0.definition.field1588;
		var0.field1014 = var0.definition.field1601;
	}
}
