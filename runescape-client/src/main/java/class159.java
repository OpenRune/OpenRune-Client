import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class159 extends class145 {
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("aq")
	int field1432;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class159(class148 var1) {
		this.this$0 = var1;
		this.field1432 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		this.field1432 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method824(this.field1432);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lvd;",
		garbageValue = "592118156"
	)
	static SpritePixels method841(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (SpritePixels)var3.get(var4);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lof;IB)Lvg;",
		garbageValue = "8"
	)
	public static IndexedSprite method842(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1);
		boolean var2;
		if (var3 == null) {
			var2 = false;
		} else {
			ServerPacket.SpriteBuffer_decode(var3);
			var2 = true;
		}

		return !var2 ? null : Interpreter.method421();
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-28"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}
}
