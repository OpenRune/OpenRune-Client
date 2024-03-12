import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
public class class534 {
	@ObfuscatedName("aq")
	int[] field4261;
	@ObfuscatedName("aw")
	short[] field4262;

	@ObfuscatedSignature(
		descriptor = "(Lho;)V"
	)
	public class534(NPCComposition var1) {
		this.field4261 = new int[8];
		this.field4262 = new short[8];
		int var2 = 0;
		if (var1.method961()) {
			var2 = var1.method962().length;
			System.arraycopy(var1.method962(), 0, this.field4261, 0, var2);
			System.arraycopy(var1.method964(), 0, this.field4262, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field4261[var3] = -1;
			this.field4262[var3] = -1;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "153301675"
	)
	public int[] method2676() {
		return this.field4261;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1838511532"
	)
	public short[] method2677() {
		return this.field4262;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-956250169"
	)
	public void method2678(int var1, int var2, short var3) {
		this.field4261[var1] = var2;
		this.field4262[var1] = var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "221820389"
	)
	public void method2679(int[] var1, short[] var2) {
		this.field4261 = var1;
		this.field4262 = var2;
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "689661422"
	)
	static final void method2680() {
		Client.field545 = Client.cycleCntr;
		class257.field2139 = true;
	}
}
