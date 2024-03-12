import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("FloorDecoration")
public final class FloorDecoration {
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
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ar")
	@Export("tag")
	public long tag;
	@ObfuscatedName("as")
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "371254580"
	)
	public static void method1447() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}
}
