import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class363 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final class363 field3236;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static final class363 field3237;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("al")
	final int field3239;
	@ObfuscatedName("ai")
	final int field3238;

	static {
		field3236 = new class363(51, 27, 800, 0, 16, 16);
		field3237 = new class363(25, 28, 800, 656, 40, 40);
	}

	class363(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3239 = var5;
		this.field3238 = var6;
	}
}
