import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("aq")
	ArrayList field3820;

	@ObfuscatedSignature(
		descriptor = "(Lqe;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field3820 = var2;
		super.field3818 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	@Export("vmethod8043")
	public boolean vmethod8043() {
		for (int var1 = 0; var1 < this.field3820.size(); ++var1) {
			SongTask var2 = (SongTask)this.field3820.get(var1);
			if (var2 == null) {
				this.field3820.remove(var1);
				--var1;
			} else if (var2.vmethod8043()) {
				if (var2.method2214()) {
					this.method2218(var2.method2216());
					this.field3820.clear();
					return true;
				}

				if (var2.method2217() != null) {
					this.field3820.add(var2.method2217());
				}

				super.field3815 = var2.field3815;
				this.field3820.remove(var1);
				--var1;
			}
		}

		if (this.field3820.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
