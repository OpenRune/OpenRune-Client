import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	Node field3738;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("aq")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lse;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lse;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel;
		var1.previous = this.sentinel.previous;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lse;"
	)
	@Export("last")
	public Node last() {
		return this.method2088((Node)null);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lse;)Lse;"
	)
	Node method2088(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field3738 = null;
			return null;
		} else {
			this.field3738 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lse;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field3738;
		if (var1 == this.sentinel) {
			this.field3738 = null;
			return null;
		} else {
			this.field3738 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("az")
	int method2090() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("ao")
	public boolean method2091() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()[Lse;"
	)
	Node[] method2092() {
		Node[] var1 = new Node[this.method2090()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lse;)Z"
	)
	boolean method2093(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public int size() {
		return this.method2090();
	}

	public boolean isEmpty() {
		return this.method2091();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method2092();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.rsClear();
	}

	public boolean add(Object var1) {
		return this.method2093((Node)var1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lse;Lse;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) {
			var0.remove();
		}

		var0.next = var1;
		var0.previous = var1.previous;
		var0.next.previous = var0;
		var0.previous.next = var0;
	}
}
