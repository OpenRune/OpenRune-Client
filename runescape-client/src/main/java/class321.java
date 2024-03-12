import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class321 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field2851;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field2852;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field2850;
	@ObfuscatedName("ai")
	public static ArrayList field2846;
	@ObfuscatedName("ar")
	public static LinkedList field2849;
	@ObfuscatedName("as")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("aa")
	static ArrayList field2858;
	@ObfuscatedName("az")
	public static ArrayList field2848;
	@ObfuscatedName("ao")
	public static final List field2853;
	@ObfuscatedName("au")
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("ak")
	static int field2856;
	@ObfuscatedName("ah")
	static int field2854;
	@ObfuscatedName("aj")
	static int field2855;

	static {
		field2846 = null;
		field2849 = new LinkedList();
		musicSongs = new ArrayList(3);
		field2858 = new ArrayList(3);
		field2848 = new ArrayList();
		field2853 = new ArrayList();
		musicPlayerStatus = 0;
		field2856 = 0;
		field2854 = 0;
		field2855 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I[BLrl;B)V",
		garbageValue = "0"
	)
	static void method1696(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field3606) {
			if (ArchiveDiskActionHandler.field3605 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field3605 = 600;
			ArchiveDiskActionHandler.field3604 = false;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BB)[I",
		garbageValue = "-79"
	)
	public static int[] method1697(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) {
			int[] var1 = new int[var0.length];

			for (int var2 = 0; var2 < var0.length; ++var2) {
				if (var0[var2] < 0 || var0[var2] > class557.field4388.length) {
					return null;
				}

				var1[var2] = class557.field4388[var0[var2]];
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	protected static final void method1698() {
		SecureRandomSSLSocket.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class496.gameCyclesToDo = 0;
	}
}
