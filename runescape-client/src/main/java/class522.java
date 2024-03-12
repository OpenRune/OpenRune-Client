import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uo")
final class class522 implements class517 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luq;S)V",
		garbageValue = "25989"
	)
	@Export("vmethod9339")
	public void vmethod9339(Object var1, Buffer var2) {
		this.method2573((String)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)Ljava/lang/Object;",
		garbageValue = "-1139404213"
	)
	@Export("vmethod9338")
	public Object vmethod9338(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Luq;I)V",
		garbageValue = "-930203975"
	)
	void method2573(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
