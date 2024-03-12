import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("aq")
	@Export("swColor")
	int swColor;
	@ObfuscatedName("aw")
	@Export("seColor")
	int seColor;
	@ObfuscatedName("al")
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ai")
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ar")
	@Export("texture")
	int texture;
	@ObfuscatedName("as")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("aa")
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}
}
