import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public enum class6 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	field6(0, 0);

	@ObfuscatedName("aw")
	final int field8;
	@ObfuscatedName("al")
	final int field7;

	class6(int var3, int var4) {
		this.field8 = var3;
		this.field7 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field7;
	}
}
