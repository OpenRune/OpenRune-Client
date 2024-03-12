import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class427 extends SongTask {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field3821;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field3822;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field3823;

	@ObfuscatedSignature(
		descriptor = "(Lqe;Lof;Lof;Lof;)V"
	)
	public class427(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field3821 = var2;
		this.field3822 = var3;
		this.field3823 = var4;
		super.field3818 = "LoadSongTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	@Export("vmethod8043")
	public boolean vmethod8043() {
		int var1 = 0;
		Iterator var2 = class321.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field2890 > 1 && var3.midiPcmStream.method1708()) {
					this.method2218("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field2943) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field2952 == null) {
								var3.field2952 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field2952 == null) {
									continue;
								}
							}

							if (var3.field2942 == null) {
								var3.field2942 = new SoundCache(this.field3823, this.field3822);
							}

							if (var3.midiPcmStream.method1701(var3.field2952, this.field3821, var3.field2942)) {
								++var1;
								var3.field2943 = true;
								var3.midiPcmStream.method1702();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						class315.RunException_sendStackTrace((String)null, var5);
						this.method2218(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class321.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}
}
