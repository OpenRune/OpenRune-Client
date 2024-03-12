import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bl")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("aq")
	int field245;
	@ObfuscatedName("aw")
	int field246;
	@ObfuscatedName("al")
	int[] field248;
	@ObfuscatedName("ai")
	int[] field247;

	VorbisMapping() {
		class60 var1 = VorbisSample.field262;
		var1.method320(16);
		this.field245 = var1.method321() != 0 ? var1.method320(4) + 1 : 1;
		if (var1.method321() != 0) {
			var1.method320(8);
		}

		var1.method320(2);
		if (this.field245 > 1) {
			this.field246 = var1.method320(4);
		}

		this.field248 = new int[this.field245];
		this.field247 = new int[this.field245];

		for (int var2 = 0; var2 < this.field245; ++var2) {
			var1.method320(8);
			this.field248[var2] = var1.method320(8);
			this.field247[var2] = var1.method320(8);
		}

	}
}
