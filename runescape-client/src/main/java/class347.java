import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public class class347 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class413 field3030;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class413 field3029;
	@ObfuscatedName("at")
	boolean field3011;
	@ObfuscatedName("ay")
	boolean field3012;
	@ObfuscatedName("ae")
	int field3014;
	@ObfuscatedName("ac")
	boolean field3010;
	@ObfuscatedName("ab")
	int field3013;
	@ObfuscatedName("av")
	int field3016;
	@ObfuscatedName("ap")
	int field3015;
	@ObfuscatedName("bu")
	int field3025;
	@ObfuscatedName("bo")
	int field3022;
	@ObfuscatedName("bd")
	int field3018;
	@ObfuscatedName("bi")
	int field3019;
	@ObfuscatedName("bq")
	int field3023;
	@ObfuscatedName("ba")
	int field3017;
	@ObfuscatedName("bt")
	int field3024;
	@ObfuscatedName("bk")
	int field3020;
	@ObfuscatedName("bm")
	int field3021;
	@ObfuscatedName("bw")
	int field3026;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class339 field3027;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class339 field3028;

	class347() {
		this.field3030 = new class413();
		this.field3029 = new class413();
		this.field3011 = false;
		this.field3012 = true;
		this.field3014 = 0;
		this.field3010 = false;
		this.field3013 = 0;
		this.field3016 = 0;
		this.field3015 = 0;
		this.field3025 = 0;
		this.field3022 = 0;
		this.field3018 = 0;
		this.field3019 = 0;
		this.field3023 = Integer.MAX_VALUE;
		this.field3017 = Integer.MAX_VALUE;
		this.field3024 = 0;
		this.field3020 = 0;
		this.field3021 = 0;
		this.field3026 = 0;
		this.field3030.method2126(1);
		this.field3029.method2126(1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-756472438"
	)
	void method1808() {
		this.field3014 = (this.field3014 + 1) % 60;
		if (this.field3019 > 0) {
			--this.field3019;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "753569973"
	)
	public boolean method1809(boolean var1) {
		var1 = var1 && this.field3012;
		boolean var2 = this.field3011 != var1;
		this.field3011 = var1;
		if (!this.field3011) {
			this.method1833(this.field3025, this.field3025);
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1273758417"
	)
	public void method1810(boolean var1) {
		this.field3012 = var1;
		this.field3011 = var1 && this.field3011;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "528177582"
	)
	public boolean method1811(String var1) {
		String var2 = this.field3030.method2121();
		if (!var2.equals(var1)) {
			var1 = this.method1877(var1);
			this.field3030.method2133(var1);
			this.method1833(this.field3022, this.field3025);
			this.method1818(this.field3021, this.field3026);
			this.method1881();
			this.method1886();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2132521772"
	)
	boolean method1812(String var1) {
		this.field3029.method2133(var1);
		return true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)Z",
		garbageValue = "7"
	)
	boolean method1813(AbstractFont var1) {
		boolean var2 = !this.field3010;
		this.field3030.method2125(var1);
		this.field3029.method2125(var1);
		this.field3010 = true;
		var2 |= this.method1818(this.field3021, this.field3026);
		var2 |= this.method1833(this.field3022, this.field3025);
		if (this.method1881()) {
			this.method1886();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "4"
	)
	public boolean method1814(int var1, int var2) {
		boolean var3 = this.field3024 != var1 || var2 != this.field3020;
		this.field3024 = var1;
		this.field3020 = var2;
		var3 |= this.method1818(this.field3021, this.field3026);
		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2020341672"
	)
	public boolean method1815(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3030.method2144();
		this.field3030.method2122(var1);
		this.field3029.method2122(var1);
		if (this.method1881()) {
			this.method1886();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "96"
	)
	public boolean method1816(int var1) {
		this.field3030.method2123(var1);
		if (this.method1881()) {
			this.method1886();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2117018219"
	)
	public boolean method1817(int var1) {
		this.field3017 = var1;
		if (this.method1881()) {
			this.method1886();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1128260790"
	)
	public boolean method1818(int var1, int var2) {
		if (!this.method1865()) {
			this.field3021 = var1;
			this.field3026 = var2;
			return false;
		} else {
			int var3 = this.field3021;
			int var4 = this.field3026;
			int var5 = Math.max(0, this.field3030.method2139() - this.field3024 + 2);
			int var6 = Math.max(0, this.field3030.method2140() - this.field3020 + 1);
			this.field3021 = Math.max(0, Math.min(var5, var1));
			this.field3026 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3021 || var4 != this.field3026;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "911185863"
	)
	public boolean method1819(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3030.method2127(var1, var2) : false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "65"
	)
	public void method1820(int var1) {
		this.field3030.method2128(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1715771131"
	)
	public void method1821(int var1) {
		this.field3013 = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-525256758"
	)
	public void method1822(int var1) {
		this.field3030.method2126(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	public void method1823(int var1) {
		this.field3030.method2124(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-104"
	)
	public boolean method1824(int var1) {
		this.field3015 = var1;
		String var2 = this.field3030.method2121();
		int var3 = var2.length();
		var2 = this.method1877(var2);
		if (var2.length() != var3) {
			this.field3030.method2133(var2);
			this.method1818(this.field3021, this.field3026);
			this.method1881();
			this.method1886();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-20912"
	)
	public void method1825() {
		this.field3010 = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-290248574"
	)
	public boolean method1826(int var1) {
		if (this.method1887(var1)) {
			this.method1831();
			class414 var2 = this.field3030.method2130((char)var1, this.field3025, this.field3023);
			this.method1833(var2.method2157(), var2.method2157());
			this.method1881();
			this.method1886();
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method1827() {
		if (!this.method1831() && this.field3025 > 0) {
			int var1 = this.field3030.method2135(this.field3025 - 1);
			this.method1886();
			this.method1833(var1, var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "898173700"
	)
	public void method1828() {
		if (!this.method1831() && this.field3025 < this.field3030.method2120()) {
			int var1 = this.field3030.method2135(this.field3025);
			this.method1886();
			this.method1833(var1, var1);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-811114332"
	)
	public void method1829() {
		if (!this.method1831() && this.field3025 > 0) {
			class504 var1 = this.method1879(this.field3025 - 1);
			int var2 = this.field3030.method2136((Integer)var1.field4144, this.field3025);
			this.method1886();
			this.method1833(var2, var2);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "878062977"
	)
	public void method1830() {
		if (!this.method1831() && this.field3025 < this.field3030.method2120()) {
			class504 var1 = this.method1879(this.field3025);
			int var2 = this.field3030.method2136(this.field3025, (Integer)var1.field4145);
			this.method1886();
			this.method1833(var2, var2);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1048060656"
	)
	boolean method1831() {
		if (!this.method1876()) {
			return false;
		} else {
			int var1 = this.field3030.method2136(this.field3022, this.field3025);
			this.method1886();
			this.method1833(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1354777542"
	)
	public void method1832() {
		this.method1833(0, this.field3030.method2120());
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "34"
	)
	public boolean method1833(int var1, int var2) {
		if (!this.method1865()) {
			this.field3022 = var1;
			this.field3025 = var2;
			return false;
		} else {
			if (var1 > this.field3030.method2120()) {
				var1 = this.field3030.method2120();
			}

			if (var2 > this.field3030.method2120()) {
				var2 = this.field3030.method2120();
			}

			boolean var3 = this.field3022 != var1 || var2 != this.field3025;
			this.field3022 = var1;
			if (var2 != this.field3025) {
				this.field3025 = var2;
				this.field3014 = 0;
				this.method1884();
			}

			if (var3 && this.field3028 != null) {
				this.field3028.vmethod6430();
			}

			return var3;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-955837720"
	)
	public void method1834(boolean var1) {
		class504 var2 = this.method1880(this.field3025);
		this.method1882((Integer)var2.field4144, var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-552794233"
	)
	public void method1835(boolean var1) {
		class504 var2 = this.method1880(this.field3025);
		this.method1882((Integer)var2.field4145, var1);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "7"
	)
	public void method1836(boolean var1) {
		this.method1882(0, var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1480986847"
	)
	public void method1837(boolean var1) {
		this.method1882(this.field3030.method2120(), var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1932709766"
	)
	public void method1838(boolean var1) {
		if (this.method1876() && !var1) {
			this.method1882(Math.min(this.field3022, this.field3025), var1);
		} else if (this.field3025 > 0) {
			this.method1882(this.field3025 - 1, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1446723021"
	)
	public void method1839(boolean var1) {
		if (this.method1876() && !var1) {
			this.method1882(Math.max(this.field3022, this.field3025), var1);
		} else if (this.field3025 < this.field3030.method2120()) {
			this.method1882(this.field3025 + 1, var1);
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method1840(boolean var1) {
		if (this.field3025 > 0) {
			class504 var2 = this.method1879(this.field3025 - 1);
			this.method1882((Integer)var2.field4144, var1);
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1107971774"
	)
	public void method1841(boolean var1) {
		if (this.field3025 < this.field3030.method2120()) {
			class504 var2 = this.method1879(this.field3025 + 1);
			this.method1882((Integer)var2.field4145, var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-59"
	)
	public void method1842(boolean var1) {
		if (this.field3025 > 0) {
			this.method1882(this.field3030.method2138(this.field3025, -1), var1);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method1843(boolean var1) {
		if (this.field3025 < this.field3030.method2120()) {
			this.method1882(this.field3030.method2138(this.field3025, 1), var1);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method1844(boolean var1) {
		if (this.field3025 > 0) {
			int var2 = this.method1883();
			this.method1882(this.field3030.method2138(this.field3025, -var2), var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-9"
	)
	public void method1845(boolean var1) {
		if (this.field3025 < this.field3030.method2120()) {
			int var2 = this.method1883();
			this.method1882(this.field3030.method2138(this.field3025, var2), var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-57"
	)
	public void method1846(boolean var1) {
		class417 var2 = this.field3030.method2129(0, this.field3025);
		class504 var3 = var2.method2200();
		this.method1882(this.field3030.method2137((Integer)var3.field4144, this.field3026), var1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-25917"
	)
	public void method1847(boolean var1) {
		class417 var2 = this.field3030.method2129(0, this.field3025);
		class504 var3 = var2.method2200();
		this.method1882(this.field3030.method2137((Integer)var3.field4144, this.field3020 + this.field3026), var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1047851640"
	)
	public void method1848(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class504 var6;
		int var8;
		if (!this.field3010) {
			var8 = 0;
		} else {
			var1 += this.field3021;
			var2 += this.field3026;
			var6 = this.method1888();
			var8 = this.field3030.method2137(var1 - (Integer)var6.field4144, var2 - (Integer)var6.field4145);
		}

		if (var3 && var4) {
			this.field3016 = 1;
			var6 = this.method1879(var8);
			class504 var7 = this.method1879(this.field3018);
			this.method1878(var7, var6);
		} else if (var3) {
			this.field3016 = 1;
			var6 = this.method1879(var8);
			this.method1833((Integer)var6.field4144, (Integer)var6.field4145);
			this.field3018 = (Integer)var6.field4144;
		} else if (var4) {
			this.method1833(this.field3018, var8);
		} else {
			if (this.field3019 > 0 && var8 == this.field3018) {
				if (this.field3022 == this.field3025) {
					this.field3016 = 1;
					var6 = this.method1879(var8);
					this.method1833((Integer)var6.field4144, (Integer)var6.field4145);
				} else {
					this.field3016 = 2;
					var6 = this.method1880(var8);
					this.method1833((Integer)var6.field4144, (Integer)var6.field4145);
				}
			} else {
				this.field3016 = 0;
				this.method1833(var8, var8);
				this.field3018 = var8;
			}

			this.field3019 = 25;
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "528254532"
	)
	public void method1849(int var1, int var2) {
		if (this.field3010 && this.method1860()) {
			var1 += this.field3021;
			var2 += this.field3026;
			class504 var3 = this.method1888();
			int var4 = this.field3030.method2137(var1 - (Integer)var3.field4144, var2 - (Integer)var3.field4145);
			class504 var5;
			class504 var6;
			switch(this.field3016) {
			case 0:
				this.method1833(this.field3022, var4);
				break;
			case 1:
				var5 = this.method1879(this.field3018);
				var6 = this.method1879(var4);
				this.method1878(var5, var6);
				break;
			case 2:
				var5 = this.method1880(this.field3018);
				var6 = this.method1880(var4);
				this.method1878(var5, var6);
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1147801496"
	)
	public void method1850(Clipboard var1) {
		class417 var2 = this.field3030.method2129(this.field3022, this.field3025);
		if (!var2.method2196()) {
			String var3 = var2.method2193();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-2048151798"
	)
	public void method1851(Clipboard var1) {
		if (this.method1876()) {
			this.method1850(var1);
			this.method1831();
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-932002013"
	)
	public void method1852(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method1877((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method1831();
				class414 var4 = this.field3030.method2131(var3, this.field3025, this.field3023);
				this.method1833(var4.method2157(), var4.method2157());
				this.method1881();
				this.method1886();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1610173482"
	)
	public void method1853() {
		this.field3026 = Math.max(0, this.field3026 - this.field3030.method2141());
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1391428115"
	)
	public void method1854() {
		int var1 = Math.max(0, this.field3030.method2140() - this.field3020);
		this.field3026 = Math.min(var1, this.field3026 + this.field3030.method2141());
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lnw;B)V",
		garbageValue = "8"
	)
	public void method1855(class339 var1) {
		this.field3027 = var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lnw;I)V",
		garbageValue = "-1665927607"
	)
	public void method1856(class339 var1) {
		this.field3028 = var1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "1257442185"
	)
	public class413 method1857() {
		return this.field3030;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lpv;",
		garbageValue = "-212619046"
	)
	public class413 method1858() {
		return this.field3029;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Lqz;",
		garbageValue = "-57"
	)
	public class417 method1859() {
		return this.field3030.method2129(this.field3022, this.field3025);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1403865728"
	)
	public boolean method1860() {
		return this.field3011;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-3432"
	)
	public boolean method1861() {
		return this.field3012;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method1862() {
		return this.method1860() && this.field3014 % 60 < 30;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-73"
	)
	public int method1863() {
		return this.field3025;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "395517084"
	)
	public int method1864() {
		return this.field3022;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1180862872"
	)
	public boolean method1865() {
		return this.field3010;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "101"
	)
	public int method1866() {
		return this.field3021;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2060373188"
	)
	public int method1867() {
		return this.field3026;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2120111535"
	)
	public int method1868() {
		return this.field3030.method2144();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108307152"
	)
	public int method1869() {
		return this.field3030.method2145();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2136471290"
	)
	public int method1870() {
		return this.field3017;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1990544466"
	)
	public int method1871() {
		return this.field3013;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	public int method1872() {
		return this.field3030.method2146();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "95"
	)
	public int method1873() {
		return this.field3015;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-773664366"
	)
	public int method1874() {
		return this.field3030.method2147();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1937995389"
	)
	public boolean method1875() {
		return this.method1869() > 1;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1356361203"
	)
	boolean method1876() {
		return this.field3022 != this.field3025;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "159066077"
	)
	String method1877(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method1887(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lth;Lth;S)V",
		garbageValue = "-86"
	)
	void method1878(class504 var1, class504 var2) {
		if ((Integer)var2.field4144 < (Integer)var1.field4144) {
			this.method1833((Integer)var1.field4145, (Integer)var2.field4144);
		} else {
			this.method1833((Integer)var1.field4144, (Integer)var2.field4145);
		}

	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)Lth;",
		garbageValue = "535230839"
	)
	class504 method1879(int var1) {
		int var2 = this.field3030.method2120();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method1885(this.field3030.method2116(var5 - 1).field3778)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method1885(this.field3030.method2116(var5).field3778)) {
				var4 = var5;
				break;
			}
		}

		return new class504(var3, var4);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)Lth;",
		garbageValue = "1298604778"
	)
	class504 method1880(int var1) {
		int var2 = this.field3030.method2120();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3030.method2116(var5 - 1).field3778 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3030.method2116(var5).field3778 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class504(var3, var4);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-140710823"
	)
	boolean method1881() {
		if (!this.method1865()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3030.method2120() > this.field3017) {
				this.field3030.method2136(this.field3017, this.field3030.method2120());
				var1 = true;
			}

			int var2 = this.method1869();
			int var3;
			if (this.field3030.method2142() > var2) {
				var3 = this.field3030.method2138(0, var2) - 1;
				this.field3030.method2136(var3, this.field3030.method2120());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3025;
				int var4 = this.field3022;
				int var5 = this.field3030.method2120();
				if (this.field3025 > var5) {
					var3 = var5;
				}

				if (this.field3022 > var5) {
					var4 = var5;
				}

				this.method1833(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1955972447"
	)
	void method1882(int var1, boolean var2) {
		if (var2) {
			this.method1833(this.field3022, var1);
		} else {
			this.method1833(var1, var1);
		}

	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-925662674"
	)
	int method1883() {
		return this.field3020 / this.field3030.method2141();
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1025063266"
	)
	void method1884() {
		class417 var1 = this.field3030.method2129(0, this.field3025);
		class504 var2 = var1.method2200();
		int var3 = this.field3030.method2141();
		int var4 = (Integer)var2.field4144 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field4145 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3021;
		int var9 = var8 + this.field3024;
		int var10 = this.field3026;
		int var11 = var10 + this.field3020;
		int var12 = this.field3021;
		int var13 = this.field3026;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3024;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3020;
		}

		this.method1818(var12, var13);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2048388371"
	)
	boolean method1885(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method1886() {
		if (this.field3027 != null) {
			this.field3027.vmethod6430();
		}

	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-423014427"
	)
	boolean method1887(int var1) {
		switch(this.field3015) {
		case 1:
			return BoundaryObject.isAlphaNumeric((char)var1);
		case 2:
			return class154.isCharAlphabetic((char)var1);
		case 3:
			return class237.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class237.isDigit(var2)) {
				return true;
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') {
					return false;
				}

				return true;
			}
		default:
			return true;
		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(I)Lth;",
		garbageValue = "1240566023"
	)
	class504 method1888() {
		int var1 = this.field3030.method2148(this.field3024);
		int var2 = this.field3030.method2149(this.field3020);
		return new class504(var1, var2);
	}
}
