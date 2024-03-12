import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class class218 extends class224 {
	@ObfuscatedName("aq")
	String field1900;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lit;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class218(class221 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1900 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2105911105"
	)
	@Export("vmethod4366")
	public int vmethod4366() {
		return 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("vmethod4367")
	public String vmethod4367() {
		return this.field1900;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Laa;I)Lai;",
		garbageValue = "2106914703"
	)
	public static class3 method1122(class6 var0) {
		switch(var0.field8) {
		case 0:
			return new class0();
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1932952799"
	)
	static int method1123(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "1672829103"
	)
	static class141 method1124(int var0) {
		class141 var1 = (class141)class356.findEnumerated(class4.method6(), var0);
		if (var1 == null) {
			var1 = class141.field1346;
		}

		return var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "84"
	)
	static int method1127(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 4200) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == 4201) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = ArchiveDiskActionHandler.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4202) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = ArchiveDiskActionHandler.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4203) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == 4204) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var6;
				if (var0 == 4205) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var6 = ArchiveDiskActionHandler.ItemDefinition_get(var3);
					if (var6.noteTemplate == -1 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == 4206) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var6 = ArchiveDiskActionHandler.ItemDefinition_get(var3);
					if (var6.noteTemplate >= 0 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == 4207) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == 4208) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var6 = ArchiveDiskActionHandler.ItemDefinition_get(var3);
					if (var6.placeholderTemplate == -1 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == 4209) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var6 = ArchiveDiskActionHandler.ItemDefinition_get(var3);
					if (var6.placeholderTemplate >= 0 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == 4210) {
					String var7 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					class256.findItemDefinitions(var7, var4 == 1);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class207.foundItemIdCount;
					return 1;
				} else if (var0 != 4211) {
					if (var0 == 4212) {
						GameObject.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = ArchiveDiskActionHandler.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var6 = ArchiveDiskActionHandler.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.field1796;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class73.foundItemIds != null && GameObject.foundItemIndex < class207.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class73.foundItemIds[++GameObject.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
