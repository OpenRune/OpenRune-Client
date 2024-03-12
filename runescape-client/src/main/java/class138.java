import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class138 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lof;III)[Lvd;",
		garbageValue = "-86233743"
	)
	public static SpritePixels[] method750(AbstractArchive var0, int var1, int var2) {
		if (!class130.method720(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class548.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class548.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = class548.SpriteBuffer_spriteWidth;
				var6.height = class548.SpriteBuffer_spriteHeight;
				var6.xOffset = class548.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class548.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class235.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class548.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subWidth * var6.subHeight;
				byte[] var8 = class548.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					var6.pixels[var9] = AbstractSocket.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class548.SpriteBuffer_xOffsets = null;
			class548.SpriteBuffer_yOffsets = null;
			class235.SpriteBuffer_spriteWidths = null;
			class548.SpriteBuffer_spriteHeights = null;
			AbstractSocket.SpriteBuffer_spritePalette = null;
			class548.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
