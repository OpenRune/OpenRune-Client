import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class410 implements Iterator {
	@ObfuscatedName("gb")
	static int field3758;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class411 field3761;
	@ObfuscatedName("aw")
	int field3760;
	@ObfuscatedName("al")
	int field3759;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	class410(class411 var1) {
		this.field3760 = 0;
		this.field3759 = this.field3761.field3763;
		this.field3761 = var1;
	}

	public boolean hasNext() {
		return this.field3760 < this.field3761.field3762;
	}

	public Object next() {
		if (this.field3761.field3763 != this.field3759) {
			throw new ConcurrentModificationException();
		} else if (this.field3760 < this.field3761.field3762) {
			Object var1 = this.field3761.field3765[this.field3760].field3757;
			++this.field3760;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
