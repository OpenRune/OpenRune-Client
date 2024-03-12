import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("aq")
	long field3808;
	@ObfuscatedName("aw")
	int field3807;

	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field3807 = var2;
		super.field3818 = "DelayFadeTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	@Export("vmethod8043")
	public boolean vmethod8043() {
		if (this.field3808 < (long)this.field3807) {
			++this.field3808;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "1916440406"
	)
	static DbTable method2207(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class150.field1376, var0);
		}

		return var1;
	}
}
