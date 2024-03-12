import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kx")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("aq")
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@Export("y")
	int y;
	@ObfuscatedName("al")
	@Export("z")
	int z;

	FaceNormal() {
	}
}
