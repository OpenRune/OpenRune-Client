import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static final HttpContentType field4003;
	@ObfuscatedName("al")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		field4003 = new HttpContentType("text/plain");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1029608624"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;B)I",
		garbageValue = "-120"
	)
	public static int method2407(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method2409() {
		if (MilliClock.field1892 != null) {
			Client.field390 = Client.cycle;
			MilliClock.field1892.method2051();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					MilliClock.field1892.method2050((Client.players[var0].x >> 7) + Projectile.baseX, (Client.players[var0].y >> 7) + GameEngine.baseY);
				}
			}
		}

	}
}
