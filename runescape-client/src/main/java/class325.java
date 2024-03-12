import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class325 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("aq")
	int field2905;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	class53 field2904;

	@ObfuscatedSignature(
		descriptor = "(ILch;)V"
	)
	class325(int var1, class53 var2) {
		this.field2905 = var1;
		this.field2904 = var2;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1804688495"
	)
	static void method1753() {
		for (class227 var0 = (class227)Client.field658.last(); var0 != null; var0 = (class227)Client.field658.previous()) {
			var0.remove();
		}

	}
}
