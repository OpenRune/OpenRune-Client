import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vh")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("aq")
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("aw")
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("al")
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("ai")
	public int field4380;
	@ObfuscatedName("ar")
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field4380 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field4380 = var3;
		this.spotAnimationFrame = var4;
	}
}
