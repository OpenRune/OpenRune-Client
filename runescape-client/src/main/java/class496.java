import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
public class class496 extends class498 {
	@ObfuscatedName("aa")
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("aq")
	int field4063;
	@ObfuscatedName("aw")
	int field4066;
	@ObfuscatedName("al")
	int field4062;
	@ObfuscatedName("ai")
	int field4061;
	@ObfuscatedName("ar")
	int field4064;
	@ObfuscatedName("as")
	int field4065;

	public class496(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field4063 = 0;
		this.field4066 = 0;
		this.field4062 = 0;
		this.field4061 = 0;
		this.field4064 = 0;
		this.field4065 = 0;
		this.field4063 = var1;
		this.field4066 = var2;
		this.field4062 = var3;
		this.field4061 = var4;
		this.field4064 = var5;
		this.field4065 = var6;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1316582552"
	)
	public int vmethod8869() {
		double var1 = this.method2452();
		return (int)Math.round(var1 * (double)(this.field4061 - this.field4063) + (double)this.field4063);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1514290339"
	)
	public int vmethod8868() {
		double var1 = this.method2452();
		return (int)Math.round(var1 * (double)(this.field4064 - this.field4066) + (double)this.field4066);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-79"
	)
	public int vmethod8874() {
		double var1 = this.method2452();
		return (int)Math.round(var1 * (double)(this.field4065 - this.field4062) + (double)this.field4062);
	}
}
