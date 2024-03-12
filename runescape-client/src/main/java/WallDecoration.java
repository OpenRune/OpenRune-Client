import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("aq")
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ar")
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("as")
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("aa")
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("au")
	@Export("tag")
	public long tag;
	@ObfuscatedName("ak")
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}
}
