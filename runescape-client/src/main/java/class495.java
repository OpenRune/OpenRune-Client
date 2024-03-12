import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
public class class495 extends class498 {
	@ObfuscatedName("aq")
	int field4058;
	@ObfuscatedName("aw")
	int field4059;
	@ObfuscatedName("al")
	double field4055;
	@ObfuscatedName("ai")
	double field4054;
	@ObfuscatedName("ar")
	double field4056;
	@ObfuscatedName("as")
	double field4057;
	@ObfuscatedName("aa")
	double field4053;

	public class495(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field4058 = 0;
		this.field4059 = 0;
		this.field4055 = 0.0D;
		this.field4054 = 0.0D;
		this.field4056 = 0.0D;
		this.field4057 = 0.0D;
		this.field4053 = 0.0D;
		this.field4058 = var3;
		this.field4059 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field4055 = (double)var4;
			this.field4054 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field4055 = (var17 + (var11 * var19 - var15 * var21) - var13) / (var19 - var21);
			this.field4054 = var19 * (this.field4055 - var11) + var13;
			this.field4056 = Math.sqrt(Math.pow(this.field4055 - (double)var1, 2.0D) + Math.pow(this.field4054 - (double)var2, 2.0D));
			this.field4057 = Math.atan2((double)var2 - this.field4054, (double)var1 - this.field4055);
			double var23 = Math.atan2((double)var8 - this.field4054, (double)var7 - this.field4055);
			this.field4053 = Math.atan2((double)var5 - this.field4054, (double)var4 - this.field4055);
			boolean var25 = this.field4057 <= var23 && var23 <= this.field4053 || this.field4053 <= var23 && var23 <= this.field4057;
			if (!var25) {
				this.field4053 += (double)(this.field4057 - this.field4053 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1316582552"
	)
	public int vmethod8869() {
		double var1 = this.method2452();
		double var3 = var1 * (this.field4053 - this.field4057) + this.field4057;
		return (int)Math.round(this.field4055 + this.field4056 * Math.cos(var3));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1514290339"
	)
	public int vmethod8868() {
		double var1 = this.method2452();
		double var3 = var1 * (this.field4053 - this.field4057) + this.field4057;
		return (int)Math.round(this.field4054 + this.field4056 * Math.sin(var3));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-79"
	)
	@Export("vmethod8874")
	public int vmethod8874() {
		double var1 = this.method2452();
		return (int)Math.round(var1 * (double)(this.field4059 - this.field4058) + (double)this.field4058);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)Ljava/lang/String;",
		garbageValue = "-75"
	)
	public static String method2443(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class405.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = class102.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}

		return var1;
	}
}
