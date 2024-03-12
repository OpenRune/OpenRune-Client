import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public class class516 extends class474 implements class299 {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("tx")
	static int field4190;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	final AbstractArchive field4194;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	final DemotingHashTable field4193;
	@ObfuscatedName("ai")
	final int field4192;

	@ObfuscatedSignature(
		descriptor = "(Lox;ILpe;Lof;)V"
	)
	public class516(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4193 = new DemotingHashTable(64);
		this.field4194 = var4;
		this.field4192 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsy;",
		garbageValue = "79"
	)
	@Export("vmethod9278")
	protected class476 vmethod9278(int var1) {
		synchronized(this.field4193) {
			class475 var2 = (class475)this.field4193.get((long)var1);
			if (var2 == null) {
				var2 = this.method2557(var1);
				this.field4193.method1659(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lsn;",
		garbageValue = "-1765623354"
	)
	class475 method2557(int var1) {
		byte[] var2 = this.field4194.takeFile(this.field4192, var1);
		class475 var3 = new class475(var1);
		if (var2 != null) {
			var3.method2403(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "198654526"
	)
	public void method2558() {
		synchronized(this.field4193) {
			this.field4193.clear();
		}
	}

	public Iterator iterator() {
		return new class515(this);
	}
}
