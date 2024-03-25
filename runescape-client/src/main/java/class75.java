import java.math.BigInteger;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class75 {
	@ObfuscatedName("aq")
	static final BigInteger field775;
	@ObfuscatedName("aw")
	static final BigInteger field776;

	static {
		field775 = new BigInteger("10001", 16);
		field776 = new BigInteger("80bd45632ab8832b9a3166bea254ff0ee973a1f54f6e0244b189188ee5cc3340372d9b502f7174399e956f9cb39f481dd11359c96a3c31a6f34fdc8f90ac4558631e7a3b095ae524ac23343ff51e45767a407f43065db4d8a306bdad4373113ef2bc50fd7f541bb78f41f4ada546fffc8c61463b6efd07d9a68bff3f73fe67a1", 16);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
			descriptor = "(Lte;I)I",
			garbageValue = "1678088189"
	)
	static final int method429(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field4171) {
				case 5:
					return 20;
				default:
					return 12;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
			descriptor = "(Luq;[II)[Ljava/lang/Object;",
			garbageValue = "-1281861605"
	)
	static Object[] method430(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart();
		Object[] var3 = new Object[var1.length * var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.length * var4 + var5;
				class521 var7 = class297.method1653(var1[var5]);
				var3[var6] = var7.method2572(var0);
			}
		}

		return var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
			descriptor = "(IIIII)V",
			garbageValue = "-1228894690"
	)
	public static void method431(int var0, int var1, int var2, int var3) {
		if (class321.musicSongs.size() > 1 && class321.musicSongs.get(0) != null && ((MusicSong)class321.musicSongs.get(0)).midiPcmStream.isReady() && class321.musicSongs.get(1) != null && ((MusicSong)class321.musicSongs.get(1)).midiPcmStream.isReady()) {
			ScriptFrame.method327(var0, var1, var2, var3);
			class321.field2848.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class321.field2855), class321.field2854));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class321.field2856), class321.musicPlayerStatus));
			class321.field2848.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class321.field2858.get(0) != null && class321.field2858.get(1) != null) {
				MusicSong var5 = (MusicSong)class321.field2858.get(0);
				class321.field2858.set(0, class321.musicSongs.get(1));
				class321.field2858.set(1, var5);
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
			descriptor = "(B)V",
			garbageValue = "3"
	)
	@Export("SpriteBuffer_reset")
	static void SpriteBuffer_reset() {
		JagexCache.method1113(24);
		SecureUrlRequester.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}
}
