import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;S)I",
		garbageValue = "-17937"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "1460065169"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "23"
	)
	static int method672(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 != 1927 && var0 != 2927) {
			int var4;
			if (var0 == 1928) {
				var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class103 var5 = new class103(var4, var3.id, var3.childIndex, var3.itemId);
					Interpreter.field745.add(var5);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				Interpreter.Interpreter_intStackSize -= 3;
				int var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				int var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				if (var8 >= 1 && var8 <= 10) {
					class103 var6 = new class103(var8, var7, var4, ArchiveLoader.widgetDefinition.method1785(var7).itemId);
					Interpreter.field745.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field739 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var3 = ArchiveLoader.widgetDefinition.method1785(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			} else {
				var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
			}

			if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var3;
				var9.args = var3.onResize;
				var9.field901 = Interpreter.field739 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
