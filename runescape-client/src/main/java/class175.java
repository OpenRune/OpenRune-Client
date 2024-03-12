import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class175 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field1851")
	public static EvictingDualNodeHashTable field1851;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I[IIS)V",
		garbageValue = "-13799"
	)
	static void method898(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < KitDefinition.KitDefinition_fileCount; ++var3) {
			KitDefinition var4 = GrandExchangeOfferWorldComparator.KitDefinition_get(var3);
			if (var4 != null && !var4.nonSelectable && var4.bodypartID == (var0 == 1 ? 7 : 0) + var2) {
				var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256;
				break;
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "36"
	)
	public static boolean method897(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "1"
	)
	static int method899(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = ArchiveLoader.widgetDefinition.method1785(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
		}

		int var11;
		if (var0 == 1300) {
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class60.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == 1301) {
				Interpreter.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var4.parent = ArchiveLoader.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == 1302) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1303) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == 1304) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == 1305) {
				var4.dataText = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == 1306) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == 1307) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--Interpreter.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var9;
				if (var0 != 1350) {
					byte var5;
					if (var0 == 1351) {
						Interpreter.Interpreter_intStackSize -= 2;
						var5 = 10;
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
						byte[] var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
						ModeWhere.Widget_setKey(var4, var5, var9, var10);
						return 1;
					} else if (var0 == 1352) {
						Interpreter.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							MouseHandler.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						MouseHandler.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == 1354) {
						--Interpreter.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							AuthenticationScheme.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var5 = 10;
						AuthenticationScheme.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var8 = null;
					var9 = null;
					if (var3) {
						Interpreter.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var8 = new byte[var7 / 2];
							var9 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize];
								var9[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1];
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]};
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						ModeWhere.Widget_setKey(var4, var7, var8, var9);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
