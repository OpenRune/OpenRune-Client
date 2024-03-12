import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class341 {
	@ObfuscatedName("aq")
	public int field2984;
	@ObfuscatedName("aw")
	public int field2985;
	@ObfuscatedName("al")
	public int field2983;

	class341() {
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Z",
		garbageValue = "-136286102"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = Client.method386(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
