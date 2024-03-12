import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public class class255 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static final class255 field2132;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static final class255 field2133;
	@ObfuscatedName("al")
	final int field2134;

	static {
		field2132 = new class255(0);
		field2133 = new class255(1);
	}

	class255(int var1) {
		this.field2134 = var1;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1731550026"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
