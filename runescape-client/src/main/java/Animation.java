import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("Animation")
public class Animation {
	@ObfuscatedName("aq")
	static int[] field2237;
	@ObfuscatedName("aw")
	static int[] field2238;
	@ObfuscatedName("al")
	static int[] field2236;
	@ObfuscatedName("ai")
	static int[] field2235;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("skeleton")
	Skeleton skeleton;
	@ObfuscatedName("as")
	@Export("transformCount")
	int transformCount;
	@ObfuscatedName("aa")
	@Export("transformSkeletonLabels")
	int[] transformSkeletonLabels;
	@ObfuscatedName("az")
	@Export("transformXs")
	int[] transformXs;
	@ObfuscatedName("ao")
	@Export("transformYs")
	int[] transformYs;
	@ObfuscatedName("au")
	@Export("transformZs")
	int[] transformZs;
	@ObfuscatedName("ak")
	@Export("hasAlphaTransform")
	boolean hasAlphaTransform;

	static {
		field2237 = new int[500];
		field2238 = new int[500];
		field2236 = new int[500];
		field2235 = new int[500];
	}

	@ObfuscatedSignature(
		descriptor = "([BLku;)V"
	)
	Animation(byte[] var1, Skeleton var2) {
		this.skeleton = null;
		this.transformCount = -1;
		this.hasAlphaTransform = false;
		this.skeleton = var2;
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		var3.offset = 2;
		int var5 = var3.readUnsignedByte();
		int var6 = -1;
		int var7 = 0;
		var4.offset = var5 + var3.offset;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.readUnsignedByte();
			if (var9 > 0) {
				if (this.skeleton.transformTypes[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.skeleton.transformTypes[var10] == 0) {
							field2237[var7] = var10;
							field2238[var7] = 0;
							field2236[var7] = 0;
							field2235[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2237[var7] = var8;
				short var11 = 0;
				if (this.skeleton.transformTypes[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2238[var7] = var4.readShortSmart();
				} else {
					field2238[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2236[var7] = var4.readShortSmart();
				} else {
					field2236[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2235[var7] = var4.readShortSmart();
				} else {
					field2235[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.skeleton.transformTypes[var8] == 5) {
					this.hasAlphaTransform = true;
				}
			}
		}

		if (var1.length != var4.offset) {
			throw new RuntimeException();
		} else {
			this.transformCount = var7;
			this.transformSkeletonLabels = new int[var7];
			this.transformXs = new int[var7];
			this.transformYs = new int[var7];
			this.transformZs = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.transformSkeletonLabels[var8] = field2237[var8];
				this.transformXs[var8] = field2238[var8];
				this.transformYs[var8] = field2236[var8];
				this.transformZs[var8] = field2235[var8];
			}

		}
	}
}
