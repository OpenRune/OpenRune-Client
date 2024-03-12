import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public class class73 {
	@ObfuscatedName("wo")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("ar")
	static final BigInteger field765;
	@ObfuscatedName("as")
	static final BigInteger field766;
	@ObfuscatedName("aa")
	static int field761;
	@ObfuscatedName("eh")
	static long field762;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	static class473 field763;
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("decimator")
	static Decimator decimator;

	static {
		field765 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field766 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1659794248"
	)
	@Export("updateItemPile")
	static void updateItemPile(int var0, int var1, int var2) {
		NodeDeque var3 = Client.groundItems[var0][var1][var2];
		if (var3 == null) {
			Actor.scene.removeGroundItemPile(var0, var1, var2);
		} else {
			long var4 = -99999999L;
			TileItem var6 = null;

			TileItem var7;
			for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) {
				ItemComposition var8 = ArchiveDiskActionHandler.ItemDefinition_get(var7.id);
				long var9 = (long)var8.price;
				if (var8.isStackable == 1) {
					var9 *= var7.quantity < Integer.MAX_VALUE ? (long)(var7.quantity + 1) : (long)var7.quantity;
				}

				if (var9 > var4) {
					var4 = var9;
					var6 = var7;
				}
			}

			if (var6 == null) {
				Actor.scene.removeGroundItemPile(var0, var1, var2);
			} else {
				var3.addLast(var6);
				TileItem var13 = null;
				TileItem var12 = null;

				for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) {
					if (var6.id != var7.id) {
						if (var13 == null) {
							var13 = var7;
						}

						if (var13.id != var7.id && var12 == null) {
							var12 = var7;
						}
					}
				}

				long var10 = AsyncHttpResponse.calculateTag(var1, var2, 3, false, 0);
				Actor.scene.newGroundItemPile(var0, var1, var2, class272.getTileHeight(var1 * 128 + 64, var2 * 128 + 64, var0), var6, var10, var13, var12);
			}
		}
	}
}
