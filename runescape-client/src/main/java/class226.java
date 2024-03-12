import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class226 implements class29 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	Widget field1942;
	@ObfuscatedName("aw")
	boolean field1941;
	@ObfuscatedName("al")
	boolean field1940;

	public class226() {
		this.field1942 = null;
		this.field1941 = false;
		this.field1940 = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2108130536"
	)
	@Export("vmethod4425")
	public boolean vmethod4425(int var1) {
		if (this.field1942 == null) {
			return false;
		} else {
			class27 var2 = this.field1942.method1925();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method98(var1)) {
					switch(var1) {
					case 81:
						this.field1940 = true;
						break;
					case 82:
						this.field1941 = true;
						break;
					default:
						if (this.method1174(var1)) {
							UserComparator5.invalidateWidget(this.field1942);
						}
					}
				}

				return var2.method96(var1);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2132067941"
	)
	public boolean vmethod4442(int var1) {
		switch(var1) {
		case 81:
			this.field1940 = false;
			return false;
		case 82:
			this.field1941 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-71"
	)
	@Export("vmethod4427")
	public boolean vmethod4427(char var1) {
		if (this.field1942 == null) {
			return false;
		} else if (!class344.method1794(var1)) {
			return false;
		} else {
			class347 var2 = this.field1942.method1923();
			if (var2 != null && var2.method1865()) {
				class27 var3 = this.field1942.method1925();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method99(var1) && var2.method1826(var1)) {
						UserComparator5.invalidateWidget(this.field1942);
					}

					return var3.method97(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "289932078"
	)
	@Export("vmethod4467")
	public boolean vmethod4467(boolean var1) {
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)V",
		garbageValue = "-104"
	)
	public void method1166(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field1942) {
				this.method1168();
				this.field1942 = var1;
			}

			class345 var2 = var1.method1926();
			if (var2 != null) {
				if (!var2.field2994.method1860() && var2.field2992 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method479(var1);
					var3.setArgs(var2.field2992);
					DirectByteArrayCopier.method1938().addFirst(var3);
				}

				var2.field2994.method1809(true);
			}
		} else {
			this.method1168();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lng;",
		garbageValue = "10"
	)
	public Widget method1167() {
		return this.field1942;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "27"
	)
	public void method1168() {
		if (this.field1942 != null) {
			class345 var1 = this.field1942.method1926();
			Widget var2 = this.field1942;
			this.field1942 = null;
			if (var1 != null) {
				if (var1.field2994.method1860() && var1.field2992 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method479(var2);
					var3.setArgs(var1.field2992);
					DirectByteArrayCopier.method1938().addFirst(var3);
				}

				var1.field2994.method1809(false);
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "91"
	)
	boolean method1174(int var1) {
		if (this.field1942 == null) {
			return false;
		} else {
			class347 var2 = this.field1942.method1923();
			if (var2 != null && var2.method1865()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method1168();
					return true;
				case 48:
					if (this.field1941) {
						var2.method1832();
					}

					return true;
				case 65:
					if (this.field1941) {
						var5 = class193.client.method129();
						var2.method1851(var5);
					}

					return true;
				case 66:
					if (this.field1941) {
						var5 = class193.client.method129();
						var2.method1850(var5);
					}

					return true;
				case 67:
					if (this.field1941) {
						var5 = class193.client.method129();
						var2.method1852(var5);
					}

					return true;
				case 84:
					if (var2.method1871() == 0) {
						var2.method1826(10);
					} else if (this.field1940 && var2.method1875()) {
						var2.method1826(10);
					} else {
						class345 var3 = this.field1942.method1926();
						ScriptEvent var4 = new ScriptEvent();
						var4.method479(this.field1942);
						var4.setArgs(var3.field2990);
						DirectByteArrayCopier.method1938().addFirst(var4);
						this.method1168();
					}

					return true;
				case 85:
					if (this.field1941) {
						var2.method1829();
					} else {
						var2.method1827();
					}

					return true;
				case 96:
					if (this.field1941) {
						var2.method1840(this.field1940);
					} else {
						var2.method1838(this.field1940);
					}

					return true;
				case 97:
					if (this.field1941) {
						var2.method1841(this.field1940);
					} else {
						var2.method1839(this.field1940);
					}

					return true;
				case 98:
					if (this.field1941) {
						var2.method1853();
					} else {
						var2.method1842(this.field1940);
					}

					return true;
				case 99:
					if (this.field1941) {
						var2.method1854();
					} else {
						var2.method1843(this.field1940);
					}

					return true;
				case 101:
					if (this.field1941) {
						var2.method1830();
					} else {
						var2.method1828();
					}

					return true;
				case 102:
					if (this.field1941) {
						var2.method1836(this.field1940);
					} else {
						var2.method1834(this.field1940);
					}

					return true;
				case 103:
					if (this.field1941) {
						var2.method1837(this.field1940);
					} else {
						var2.method1835(this.field1940);
					}

					return true;
				case 104:
					if (this.field1941) {
						var2.method1846(this.field1940);
					} else {
						var2.method1844(this.field1940);
					}

					return true;
				case 105:
					if (this.field1941) {
						var2.method1847(this.field1940);
					} else {
						var2.method1845(this.field1940);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "556823062"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CLpe;B)I",
		garbageValue = "82"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-13"
	)
	static int method1175(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}
