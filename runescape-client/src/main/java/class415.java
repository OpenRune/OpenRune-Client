import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class415 {
	@ObfuscatedName("aq")
	public char field3778;
	@ObfuscatedName("aw")
	public int field3780;
	@ObfuscatedName("al")
	public int field3779;

	class415() {
		this.field3780 = 0;
		this.field3779 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-2"
	)
	static String method2158(int var0) {
		return "<img=" + var0 + ">";
	}
}
