import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class59 {
	@ObfuscatedName("ke")
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	VorbisFloor field306;
	@ObfuscatedName("aw")
	boolean field304;
	@ObfuscatedName("al")
	int[] field308;
	@ObfuscatedName("ai")
	int[] field307;
	@ObfuscatedName("ar")
	boolean[] field305;

	@ObfuscatedSignature(
		descriptor = "(Lbp;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field306 = var1;
		this.field304 = var2;
		this.field308 = var3;
		this.field307 = var4;
		this.field305 = var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FIS)V",
		garbageValue = "12621"
	)
	void method313(float[] var1, int var2) {
		int var3 = this.field306.field177.length;
		VorbisFloor var10000 = this.field306;
		int var4 = VorbisFloor.field174[this.field306.multiplier - 1];
		boolean[] var5 = this.field305;
		this.field305[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field306.method183(this.field308, var6);
			var8 = this.field306.method184(this.field308, var6);
			var9 = this.field306.method185(this.field308[var7], this.field307[var7], this.field308[var8], this.field307[var8], this.field308[var6]);
			var10 = this.field307[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field305;
				this.field305[var8] = true;
				var14[var7] = true;
				this.field305[var6] = true;
				if (var10 >= var13) {
					this.field307[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field307[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field305[var6] = false;
				this.field307[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field306.multiplier * this.field307[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field305[var8]) {
				var9 = this.field308[var8];
				var10 = this.field306.multiplier * this.field307[var8];
				this.field306.method186(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field306;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "811887838"
	)
	boolean method314() {
		return this.field304;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "3"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field308[var1];
			int var5 = this.field307[var1];
			boolean var6 = this.field305[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field308[var7];
				if (var8 < var4) {
					this.field308[var3] = var8;
					this.field307[var3] = this.field307[var7];
					this.field305[var3] = this.field305[var7];
					++var3;
					this.field308[var7] = this.field308[var3];
					this.field307[var7] = this.field307[var3];
					this.field305[var7] = this.field305[var3];
				}
			}

			this.field308[var3] = var4;
			this.field307[var3] = var5;
			this.field305[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILuu;B)Z",
		garbageValue = "-38"
	)
	public static boolean method312(int var0, class529 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	static final void method316() {
		SecureRandomCallable.method466("Your friend list is full. Max of 200 for free users, and 400 for members");
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-66317546"
	)
	public static void method317() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	static final void method318() {
		DevicePcmPlayerProvider.method72(false);
		Client.field475 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < Player.regionLandArchives.length; ++var1) {
			if (class318.regionMapArchiveIds[var1] != -1 && Player.regionLandArchives[var1] == null) {
				Player.regionLandArchives[var1] = JagexCache.archive9.takeFile(class318.regionMapArchiveIds[var1], 0);
				if (Player.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field475;
				}
			}

			if (class146.regionLandArchiveIds[var1] != -1 && HorizontalAlignment.regionMapArchives[var1] == null) {
				HorizontalAlignment.regionMapArchives[var1] = JagexCache.archive9.takeFileEncrypted(class146.regionLandArchiveIds[var1], 0, FriendLoginUpdate.xteaKeys[var1]);
				if (HorizontalAlignment.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field475;
				}
			}
		}

		if (!var0) {
			Client.field473 = 1;
		} else {
			Client.field474 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < Player.regionLandArchives.length; ++var1) {
				byte[] var2 = HorizontalAlignment.regionMapArchives[var1];
				if (var2 != null) {
					var3 = (class13.regions[var1] >> 8) * 64 - Projectile.baseX;
					var4 = (class13.regions[var1] & 255) * 64 - GameEngine.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class127.method697(var2, var3, var4);
				}
			}

			if (!var0) {
				Client.field473 = 2;
			} else {
				if (Client.field473 != 0) {
					RouteStrategy.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class190.method968();
				Actor.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var15;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var15 = 0; var15 < 104; ++var15) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var15][var3] = 0;
						}
					}
				}

				class190.method968();
				GameEngine.method123();
				var1 = Player.regionLandArchives.length;
				InterfaceParent.method475();
				DevicePcmPlayerProvider.method72(true);
				int var17;
				if (!Client.isInInstance) {
					byte[] var5;
					for (var15 = 0; var15 < var1; ++var15) {
						var3 = (class13.regions[var15] >> 8) * 64 - Projectile.baseX;
						var4 = (class13.regions[var15] & 255) * 64 - GameEngine.baseY;
						var5 = Player.regionLandArchives[var15];
						if (var5 != null) {
							class190.method968();
							HttpQueryParams.method2420(var5, var3, var4, JagNetThread.field3644 * 8 - 48, class317.field2830 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var15 = 0; var15 < var1; ++var15) {
						var3 = (class13.regions[var15] >> 8) * 64 - Projectile.baseX;
						var4 = (class13.regions[var15] & 255) * 64 - GameEngine.baseY;
						var5 = Player.regionLandArchives[var15];
						if (var5 == null && class317.field2830 < 800) {
							class190.method968();
							Login.method435(var3, var4, 64, 64);
						}
					}

					DevicePcmPlayerProvider.method72(true);

					for (var15 = 0; var15 < var1; ++var15) {
						byte[] var16 = HorizontalAlignment.regionMapArchives[var15];
						if (var16 != null) {
							var4 = (class13.regions[var15] >> 8) * 64 - Projectile.baseX;
							var17 = (class13.regions[var15] & 255) * 64 - GameEngine.baseY;
							class190.method968();
							VarcInt.method918(var16, var4, var17, Actor.scene, Client.collisionMaps);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var15 = 0; var15 < 4; ++var15) {
						class190.method968();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var19 = false;
								var6 = Client.instanceChunkTemplates[var15][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class13.regions.length; ++var12) {
										if (class13.regions[var12] == var11 && Player.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											HttpResponse.method65(Player.regionLandArchives[var12], var15, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
											var19 = true;
											break;
										}
									}
								}

								if (!var19) {
									class33.method122(var15, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var15 = 0; var15 < 13; ++var15) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var15][var3];
							if (var4 == -1) {
								Login.method435(var15 * 8, var3 * 8, 8, 8);
							}
						}
					}

					DevicePcmPlayerProvider.method72(true);

					for (var15 = 0; var15 < 4; ++var15) {
						class190.method968();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var17 = Client.instanceChunkTemplates[var15][var3][var4];
								if (var17 != -1) {
									var6 = var17 >> 24 & 3;
									var7 = var17 >> 1 & 3;
									var8 = var17 >> 14 & 1023;
									var9 = var17 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class13.regions.length; ++var11) {
										if (class13.regions[var11] == var10 && HorizontalAlignment.regionMapArchives[var11] != null) {
											Tiles.method464(HorizontalAlignment.regionMapArchives[var11], var15, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, Actor.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				DevicePcmPlayerProvider.method72(true);
				class190.method968();
				class53.method289(Actor.scene, Client.collisionMaps);
				DevicePcmPlayerProvider.method72(true);
				var15 = Tiles.Tiles_minPlane;
				if (var15 > class473.Client_plane) {
					var15 = class473.Client_plane;
				}

				if (var15 < class473.Client_plane - 1) {
					var15 = class473.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					Actor.scene.init(Tiles.Tiles_minPlane);
				} else {
					Actor.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class73.updateItemPile(class473.Client_plane, var3, var4);
					}
				}

				class190.method968();
				CollisionMap.method1205();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var18;
				if (class193.client.hasFrame()) {
					var18 = ViewportMouse.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var18.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var18);
				}

				if (!Client.isInInstance) {
					var3 = (JagNetThread.field3644 - 6) / 8;
					var4 = (JagNetThread.field3644 + 6) / 8;
					var17 = (class317.field2830 - 6) / 8;
					var6 = (class317.field2830 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var17 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var17 || var8 > var6) {
								JagexCache.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								JagexCache.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				Interpreter.updateGameState(30);
				class190.method968();
				MouseRecorder.method483();
				var18 = ViewportMouse.getPacketBufferNode(ClientPacket.field2585, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var18);
				class321.method1698();
			}
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1711332225"
	)
	static final void method319() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			if (var0.hitpoints == 0) {
				if (var0.objectId < 0 || class237.method1239(var0.objectId, var0.field980)) {
					class439.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field989, var0.field980, var0.field984);
					var0.remove();
				}
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102 && (var0.field993 < 0 || class237.method1239(var0.field993, var0.field990))) {
					class439.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.field993, var0.field986, var0.field990, var0.field984);
					var0.delay = -1;
					if (var0.field993 == var0.objectId && var0.objectId == -1) {
						var0.remove();
					} else if (var0.objectId == var0.field993 && var0.field989 == var0.field986 && var0.field990 == var0.field980) {
						var0.remove();
					}
				}
			}
		}

	}
}
