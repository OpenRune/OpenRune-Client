import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class414 {
	@ObfuscatedName("aq")
	int field3777;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class414(int var1, boolean var2) {
		this.field3777 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "60"
	)
	public int method2157() {
		return this.field3777;
	}
}
