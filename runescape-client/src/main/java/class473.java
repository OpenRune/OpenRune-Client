import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public class class473 implements class478 {
	@ObfuscatedName("au")
	static int field3998;
	@ObfuscatedName("mb")
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	public final class508 field4000;

	@ObfuscatedSignature(
		descriptor = "(Lti;)V"
	)
	class473(class509 var1) {
		this.field4000 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lsq;)V"
	)
	public class473(class474 var1) {
		this(new class509(var1));
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2135189026"
	)
	public int method2396(int var1) {
		return this.field4000.vmethod9189(var1);
	}
}
