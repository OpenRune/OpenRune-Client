import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public enum class141 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1347(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1350(1, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1345(2, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1344(3, 3),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1348(4, 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1349(5, 5),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1343(6, 6),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1351(7, 7),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1346(8, 8);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("au")
	final int field1353;
	@ObfuscatedName("ak")
	final int field1352;

	class141(int var3, int var4) {
		this.field1353 = var3;
		this.field1352 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1352;
	}
}
