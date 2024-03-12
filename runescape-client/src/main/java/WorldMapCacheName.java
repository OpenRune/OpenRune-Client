import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	public static final WorldMapCacheName field2151;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	public static final WorldMapCacheName field2153;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	public static final WorldMapCacheName field2150;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final WorldMapCacheName field2157;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	public static final WorldMapCacheName field2152;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static IndexedSprite[] field2156;
	@ObfuscatedName("ub")
	static int field2154;
	@ObfuscatedName("as")
	@Export("name")
	public final String name;

	static {
		field2151 = new WorldMapCacheName("details");
		field2153 = new WorldMapCacheName("compositemap");
		field2150 = new WorldMapCacheName("compositetexture");
		field2157 = new WorldMapCacheName("area");
		field2152 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1813975840"
	)
	static int method1397(int var0) {
		return var0 * 3 + 600;
	}
}
