import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class389 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final class389 field3699;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final class389 field3700;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final class389 field3698;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static final class389 field3697;

	static {
		field3699 = new class389();
		field3700 = new class389();
		field3698 = new class389();
		field3697 = new class389();
	}

	class389() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "-10"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}
}
