import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bv")
	static AtomicBoolean field2860;
	@ObfuscatedName("by")
	static ThreadPoolExecutor field2859;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("aw")
	int field2864;
	@ObfuscatedName("al")
	int field2863;
	@ObfuscatedName("ai")
	int[] field2872;
	@ObfuscatedName("ar")
	int[] field2875;
	@ObfuscatedName("as")
	int[] field2876;
	@ObfuscatedName("aa")
	int[] field2867;
	@ObfuscatedName("az")
	int[] field2881;
	@ObfuscatedName("ao")
	int[] field2874;
	@ObfuscatedName("au")
	int[] field2878;
	@ObfuscatedName("ak")
	int[] field2873;
	@ObfuscatedName("ah")
	int[] field2871;
	@ObfuscatedName("at")
	int[] field2877;
	@ObfuscatedName("ay")
	int[] field2880;
	@ObfuscatedName("ae")
	int[] field2870;
	@ObfuscatedName("ac")
	int[] field2869;
	@ObfuscatedName("ab")
	int[] field2868;
	@ObfuscatedName("av")
	int[] field2879;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field2887;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field2888;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bd")
	boolean field2862;
	@ObfuscatedName("bi")
	@Export("track")
	int track;
	@ObfuscatedName("bq")
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ba")
	long field2883;
	@ObfuscatedName("bt")
	long field2884;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bw")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("bb")
	public int field2890;

	static {
		field2860 = null;
		field2859 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbf;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field2864 = 256;
		this.field2863 = 1000000;
		this.field2872 = new int[16];
		this.field2875 = new int[16];
		this.field2876 = new int[16];
		this.field2867 = new int[16];
		this.field2881 = new int[16];
		this.field2874 = new int[16];
		this.field2878 = new int[16];
		this.field2873 = new int[16];
		this.field2871 = new int[16];
		this.field2877 = new int[16];
		this.field2880 = new int[16];
		this.field2870 = new int[16];
		this.field2869 = new int[16];
		this.field2868 = new int[16];
		this.field2879 = new int[16];
		this.field2887 = new MusicPatchNode[16][128];
		this.field2888 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class332());
		this.field2890 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method1721();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1261452882"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field2864 = var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6201"
	)
	public int method1700() {
		return this.field2864;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmu;Lof;Lbc;I)Z",
		garbageValue = "1123969906"
	)
	public boolean method1701(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class334 var6 = (class334)var1.field2919.first(); var6 != null; var6 = (class334)var1.field2919.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					byte[] var10 = var2.takeFileFlat(var14);
					MusicPatch var9;
					if (var10 == null) {
						var9 = null;
					} else {
						var9 = new MusicPatch(var10);
					}

					var8 = var9;
					if (var9 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var9, (long)var14);
				}

				if (!var8.method1756(var3, var6.field2957)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var18 = var8.field2912.iterator();

						while (var18.hasNext()) {
							class53 var11 = (class53)var18.next();
							this.priorityQueue.add(new class325(var6.field2956, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	public void method1702() {
		if (this.priorityQueue != null) {
			if (field2860 != null) {
				field2860.set(true);
			}

			field2860 = new AtomicBoolean(false);
			AtomicBoolean var1 = field2860;
			if (field2859 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field2859 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class324(this));
			}

			field2859.submit(new class328(this, var1));
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	public void method1703() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method1757();
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("az")
	protected int vmethod6346() {
		return 0;
	}

	@ObfuscatedName("ao")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2863 / PcmPlayer.field183;

			do {
				long var5 = this.field2883 + (long)var4 * (long)var3;
				if (this.field2884 - var5 >= 0L) {
					this.field2883 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field2884 - this.field2883) - 1L) / (long)var4);
				this.field2883 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method1734();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	public void method1704() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("ak")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2863 / PcmPlayer.field183;

			do {
				long var3 = (long)var2 * (long)var1 + this.field2883;
				if (this.field2884 - var3 >= 0L) {
					this.field2883 = var3;
					break;
				}

				int var5 = (int)((this.field2884 - this.field2883 + (long)var2 - 1L) / (long)var2);
				this.field2883 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method1734();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lmu;ZI)V",
		garbageValue = "-127379304"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field2862 = var2;
			this.field2883 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field2884 = this.midiFile.method1748(this.trackLength);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method1721();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-112"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	public boolean method1708() {
		synchronized(this.player) {
			return this.musicPatches.method2533() > 0;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	public void method1709(int var1, int var2) {
		synchronized(this.player) {
			this.method1710(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1765229247"
	)
	void method1710(int var1, int var2) {
		this.field2867[var1] = var2;
		this.field2874[var1] = var2 & -128;
		this.method1711(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-79"
	)
	void method1711(int var1, int var2) {
		if (var2 != this.field2881[var1]) {
			this.field2881[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2888[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-124"
	)
	void method1712(int var1, int var2, int var3) {
		this.method1714(var1, var2, 64);
		if ((this.field2877[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2932 == var1 && var4.field2937 < 0) {
					this.field2887[var1][var4.field2934] = null;
					this.field2887[var1][var2] = var4;
					int var5 = (var4.field2936 * var4.field2928 >> 12) + var4.field2931;
					var4.field2931 += var2 - var4.field2934 << 8;
					var4.field2936 = var5 - var4.field2931;
					var4.field2928 = 4096;
					var4.field2934 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2881[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var8 = var9.rawSounds[var2].method285();
				if (var8 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field2932 = var1;
					var6.table = var9;
					var6.rawSound = var8;
					var6.field2939 = var9.field2913[var2];
					var6.field2933 = var9.field2908[var2];
					var6.field2934 = var2;
					var6.field2922 = var3 * var3 * var9.field2906[var2] * var9.field2910 + 1024 >> 11;
					var6.field2938 = var9.field2907[var2] & 255;
					var6.field2931 = (var2 << 8) - (var9.field2914[var2] & 32767);
					var6.field2926 = 0;
					var6.field2927 = 0;
					var6.field2924 = 0;
					var6.field2937 = -1;
					var6.field2930 = 0;
					if (this.field2869[var1] == 0) {
						var6.stream = RawPcmStream.method229(var8, this.method1726(var6), this.method1727(var6), this.method1728(var6));
					} else {
						var6.stream = RawPcmStream.method229(var8, this.method1726(var6), 0, this.method1728(var6));
						this.method1713(var6, var9.field2914[var2] < 0);
					}

					if (var9.field2914[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field2933 >= 0) {
						MusicPatchNode var7 = this.field2888[var1][var6.field2933];
						if (var7 != null && var7.field2937 < 0) {
							this.field2887[var1][var7.field2934] = null;
							var7.field2937 = 0;
						}

						this.field2888[var1][var6.field2933] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field2887[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmw;ZI)V",
		garbageValue = "-1050214773"
	)
	void method1713(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field169) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field2869[var1.field2932] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method238();
			}
		} else {
			var4 = (int)((long)this.field2869[var1.field2932] * (long)var3 >> 6);
		}

		var1.stream.method237(var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-146148879"
	)
	void method1714(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2887[var1][var2];
		if (var4 != null) {
			this.field2887[var1][var2] = null;
			if ((this.field2877[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field2932 == var4.field2932 && var5.field2937 < 0 && var4 != var5) {
						var4.field2937 = 0;
						break;
					}
				}
			} else {
				var4.field2937 = 0;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	void method1715(int var1, int var2, int var3) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "12"
	)
	void method1716(int var1, int var2) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1772179237"
	)
	void method1717(int var1, int var2) {
		this.field2878[var1] = var2;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "80"
	)
	void method1718(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2932 == var1) {
				if (var2.stream != null) {
					var2.stream.method242(PcmPlayer.field183 / 100);
					if (var2.stream.method246()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method1770();
				}

				if (var2.field2937 < 0) {
					this.field2887[var2.field2932][var2.field2934] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-181524970"
	)
	void method1719(int var1) {
		if (var1 >= 0) {
			this.field2872[var1] = 12800;
			this.field2875[var1] = 8192;
			this.field2876[var1] = 16383;
			this.field2878[var1] = 8192;
			this.field2873[var1] = 0;
			this.field2871[var1] = 8192;
			this.method1722(var1);
			this.method1723(var1);
			this.field2877[var1] = 0;
			this.field2880[var1] = 32767;
			this.field2870[var1] = 256;
			this.field2869[var1] = 0;
			this.method1725(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method1719(var1);
			}

		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1332909523"
	)
	void method1720(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2932 == var1) && var2.field2937 < 0) {
				this.field2887[var2.field2932][var2.field2934] = null;
				var2.field2937 = 0;
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method1721() {
		this.method1718(-1);
		this.method1719(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2881[var1] = this.field2867[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2874[var1] = this.field2867[var1] & -128;
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2105906400"
	)
	void method1722(int var1) {
		if ((this.field2877[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2932 == var1 && this.field2887[var1][var2.field2934] == null && var2.field2937 < 0) {
					var2.field2937 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1575578518"
	)
	void method1723(int var1) {
		if ((this.field2877[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2932 == var1) {
					var2.field2923 = 0;
				}
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-97"
	)
	void method1724(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method1714(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method1712(var3, var4, var5);
			} else {
				this.method1714(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method1715(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2874[var3] = (var5 << 14) + (this.field2874[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2874[var3] = (var5 << 7) + (this.field2874[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2873[var3] = (var5 << 7) + (this.field2873[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2873[var3] = var5 + (this.field2873[var3] & -128);
			}

			if (var4 == 5) {
				this.field2871[var3] = (var5 << 7) + (this.field2871[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2871[var3] = var5 + (this.field2871[var3] & -128);
			}

			if (var4 == 7) {
				this.field2872[var3] = (var5 << 7) + (this.field2872[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2872[var3] = var5 + (this.field2872[var3] & -128);
			}

			if (var4 == 10) {
				this.field2875[var3] = (var5 << 7) + (this.field2875[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2875[var3] = var5 + (this.field2875[var3] & -128);
			}

			if (var4 == 11) {
				this.field2876[var3] = (var5 << 7) + (this.field2876[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2876[var3] = var5 + (this.field2876[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2877;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2877;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2877;
					var10000[var3] |= 2;
				} else {
					this.method1722(var3);
					var10000 = this.field2877;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2880[var3] = (var5 << 7) + (this.field2880[var3] & 127);
			}

			if (var4 == 98) {
				this.field2880[var3] = (this.field2880[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2880[var3] = (var5 << 7) + (this.field2880[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2880[var3] = (this.field2880[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method1718(var3);
			}

			if (var4 == 121) {
				this.method1719(var3);
			}

			if (var4 == 123) {
				this.method1720(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2880[var3];
				if (var6 == 16384) {
					this.field2870[var3] = (var5 << 7) + (this.field2870[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2880[var3];
				if (var6 == 16384) {
					this.field2870[var3] = var5 + (this.field2870[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2869[var3] = (var5 << 7) + (this.field2869[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2869[var3] = var5 + (this.field2869[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2877;
					var10000[var3] |= 4;
				} else {
					this.method1723(var3);
					var10000 = this.field2877;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method1725(var3, (var5 << 7) + (this.field2868[var3] & -16257));
			}

			if (var4 == 49) {
				this.method1725(var3, var5 + (this.field2868[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method1711(var3, var4 + this.field2874[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method1716(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method1717(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method1721();
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1812753781"
	)
	void method1725(int var1, int var2) {
		this.field2868[var1] = var2;
		this.field2879[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "26734457"
	)
	int method1726(MusicPatchNode var1) {
		int var2 = (var1.field2936 * var1.field2928 >> 12) + var1.field2931;
		var2 += (this.field2878[var1.field2932] - 8192) * this.field2870[var1.field2932] >> 12;
		MusicPatchNode2 var3 = var1.field2939;
		int var4;
		if (var3.field2845 > 0 && (var3.field2839 > 0 || this.field2873[var1.field2932] > 0)) {
			var4 = var3.field2839 << 2;
			int var5 = var3.field2842 << 1;
			if (var1.field2925 < var5) {
				var4 = var4 * var1.field2925 / var5;
			}

			var4 += this.field2873[var1.field2932] >> 7;
			double var6 = Math.sin((double)(var1.field2929 & 511) * 0.01227184630308513D);
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field183 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "1785127689"
	)
	int method1727(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2939;
		int var3 = this.field2872[var1.field2932] * this.field2876[var1.field2932] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2922 + 16384 >> 15;
		var3 = var3 * this.field2864 + 128 >> 8;
		if (var2.field2841 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2841 * 1.953125E-5D * (double)var1.field2926) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2837 != null) {
			var4 = var1.field2927;
			var5 = var2.field2837[var1.field2924 + 1];
			if (var1.field2924 < var2.field2837.length - 2) {
				var6 = (var2.field2837[var1.field2924] & 255) << 8;
				var7 = (var2.field2837[var1.field2924 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2837[var1.field2924 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field2937 > 0 && var2.field2838 != null) {
			var4 = var1.field2937;
			var5 = var2.field2838[var1.field2930 + 1];
			if (var1.field2930 < var2.field2838.length - 2) {
				var6 = (var2.field2838[var1.field2930] & 255) << 8;
				var7 = (var2.field2838[var1.field2930 + 2] & 255) << 8;
				var5 += (var2.field2838[var1.field2930 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "169543047"
	)
	int method1728(MusicPatchNode var1) {
		int var2 = this.field2875[var1.field2932];
		return var2 < 8192 ? var2 * var1.field2938 + 32 >> 6 : 16384 - ((128 - var1.field2938) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-21270581"
	)
	void method1734() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2884; var2 == this.trackLength; var3 = this.midiFile.method1748(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2862 || var2 == 0) {
							this.method1721();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method1724(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2884 = var3;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)Z",
		garbageValue = "4"
	)
	boolean method1735(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2937 >= 0) {
				var1.remove();
				if (var1.field2933 > 0 && var1 == this.field2888[var1.field2932][var1.field2933]) {
					this.field2888[var1.field2932][var1.field2933] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIIB)Z",
		garbageValue = "46"
	)
	boolean method1736(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2935 = PcmPlayer.field183 / 100;
		if (var1.field2937 < 0 || var1.stream != null && !var1.stream.method245()) {
			int var5 = var1.field2928;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2871[var1.field2932] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2928 = var5;
			}

			var1.stream.method243(this.method1726(var1));
			MusicPatchNode2 var6 = var1.field2939;
			boolean var7 = false;
			++var1.field2925;
			var1.field2929 += var6.field2845;
			double var8 = (double)((var1.field2934 - 60 << 8) + (var1.field2928 * var1.field2936 >> 12)) * 5.086263020833333E-6D;
			if (var6.field2841 > 0) {
				if (var6.field2844 > 0) {
					var1.field2926 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2844 * var8) + 0.5D);
				} else {
					var1.field2926 += 128;
				}
			}

			if (var6.field2837 != null) {
				if (var6.field2840 > 0) {
					var1.field2927 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2840) + 0.5D);
				} else {
					var1.field2927 += 128;
				}

				while (var1.field2924 < var6.field2837.length - 2 && var1.field2927 > (var6.field2837[var1.field2924 + 2] & 255) << 8) {
					var1.field2924 += 2;
				}

				if (var6.field2837.length - 2 == var1.field2924 && var6.field2837[var1.field2924 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2937 >= 0 && var6.field2838 != null && (this.field2877[var1.field2932] & 1) == 0 && (var1.field2933 < 0 || var1 != this.field2888[var1.field2932][var1.field2933])) {
				if (var6.field2843 > 0) {
					var1.field2937 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2843) + 0.5D);
				} else {
					var1.field2937 += 128;
				}

				while (var1.field2930 < var6.field2838.length - 2 && var1.field2937 > (var6.field2838[var1.field2930 + 2] & 255) << 8) {
					var1.field2930 += 2;
				}

				if (var6.field2838.length - 2 == var1.field2930) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method242(var1.field2935);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method246()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method1770();
				if (var1.field2937 >= 0) {
					var1.remove();
					if (var1.field2933 > 0 && var1 == this.field2888[var1.field2932][var1.field2933]) {
						this.field2888[var1.field2932][var1.field2933] = null;
					}
				}

				return true;
			} else {
				var1.stream.method241(var1.field2935, this.method1727(var1), this.method1728(var1));
				return false;
			}
		} else {
			var1.method1770();
			var1.remove();
			if (var1.field2933 > 0 && var1 == this.field2888[var1.field2932][var1.field2933]) {
				this.field2888[var1.field2932][var1.field2933] = null;
			}

			return true;
		}
	}
}
