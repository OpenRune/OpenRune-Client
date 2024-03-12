import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sx")
public class class483 {
	@ObfuscatedName("ar")
	static final int[] field4007;
	@ObfuscatedName("as")
	static final int[] field4008;

	static {
		field4007 = new int[16384];
		field4008 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4007[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field4008[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
