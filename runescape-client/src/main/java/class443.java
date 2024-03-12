import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public final class class443 implements Comparable {
	@ObfuscatedName("aq")
	Object field3873;
	@ObfuscatedName("aw")
	Object field3874;
	@ObfuscatedName("al")
	long field3876;
	@ObfuscatedName("ai")
	long field3875;

	class443(Object var1, Object var2) {
		this.field3873 = var1;
		this.field3874 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)I",
		garbageValue = "86"
	)
	int method2264(class443 var1) {
		if (this.field3875 < var1.field3875) {
			return -1;
		} else {
			return this.field3875 > var1.field3875 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class443) {
			return this.field3874.equals(((class443)var1).field3874);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field3874.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method2264((class443)var1);
	}
}
