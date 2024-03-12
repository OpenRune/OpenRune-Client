import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uw")
final class class520 implements class517 {
	@ObfuscatedName("ai")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("aa")
	static int field4196;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luq;S)V",
		garbageValue = "25989"
	)
	@Export("vmethod9339")
	public void vmethod9339(Object var1, Buffer var2) {
		this.method2565((Long)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)Ljava/lang/Object;",
		garbageValue = "-1139404213"
	)
	@Export("vmethod9338")
	public Object vmethod9338(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Luq;B)V",
		garbageValue = "96"
	)
	void method2565(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
