import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("Players")
public class Players {
	@ObfuscatedName("al")
	static byte[] field1140;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	static class233[] field1150;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Luq;"
	)
	static Buffer[] field1152;
	@ObfuscatedName("as")
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("aa")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("az")
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("ao")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("au")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ak")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("ah")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("aj")
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("af")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	static Buffer field1151;
	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	static {
		field1140 = new byte[2048];
		field1150 = new class233[2048];
		field1152 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1151 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lvg;",
		garbageValue = "-1785638983"
	)
	static IndexedSprite method630(boolean var0, boolean var1) {
		return var0 ? (var1 ? class557.field4387 : class472.options_buttons_2Sprite) : (var1 ? UserComparator2.field4312 : class128.options_buttons_0Sprite);
	}
}
