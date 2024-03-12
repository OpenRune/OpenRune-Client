import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("it")
public class class221 {
	@ObfuscatedName("aw")
	String field1924;
	@ObfuscatedName("al")
	int field1922;
	@ObfuscatedName("ai")
	ArrayList field1925;
	@ObfuscatedName("ar")
	ArrayList field1926;
	@ObfuscatedName("as")
	ArrayList field1927;
	@ObfuscatedName("aa")
	String field1923;
	@ObfuscatedName("az")
	float[] field1921;
	@ObfuscatedName("ao")
	Map field1928;
	@ObfuscatedName("au")
	Map field1929;

	class221() {
		this.field1922 = 0;
		this.field1925 = new ArrayList();
		this.field1926 = new ArrayList();
		this.field1927 = new ArrayList();
		this.field1923 = null;
		this.field1921 = new float[4];
		this.field1928 = new HashMap();
		this.field1929 = new HashMap();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "78"
	)
	String method1138() {
		return this.field1924;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-93251573"
	)
	int method1139() {
		return this.field1922;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-158880452"
	)
	void method1140() {
		this.field1923 = null;
		this.field1921[0] = 0.0F;
		this.field1921[1] = 0.0F;
		this.field1921[2] = 1.0F;
		this.field1921[3] = 1.0F;
		this.field1925.clear();
		this.field1926.clear();
		this.field1927.clear();
		this.field1928.clear();
		this.field1929.clear();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;I)Z",
		garbageValue = "952427396"
	)
	boolean method1141(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method1140();
				return false;
			}

			try {
				this.method1142(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field1926.clear();
			}

			try {
				this.method1144(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field1927.clear();
			}
		} else {
			try {
				this.method1143(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field1926.clear();
			}

			try {
				this.method1145(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field1927.clear();
			}
		}

		try {
			this.method1146(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field1923 = null;
			this.field1921[0] = 0.0F;
			this.field1921[1] = 0.0F;
			this.field1921[2] = 1.0F;
			this.field1921[3] = 1.0F;
			this.field1925.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method1147(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field1928.clear();
			this.field1929.clear();
		}

		if (var2 == 2) {
			try {
				this.field1924 = var4.getString("id");
				this.field1922 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lel;I)V",
		garbageValue = "-293909434"
	)
	void method1142(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class211 var5 = new class211(this);
					var5.field1873 = var2.request(new URL(var4.getString("src")));
					var5.field1874 = class136.method746(var4, "placement");
					this.field1926.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lel;B)V",
		garbageValue = "62"
	)
	void method1143(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class211 var3 = new class211(this);
			var3.field1873 = var2.request(new URL(var1.getString("src")));
			var3.field1874 = class136.method746(var1, "placement");
			this.field1926.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-2032707420"
	)
	void method1144(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class222 var4 = new class222(this);
				var4.field1934 = var3.getString("text");
				var4.field1932 = class226.method1175(var3.getString("align_x"));
				var4.field1931 = class226.method1175(var3.getString("align_y"));
				var4.field1933 = var3.getInt("font");
				var4.field1930 = class136.method746(var3, "placement");
				this.field1927.add(var4);
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-105"
	)
	void method1145(JSONObject var1) throws JSONException {
		class222 var2 = new class222(this);
		var2.field1934 = var1.optString("text");
		var2.field1932 = class226.method1175(var1.optString("align_x"));
		var2.field1931 = class226.method1175(var1.optString("align_y"));
		var2.field1933 = var1.optInt("font");
		var2.field1930 = class136.method746(var1, "placement");
		this.field1927.add(var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1473148449"
	)
	void method1146(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1921 = class136.method746(var1, "clickbounds");
			this.field1923 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1925.add(new class209(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1925.add(new class209(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1925.add(new class209(this, var2[var3], 0));
							} else {
								this.field1925.add(new class218(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "2100109315"
	)
	void method1147(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field1928.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field1928.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1928.put(var2[var3], 0);
					} else {
						this.field1929.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}
}
