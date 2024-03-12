import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("aq")
	int field2932;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	MusicPatchNode2 field2939;
	@ObfuscatedName("ar")
	int field2933;
	@ObfuscatedName("as")
	int field2934;
	@ObfuscatedName("aa")
	int field2922;
	@ObfuscatedName("az")
	int field2938;
	@ObfuscatedName("ao")
	int field2931;
	@ObfuscatedName("au")
	int field2936;
	@ObfuscatedName("ak")
	int field2928;
	@ObfuscatedName("ah")
	int field2926;
	@ObfuscatedName("aj")
	int field2927;
	@ObfuscatedName("af")
	int field2924;
	@ObfuscatedName("ax")
	int field2937;
	@ObfuscatedName("an")
	int field2930;
	@ObfuscatedName("ag")
	int field2925;
	@ObfuscatedName("am")
	int field2929;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("at")
	int field2935;
	@ObfuscatedName("ae")
	int field2923;

	MusicPatchNode() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method1770() {
		this.table = null;
		this.rawSound = null;
		this.field2939 = null;
		this.stream = null;
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "1"
	)
	static final void method1771(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method1470(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.method1470(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
