import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sh")
public class class484 {
	@ObfuscatedName("aj")
	static final int[] field4010;
	@ObfuscatedName("af")
	static final int[] field4009;

	static {
		field4010 = new int[2048];
		field4009 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4010[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4009[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
