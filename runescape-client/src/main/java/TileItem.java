import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("aq")
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ai")
	int field1136;

	TileItem() {
		this.field1136 = 31;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "255610960"
	)
	void method621(int var1) {
		this.field1136 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		return ArchiveDiskActionHandler.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-20"
	)
	boolean method622(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1136 & 1 << var1) != 0;
		} else {
			return true;
		}
	}
}
