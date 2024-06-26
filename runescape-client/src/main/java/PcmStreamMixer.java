import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	NodeDeque field164;
	@ObfuscatedName("al")
	int field162;
	@ObfuscatedName("ai")
	int field161;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field164 = new NodeDeque();
		this.field162 = 0;
		this.field161 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbj;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbj;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("al")
	void method168() {
		if (this.field162 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field164.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field164.previous()) {
				var1.field289 -= this.field162;
			}

			this.field161 -= this.field162;
			this.field162 = 0;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lse;Lcd;)V"
	)
	void method169(Node var1, PcmStreamMixerListener var2) {
		while (this.field164.sentinel != var1 && ((PcmStreamMixerListener)var1).field289 <= var2.field289) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field161 = ((PcmStreamMixerListener)this.field164.sentinel.previous).field289;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lcd;)V"
	)
	void method170(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field164.sentinel.previous;
		if (var2 == this.field164.sentinel) {
			this.field161 = -1;
		} else {
			this.field161 = ((PcmStreamMixerListener)var2).field289;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("az")
	@Export("vmethod6346")
	protected int vmethod6346() {
		return 0;
	}

	@ObfuscatedName("ao")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field161 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field162 < this.field161) {
				this.field162 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field161 - this.field162;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field162 += var4;
			this.method168();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field164.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field289 = 0;
					this.method170(var5);
				} else {
					var5.field289 = var7;
					this.method169(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("au")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("ak")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field161 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field162 + var1 < this.field161) {
				this.field162 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field161 - this.field162;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field162 += var2;
			this.method168();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field164.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field289 = 0;
					this.method170(var3);
				} else {
					var3.field289 = var5;
					this.method169(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("ah")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
