import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uy")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	field4330(1, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	field4329(2, 2);

	@ObfuscatedName("ai")
	public final int field4332;
	@ObfuscatedName("ar")
	final int field4331;

	FillMode(int var3, int var4) {
		this.field4332 = var3;
		this.field4331 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4331;
	}
}
