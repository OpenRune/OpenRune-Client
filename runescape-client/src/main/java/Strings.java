import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fi")
	public static String field3392;
	@ObfuscatedName("kd")
	public static String field3505;
	@ObfuscatedName("kh")
	public static String field3509;
	@ObfuscatedName("kp")
	public static String field3515;

	static {
		field3392 = "Please visit the support page for assistance.";
		field3505 = "";
		field3509 = "Page has opened in the browser.";
		field3515 = "";
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "77792910"
	)
	static void method1959(int var0, int var1) {
		MenuAction var2 = class363.tempMenuAction;
		if (var2 != null) {
			ReflectionCheck.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.itemId, var2.action, var2.target, var0, var1);
		}

		class363.tempMenuAction = null;
	}
}
