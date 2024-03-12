import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class319 {
	@ObfuscatedName("aq")
	static int[] field2836;

	static {
		new Object();
		field2836 = new int[33];
		field2836[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2836[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/Object;",
		garbageValue = "6380"
	)
	static Object method1694(int var0) {
		return class317.method1688((class521)class356.findEnumerated(class521.method2568(), var0));
	}
}
