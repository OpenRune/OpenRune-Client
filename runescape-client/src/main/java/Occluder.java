import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("aq")
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("aw")
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("al")
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ai")
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ar")
	@Export("type")
	int type;
	@ObfuscatedName("as")
	@Export("minX")
	int minX;
	@ObfuscatedName("aa")
	@Export("maxX")
	int maxX;
	@ObfuscatedName("az")
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ao")
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("au")
	@Export("minY")
	int minY;
	@ObfuscatedName("ak")
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ah")
	int field2364;
	@ObfuscatedName("aj")
	int field2366;
	@ObfuscatedName("af")
	int field2362;
	@ObfuscatedName("ax")
	int field2377;
	@ObfuscatedName("an")
	int field2370;
	@ObfuscatedName("ag")
	int field2363;
	@ObfuscatedName("am")
	int field2369;

	Occluder() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1558434695"
	)
	static int method1563(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveLoader.widgetDefinition.method1785(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == 2500) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == 2501) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == 2502) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == 2503) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == 2504) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == 2505) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIIII)V",
		garbageValue = "1557072939"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC)var0).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var75 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			boolean var8 = var1 < var75;
			int var9 = -2;
			if (var0.overheadText != null && (!var8 || !var0.field997 && (Client.publicChatMode == 4 || !var0.field998 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				ClientPreferences.method583(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class166.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class166.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9;
					Client.overheadTextColors[Client.overheadTextCount] = var0.field1027;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field1030;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.field620[Client.overheadTextCount] = var0.field1062;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
					var9 += 12;
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method2091()) {
				ClientPreferences.method583(var0, var0.defaultHeight + 15);

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var11 = var10.get(Client.cycle);
					if (var11 == null) {
						if (var10.isEmpty()) {
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition;
						SpritePixels var13 = var12.getBackSprite();
						SpritePixels var14 = var12.getFrontSprite();
						int var16 = 0;
						if (var13 != null && var14 != null) {
							if (var12.widthPadding * 2 < var14.subWidth) {
								var16 = var12.widthPadding;
							}

							var15 = var14.subWidth - var16 * 2;
						} else {
							var15 = var12.width;
						}

						int var84 = 255;
						boolean var86 = true;
						int var87 = Client.cycle - var11.cycle;
						int var88 = var15 * var11.health2 / var12.width;
						int var89;
						int var99;
						if (var11.cycleOffset > var87) {
							var89 = var12.field1531 == 0 ? 0 : var12.field1531 * (var87 / var12.field1531);
							var22 = var15 * var11.health / var12.width;
							var99 = var89 * (var88 - var22) / var11.cycleOffset + var22;
						} else {
							var99 = var88;
							var89 = var12.int5 + var11.cycleOffset - var87;
							if (var12.int3 >= 0) {
								var84 = (var89 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var99 < 1) {
							var99 = 1;
						}

						if (var13 != null && var14 != null) {
							if (var99 == var15) {
								var99 += var16 * 2;
							} else {
								var99 += var16;
							}

							var89 = var13.subHeight;
							var9 += var89;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var23 = var3 + Client.viewportTempY - var9;
							var22 -= var16;
							if (var84 >= 0 && var84 < 255) {
								var13.drawTransAt(var22, var23, var84);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var99 + var22, var23 + var89);
								var14.drawTransAt(var22, var23, var84);
							} else {
								var13.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var99 + var22, var23 + var89);
								var14.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var9 += 2;
						} else {
							var9 += 5;
							if (Client.viewportTempX > -1) {
								var89 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var9;
								Rasterizer2D.Rasterizer2D_fillRectangle(var89, var22, var99, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var99 + var89, var22, var15 - var99, 5, 16711680);
							}

							var9 += 2;
						}
					}
				}
			}

			if (var9 == -2) {
				var9 += 7;
			}

			Player var90;
			if (var8 && var0.playerCycle == Client.cycle && SpotAnimationDefinition.method980((Player)var0)) {
				var90 = (Player)var0;
				if (var8) {
					ClientPreferences.method583(var0, var0.defaultHeight + 15);
					AbstractFont var91 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					var9 += 4;
					var91.drawCentered(var90.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0);
					var9 += 18;
				}
			}

			if (var8) {
				var90 = (Player)var0;
				if (var90.isHidden) {
					return;
				}

				if (var90.headIconPk != -1 || var90.headIconPrayer != -1) {
					ClientPreferences.method583(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var90.headIconPk != -1) {
							var9 += 25;
							class13.headIconPkSprites[var90.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}

						if (var90.headIconPrayer != -1) {
							var9 += 25;
							class168.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					ClientPreferences.method583(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var9 += ChatChannel.headIconHintSprites[1].subHeight;
						ChatChannel.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
					}
				}
			} else {
				NPC var92 = (NPC)var0;
				int[] var93 = var92.method596();
				short[] var94 = var92.method597();
				if (var94 != null && var93 != null) {
					for (int var76 = 0; var76 < var94.length; ++var76) {
						if (var94[var76] >= 0 && var93[var76] >= 0) {
							long var77 = (long)var93[var76] << 8 | (long)var94[var76];
							SpritePixels var79 = (SpritePixels)Client.field661.method2258(var77);
							if (var79 == null) {
								SpritePixels[] var17 = class138.method750(class311.archive8, var93[var76], 0);
								if (var17 != null && var94[var76] < var17.length) {
									var79 = var17[var94[var76]];
									Client.field661.method2259(var77, var79);
								}
							}

							if (var79 != null) {
								ClientPreferences.method583(var0, var0.defaultHeight + 15);
								if (Client.viewportTempX > -1) {
									var79.drawTransBgAt(var2 + Client.viewportTempX - (var79.subWidth >> 1), Client.viewportTempY + (var3 - var79.subHeight) - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					ClientPreferences.method583(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						ChatChannel.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var80 = 0; var80 < 4; ++var80) {
				int var81 = var0.hitSplatCycles[var80];
				int var82 = var0.hitSplatTypes[var80];
				HitSplatDefinition var95 = null;
				int var83 = 0;
				if (var82 >= 0) {
					if (var81 <= Client.cycle) {
						continue;
					}

					var95 = Language.method2058(var0.hitSplatTypes[var80]);
					var83 = var95.field1687;
					if (var95 != null && var95.transforms != null) {
						var95 = var95.transform();
						if (var95 == null) {
							var0.hitSplatCycles[var80] = -1;
							continue;
						}
					}
				} else if (var81 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var80];
				HitSplatDefinition var97 = null;
				if (var15 >= 0) {
					var97 = Language.method2058(var15);
					if (var97 != null && var97.transforms != null) {
						var97 = var97.transform();
					}
				}

				if (var81 - var83 <= Client.cycle) {
					if (var95 == null) {
						var0.hitSplatCycles[var80] = -1;
					} else {
						ClientPreferences.method583(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > -1) {
							boolean var98 = true;
							if (var80 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var80 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var80 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var18 = null;
							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							var22 = 0;
							var23 = 0;
							int var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							var18 = var95.method1012();
							int var43;
							if (var18 != null) {
								var22 = var18.subWidth;
								var43 = var18.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var18.xOffset;
							}

							var19 = var95.method1013();
							if (var19 != null) {
								var23 = var19.subWidth;
								var43 = var19.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var19.xOffset;
							}

							var20 = var95.method1014();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var95.method1015();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var97 != null) {
								var30 = var97.method1012();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var97.method1013();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var97.method1014();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var97.method1015();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var85 = var95.getFont();
							if (var85 == null) {
								var85 = class60.fontPlain11;
							}

							Font var44;
							if (var97 != null) {
								var44 = var97.getFont();
								if (var44 == null) {
									var44 = class60.fontPlain11;
								}
							} else {
								var44 = class60.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var95.getString(var0.hitSplatValues[var80]);
							int var96 = var85.stringWidth(var45);
							if (var97 != null) {
								var46 = var97.getString(var0.hitSplatValues2[var80]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var20 == null && var21 == null) {
									var49 = 1;
								} else {
									var49 = var96 / var23 + 1;
								}
							}

							if (var97 != null && var35 > 0) {
								if (var32 == null && var33 == null) {
									var50 = 1;
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var23 > 0) {
								var56 = var49 * var23;
								var51 += var56;
								var55 += (var56 - var96) / 2;
							} else {
								var51 += var96;
							}

							var56 = var51;
							if (var25 > 0) {
								var51 += var25;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var97 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var35 * var50;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var80] - Client.cycle;
							int var63 = var95.field1686 - var62 * var95.field1686 / var95.field1687;
							int var64 = var62 * var95.field1689 / var95.field1687 + -var95.field1689;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var3 + Client.viewportTempY - 12 + var64;
							int var67 = var66;
							int var68 = var66 + var42;
							int var69 = var66 + var95.field1684 + 15;
							int var70 = var69 - var85.maxAscent;
							int var71 = var69 + var85.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var97 != null) {
								var72 = var66 + var97.field1684 + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {
									;
								}

								if (var74 > var68) {
									;
								}
							}

							var73 = 255;
							if (var95.field1690 >= 0) {
								var73 = (var62 << 8) / (var95.field1687 - var95.field1690);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var18 != null) {
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransAt(var23 * var74 + (var54 + var65 - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var85.drawAlpha(var45, var65 + var55, var69, var95.textColor, 0, var73);
								if (var97 != null) {
									if (var30 != null) {
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var97.textColor, 0, var73);
								}
							} else {
								if (var18 != null) {
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransBgAt(var74 * var23 + (var65 + var54 - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var85.draw(var45, var65 + var55, var69, var95.textColor | -16777216, 0);
								if (var97 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var97.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
