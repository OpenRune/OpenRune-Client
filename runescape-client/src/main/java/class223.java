import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ia")
public class class223 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final class223 field1936;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("aw")
	Map field1938;
	@ObfuscatedName("al")
	int field1937;

	static {
		field1936 = new class223();
	}

	class223() {
		this.field1938 = new HashMap();
		this.field1937 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;I)V",
		garbageValue = "-737927221"
	)
	void method1149(JSONObject var1, int var2, UrlRequester var3) {
		this.field1938.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field1937 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method1152(var4.getJSONArray("crmcomponents"), this.field1937, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILel;I)V",
		garbageValue = "-1974650686"
	)
	void method1152(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class221 var7 = new class221();

						try {
							var7.method1141(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field1923.isEmpty()) {
							String var8 = var5.getString("location");
							this.field1938.put(var8, var7);
						}
					}
				}
			}

			this.field1938 = this.method1153();
			SecureRandomCallable.method465();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "38"
	)
	Map method1153() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field1938.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var5 = 0; var5 < var2.size() - 1; ++var5) {
				if (((class221)((Entry)var2.get(var5)).getValue()).method1139() > ((class221)((Entry)var2.get(var5 + 1)).getValue()).method1139()) {
					Entry var4 = (Entry)var2.get(var5);
					var2.set(var5, var2.get(var5 + 1));
					var2.set(var5 + 1, var4);
					var3 = false;
				}
			}
		}

		Iterator var7 = var2.iterator();

		while (var7.hasNext()) {
			Entry var6 = (Entry)var7.next();
			var1.put(var6.getKey(), var6.getValue());
		}

		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lit;",
		garbageValue = "1"
	)
	class221 method1154(String var1) {
		return (class221)this.field1938.get(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldc;",
		garbageValue = "1732993842"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = Player.shift8LeftAndAdd(var1, var0);
		Script var4 = WorldMapAreaData.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (-3 - var2 << 8) + var0;
			var4 = WorldMapAreaData.getScript(var5, var0);
			if (var4 != null) {
				return var4;
			} else {
				int var6 = var0 + -512;
				var4 = WorldMapAreaData.getScript(var6, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "5"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "530526359"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			UrlRequest.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < SecureRandomFuture.method450(); ++var8) {
			long var9 = FloorUnderlayDefinition.method984(var8);
			if (var6 != var9) {
				var6 = var9;
				int var11 = class86.method474(var8);
				int var12 = class367.method1955(var8);
				int var13 = WorldMapDecoration.method1369(var8);
				int var14 = Message.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var15 = var14;
				int var19;
				if (var13 == 2 && Actor.scene.getObjectFlags(class473.Client_plane, var11, var12, var9) >= 0) {
					ObjectComposition var16 = class127.getObjectDefinition(var14);
					if (var16.transforms != null) {
						var16 = var16.transform();
					}

					if (var16 == null) {
						continue;
					}

					PendingSpawn var17 = null;

					for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
						if (var18.plane == class473.Client_plane && var11 == var18.x && var12 == var18.y && var15 == var18.field993) {
							var17 = var18;
							break;
						}
					}

					if (Client.isItemSelected == 1) {
						UrlRequest.insertMenuItemNoShift("Use", Client.field625 + " " + "->" + " " + class370.colorStartTag(65535) + var16.name, 1, var15, var11, var12);
					} else if (Client.isSpellSelected) {
						if ((class128.selectedSpellFlags & 4) == 4) {
							UrlRequest.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class370.colorStartTag(65535) + var16.name, 2, var15, var11, var12);
						}
					} else {
						String[] var30 = var16.actions;
						if (var30 != null) {
							for (var19 = 4; var19 >= 0; --var19) {
								if ((var17 == null || var17.method522(var19)) && var30[var19] != null) {
									short var20 = 0;
									if (var19 == 0) {
										var20 = 3;
									}

									if (var19 == 1) {
										var20 = 4;
									}

									if (var19 == 2) {
										var20 = 5;
									}

									if (var19 == 3) {
										var20 = 6;
									}

									if (var19 == 4) {
										var20 = 1001;
									}

									UrlRequest.insertMenuItemNoShift(var30[var19], class370.colorStartTag(65535) + var16.name, var20, var15, var11, var12);
								}
							}
						}

						UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(65535) + var16.name, 1002, var16.id, var11, var12);
					}
				}

				int var22;
				Player var23;
				NPC var31;
				int[] var32;
				if (var13 == 1) {
					NPC var26 = Client.npcs[var15];
					if (var26 == null) {
						continue;
					}

					if (var26.definition.size == 1 && (var26.x & 127) == 64 && (var26.y & 127) == 64) {
						for (var22 = 0; var22 < Client.npcCount; ++var22) {
							var31 = Client.npcs[Client.npcIndices[var22]];
							if (var31 != null && var31 != var26 && var31.definition.size == 1 && var31.x == var26.x && var26.y == var31.y) {
								Skeleton.addNpcToMenu(var31, Client.npcIndices[var22], var11, var12);
							}
						}

						var22 = Players.Players_count;
						var32 = Players.Players_indices;

						for (var19 = 0; var19 < var22; ++var19) {
							var23 = Client.players[var32[var19]];
							if (var23 != null && var23.x == var26.x && var23.y == var26.y) {
								MilliClock.addPlayerToMenu(var23, var32[var19], var11, var12);
							}
						}
					}

					Skeleton.addNpcToMenu(var26, var15, var11, var12);
				}

				if (var13 == 0) {
					Player var27 = Client.players[var15];
					if (var27 == null) {
						continue;
					}

					if ((var27.x & 127) == 64 && (var27.y & 127) == 64) {
						for (var22 = 0; var22 < Client.npcCount; ++var22) {
							var31 = Client.npcs[Client.npcIndices[var22]];
							if (var31 != null && var31.definition.size == 1 && var31.x == var27.x && var27.y == var31.y) {
								Skeleton.addNpcToMenu(var31, Client.npcIndices[var22], var11, var12);
							}
						}

						var22 = Players.Players_count;
						var32 = Players.Players_indices;

						for (var19 = 0; var19 < var22; ++var19) {
							var23 = Client.players[var32[var19]];
							if (var23 != null && var27 != var23 && var27.x == var23.x && var27.y == var23.y) {
								MilliClock.addPlayerToMenu(var23, var32[var19], var11, var12);
							}
						}
					}

					if (var15 != Client.combatTargetPlayerIndex) {
						MilliClock.addPlayerToMenu(var27, var15, var11, var12);
					} else {
						var4 = var9;
					}
				}

				if (var13 == 3) {
					NodeDeque var28 = Client.groundItems[class473.Client_plane][var11][var12];
					if (var28 != null) {
						for (TileItem var29 = (TileItem)var28.first(); var29 != null; var29 = (TileItem)var28.next()) {
							ItemComposition var33 = ArchiveDiskActionHandler.ItemDefinition_get(var29.id);
							if (Client.isItemSelected == 1) {
								UrlRequest.insertMenuItemNoShift("Use", Client.field625 + " " + "->" + " " + class370.colorStartTag(16748608) + var33.name, 16, var29.id, var11, var12);
							} else if (Client.isSpellSelected) {
								if ((class128.selectedSpellFlags & 1) == 1) {
									UrlRequest.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class370.colorStartTag(16748608) + var33.name, 17, var29.id, var11, var12);
								}
							} else {
								String[] var24 = var33.groundActions;

								for (int var34 = 4; var34 >= 0; --var34) {
									if (var29.method622(var34)) {
										if (var24 != null && var24[var34] != null) {
											byte var21 = 0;
											if (var34 == 0) {
												var21 = 18;
											}

											if (var34 == 1) {
												var21 = 19;
											}

											if (var34 == 2) {
												var21 = 20;
											}

											if (var34 == 3) {
												var21 = 21;
											}

											if (var34 == 4) {
												var21 = 22;
											}

											UrlRequest.insertMenuItemNoShift(var24[var34], class370.colorStartTag(16748608) + var33.name, var21, var29.id, var11, var12);
										} else if (var34 == 2) {
											UrlRequest.insertMenuItemNoShift("Take", class370.colorStartTag(16748608) + var33.name, 20, var29.id, var11, var12);
										}
									}
								}

								UrlRequest.insertMenuItemNoShift("Examine", class370.colorStartTag(16748608) + var33.name, 1004, var29.id, var11, var12);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = GrandExchangeOfferAgeComparator.method2033(var4);
			int var25 = SoundSystem.method209(var4);
			Player var10 = Client.players[Client.combatTargetPlayerIndex];
			MilliClock.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var25);
		}

	}
}
