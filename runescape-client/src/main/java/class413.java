import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class413 {
	@ObfuscatedName("an")
	int field3772;
	@ObfuscatedName("ag")
	int field3770;
	@ObfuscatedName("am")
	int field3771;
	@ObfuscatedName("ad")
	int field3769;
	@ObfuscatedName("at")
	int field3773;
	@ObfuscatedName("ay")
	boolean field3767;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	AbstractFont field3776;
	@ObfuscatedName("ac")
	ArrayList field3775;
	@ObfuscatedName("ab")
	int field3768;
	@ObfuscatedName("av")
	int field3774;

	public class413() {
		this.field3772 = Integer.MAX_VALUE;
		this.field3770 = Integer.MAX_VALUE;
		this.field3771 = 0;
		this.field3769 = 0;
		this.field3773 = 0;
		this.field3767 = true;
		this.field3775 = new ArrayList();
		this.field3768 = 0;
		this.field3774 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lpu;",
		garbageValue = "-470457898"
	)
	public class415 method2116(int var1) {
		return (class415)this.field3775.get(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lpu;",
		garbageValue = "-1049497783"
	)
	class415 method2117() {
		return this.field3775.size() == 0 ? null : (class415)this.field3775.get(this.field3775.size() - 1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1148407571"
	)
	public boolean method2118() {
		return this.field3775.size() == 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2118676254"
	)
	boolean method2119() {
		return this.field3770 > 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method2120() {
		return this.field3775.size();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1754226121"
	)
	public String method2121() {
		if (this.method2118()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method2120());

			for (int var2 = 0; var2 < this.method2120(); ++var2) {
				class415 var3 = this.method2116(var2);
				var1.append(var3.field3778);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "227737662"
	)
	public void method2122(int var1) {
		if (this.field3776 != null && var1 < this.field3776.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field3772 != var1) {
			this.field3772 = var1;
			this.method2150();
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "30"
	)
	public void method2123(int var1) {
		if (this.field3770 != var1) {
			this.field3770 = var1;
			this.method2150();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-120"
	)
	public void method2124(int var1) {
		if (this.field3774 != var1) {
			this.field3774 = var1;
			this.method2150();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)V",
		garbageValue = "1754226121"
	)
	public void method2125(AbstractFont var1) {
		if (var1 != this.field3776) {
			this.field3776 = var1;
			if (this.field3776 != null) {
				if (this.field3773 == 0) {
					this.field3773 = this.field3776.ascent;
				}

				if (!this.method2118()) {
					this.method2150();
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2133459477"
	)
	public void method2126(int var1) {
		if (this.field3768 != var1) {
			this.field3768 = var1;
			this.method2150();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1656678434"
	)
	public boolean method2127(int var1, int var2) {
		if (this.field3771 != var1 || var2 != this.field3769) {
			this.field3771 = var1;
			this.field3769 = var2;
			this.method2150();
		}

		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1497702314"
	)
	public void method2128(int var1) {
		if (this.field3773 != var1) {
			this.field3773 = var1;
			this.method2150();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqz;",
		garbageValue = "114"
	)
	public class417 method2129(int var1, int var2) {
		if (var2 == var1) {
			return new class417(this, 0, 0);
		} else if (var1 <= this.field3775.size() && var2 <= this.field3775.size()) {
			return var2 < var1 ? new class417(this, var2, var1) : new class417(this, var1, var2);
		} else {
			return new class417(this, 0, 0);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lpa;",
		garbageValue = "8"
	)
	public class414 method2130(char var1, int var2, int var3) {
		return this.method2131(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lpa;",
		garbageValue = "1"
	)
	public class414 method2131(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field3775.size() >= var3) {
			this.method2151(var2, var2);
			return new class414(var2, true);
		} else {
			this.field3775.ensureCapacity(this.field3775.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field3775.size() < var3; ++var5) {
				class415 var6 = new class415();
				var6.field3778 = var1.charAt(var5);
				this.field3775.add(var4, var6);
				++var4;
			}

			this.method2151(var2, var4);
			if (this.field3770 != 0 && this.method2142() > this.field3770) {
				while (var4 != var2) {
					--var4;
					this.method2135(var4);
					if (this.method2142() <= this.field3770) {
						break;
					}
				}

				return new class414(var4, true);
			} else {
				return new class414(var4, false);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpa;",
		garbageValue = "414119716"
	)
	class414 method2132(String var1, int var2) {
		return this.method2131(var1, this.field3775.size(), var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lpa;",
		garbageValue = "1824140523"
	)
	public class414 method2133(String var1) {
		this.method2134();
		return this.method2132(var1, 0);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	void method2134() {
		this.field3775.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "24"
	)
	public int method2135(int var1) {
		return this.method2136(var1, var1 + 1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1811154260"
	)
	public int method2136(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field3775.subList(var1, var2).clear();
		var3 = var1;
		if (this.method2119() && this.field3768 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class415)this.field3775.get(var3)).field3778;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method2151(var3, var2);
		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-24793"
	)
	public int method2137(int var1, int var2) {
		if (this.field3776 == null) {
			return 0;
		} else if (this.method2119() && var1 > this.field3772) {
			return this.field3775.size();
		} else {
			if (!this.field3775.isEmpty()) {
				for (int var3 = 0; var3 < this.field3775.size(); ++var3) {
					class415 var4 = (class415)this.field3775.get(var3);
					if (var2 <= var4.field3779 + this.method2141()) {
						if (var2 < var4.field3779) {
							break;
						}

						if (var1 < var4.field3780) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field3775.size() && ((class415)this.field3775.get(var3 + 1)).field3779 != var4.field3779) {
							int var5 = this.method2153((class415)this.field3775.get(var3), false);
							if (var1 < var5 + var4.field3780) {
								return var3;
							}

							if (var2 <= var4.field3779 + this.method2141()) {
								return var3 + 1;
							}
						}
					}
				}

				class415 var6 = (class415)this.field3775.get(this.field3775.size() - 1);
				if (var1 >= var6.field3780 && var1 <= var6.field3780 + this.method2143() && var2 >= var6.field3779 && var2 <= var6.field3779 + this.method2141()) {
					return this.field3775.size() - 1;
				}
			}

			return this.field3775.size();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2096658446"
	)
	public int method2138(int var1, int var2) {
		if (this.field3776 != null && !this.method2118() && var1 <= this.field3775.size()) {
			byte var3;
			if (var2 > 0) {
				var3 = 1;
			} else {
				var3 = -1;
				var2 = -var2;
			}

			int var4 = 0;
			int var5 = 0;
			if (var1 > 0) {
				class415 var6 = (class415)this.field3775.get(var1 - 1);
				var4 = var6.field3780 + this.method2152(var1 - 1);
				var5 = var6.field3779;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field3775.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class415 var12 = (class415)this.field3775.get(var11 - 1);
				if (var5 != var12.field3779) {
					++var7;
					var5 = var12.field3779;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field3780 + this.method2152(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field3775.size();
			} else {
				if (var5 != 0) {
					++var7;
				}

				return var9 == 16777215 || var7 == var2 && var4 < var9 ? 0 : var8;
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	public int method2139() {
		if (!this.field3775.isEmpty() && this.method2142() == 1) {
			return this.field3775.isEmpty() ? 0 : ((class415)this.field3775.get(this.field3775.size() - 1)).field3780 + this.method2143();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field3775.size() - 1; var3 >= 0; --var3) {
				class415 var4 = (class415)this.field3775.get(var3);
				if (var1 != var4.field3779) {
					int var5 = this.method2153(var4, false) + var4.field3780;
					var2 = Math.max(var5, var2);
					var1 = var4.field3779;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-740474028"
	)
	public int method2140() {
		return this.method2118() ? 0 : this.field3776.ascent + ((class415)this.field3775.get(this.field3775.size() - 1)).field3779;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1472959115"
	)
	public int method2141() {
		return this.field3773;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-24667"
	)
	public int method2142() {
		return this.method2140() / this.field3776.ascent;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "138917302"
	)
	int method2143() {
		return this.method2118() ? 0 : this.method2153((class415)this.field3775.get(this.field3775.size() - 1), false);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-2"
	)
	public int method2144() {
		return this.field3772;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1765465217"
	)
	public int method2145() {
		return this.field3770;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-354001801"
	)
	public int method2146() {
		return this.field3768;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1338784417"
	)
	public int method2147() {
		return this.field3774;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "95"
	)
	public int method2148(int var1) {
		switch(this.field3771) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "32479"
	)
	public int method2149(int var1) {
		switch(this.field3769) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "383944727"
	)
	void method2150() {
		this.method2151(0, this.field3775.size());
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-788622491"
	)
	void method2151(int var1, int var2) {
		if (!this.method2118() && this.field3776 != null) {
			class504 var3 = this.method2154(var1, var2);
			boolean var4 = (Integer)var3.field4144 == 0 && (Integer)var3.field4145 == this.field3775.size();
			int var5 = (Integer)var3.field4144;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class415)this.field3775.get((Integer)var3.field4144)).field3779 * 827753507 * -1703916661;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field4144; var9 <= (Integer)var3.field4145; ++var9) {
				boolean var10 = var9 >= this.field3775.size();
				class415 var21 = (class415)this.field3775.get(!var10 ? var9 : this.field3775.size() - 1);
				int var22 = !var10 ? this.method2153(var21, false) : 0;
				boolean var13 = !var10 && var21.field3778 == '\n';
				boolean var14 = !var10 && this.method2119() && var22 + var6 > this.field3772;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class415 var19;
					if (var14) {
						var17 = 0;
						if (this.field3768 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class415)this.field3775.get(var18);
								var17 += var18 < var15 ? this.method2153(var19, false) : 0;
								if (var19.field3778 == ' ' || var19.field3778 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method2148(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class415)this.field3775.get(var18);
						int var20 = this.method2153(var19, false);
						var19.field3780 = var17;
						var19.field3779 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method2141();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field3769 != 0 && var4) {
				var9 = var8 * this.method2141();
				int var23 = this.method2149(var9);

				for (int var11 = 0; var11 < this.field3775.size(); ++var11) {
					class415 var12 = (class415)this.field3775.get(var11);
					var12.field3779 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1626730503"
	)
	int method2152(int var1) {
		return var1 < this.field3775.size() ? this.method2153((class415)this.field3775.get(var1), false) : 0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lpu;ZB)I",
		garbageValue = "6"
	)
	int method2153(class415 var1, boolean var2) {
		if (var1.field3778 == '\n') {
			return 0;
		} else if (this.field3774 == 0) {
			int var3 = this.field3776.advances[var1.field3778];
			if (var3 == 0) {
				return var1.field3778 == '\t' ? this.field3776.advances[32] * 3 : this.field3776.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field3776.advances[42];
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lth;",
		garbageValue = "5"
	)
	class504 method2154(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field3775.size();
		if (var3 == 0 && var4 == var5) {
			return new class504(0, var5);
		} else {
			int var6 = this.method2155(var3, false);
			int var7 = this.method2156(var4, false);
			int var8;
			switch(this.field3769) {
			case 0:
				if (this.field3771 == 0) {
					return new class504(var6, var5);
				}

				var8 = this.method2155(var3, true);
				return new class504(var8, var5);
			case 1:
				return new class504(0, var5);
			case 2:
				if (this.field3771 == 2) {
					return new class504(0, var7);
				}

				var8 = this.method2156(var4, true);
				return new class504(0, var8);
			default:
				return new class504(0, var5);
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-336171947"
	)
	int method2155(int var1, boolean var2) {
		if (var1 < this.field3775.size()) {
			int var3 = ((class415)this.field3775.get(var1)).field3779;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class415)this.field3775.get(var4 - 1)).field3779 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class415)this.field3775.get(var4 - 1)).field3779;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-67"
	)
	int method2156(int var1, boolean var2) {
		if (var1 < this.field3775.size()) {
			int var3 = ((class415)this.field3775.get(var1)).field3779;

			for (int var4 = var1; var4 < this.field3775.size() - 1; ++var4) {
				if (((class415)this.field3775.get(var4 + 1)).field3779 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class415)this.field3775.get(var4 + 1)).field3779;
				}
			}
		}

		return this.field3775.size();
	}
}
