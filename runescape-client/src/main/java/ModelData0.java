import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "[Lng;"
	)
	static Widget[] field2514;

	ModelData0() {
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "1337525422"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class150.field1376, class133.method734(var0), class227.method1176(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
