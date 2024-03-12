import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
public enum class472 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	field3994(2, 1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	field3995(0, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	field3993(3, 3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	field3992(1, 10);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("ar")
	final int field3996;
	@ObfuscatedName("as")
	final int field3997;

	class472(int var3, int var4) {
		this.field3996 = var3;
		this.field3997 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3997;
	}
}
