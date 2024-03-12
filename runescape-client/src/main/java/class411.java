import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class411 extends AbstractQueue {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lpz;"
	)
	class409[] field3765;
	@ObfuscatedName("aw")
	Map field3764;
	@ObfuscatedName("al")
	int field3762;
	@ObfuscatedName("ai")
	final Comparator field3766;
	@ObfuscatedName("ar")
	int field3763;

	public class411(int var1, Comparator var2) {
		this.field3763 = 0;
		this.field3765 = new class409[var1];
		this.field3764 = new HashMap();
		this.field3766 = var2;
	}

	public class411(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	void method2111() {
		int var1 = (this.field3765.length << 1) + 1;
		this.field3765 = (class409[])((class409[])Arrays.copyOf(this.field3765, var1));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-6"
	)
	void method2112(int var1) {
		class409 var2;
		int var3;
		for (var2 = this.field3765[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class409 var4 = this.field3765[var3];
			if (this.field3766 != null) {
				if (this.field3766.compare(var2.field3757, var4.field3757) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field3757).compareTo(var4.field3757) >= 0) {
				break;
			}

			this.field3765[var1] = var4;
			this.field3765[var1].field3756 = var1;
		}

		this.field3765[var1] = var2;
		this.field3765[var1].field3756 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-716869550"
	)
	void method2113(int var1) {
		class409 var2 = this.field3765[var1];

		int var8;
		for (int var3 = this.field3762 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class409 var5 = this.field3765[var4];
			int var6 = (var1 << 1) + 2;
			class409 var7 = this.field3765[var6];
			if (this.field3766 != null) {
				if (var6 < this.field3762 && this.field3766.compare(var5.field3757, var7.field3757) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field3762 && ((Comparable)var5.field3757).compareTo(var7.field3757) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field3766 != null) {
				if (this.field3766.compare(var2.field3757, this.field3765[var8].field3757) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field3757).compareTo(this.field3765[var8].field3757) <= 0) {
				break;
			}

			this.field3765[var1] = this.field3765[var8];
			this.field3765[var1].field3756 = var1;
		}

		this.field3765[var1] = var2;
		this.field3765[var1].field3756 = var1;
	}

	public boolean remove(Object var1) {
		class409 var2 = (class409)this.field3764.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field3763;
			--this.field3762;
			if (this.field3762 == var2.field3756) {
				this.field3765[this.field3762] = null;
				return true;
			} else {
				class409 var3 = this.field3765[this.field3762];
				this.field3765[this.field3762] = null;
				this.field3765[var2.field3756] = var3;
				this.field3765[var2.field3756].field3756 = var2.field3756;
				this.method2113(var2.field3756);
				if (var3 == this.field3765[var2.field3756]) {
					this.method2112(var2.field3756);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field3762 == 0 ? null : this.field3765[0].field3757;
	}

	public int size() {
		return this.field3762;
	}

	public boolean offer(Object var1) {
		if (this.field3764.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field3763;
			int var2 = this.field3762;
			if (var2 >= this.field3765.length) {
				this.method2111();
			}

			++this.field3762;
			if (var2 == 0) {
				this.field3765[0] = new class409(var1, 0);
				this.field3764.put(var1, this.field3765[0]);
			} else {
				this.field3765[var2] = new class409(var1, var2);
				this.field3764.put(var1, this.field3765[var2]);
				this.method2112(var2);
			}

			return true;
		}
	}

	public Object poll() {
		if (this.field3762 == 0) {
			return null;
		} else {
			++this.field3763;
			Object var1 = this.field3765[0].field3757;
			this.field3764.remove(var1);
			--this.field3762;
			if (this.field3762 == 0) {
				this.field3765[this.field3762] = null;
			} else {
				this.field3765[0] = this.field3765[this.field3762];
				this.field3765[0].field3756 = 0;
				this.field3765[this.field3762] = null;
				this.method2113(0);
			}

			return var1;
		}
	}

	public boolean contains(Object var1) {
		return this.field3764.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field3766 != null) {
			Arrays.sort(var1, this.field3766);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class410(this);
	}
}
