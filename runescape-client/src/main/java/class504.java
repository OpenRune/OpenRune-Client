import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("th")
public class class504 {
	@ObfuscatedName("aq")
	public final Object field4144;
	@ObfuscatedName("aw")
	public final Object field4145;

	public class504(Object var1, Object var2) {
		this.field4144 = var1;
		this.field4145 = var2;
	}

	public String toString() {
		return this.field4144 + ", " + this.field4145;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class504) {
			class504 var2 = (class504)var1;
			if (this.field4144 == null) {
				if (var2.field4144 != null) {
					return false;
				}
			} else if (!this.field4144.equals(var2.field4144)) {
				return false;
			}

			if (this.field4145 == null) {
				if (var2.field4145 != null) {
					return false;
				}
			} else if (!this.field4145.equals(var2.field4145)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field4144 != null) {
			var1 += this.field4144.hashCode();
		}

		if (this.field4145 != null) {
			var1 += 31 * this.field4145.hashCode();
		}

		return var1;
	}
}
