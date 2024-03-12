import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("aa")
	int[] field1083;
	@ObfuscatedName("az")
	int field1082;
	@ObfuscatedName("ao")
	int[] field1089;
	@ObfuscatedName("au")
	int[] field1090;
	@ObfuscatedName("ak")
	int[] field1086;
	@ObfuscatedName("ah")
	int[] field1085;
	@ObfuscatedName("aj")
	int field1079;
	@ObfuscatedName("af")
	int field1078;
	@ObfuscatedName("ax")
	int[] field1091;
	@ObfuscatedName("an")
	int[] field1088;
	@ObfuscatedName("ag")
	int[] field1084;
	@ObfuscatedName("am")
	int[] field1087;
	@ObfuscatedName("ad")
	int field1077;
	@ObfuscatedName("at")
	int field1080;
	@ObfuscatedName("ay")
	int field1081;

	@ObfuscatedSignature(
		descriptor = "([Lvg;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1083 = new int[256];
		this.field1082 = 0;
		this.field1079 = 0;
		this.field1078 = 0;
		this.field1077 = 0;
		this.field1080 = 0;
		this.field1081 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-661569380"
	)
	@Export("initColors")
	void initColors() {
		this.field1090 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1090[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1090[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1090[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1090[var1 + 192] = 16777215;
		}

		this.field1086 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1086[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1086[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1086[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1086[var1 + 192] = 16777215;
		}

		this.field1085 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1085[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1085[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1085[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1085[var1 + 192] = 16777215;
		}

		this.field1089 = new int[256];
		this.field1077 = 0;
		this.field1084 = new int[32768];
		this.field1087 = new int[32768];
		this.method548((IndexedSprite)null);
		this.field1091 = new int[32768];
		this.field1088 = new int[32768];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method541() {
		this.field1090 = null;
		this.field1086 = null;
		this.field1085 = null;
		this.field1089 = null;
		this.field1084 = null;
		this.field1087 = null;
		this.field1091 = null;
		this.field1088 = null;
		this.field1077 = 0;
		this.field1080 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2079246213"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1091 == null) {
			this.initColors();
		}

		if (this.field1081 == 0) {
			this.field1081 = var2;
		}

		int var3 = var2 - this.field1081;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1081 = var2;
		if (var3 > 0) {
			this.method543(var3);
		}

		this.method545(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-9"
	)
	final void method543(int var1) {
		this.field1077 += var1 * 128;
		int var2;
		if (this.field1077 > this.field1084.length) {
			this.field1077 -= this.field1084.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method548(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1091[var2 + var3] - this.field1084[var2 + this.field1077 & this.field1084.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1091[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1091[var9 + var8] = 255;
				} else {
					this.field1091[var8 + var9] = 0;
				}
			}
		}

		if (this.field1079 > 0) {
			this.field1079 -= var1 * 4;
		}

		if (this.field1078 > 0) {
			this.field1078 -= var1 * 4;
		}

		if (this.field1079 == 0 && this.field1078 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1079 = 1024;
			}

			if (var7 == 1) {
				this.field1078 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1083[var7] = this.field1083[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1083[var7] = (int)(Math.sin((double)this.field1082 / 14.0D) * 16.0D + Math.sin((double)this.field1082 / 15.0D) * 14.0D + Math.sin((double)this.field1082 / 16.0D) * 12.0D);
			++this.field1082;
		}

		this.field1080 += var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1080 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1091[var12 + (var13 << 7)] = 192;
			}

			this.field1080 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1091[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1091[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1088[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1088[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1088[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1091[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-17"
	)
	final int method544(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1902831360"
	)
	final void method545(int var1) {
		int var2 = this.field1089.length;
		if (this.field1079 > 0) {
			this.method546(this.field1079, this.field1086);
		} else if (this.field1078 > 0) {
			this.method546(this.field1078, this.field1085);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1089[var3] = this.field1090[var3];
			}
		}

		this.method547(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "1872617322"
	)
	final void method546(int var1, int[] var2) {
		int var3 = this.field1089.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1089[var4] = this.method544(this.field1090[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1089[var4] = var2[var4];
			} else {
				this.field1089[var4] = this.method544(var2[var4], this.field1090[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-889960889"
	)
	final void method547(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1083[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= UserComparator8.rasterProvider.width) {
				var7 = UserComparator8.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * UserComparator8.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1091[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1089[var10];
					int var14 = UserComparator8.rasterProvider.pixels[var8];
					UserComparator8.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "1546430874"
	)
	final void method548(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1084.length; ++var2) {
			this.field1084[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1084[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1087[var5] = (this.field1084[var5 + 1] + this.field1084[var5 + 128] + this.field1084[var5 - 128] + this.field1084[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1084;
			this.field1084 = this.field1087;
			this.field1087 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1084[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("aq")
	public static int method539(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(256.0D * var5);
		int var11 = (int)(256.0D * var7);
		return var11 + (var10 << 8) + (var9 << 16) + -16777216;
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-682940445"
	)
	static void method549(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class428.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		class406.method2105(var0, var1);
	}
}
