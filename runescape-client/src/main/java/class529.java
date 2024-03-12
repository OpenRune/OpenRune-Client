import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public enum class529 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4227(1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4228(2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4224(4),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4222(8),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4242(16),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4243(32),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4232(64),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4249(128),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4225(256),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4245(512),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4223(1024),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4238(2048),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4239(4096),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4237(8192),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4247(16384),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4241(32768),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4221(65536),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4240(131072),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4235(262144),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4244(524288),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4248(1048576),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4236(2097152),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4234(4194304),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4233(8388608),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4246(16777216),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4226(33554432),
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4252(67108864),
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4230(134217728),
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4251(268435456),
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4229(536870912),
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4231(1073741824),
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field4250(Integer.MIN_VALUE);

	@ObfuscatedName("bt")
	final int field4253;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class529(int var3) {
		this.field4253 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4253;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)Lpb;",
		garbageValue = "1237025991"
	)
	@Export("fontFromBytes")
	public static Font fontFromBytes(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			Font var1 = new Font(var0, class548.SpriteBuffer_xOffsets, class548.SpriteBuffer_yOffsets, class235.SpriteBuffer_spriteWidths, class548.SpriteBuffer_spriteHeights, AbstractSocket.SpriteBuffer_spritePalette, class548.SpriteBuffer_pixels);
			class548.SpriteBuffer_xOffsets = null;
			class548.SpriteBuffer_yOffsets = null;
			class235.SpriteBuffer_spriteWidths = null;
			class548.SpriteBuffer_spriteHeights = null;
			AbstractSocket.SpriteBuffer_spritePalette = null;
			class548.SpriteBuffer_pixels = null;
			return var1;
		}
	}
}
