import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uk")
public class class542 {
	@ObfuscatedName("aq")
	public final int field4315;
	@ObfuscatedName("aw")
	public Object field4314;

	public class542(int var1) {
		this.field4315 = var1;
	}

	public class542(int var1, Object var2) {
		this.field4315 = var1;
		this.field4314 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class542)) {
			return false;
		} else {
			class542 var2 = (class542)var1;
			if (var2.field4314 == null && this.field4314 != null) {
				return false;
			} else if (this.field4314 == null && var2.field4314 != null) {
				return false;
			} else {
				return var2.field4315 == this.field4315 && var2.field4314.equals(this.field4314);
			}
		}
	}
}
