import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public class class509 implements class508 {
	@ObfuscatedName("aq")
	Map field4160;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	final class541 field4161;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	public class509(class541 var1) {
		this.field4161 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "601833237"
	)
	@Export("vmethod9189")
	public int vmethod9189(int var1) {
		if (this.field4160 != null) {
			class542 var2 = (class542)this.field4160.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4314;
			}
		}

		return (Integer)this.field4161.vmethod9769(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-924522595"
	)
	@Export("vmethod9186")
	public void vmethod9186(int var1, Object var2) {
		if (this.field4160 == null) {
			this.field4160 = new HashMap();
			this.field4160.put(var1, new class542(var1, var2));
		} else {
			class542 var3 = (class542)this.field4160.get(var1);
			if (var3 == null) {
				this.field4160.put(var1, new class542(var1, var2));
			} else {
				var3.field4314 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4160 == null ? Collections.emptyList().iterator() : this.field4160.values().iterator();
	}
}
