import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class103 {
	@ObfuscatedName("pj")
	static int field1125;
	@ObfuscatedName("aq")
	int field1128;
	@ObfuscatedName("aw")
	int field1129;
	@ObfuscatedName("al")
	int field1127;
	@ObfuscatedName("ai")
	int field1126;

	class103(int var1, int var2, int var3, int var4) {
		this.field1128 = var1;
		this.field1129 = var2;
		this.field1127 = var3;
		this.field1126 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1608707945"
	)
	int method612() {
		return this.field1128;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-28872"
	)
	int method613() {
		return this.field1129;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method614() {
		return this.field1127;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	int method615() {
		return this.field1126;
	}

	@ObfuscatedName("aq")
	public static final int method611(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var4 + var2 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = var14 + (var12 - var14) * 6.0D * var16;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var16);
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = var14 + 6.0D * (var12 - var14) * var0;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = 6.0D * (var12 - var14) * (0.6666666666666666D - var20) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0D);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "25817"
	)
	public static void method616() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1244805083"
	)
	static int method617(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var3 = ArchiveLoader.widgetDefinition.method1785(var4);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
		}

		int var15;
		if (var0 == 1100) {
			Interpreter.Interpreter_intStackSize -= 2;
			var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class347 var16 = var3.method1923();
				if (var16 != null && var16.method1818(var15, var6)) {
					UserComparator5.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var15;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var6;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				UserComparator5.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == 1101) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1102) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1103) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1104) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1105) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1106) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1107) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1108) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1109) {
			Interpreter.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5];
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else if (var0 == 1110) {
			var15 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var15 != var3.sequenceId) {
				var3.sequenceId = var15;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				UserComparator5.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == 1111) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			UserComparator5.invalidateWidget(var3);
			return 1;
		} else {
			String var13;
			class347 var14;
			if (var0 != 1112) {
				class347 var20;
				if (var0 == 1113) {
					var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var3.type == 12) {
						var20 = var3.method1923();
						if (var20 != null) {
							var20.method1825();
						}
					}

					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1114) {
					Interpreter.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var20 = var3.method1923();
						if (var20 != null) {
							var20.method1819(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
							var20.method1820(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					}

					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1115) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1116) {
					var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1117) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1118) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1119) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1120) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					UserComparator5.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						class167.revalidateWidgetScroll(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == 1121) {
					class192.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1123) {
					var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					UserComparator5.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var15 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					FillMode var18 = (FillMode)class356.findEnumerated(ArchiveDiskAction.FillMode_values(), var15);
					if (var18 != null) {
						var3.fillMode = var18;
						UserComparator5.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var5;
					if (var0 == 1126) {
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.field3050 = var5;
						return 1;
					} else if (var0 == 1127) {
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var5;
						return 1;
					} else if (var0 == 1129) {
						var3.field3176 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
						UserComparator5.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method1905(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize], "", InvDefinition.urlRequester, AttackOption.getUserId());
						return 1;
					} else if (var0 == 1131) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3.method1909(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method1910(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
						return 1;
					} else {
						class341 var21;
						if (var0 == 1133) {
							--Interpreter.Interpreter_intStackSize;
							var21 = var3.method1924();
							if (var21 != null) {
								var21.field2984 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--Interpreter.Interpreter_intStackSize;
							var21 = var3.method1924();
							if (var21 != null) {
								var21.field2985 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class60.Interpreter_stringStackSize;
							var20 = var3.method1923();
							if (var20 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--Interpreter.Interpreter_intStackSize;
							var21 = var3.method1924();
							if (var21 != null) {
								var21.field2983 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method1923();
							if (var20 != null && var20.method1815(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method1923();
							if (var20 != null && var20.method1816(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method1923();
							if (var20 != null && var20.method1817(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.field622.method1168();
							var14 = var3.method1923();
							if (var14 != null && var14.method1809(var5)) {
								if (var5) {
									Client.field622.method1166(var3);
								}

								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (!var5 && Client.field622.method1167() == var3) {
								Client.field622.method1168();
								UserComparator5.invalidateWidget(var3);
							}

							var14 = var3.method1923();
							if (var14 != null) {
								var14.method1810(var5);
							}

							return 1;
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2;
							var20 = var3.method1923();
							if (var20 != null && var20.method1833(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method1923();
							if (var20 != null && var20.method1833(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) {
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method1923();
							if (var20 != null) {
								var20.method1822(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method1923();
							if (var20 != null) {
								var20.method1821(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method1923();
							if (var20 != null) {
								var20.method1824(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize;
							var20 = var3.method1923();
							if (var20 != null) {
								var20.method1823(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
								UserComparator5.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var19;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2;
								var19 = var3.method1925();
								if (var19 != null) {
									var19.method92(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2;
								var19 = var3.method1925();
								if (var19 != null) {
									var19.method93((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method1907(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize], InvDefinition.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class60.Interpreter_stringStackSize -= 3;
								var13 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
								String var17 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 2];
								long var8 = AttackOption.getUserId();
								long var10 = class159.getUserHash();
								String var12 = SongTask.getPlatformInfo().getDeviceId(SongTask.getPlatformInfo().os);
								if (var8 != -1L) {
									var13 = var13.replaceAll("%userid%", Long.toString(var8));
								}

								if (var10 != -1L) {
									var13 = var13.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var13 = var13.replaceAll("%deviceid%", var12);
								}

								var3.method1906(var13, var17, var7, var12, Long.toString(var10), InvDefinition.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type == 11) {
									var5 = VarbitComposition.method990().method1136(var3.method1919().method1098());
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5 ? 1 : 0;
								} else {
									System.out.println("Attempting to call function on a non-CRMView object.");
								}

								return 1;
							} else {
								return 2;
							}
						}
					}
				}
			} else {
				var13 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var14 = var3.method1923();
					if (var14 != null && var14.method1865()) {
						var14.method1811(var13);
					} else {
						var3.text = var13;
					}

					UserComparator5.invalidateWidget(var3);
				} else if (!var13.equals(var3.text)) {
					var3.text = var13;
					UserComparator5.invalidateWidget(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2069548538"
	)
	static final void method618(int var0, int var1, boolean var2) {
		if (!var2 || var0 != JagNetThread.field3644 || class317.field2830 != var1) {
			JagNetThread.field3644 = var0;
			class317.field2830 = var1;
			Interpreter.updateGameState(25);
			RouteStrategy.drawLoadingMessage("Loading - please wait.", true);
			int var3 = Projectile.baseX;
			int var4 = GameEngine.baseY;
			Projectile.baseX = (var0 - 6) * 8;
			GameEngine.baseY = (var1 - 6) * 8;
			int var5 = Projectile.baseX - var3;
			int var6 = GameEngine.baseY - var4;
			var3 = Projectile.baseX;
			var4 = GameEngine.baseY;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) {
				NPC var8 = Client.npcs[var7];
				if (var8 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var8.pathX;
						var10000[var9] -= var5;
						var10000 = var8.pathY;
						var10000[var9] -= var6;
					}

					var8.x -= var5 * 128;
					var8.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var21 = Client.players[var7];
				if (var21 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var21.pathX;
						var10000[var9] -= var5;
						var10000 = var21.pathY;
						var10000[var9] -= var6;
					}

					var21.x -= var5 * 128;
					var21.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var18 = 104;
			byte var22 = 1;
			if (var5 < 0) {
				var20 = 103;
				var18 = -1;
				var22 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var18 != var13; var13 += var22) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var14 + var6;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var19 = (PendingSpawn)Client.pendingSpawns.last(); var19 != null; var19 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var19.x -= var5;
				var19.y -= var6;
				if (var19.x < 0 || var19.y < 0 || var19.x >= 104 || var19.y >= 104) {
					var19.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			ClanMate.cameraX -= var5 << 7;
			class317.cameraZ -= var6 << 7;
			Friend.oculusOrbFocalPointX -= var5 << 7;
			class59.oculusOrbFocalPointY -= var6 << 7;
			Client.field559 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}
}
