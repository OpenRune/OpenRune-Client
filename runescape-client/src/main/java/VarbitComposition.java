import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("as")
	static final int[] field1656;
	@ObfuscatedName("ft")
	static boolean field1654;
	@ObfuscatedName("uh")
	static int field1655;
	@ObfuscatedName("al")
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ai")
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ar")
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1656 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1656[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "40"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "-66"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Lim;",
		garbageValue = "-1279"
	)
	public static class219 method990() {
		return class219.field1901;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhn;",
		garbageValue = "-1830328476"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-326552264"
	)
	public static boolean method992() {
		return !class321.field2858.isEmpty();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "-30"
	)
	static int method993(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
		if (var0 == 1600) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == 1601) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class347 var7;
			if (var0 == 1602) {
				if (var3.type == 12) {
					var7 = var3.method1923();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7.method1857().method2121();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == 1603) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == 1604) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == 1605) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == 1606) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == 1607) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == 1608) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == 1609) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == 1611) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == 1612) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == 1614) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class341 var4;
				if (var0 == 1617) {
					var4 = var3.method1924();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2984 * -366581865 * 261261351 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method1924();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2985 * 274020819 * -1093630373 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method1923();
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7 != null ? var7.method1858().method2121() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method1924();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2983 * 2037693281 * -374396767 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method1923();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1868() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method1923();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1869() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method1923();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1870() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method1923();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method1860() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method1923();
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7 != null ? var7.method1859().method2193() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method1923();
						int var5 = var7 != null ? var7.method1864() : 0;
						int var6 = var7 != null ? var7.method1863() : 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1863() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1872() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1871() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1873() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1874() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method1925();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method94(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method1925();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method95((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method1923();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method1861() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	static void method994(int var0, int var1, int var2, int var3) {
		Widget var4 = ArchiveLoader.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class177.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class160.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class128.selectedSpellFlags = var2;
		UserComparator5.invalidateWidget(var4);
	}
}
