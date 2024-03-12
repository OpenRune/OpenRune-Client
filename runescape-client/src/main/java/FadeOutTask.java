import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("bg")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	MusicSong field3812;
	@ObfuscatedName("aw")
	int field3811;

	@ObfuscatedSignature(
		descriptor = "(Lqe;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field3812 = null;
		this.field3811 = 0;
		super.field3818 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class321.field2849.size()) {
				this.field3812 = (MusicSong)class321.field2849.get(var2);
			} else if (!var3 && var2 < class321.musicSongs.size()) {
				this.field3812 = (MusicSong)class321.musicSongs.get(var2);
			}

			this.field3811 = var4;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	@Export("vmethod8043")
	public boolean vmethod8043() {
		if (this.field3812 != null && this.field3812.midiPcmStream != null) {
			this.field3812.field2944 = true;

			try {
				if (this.field3812.field2947 > 0.0F && this.field3812.midiPcmStream.isReady()) {
					float var1 = this.field3811 == 0 ? (float)this.field3811 : (float)this.field3812.musicTrackVolume / (float)this.field3811;
					MusicSong var10000 = this.field3812;
					var10000.field2947 -= var1 == 0.0F ? (float)this.field3812.musicTrackVolume : var1;
					if (this.field3812.field2947 < 0.0F) {
						this.field3812.field2947 = 0.0F;
					}

					this.field3812.midiPcmStream.setPcmStreamVolume((int)this.field3812.field2947);
					return false;
				}
			} catch (Exception var3) {
				this.method2218(var3.getMessage());
				return true;
			}

			this.field3812.field2944 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lmn;",
		garbageValue = "0"
	)
	static PacketBufferNode method2209() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Luf;",
		garbageValue = "1884121148"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field4214.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method2581(new Buffer(var2));
			}

			var1.method2584();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
