import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class318 {
	@ObfuscatedName("ci")
	static int field2834;
	@ObfuscatedName("id")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-77"
	)
	public static int method1693(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}
}
