import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("aq")
	byte[] field2837;
	@ObfuscatedName("aw")
	byte[] field2838;
	@ObfuscatedName("al")
	int field2841;
	@ObfuscatedName("ai")
	int field2840;
	@ObfuscatedName("ar")
	int field2843;
	@ObfuscatedName("as")
	int field2844;
	@ObfuscatedName("aa")
	int field2839;
	@ObfuscatedName("az")
	int field2845;
	@ObfuscatedName("ao")
	int field2842;

	MusicPatchNode2() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-822937371"
	)
	static void method1695(ArrayList var0, boolean var1) {
		if (!var1) {
			class321.field2858.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MusicSong var3 = (MusicSong)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class321.field2858.add(var3);
				}

				class321.field2849.add(var3);
			}
		}

	}
}
