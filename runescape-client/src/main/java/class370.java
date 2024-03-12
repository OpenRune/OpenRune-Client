import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public enum class370 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field3570(-1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field3571(0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field3569(1),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field3568(2);

	@ObfuscatedName("ar")
	final int field3572;

	class370(int var3) {
		this.field3572 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3572;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-377082167"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
