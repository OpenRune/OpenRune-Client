import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class172 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmf;",
		garbageValue = "-1094244381"
	)
	static class314[] method892() {
		return new class314[]{class314.field2818, class314.field2817, class314.field2820, class314.field2815, class314.field2822, class314.field2821, class314.field2819, class314.field2816};
	}
}
