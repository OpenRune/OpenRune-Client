import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("aq")
	@Export("width")
	int width;
	@ObfuscatedName("aw")
	@Export("height")
	int height;
	@ObfuscatedName("al")
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}
}
