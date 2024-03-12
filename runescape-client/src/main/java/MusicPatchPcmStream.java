import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmo;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIIIB)V",
		garbageValue = "-127"
	)
	void method1766(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2877[var1.field2932] & 4) != 0 && var1.field2937 < 0) {
			int var6 = this.superStream.field2879[var1.field2932] / PcmPlayer.field183;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2923) / var6;
				if (var7 > var4) {
					var1.field2923 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2923 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field183 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2869[var1.field2932] == 0) {
					var1.stream = RawPcmStream.method229(var1.rawSound, var10.method244(), var10.method235(), var10.method236());
				} else {
					var1.stream = RawPcmStream.method229(var1.rawSound, var10.method244(), 0, var10.method236());
					this.superStream.method1713(var1, var1.table.field2914[var1.field2934] < 0);
					var1.stream.method240(var8, var10.method235());
				}

				if (var1.table.field2914[var1.field2934] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method242(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method246()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lmw;II)V",
		garbageValue = "977328612"
	)
	void method1767(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2877[var1.field2932] & 4) != 0 && var1.field2937 < 0) {
			int var3 = this.superStream.field2879[var1.field2932] / PcmPlayer.field183;
			int var4 = (var3 + 1048575 - var1.field2923) / var3;
			var1.field2923 = var3 * var2 + var1.field2923 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2869[var1.field2932] == 0) {
					var1.stream = RawPcmStream.method229(var1.rawSound, var1.stream.method244(), var1.stream.method235(), var1.stream.method236());
				} else {
					var1.stream = RawPcmStream.method229(var1.rawSound, var1.stream.method244(), 0, var1.stream.method236());
					this.superStream.method1713(var1, var1.table.field2914[var1.field2934] < 0);
				}

				if (var1.table.field2914[var1.field2934] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2923 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("az")
	@Export("vmethod6346")
	protected int vmethod6346() {
		return 0;
	}

	@ObfuscatedName("ao")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method1735(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2935) {
						this.method1766(var6, var1, var4, var5, var5 + var4);
						var6.field2935 -= var5;
						break;
					}

					this.method1766(var6, var1, var4, var6.field2935, var5 + var4);
					var4 += var6.field2935;
					var5 -= var6.field2935;
				} while(!this.superStream.method1736(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ak")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method1735(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2935) {
						this.method1767(var3, var2);
						var3.field2935 -= var2;
						break;
					}

					this.method1767(var3, var3.field2935);
					var2 -= var3.field2935;
				} while(!this.superStream.method1736(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	public static void method1768() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}
}
