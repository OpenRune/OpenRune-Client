import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public enum class90 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field919(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field921(1, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field918(2, 7),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field917(3, 8),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field920(4, 9);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static IndexedSprite field916;
	@ObfuscatedName("as")
	final int field923;
	@ObfuscatedName("aa")
	final int field922;

	class90(int var3, int var4) {
		this.field923 = var3;
		this.field922 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field922;
	}
}
