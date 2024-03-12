import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
public class class551 {
	@ObfuscatedName("aw")
	int field4372;
	@ObfuscatedName("al")
	int field4368;
	@ObfuscatedName("ai")
	int field4365;
	@ObfuscatedName("ar")
	int field4370;
	@ObfuscatedName("as")
	int field4371;
	@ObfuscatedName("aa")
	int field4362;
	@ObfuscatedName("az")
	int field4373;
	@ObfuscatedName("ao")
	int field4369;
	@ObfuscatedName("au")
	boolean field4361;
	@ObfuscatedName("ak")
	int field4367;
	@ObfuscatedName("ah")
	int field4364;
	@ObfuscatedName("aj")
	int field4366;
	@ObfuscatedName("af")
	int field4363;

	public class551() {
		this.field4373 = 0;
		this.field4369 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "1917571118"
	)
	public void method2770(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field4372 = var1;
		this.field4368 = var2;
		this.field4365 = var3;
		this.field4370 = var4;
		this.field4371 = var5;
		this.field4362 = var6;
		this.field4373 = var7;
		this.field4369 = var8;
		this.field4361 = var9;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "418202553"
	)
	public void method2771(int var1, int var2, int var3, int var4) {
		this.field4367 = var1;
		this.field4364 = var2;
		this.field4366 = var3;
		this.field4363 = var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpb;S)V",
		garbageValue = "2006"
	)
	public void method2772(class413 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field4370, (int)(0.9F * (float)var3));
			int var5 = var1.method2148(this.field4365);
			int var6 = var1.method2149(this.field4370);
			int var7 = var5 + (this.field4372 - this.field4371);
			int var8 = var6 + var3 + (this.field4368 - this.field4362);
			Rasterizer2D.Rasterizer2D_setClip(this.field4372, this.field4368, this.field4365 + this.field4372, this.field4368 + this.field4370);
			int var9 = this.field4369;
			int var10 = this.field4373;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class417 var21 = var1.method2129(0, var9);
			class417 var12 = var1.method2129(var9, var10);
			class417 var13 = var1.method2129(var10, var1.method2120());
			class417 var14 = var1.method2129(0, this.field4373);
			int var16;
			int var18;
			if (!var12.method2196()) {
				int var15 = var2.maxDescent + var2.maxAscent;

				for (var16 = 0; var16 < var12.method2197(); ++var16) {
					class415 var17 = var12.method2201(var16);
					var18 = var7 + var17.field3780;
					int var19 = var2.charWidth(var17.field3778);
					int var20 = var8 + var17.field3779 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field4363);
				}
			}

			if (!var21.method2196()) {
				var2.method2174(var21, var7, var8, this.field4367, this.field4364, -1);
			}

			if (!var12.method2196()) {
				var2.method2174(var12, var7, var8, this.field4366, this.field4364, -1);
			}

			if (!var13.method2196()) {
				var2.method2174(var13, var7, var8, this.field4367, this.field4364, -1);
			}

			if (this.field4361) {
				class504 var22 = var14.method2200();
				var16 = var7 + (Integer)var22.field4144;
				int var23 = var8 + (Integer)var22.field4145;
				var18 = var23 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var23, var16, var18, this.field4367);
				if (this.field4364 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var23 + 1, var16 + 1, var18 + 1, this.field4364);
				}
			}

		}
	}
}
