import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("aq")
	@Export("text")
	String text;
	@ObfuscatedName("aw")
	@Export("width")
	int width;
	@ObfuscatedName("al")
	@Export("height")
	int height;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILjh;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Z",
		garbageValue = "800848691"
	)
	static boolean method1374(PlayerComposition var0) {
		if (var0.equipment[0] < 512) {
			return false;
		} else {
			ItemComposition var1 = ArchiveDiskActionHandler.ItemDefinition_get(var0.equipment[0] - 512);
			return var1.maleModel1 != class207.field1846.field1860 && var1.maleModel2 != class207.field1846.field1860;
		}
	}
}
