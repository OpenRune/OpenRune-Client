import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("aw")
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("al")
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("ai")
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ar")
	public float field2947;
	@ObfuscatedName("as")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("aa")
	public boolean field2943;
	@ObfuscatedName("az")
	public boolean field2946;
	@ObfuscatedName("ao")
	public boolean field2944;
	@ObfuscatedName("au")
	boolean field2941;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	public SoundCache field2942;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public MusicTrack field2952;

	@ObfuscatedSignature(
		descriptor = "(Lof;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field2947 = 0.0F;
		this.musicTrackBoolean = false;
		this.field2944 = false;
		this.field2941 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method1775(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lof;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field2947 = 0.0F;
		this.musicTrackBoolean = false;
		this.field2944 = false;
		this.field2941 = false;
		this.method1775(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;IIIZI)V",
		garbageValue = "1009228261"
	)
	void method1775(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1608518026"
	)
	public static int method1776(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
