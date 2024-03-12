import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class467 {
	@ObfuscatedName("aq")
	float field3963;
	@ObfuscatedName("aw")
	float field3964;
	@ObfuscatedName("al")
	float field3962;

	static {
		new class467(0.0F, 0.0F, 0.0F);
		new class467(1.0F, 1.0F, 1.0F);
		new class467(1.0F, 0.0F, 0.0F);
		new class467(0.0F, 1.0F, 0.0F);
		new class467(0.0F, 0.0F, 1.0F);
	}

	class467(float var1, float var2, float var3) {
		this.field3963 = var1;
		this.field3964 = var2;
		this.field3962 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-1"
	)
	final float method2367() {
		return (float)Math.sqrt((double)(this.field3962 * this.field3962 + this.field3963 * this.field3963 + this.field3964 * this.field3964));
	}

	public String toString() {
		return this.field3963 + ", " + this.field3964 + ", " + this.field3962;
	}
}
