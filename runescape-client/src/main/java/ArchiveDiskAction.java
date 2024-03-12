import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("um")
	static int field3599;
	@ObfuscatedName("aq")
	@Export("type")
	int type;
	@ObfuscatedName("aw")
	@Export("data")
	byte[] data;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Luy;",
		garbageValue = "-1626069325"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field4329, FillMode.field4330};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "0"
	)
	static int method1970(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveLoader.widgetDefinition.method1785(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == 2600) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == 2601) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == 2602) {
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == 2603) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == 2604) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == 2605) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == 2606) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == 2607) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == 2608) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == 2609) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == 2611) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == 2612) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == 2614) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class341 var4;
			if (var0 == 2617) {
				var4 = var3.method1924();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2984 * -366581865 * 261261351 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method1924();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2985 * 274020819 * -1093630373 : 0;
				return 1;
			} else {
				class347 var7;
				if (var0 == 2619) {
					var7 = var3.method1923();
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7 != null ? var7.method1858().method2121() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method1924();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field2983 * 2037693281 * -374396767 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method1923();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1868() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method1923();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1869() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method1923();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1870() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method1923();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method1860() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method1923();
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7 != null ? var7.method1859().method2193() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method1923();
						int var5 = var7 != null ? var7.method1864() : 0;
						int var6 = var7 != null ? var7.method1863() : 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1863() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1872() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1871() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1873() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method1923();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method1874() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method1925();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method94(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
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
}
