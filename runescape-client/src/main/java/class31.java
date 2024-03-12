import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class31 {
	@ObfuscatedName("aq")
	public static Applet field86;
	@ObfuscatedName("aw")
	public static String field87;
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;

	static {
		field86 = null;
		field87 = "";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-511691401"
	)
	public static void method113() {
		class190.field2100.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2030677800"
	)
	static final int method114(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
