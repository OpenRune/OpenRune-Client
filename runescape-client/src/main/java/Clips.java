import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("Clips")
public class Clips {
	@ObfuscatedName("aq")
	boolean field2500;
	@ObfuscatedName("aw")
	@Export("rasterGouraudLowRes")
	public boolean rasterGouraudLowRes;
	@ObfuscatedName("al")
	int field2505;
	@ObfuscatedName("as")
	public int field2512;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("aj")
	int field2504;
	@ObfuscatedName("af")
	int field2502;
	@ObfuscatedName("ax")
	int field2509;
	@ObfuscatedName("an")
	int field2507;
	@ObfuscatedName("ag")
	@Export("clipNegativeMidX")
	int clipNegativeMidX;
	@ObfuscatedName("am")
	int field2506;
	@ObfuscatedName("ad")
	@Export("clipNegativeMidY")
	int clipNegativeMidY;
	@ObfuscatedName("at")
	int field2508;
	@ObfuscatedName("ay")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	Clips() {
		this.field2500 = false;
		this.rasterGouraudLowRes = true;
		this.field2505 = 0;
		this.field2512 = 512;
		this.Rasterizer3D_rowOffsets = new int[1024];
	}

	@ObfuscatedName("aq")
	void method1622() {
		this.field2504 = this.field2509 / 2;
		this.field2502 = this.field2507 / 2;
		this.clipNegativeMidX = -this.field2504;
		this.field2506 = this.field2509 - this.field2504;
		this.clipNegativeMidY = -this.field2502;
		this.field2508 = this.field2507 - this.field2502;
	}

	@ObfuscatedName("aw")
	void method1623(int var1, int var2, int var3, int var4) {
		this.field2504 = var1 - var2;
		this.field2502 = var3 - var4;
		this.clipNegativeMidX = -this.field2504;
		this.field2506 = this.field2509 - this.field2504;
		this.clipNegativeMidY = -this.field2502;
		this.field2508 = this.field2507 - this.field2502;
	}

	@ObfuscatedName("al")
	void method1624(int var1, int var2, int var3) {
		this.field2500 = var1 < 0 || var1 > this.field2509 || var2 < 0 || var2 > this.field2509 || var3 < 0 || var3 > this.field2509;
	}
}
