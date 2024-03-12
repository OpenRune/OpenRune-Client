import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("un")
	static int field2346;
	@ObfuscatedName("aq")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("aw")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("al")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ai")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ar")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("as")
	@Export("zMidOffset")
	int zMidOffset;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.xMid = var1;
		this.yMid = var2;
		this.zMid = var3;
		this.xMidOffset = var4;
		this.yMidOffset = var5;
		this.zMidOffset = var6;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1158457597"
	)
	static char method1557(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1387447217"
	)
	static int method1558(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ObjectComposition var4 = class127.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}
}
