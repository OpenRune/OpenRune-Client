import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public class class422 extends SongTask {
	@ObfuscatedName("iz")
	static int field3809;

	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	public class422(SongTask var1) {
		super(var1);
		super.field3818 = "StartSongTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	@Export("vmethod8043")
	public boolean vmethod8043() {
		Iterator var1 = class321.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field2946 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method1703();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field2952 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field2952, var2.musicTrackBoolean);
					}

					var2.field2952 = null;
					var2.field2942 = null;
					var2.musicTrackArchive = null;
					var2.field2946 = true;
				} catch (Exception var4) {
					class315.RunException_sendStackTrace((String)null, var4);
					this.method2218(var4.getMessage());
					return true;
				}
			}
		}

		super.field3815 = true;
		return true;
	}
}
