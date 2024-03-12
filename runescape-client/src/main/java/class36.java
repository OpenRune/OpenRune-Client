import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class36 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("cq")
	@Export("otpMedium")
	static int otpMedium;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-1197841897"
	)
	public static void method162(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	static void method163(String var0, String var1, String var2) {
		JagexCache.method1113(7);
		SecureUrlRequester.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	static void method164() {
		class30.clientPreferences.method575(Client.field450);
	}
}
