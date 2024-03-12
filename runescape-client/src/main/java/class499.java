import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public abstract class class499 {
	@ObfuscatedName("az")
	int field4072;
	@ObfuscatedName("ao")
	int field4071;
	@ObfuscatedName("au")
	double field4069;
	@ObfuscatedName("ak")
	int field4070;

	class499(int var1, int var2) {
		this.field4072 = 0;
		this.field4071 = 0;
		this.field4069 = 0.0D;
		this.field4070 = 0;
		this.field4072 = var1;
		this.field4071 = 0;
		this.field4070 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field4069 = class328.method1759(this.field4071, this.field4072, this.field4070);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-13291"
	)
	public void method2451() {
		if (this.field4071 < this.field4072) {
			++this.field4071;
			this.field4069 = class328.method1759(this.field4071, this.field4072, this.field4070);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-623438626"
	)
	double method2452() {
		return this.field4069;
	}
}
