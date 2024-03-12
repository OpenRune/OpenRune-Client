import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("ItemLayer")
public final class ItemLayer {
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
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("aa")
	@Export("tag")
	long tag;
	@ObfuscatedName("az")
	@Export("height")
	int height;

	ItemLayer() {
	}
}
