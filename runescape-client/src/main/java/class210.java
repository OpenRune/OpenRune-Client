import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("il")
public class class210 {
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	class219 field1865;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	class221 field1868;
	@ObfuscatedName("ah")
	int field1867;
	@ObfuscatedName("aj")
	String field1870;
	@ObfuscatedName("af")
	String field1869;
	@ObfuscatedName("ax")
	String field1871;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	UrlRequest field1864;
	@ObfuscatedName("ag")
	int field1866;

	public class210() {
		this.field1867 = -1;
		this.field1866 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lim;",
		garbageValue = "-502019476"
	)
	public class219 method1086() {
		return this.field1865;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;I)Z",
		garbageValue = "-118439298"
	)
	public boolean method1087(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method1099();

				try {
					this.field1870 = var1;
					this.field1864 = var3.request(new URL(this.field1870));
					this.field1867 = 0;
				} catch (MalformedURLException var5) {
					this.method1099();
					this.field1867 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field1871 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "101"
	)
	public void method1088(String var1, String var2, String var3) {
		this.field1865 = VarbitComposition.method990();
		this.field1869 = var1;
		this.field1865.method1130(this.field1869, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "-809833952"
	)
	public void method1089(UrlRequester var1) {
		switch(this.field1867) {
		case 0:
			this.method1100(var1);
			break;
		case 1:
			this.method1101();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2049217182"
	)
	public int method1090() {
		return this.field1867;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-121"
	)
	public int method1091(String var1) {
		return this.field1868.field1928.containsKey(var1) ? (Integer)this.field1868.field1928.get(var1) : -1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1954864910"
	)
	public String method1092(String var1) {
		return (String)((String)(this.field1868.field1929.containsKey(var1) ? this.field1868.field1929.get(var1) : null));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-447746548"
	)
	public ArrayList method1093() {
		return this.field1868.field1926;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "111"
	)
	public ArrayList method1094() {
		return this.field1868.field1927;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-6"
	)
	public ArrayList method1095() {
		return this.field1868.field1925;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "126321540"
	)
	public String method1096() {
		return this.field1868.field1923;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "34"
	)
	public float[] method1097() {
		return this.field1868.field1921;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "112414850"
	)
	public String method1098() {
		return this.field1868.method1138();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2064016499"
	)
	void method1099() {
		this.field1864 = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lel;B)V",
		garbageValue = "16"
	)
	void method1100(UrlRequester var1) {
		if (this.field1864 != null && this.field1864.isDone()) {
			byte[] var2 = this.field1864.getResponse();
			if (var2 == null) {
				this.method1099();
				this.field1867 = 4;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field1866 = var4.getInt("version");
					} catch (Exception var7) {
						this.method1099();
						this.field1867 = 6;
						return;
					}

					if (this.field1866 < 2) {
						if (!this.field1868.method1141(var4, this.field1866, var1)) {
							this.field1867 = 6;
						}
					} else if (this.field1866 == 2) {
						class223 var5 = class223.field1936;
						var5.method1149(var4, this.field1866, var1);
						this.field1868 = var5.method1154(this.field1871);
						if (this.field1868 != null) {
							this.method1101();
							this.field1867 = 1;
						} else {
							this.field1867 = 7;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method1099();
					this.field1867 = 6;
					return;
				}

				if (this.field1868 != null) {
					this.field1867 = this.field1868.field1926.size() > 0 ? 1 : 2;
				}

				this.field1864 = null;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method1101() {
		Iterator var1 = this.field1868.field1926.iterator();

		class211 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1868.field1926.iterator();

				while (var1.hasNext()) {
					var2 = (class211)var1.next();
					if (var2.field1873 != null) {
						byte[] var3 = var2.field1873.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field1867 = 2;
							return;
						}
					}
				}

				this.method1099();
				this.field1867 = 5;
				return;
			}

			var2 = (class211)var1.next();
		} while(var2.field1873 == null || var2.field1873.isDone());

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)Z",
		garbageValue = "-871874771"
	)
	public boolean method1102(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field1866 = var3.getInt("version");
			} catch (Exception var5) {
				this.method1099();
				this.field1867 = 6;
				return false;
			}

			if (!this.field1868.method1141(var3, this.field1866, var2)) {
				this.field1867 = 6;
			}

			this.field1867 = this.field1868.field1926.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.field1867 = 6;
		}

		return this.field1867 < 3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "625151772"
	)
	static final int method1103(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
