import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("aq")
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@Export("type")
	int type;
	@ObfuscatedName("al")
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@Export("objectId")
	int objectId;
	@ObfuscatedName("as")
	int field989;
	@ObfuscatedName("aa")
	int field980;
	@ObfuscatedName("az")
	int field993;
	@ObfuscatedName("ao")
	int field986;
	@ObfuscatedName("au")
	int field990;
	@ObfuscatedName("ak")
	int field984;
	@ObfuscatedName("aj")
	int field983;
	@ObfuscatedName("af")
	@Export("delay")
	int delay;
	@ObfuscatedName("ax")
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field983 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "102"
	)
	void method521(int var1) {
		this.field983 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2006124018"
	)
	boolean method522(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field983 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1061121183"
	)
	static void method524() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-204477510"
	)
	static void method523() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "97"
	)
	static void method525(boolean var0) {
		MusicSong var2;
		if (var0) {
			Iterator var1 = class321.musicSongs.iterator();

			while (true) {
				do {
					if (!var1.hasNext()) {
						class321.musicSongs.clear();
						return;
					}

					var2 = (MusicSong)var1.next();
				} while(var2 == null);

				var2.midiPcmStream.clear();
				var2.midiPcmStream.method1704();
				var2.midiPcmStream.setPcmStreamVolume(0);
				var2.midiPcmStream.field2890 = 0;
				int var3 = var2.musicTrackGroupId;
				int var4 = var2.musicTrackFileId;
				Iterator var5 = class321.field2853.iterator();

				while (var5.hasNext()) {
					class327 var6 = (class327)var5.next();
					var6.vmethod6339(var3, var4);
				}
			}
		} else {
			for (int var7 = 0; var7 < class321.musicSongs.size(); ++var7) {
				var2 = (MusicSong)class321.musicSongs.get(var7);
				if (var2 == null) {
					class321.musicSongs.remove(var7);
					--var7;
				} else if (var2.field2941) {
					if (var2.midiPcmStream.field2890 > 0) {
						--var2.midiPcmStream.field2890;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method1704();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class321.musicSongs.remove(var7);
					--var7;
				} else {
					var2.field2941 = true;
				}
			}

		}
	}
}
