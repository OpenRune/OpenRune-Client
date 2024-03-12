import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public abstract class class161 extends Node {
	@ObfuscatedName("by")
	protected static String field1437;

	class161() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	@Export("vmethod3504")
	abstract void vmethod3504(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	@Export("vmethod3509")
	abstract void vmethod3509(ClanChannel var1);

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "85"
	)
	static int method853(int var0, Script var1, boolean var2) {
		String var3;
		int var4;
		if (var0 == 4100) {
			var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + var4;
			return 1;
		} else {
			String var9;
			if (var0 == 4101) {
				class60.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + var9;
				return 1;
			} else if (var0 == 4102) {
				var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + WorldMapData_1.intToString(var4, true);
				return 1;
			} else if (var0 == 4103) {
				var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == 4104) {
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					long var11 = (11745L + (long)var10) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var11));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != 4105) {
					if (var0 == 4106) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == 4107) {
						class60.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ServerPacket.method1682(PlayerType.compareStrings(Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1], WorldMapCacheName.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var13;
						Font var14;
						if (var0 == 4108) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var13 = KeyHandler.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.lineCount(var3, var4);
							return 1;
						} else if (var0 == 4109) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var13 = KeyHandler.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.lineWidth(var3, var4);
							return 1;
						} else if (var0 == 4110) {
							class60.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9;
							}

							return 1;
						} else if (var0 == 4111) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == 4112) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + (char)var4;
							return 1;
						} else if (var0 == 4113) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BoundaryObject.isCharPrintable((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == 4114) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BoundaryObject.isAlphaNumeric((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == 4115) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class154.isCharAlphabetic((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == 4116) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class237.isDigit((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == 4117) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == 4118) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.substring(var4, var5);
							return 1;
						} else if (var0 == 4119) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							StringBuilder var18 = new StringBuilder(var3.length());
							boolean var16 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var16 = true;
								} else if (var7 == '>') {
									var16 = false;
								} else if (!var16) {
									var18.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var18.toString();
							return 1;
						} else if (var0 == 4120) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4);
							return 1;
						} else if (var0 == 4121) {
							class60.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var9, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class60.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
							String var15 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 2];
							if (VarpDefinition.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var15;
								return 1;
							} else {
								switch(VarpDefinition.localPlayer.appearance.field3007) {
								case 0:
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var15;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class60.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
					var9 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
					if (VarpDefinition.localPlayer.appearance != null && VarpDefinition.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9;
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lmn;B)V",
		garbageValue = "-42"
	)
	static void method852(PacketBufferNode var0) {
		var0.packetBuffer.writeIntME(Client.field651.hash);
		var0.packetBuffer.writeIntME(HttpRequestTask.archive2.hash);
		var0.packetBuffer.writeIntLE(class154.field1393.hash);
		var0.packetBuffer.writeIntLE(PlayerCompositionColorTextureOverride.field1465.hash);
		var0.packetBuffer.writeIntME(class362.field3234.hash);
		var0.packetBuffer.writeIntIME(WorldMapSectionType.archive12.hash);
		var0.packetBuffer.writeIntLE(ScriptFrame.archive4.hash);
		var0.packetBuffer.writeInt(0);
		var0.packetBuffer.writeIntLE(WorldMapSectionType.field2096.hash);
		var0.packetBuffer.writeInt(Varcs.field1172.hash);
		var0.packetBuffer.writeIntIME(SpotAnimationDefinition.field1631.hash);
		var0.packetBuffer.writeIntIME(SecureRandomSSLSocket.field40.hash);
		var0.packetBuffer.writeInt(class198.field1661.hash);
		var0.packetBuffer.writeIntIME(JagexCache.archive9.hash);
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "([Lng;IIIIIIIB)V",
		garbageValue = "-27"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method1903() || class429.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (PcmPlayer.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class134.mousedOverWidgetIf1 && PcmPlayer.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method1920(ArchiveLoader.widgetDefinition, InvDefinition.urlRequester)) {
						if (var9.method1912()) {
							UserComparator5.invalidateWidget(var9);
							class167.revalidateWidgetScroll(var9.children, var9, true);
							var9.method1919().method1086().method1128(3, var9.method1919().method1098());
						}

						if (var9.field3174 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3174;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method1928(ArchiveLoader.widgetDefinition)) {
					UserComparator5.invalidateWidget(var9);
				}

				int var26 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) {
					var16 = var26;
					var17 = var11;
					var18 = var26 + var9.width;
					int var19 = var11 + var9.height;
					if (var18 < var26) {
						var16 = var18;
						var18 = var26;
					}

					if (var19 < var11) {
						var17 = var19;
						var19 = var11;
					}

					++var18;
					++var19;
					var12 = var16 > var2 ? var16 : var2;
					var13 = var17 > var3 ? var17 : var3;
					var14 = var18 < var4 ? var18 : var4;
					var15 = var19 < var5 ? var19 : var5;
				} else {
					var16 = var26 + var9.width;
					var17 = var11 + var9.height;
					var12 = var26 > var2 ? var26 : var2;
					var13 = var11 > var3 ? var11 : var3;
					var14 = var16 < var4 ? var16 : var4;
					var15 = var17 < var5 ? var17 : var5;
				}

				if (var9 == Client.clickedWidget) {
					Client.field419 = true;
					Client.field536 = var26;
					Client.field529 = var11;
				}

				boolean var34 = false;
				if (var9.field3054) {
					switch(Client.field518) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field525 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field525) {
							var34 = true;
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var27.field898) {
										var27.remove();
										var27.widget.field3058 = false;
									}
								}

								class325.method1753();
								if (WorldMapLabelSize.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									class255.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field898 && var27.widget.onScroll == var27.args) {
									var27.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var35) {
							class223.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						GrandExchangeEvent.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							Tiles.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								Tiles.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								NpcOverrides.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3063.length; ++var20) {
								var21 = false;
								boolean var22 = false;
								if (!var21 && var9.field3063[var20] != null) {
									for (var23 = 0; var23 < var9.field3063[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3139 != null) {
											var24 = Client.field623.method1186(var9.field3063[var20][var23]);
										}

										if (Login.method441(var9.field3063[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3139 != null && var9.field3139[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3062[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field623.method1186(86) && !Client.field623.method1186(82) && !Client.field623.method1186(81)) && ((var33 & 2) == 0 || Client.field623.method1186(86)) && ((var33 & 1) == 0 || Client.field623.method1186(82)) && ((var33 & 4) == 0 || Client.field623.method1186(81))) {
												var22 = true;
												break;
											}
										}
									}
								}

								if (var22) {
									if (var20 < 10) {
										class185.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										GameObject.method1652();
										VarbitComposition.method994(var9.id, var9.childIndex, TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = UserComparator9.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class370.colorStartTag(16777215);
									}

									var23 = var9.field3131[var20];
									if (var9.field3139 == null) {
										var9.field3139 = new int[var9.field3063.length];
									}

									if (var9.field3132 == null) {
										var9.field3132 = new int[var9.field3063.length];
									}

									if (var23 != 0) {
										if (var9.field3139[var20] == 0) {
											var9.field3139[var20] = var23 + Client.cycle + var9.field3132[var20];
										} else {
											var9.field3139[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3139[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3139 != null) {
									var9.field3139[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class27.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method1904()) {
								if (var21) {
									Client.field658.addFirst(new class227(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field658.addFirst(new class227(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								Tiles.worldMap.method2460(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && Decimator.method300(class429.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field420 = true;
								Client.field532 = var26;
								Client.field537 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var28;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var28 = new ScriptEvent();
									var28.field898 = true;
									var28.widget = var9;
									var28.mouseY = Client.mouseWheelRotation;
									var28.args = var9.onScroll;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if (!var9.field3059 && var21) {
									var9.field3059 = true;
									if (var9.onClick != null) {
										var28 = new ScriptEvent();
										var28.field898 = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var28.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var28.args = var9.onClick;
										Client.scriptEvents.addFirst(var28);
									}
								}

								if (var9.field3059 && var36 && var9.onClickRepeat != null) {
									var28 = new ScriptEvent();
									var28.field898 = true;
									var28.widget = var9;
									var28.mouseX = MouseHandler.MouseHandler_x - var26;
									var28.mouseY = MouseHandler.MouseHandler_y - var11;
									var28.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var28);
								}

								if (var9.field3059 && !var36) {
									var9.field3059 = false;
									if (var9.onRelease != null) {
										var28 = new ScriptEvent();
										var28.field898 = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_x - var26;
										var28.mouseY = MouseHandler.MouseHandler_y - var11;
										var28.args = var9.onRelease;
										Client.scriptEvents3.addFirst(var28);
									}
								}

								if (var36 && var9.onHold != null) {
									var28 = new ScriptEvent();
									var28.field898 = true;
									var28.widget = var9;
									var28.mouseX = MouseHandler.MouseHandler_x - var26;
									var28.mouseY = MouseHandler.MouseHandler_y - var11;
									var28.args = var9.onHold;
									Client.scriptEvents.addFirst(var28);
								}

								if (!var9.field3058 && var35) {
									var9.field3058 = true;
									if (var9.onMouseOver != null) {
										var28 = new ScriptEvent();
										var28.field898 = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_x - var26;
										var28.mouseY = MouseHandler.MouseHandler_y - var11;
										var28.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var28);
									}
								}

								if (var9.field3058 && var35 && var9.onMouseRepeat != null) {
									var28 = new ScriptEvent();
									var28.field898 = true;
									var28.widget = var9;
									var28.mouseX = MouseHandler.MouseHandler_x - var26;
									var28.mouseY = MouseHandler.MouseHandler_y - var11;
									var28.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var28);
								}

								if (var9.field3058 && !var35) {
									var9.field3058 = false;
									if (var9.onMouseLeave != null) {
										var28 = new ScriptEvent();
										var28.field898 = true;
										var28.widget = var9;
										var28.mouseX = MouseHandler.MouseHandler_x - var26;
										var28.mouseY = MouseHandler.MouseHandler_y - var11;
										var28.args = var9.onMouseLeave;
										Client.scriptEvents3.addFirst(var28);
									}
								}

								if (var9.onTimer != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onTimer;
									Client.scriptEvents2.addFirst(var28);
								}

								ScriptEvent var25;
								int var37;
								int var38;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3130) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3130 <= 32) {
										label648:
										for (var37 = var9.field3130; var37 < Client.changedVarpCount; ++var37) {
											var23 = Client.changedVarps[var37 & 31];

											for (var38 = 0; var38 < var9.varTransmitTriggers.length; ++var38) {
												if (var23 == var9.varTransmitTriggers[var38]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label648;
												}
											}
										}
									} else {
										var28 = new ScriptEvent();
										var28.widget = var9;
										var28.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var28);
									}

									var9.field3130 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field542 > var9.field3125) {
									if (var9.invTransmitTriggers != null && Client.field542 - var9.field3125 <= 32) {
										label624:
										for (var37 = var9.field3125; var37 < Client.field542; ++var37) {
											var23 = Client.changedItemContainers[var37 & 31];

											for (var38 = 0; var38 < var9.invTransmitTriggers.length; ++var38) {
												if (var23 == var9.invTransmitTriggers[var38]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label624;
												}
											}
										}
									} else {
										var28 = new ScriptEvent();
										var28.widget = var9;
										var28.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var28);
									}

									var9.field3125 = Client.field542;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3120) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3120 <= 32) {
										label600:
										for (var37 = var9.field3120; var37 < Client.changedSkillsCount; ++var37) {
											var23 = Client.changedSkills[var37 & 31];

											for (var38 = 0; var38 < var9.statTransmitTriggers.length; ++var38) {
												if (var23 == var9.statTransmitTriggers[var38]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label600;
												}
											}
										}
									} else {
										var28 = new ScriptEvent();
										var28.widget = var9;
										var28.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var28);
									}

									var9.field3120 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3126 && var9.onChatTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field541 > var9.field3126 && var9.onFriendTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field543 > var9.field3126 && var9.onClanTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field545 > var9.field3126 && var9.field3166 != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.field3166;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field544 > var9.field3126 && var9.field3170 != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.field3170;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field539 > var9.field3126 && var9.onStockTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field548 > var9.field3126 && var9.field3175 != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.field3175;
									Client.scriptEvents.addFirst(var28);
								}

								if (Client.field547 > var9.field3126 && var9.onMiscTransmit != null) {
									var28 = new ScriptEvent();
									var28.widget = var9;
									var28.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var28);
								}

								var9.field3126 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var37 = 0; var37 < Client.field560; ++var37) {
										ScriptEvent var29 = new ScriptEvent();
										var29.widget = var9;
										var29.keyTyped = Client.field607[var37];
										var29.keyPressed = Client.field606[var37];
										var29.args = var9.onKey;
										Client.scriptEvents.addFirst(var29);
									}
								}

								ScriptEvent var30;
								int[] var39;
								if (var9.field3168 != null) {
									var39 = Client.field623.method1188();

									for (var23 = 0; var23 < var39.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var39[var23];
										var30.args = var9.field3168;
										Client.scriptEvents.addFirst(var30);
									}
								}

								if (var9.field3156 != null) {
									var39 = Client.field623.method1189();

									for (var23 = 0; var23 < var39.length; ++var23) {
										var30 = new ScriptEvent();
										var30.widget = var9;
										var30.keyTyped = var39[var23];
										var30.args = var9.field3156;
										Client.scriptEvents.addFirst(var30);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									class134.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class134.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								FontName.field4142 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								Login.method440(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var31 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var31 != null) {
								if (var31.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var32 = (ScriptEvent)Client.scriptEvents.last(); var32 != null; var32 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var32.field898) {
											var32.remove();
											var32.widget.field3058 = false;
										}
									}

									if (WorldMapLabelSize.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										class255.addCancelMenuEntry();
									}
								}

								ClanSettings.updateRootInterface(var31.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
