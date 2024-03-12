import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	MusicSong field3814;
	@ObfuscatedName("aw")
	int field3813;

	@ObfuscatedSignature(
		descriptor = "(Lqe;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field3814 = null;
		this.field3813 = 0;
		super.field3818 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class321.field2849.size()) {
				this.field3814 = (MusicSong)class321.field2849.get(var2);
			} else if (!var3 && var2 < class321.musicSongs.size()) {
				this.field3814 = (MusicSong)class321.musicSongs.get(var2);
			}

			this.field3813 = var4;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	@Export("vmethod8043")
	public boolean vmethod8043() {
		if (this.field3814 != null && this.field3814.midiPcmStream != null) {
			this.field3814.field2944 = true;

			try {
				if (this.field3814.field2947 < (float)this.field3814.musicTrackVolume && this.field3814.midiPcmStream.isReady()) {
					float var1 = this.field3813 == 0 ? (float)this.field3813 : (float)this.field3814.musicTrackVolume / (float)this.field3813;
					MusicSong var10000 = this.field3814;
					var10000.field2947 += 0.0F == var1 ? (float)this.field3814.musicTrackVolume : var1;
					if (this.field3814.field2947 > (float)this.field3814.musicTrackVolume) {
						this.field3814.field2947 = (float)this.field3814.musicTrackVolume;
					}

					this.field3814.midiPcmStream.setPcmStreamVolume((int)this.field3814.field2947);
					return false;
				}
			} catch (Exception var3) {
				this.method2218(var3.getMessage());
				return true;
			}

			this.field3814.field2944 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1973315729"
	)
	static final void method2213(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = class127.method698(var5, var6);
		int var7 = 2048 - var3 & 2047;
		int var8 = 2048 - var4 & 2047;
		int var9 = 0;
		int var10 = 0;
		int var11 = var5;
		int var12;
		int var13;
		int var14;
		if (var7 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var7];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
			var14 = var10 * var13 - var5 * var12 >> 16;
			var11 = var13 * var5 + var12 * var10 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var8];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var14 = var12 * var11 + var13 * var9 >> 16;
			var11 = var11 * var13 - var9 * var12 >> 16;
			var9 = var14;
		}

		if (Client.isCameraLocked) {
			class362.field3233 = var0 - var9;
			ArchiveDiskAction.field3599 = var1 - var10;
			AABB.field2346 = var2 - var11;
			WorldMapCacheName.field2154 = var3;
			FriendsChat.field3881 = var4;
		} else {
			ClanMate.cameraX = var0 - var9;
			AsyncHttpResponse.cameraY = var1 - var10;
			class317.cameraZ = var2 - var11;
			FriendSystem.cameraPitch = var3;
			Script.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (Friend.oculusOrbFocalPointX >> 7 != VarpDefinition.localPlayer.x >> 7 || class59.oculusOrbFocalPointY >> 7 != VarpDefinition.localPlayer.y >> 7)) {
			var12 = VarpDefinition.localPlayer.plane;
			var13 = (Friend.oculusOrbFocalPointX >> 7) + Projectile.baseX;
			var14 = (class59.oculusOrbFocalPointY >> 7) + GameEngine.baseY;
			Login.method442(var13, var14, var12, true);
		}

	}
}
