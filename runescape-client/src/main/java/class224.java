import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public abstract class class224 {
	@ObfuscatedName("ai")
	String field1939;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lit;Ljava/lang/String;)V"
	)
	class224(class221 var1, String var2) {
		this.this$0 = var1;
		this.field1939 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2105911105"
	)
	@Export("vmethod4366")
	public abstract int vmethod4366();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-8310"
	)
	@Export("vmethod4368")
	public int vmethod4368() {
		return -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("vmethod4367")
	public String vmethod4367() {
		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1193221178"
	)
	public String method1158() {
		return this.field1939;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)I",
		garbageValue = "13055"
	)
	static final int method1156(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("aw")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class407.base37Table[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "24441"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Script.method454();
		if (Projectile.friendsChat != null) {
			Projectile.friendsChat.invalidateIgnoreds();
		}

	}
}
