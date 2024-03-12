import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
@Implements("HttpAuthenticationHeader")
public class HttpAuthenticationHeader {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static final HttpAuthenticationHeader field3857;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("BEARER")
	static final HttpAuthenticationHeader BEARER;
	@ObfuscatedName("al")
	@Export("key")
	final String key;

	static {
		field3857 = new HttpAuthenticationHeader("Basic");
		BEARER = new HttpAuthenticationHeader("Bearer");
	}

	HttpAuthenticationHeader(String var1) {
		this.key = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1846241035"
	)
	@Export("getKey")
	String getKey() {
		return this.key;
	}
}
