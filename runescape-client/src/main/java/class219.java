import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("im")
public class class219 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class219 field1901;
	@ObfuscatedName("aq")
	String field1910;
	@ObfuscatedName("aw")
	String field1911;
	@ObfuscatedName("al")
	String field1908;
	@ObfuscatedName("ai")
	String field1907;
	@ObfuscatedName("ar")
	long field1912;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	AsyncRestClient field1903;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	AsyncHttpResponse field1902;
	@ObfuscatedName("az")
	final int field1914;
	@ObfuscatedName("ao")
	final int field1913;
	@ObfuscatedName("au")
	int field1905;
	@ObfuscatedName("ax")
	int field1906;
	@ObfuscatedName("an")
	String field1909;
	@ObfuscatedName("am")
	boolean field1904;

	static {
		field1901 = new class219();
	}

	class219() {
		this.field1910 = "";
		this.field1911 = "";
		this.field1908 = "";
		this.field1907 = "";
		this.field1912 = -1L;
		this.field1914 = 1;
		this.field1913 = 2;
		this.field1905 = 1;
		this.field1906 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1018900511"
	)
	public void method1128(int var1, String var2) {
		this.field1906 = var1;
		this.field1909 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1351678430"
	)
	public void method1129(boolean var1) {
		this.field1904 = var1;
		this.field1903 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1191721460"
	)
	void method1130(String var1, String var2, String var3) {
		if (this.field1905 != 2) {
			this.field1910 = var1;
			this.field1911 = var2;
			this.field1908 = var3;
			if (!this.field1910.endsWith("/")) {
				this.field1910 = this.field1910 + "/";
			}

			if (!this.field1911.equals("")) {
				String var4 = this.field1910;
				var4 = var4 + "session/open/" + this.field1911;
				if (this.field1908.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field1908;

				try {
					this.field1902 = this.method1137(var4);
					this.field1912 = SecureRandomCallable.method465();
				} catch (IOException var6) {
					this.field1902 = null;
					this.field1911 = "";
					this.field1908 = "";
				}

			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1886033696"
	)
	public void method1132() {
		if (this.field1902 == null) {
			if (!this.field1907.isEmpty() && this.field1905 == 1) {
				long var1 = SecureRandomCallable.method465();
				long var3 = var1 - this.field1912;
				String var5 = this.field1910;
				var5 = var5 + "session/close/" + this.field1911 + "/" + this.field1907;
				if (this.field1908.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field1908 + "&sessionDuration=" + var3;
				}

				try {
					this.field1902 = this.method1137(var5);
				} catch (IOException var7) {
					this.field1905 = 1;
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method1133() {
		if (this.field1903 != null) {
			this.field1903.shutdown();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1756755184"
	)
	void method1134() {
		if (!this.field1907.isEmpty()) {
			String var1 = "";
			switch(this.field1906) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field1909.isEmpty()) {
				String var2 = this.field1910;
				var2 = var2 + var1 + "/" + this.field1911 + "/" + this.field1907 + "/" + this.field1909 + "?userHash=" + this.field1908;

				try {
					this.field1902 = this.method1137(var2);
				} catch (IOException var4) {
					this.field1905 = 1;
				}

				this.field1905 = 1;
				this.field1906 = 0;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "996137810"
	)
	public void method1135() {
		if (this.field1902 != null && this.field1902.hasFinished()) {
			if (this.field1902.hasFinished() && this.field1902.await().getResponseCode() == 200 && this.field1907.isEmpty()) {
				String var1 = this.field1902.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field1907 = var1;
			}

			if (this.field1906 != 0) {
				this.method1134();
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1524563464"
	)
	public boolean method1136(String var1) {
		this.method1128(2, var1);
		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lad;",
		garbageValue = "-25"
	)
	AsyncHttpResponse method1137(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field1904);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field1903.submitRequest(var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2011298012"
	)
	static int method1131(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
