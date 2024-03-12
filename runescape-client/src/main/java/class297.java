import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public abstract class class297 implements class299 {
	@ObfuscatedName("aq")
	protected int field2552;

	@ObfuscatedSignature(
		descriptor = "(Lox;Lpe;I)V"
	)
	protected class297(StudioGame var1, Language var2, int var3) {
		this.field2552 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Luh;",
		garbageValue = "-113"
	)
	public static class521 method1653(int var0) {
		int var1 = class519.field4195[var0];
		if (var1 == 1) {
			return class521.field4199;
		} else if (var1 == 2) {
			return class521.field4198;
		} else {
			return var1 == 3 ? class521.field4200 : null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FZI)F",
		garbageValue = "587235743"
	)
	static float method1654(class132 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method733() != 0) {
			float var4 = (float)var0.field1277[0].field1236;
			float var5 = (float)var0.field1277[var0.method733() - 1].field1236;
			float var6 = var5 - var4;
			if ((double)var6 == 0.0D) {
				return var0.field1277[0].field1235;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var6 * var10;
				var8 = Math.abs(var8 + 1.0D);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1279 == class130.field1264) {
						if (0.0D != (double)var10) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1279 != class130.field1262 && var0.field1279 != class130.field1261) {
						if (var0.field1279 == class130.field1265) {
							var11 = var4 - var1;
							var16 = var0.field1277[0].field1232;
							var17 = var0.field1277[0].field1231;
							var3 = var0.field1277[0].field1235;
							if ((double)var16 != 0.0D) {
								var3 -= var17 * var11 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1278 == class130.field1264) {
					if (0.0D != (double)var10) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1278 != class130.field1262 && var0.field1278 != class130.field1261) {
					if (var0.field1278 == class130.field1265) {
						var11 = var1 - var5;
						var16 = var0.field1277[var0.method733() - 1].field1233;
						var17 = var0.field1277[var0.method733() - 1].field1234;
						var3 = var0.field1277[var0.method733() - 1].field1235;
						if ((double)var16 != 0.0D) {
							var3 += var11 * var17 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = Tile.method1451(var0, var11);
				float var18;
				if (var2 && var0.field1279 == class130.field1261) {
					var18 = var0.field1277[var0.method733() - 1].field1235 - var0.field1277[0].field1235;
					var3 = (float)((double)var3 - (double)var18 * var8);
				} else if (!var2 && var0.field1278 == class130.field1261) {
					var18 = var0.field1277[var0.method733() - 1].field1235 - var0.field1277[0].field1235;
					var3 = (float)((double)var3 + var8 * (double)var18);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}
}
