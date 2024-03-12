import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
class class515 implements Iterator {
	@ObfuscatedName("aq")
	int field4189;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class516 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ltx;)V"
	)
	class515(class516 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field4189 < this.this$0.method2397();
	}

	public Object next() {
		int var1 = ++this.field4189 - 1;
		class475 var2 = (class475)this.this$0.field4193.get((long)var1);
		return var2 != null ? var2 : this.this$0.method2557(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
