import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("px")
public class class404 {
	@ObfuscatedName("aq")
	static char[] field3749;
	@ObfuscatedName("aw")
	static char[] field3750;
	@ObfuscatedName("al")
	static char[] field3748;
	@ObfuscatedName("ai")
	static int[] field3751;

	static {
		field3749 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field3749[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3749[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3749[var0] = (char)(var0 + 48 - 52);
		}

		field3749[62] = '+';
		field3749[63] = '/';
		field3750 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3750[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3750[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3750[var0] = (char)(var0 + 48 - 52);
		}

		field3750[62] = '*';
		field3750[63] = '-';
		field3748 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field3748[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field3748[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field3748[var0] = (char)(var0 + 48 - 52);
		}

		field3748[62] = '-';
		field3748[63] = '_';
		field3751 = new int[128];

		for (var0 = 0; var0 < field3751.length; ++var0) {
			field3751[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field3751[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field3751[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field3751[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3751;
		field3751[43] = 62;
		var2[42] = 62;
		int[] var1 = field3751;
		field3751[47] = 63;
		var1[45] = 63;
	}
}
