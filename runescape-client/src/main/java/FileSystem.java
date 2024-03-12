import java.net.URL;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("aq")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("al")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("ah")
	static int field1889;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1269877722"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (PacketBufferNode.World_request == null) {
				PacketBufferNode.World_request = InvDefinition.urlRequester.request(new URL(HealthBarDefinition.field1525));
			} else if (PacketBufferNode.World_request.isDone()) {
				byte[] var0 = PacketBufferNode.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class256.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class256.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class186.sortWorlds(class256.World_worlds, 0, class256.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				PacketBufferNode.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			PacketBufferNode.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lof;III)Lvd;",
		garbageValue = "-1525220578"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !class130.method720(var0, var1, var2) ? null : Projectile.method446();
	}
}
