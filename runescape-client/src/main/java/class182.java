import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class182 {
	@ObfuscatedName("aj")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lun;II)Z",
		garbageValue = "-1402960376"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1;
				if (Players.field1152[var1] != null) {
					var11.read(Players.field1152[var1]);
				}

				var11.orientation = Players.Players_orientations[var1];
				var11.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1150[var1];
				var11.plane = (byte)var8;
				var11.resetPath((var9 << 13) + var3 - Projectile.baseX, (var10 << 13) + var4 - GameEngine.baseY);
				var11.field935 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players.Players_regions[var1];
				var7 = (var6 >> 28) + var4 & 3;
				var8 = var6 >> 14 & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}

				if (var5 == 1) {
					--var9;
				}

				if (var5 == 2) {
					++var8;
					--var9;
				}

				if (var5 == 3) {
					--var8;
				}

				if (var5 == 4) {
					++var8;
				}

				if (var5 == 5) {
					--var8;
					++var9;
				}

				if (var5 == 6) {
					++var9;
				}

				if (var5 == 7) {
					++var8;
					++var9;
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = var3 >> 8 & 255;
				var6 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var6 + var7 & 255;
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luq;IIIIIIB)V",
		garbageValue = "-93"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (class193.method973(var1, var2, var3)) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedShort();
				if (var7 == 0) {
					if (var1 == 0) {
						int[] var8 = Tiles.Tiles_heights[0][var2];
						int var11 = var4 + 932731;
						int var12 = var5 + 556238;
						int var13 = HttpResponse.method66(var11 + 45365, var12 + 91923, 4) - 128 + (HttpResponse.method66(var11 + 10294, 37821 + var12, 2) - 128 >> 1) + (HttpResponse.method66(var11, var12, 1) - 128 >> 2);
						var13 = (int)(0.3D * (double)var13) + 35;
						if (var13 < 10) {
							var13 = 10;
						} else if (var13 > 60) {
							var13 = 60;
						}

						var8[var3] = -var13 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var14 = var0.readUnsignedByte();
					if (var14 == 1) {
						var14 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var14 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var14 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					TriBool.Tiles_overlays[var1][var2][var3] = (short)var0.readShort();
					class173.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4);
					class350.field3188[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					GrandExchangeOfferAgeComparator.Tiles_underlays[var1][var2][var3] = (short)(var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedShort();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readShort();
				}
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-21352582"
	)
	static int method935(int var0, Script var1, boolean var2) {
		if (var0 == 6500) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FileSystem.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var3;
			if (var0 == 6501) {
				var3 = class130.worldListStart();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var3 = UserComparator5.getNextWorldListWorld();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				World var4;
				int var5;
				int var7;
				if (var0 == 6506) {
					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var4 = null;

					for (var5 = 0; var5 < World.World_count; ++var5) {
						if (var7 == class256.World_worlds[var5].id) {
							var4 = class256.World_worlds[var5];
							break;
						}
					}

					if (var4 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					Interpreter.Interpreter_intStackSize -= 4;
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
					class1.sortWorldList(var7, var10, var5, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var8;
						ParamComposition var9;
						if (var0 == 6513) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = UserComparator4.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = VarcInt.getNpcDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarcInt.getNpcDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6514) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = UserComparator4.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class127.getObjectDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class127.getObjectDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6515) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = UserComparator4.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6516) {
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var9 = UserComparator4.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class144.StructDefinition_getStructDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class144.StructDefinition_getStructDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == 6518) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--class60.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class60.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6524) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field448;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var7 >= 0 && var7 < World.World_count) {
						var4 = class256.World_worlds[var7];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-990046890"
	)
	static final void method936(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = 0.5F + (float)var0 / 200.0F;
		HttpRequestTask.method61((double)var1);
	}
}
