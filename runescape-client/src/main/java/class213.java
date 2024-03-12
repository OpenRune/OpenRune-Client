import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class213 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lof;IB)V",
		garbageValue = "-69"
	)
	static void method1111(AbstractArchive var0, int var1) {
		if ((var1 & class529.field4229.rsOrdinal()) != 0) {
			Login.logoSprite = class173.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & class529.field4231.rsOrdinal()) != 0) {
			Login.logoSprite = class173.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else if ((var1 & class529.field4225.rsOrdinal()) != 0) {
			Login.logoSprite = class173.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", "");
		} else {
			Login.logoSprite = class173.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}
}
