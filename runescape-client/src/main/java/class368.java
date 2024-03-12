import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class368 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1891610836"
	)
	static final String method1958(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-462155747"
	)
	public static String method1957(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	static final void method1956(String var0) {
		SecureRandomCallable.method466(var0 + " is already on your ignore list");
	}
}
