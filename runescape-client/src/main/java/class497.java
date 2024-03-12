import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class497 extends class499 {
	@ObfuscatedName("aq")
	int field4067;
	@ObfuscatedName("aw")
	int field4068;

	public class497(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field4067 = 0;
		this.field4068 = 0;
		this.field4067 = var1;
		this.field4068 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2068931324"
	)
	public int method2447() {
		double var1 = this.method2452();
		return (int)Math.round((double)this.field4067 + var1 * (double)(this.field4068 - this.field4067));
	}
}
