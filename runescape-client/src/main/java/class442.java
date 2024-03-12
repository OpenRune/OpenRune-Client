import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public final class class442 {
	@ObfuscatedName("aq")
	final Comparator field3867;
	@ObfuscatedName("aw")
	final Map field3868;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class411 field3871;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class411 field3870;
	@ObfuscatedName("ar")
	final long field3869;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	final class440 field3872;
	@ObfuscatedName("aa")
	final int field3866;

	@ObfuscatedSignature(
		descriptor = "(JILqb;)V"
	)
	class442(long var1, int var3, class440 var4) {
		this.field3867 = new class441(this);
		this.field3869 = var1;
		this.field3866 = var3;
		this.field3872 = var4;
		if (this.field3866 == -1) {
			this.field3868 = new HashMap(64);
			this.field3871 = new class411(64, this.field3867);
			this.field3870 = null;
		} else {
			if (this.field3872 == null) {
				throw new IllegalArgumentException("");
			}

			this.field3868 = new HashMap(this.field3866);
			this.field3871 = new class411(this.field3866, this.field3867);
			this.field3870 = new class411(this.field3866);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILqb;)V"
	)
	public class442(int var1, class440 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-35"
	)
	boolean method2257() {
		return this.field3866 != -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-60"
	)
	public Object method2258(Object var1) {
		synchronized(this) {
			if (-1L != this.field3869) {
				this.method2261();
			}

			class443 var3 = (class443)this.field3868.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method2260(var3, false);
				return var3.field3873;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "238417323"
	)
	public Object method2259(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field3869) {
				this.method2261();
			}

			class443 var4 = (class443)this.field3868.get(var1);
			if (var4 != null) {
				Object var8 = var4.field3873;
				var4.field3873 = var2;
				this.method2260(var4, false);
				return var8;
			} else {
				class443 var5;
				if (this.method2257() && this.field3868.size() == this.field3866) {
					var5 = (class443)this.field3870.remove();
					this.field3868.remove(var5.field3874);
					this.field3871.remove(var5);
				}

				var5 = new class443(var2, var1);
				this.field3868.put(var1, var5);
				this.method2260(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrq;ZB)V",
		garbageValue = "-1"
	)
	void method2260(class443 var1, boolean var2) {
		if (!var2) {
			this.field3871.remove(var1);
			if (this.method2257()) {
			}
		}

		var1.field3876 = System.currentTimeMillis();
		if (this.method2257()) {
			switch(this.field3872.field3865) {
			case 0:
				var1.field3875 = var1.field3876;
				break;
			case 1:
				++var1.field3875;
			}

			this.field3870.add(var1);
		}

		this.field3871.add(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2261() {
		long var1 = System.currentTimeMillis() - this.field3869;

		while (!this.field3871.isEmpty()) {
			class443 var3 = (class443)this.field3871.peek();
			if (var3.field3876 >= var1) {
				return;
			}

			this.field3868.remove(var3.field3874);
			this.field3871.remove(var3);
			if (this.method2257()) {
				this.field3870.remove(var3);
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1682413099"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field3868.clear();
			this.field3871.clear();
			if (this.method2257()) {
				this.field3870.clear();
			}

		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1623528561"
	)
	static void method2263() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class475.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}
}
