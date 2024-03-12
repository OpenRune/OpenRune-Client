import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public enum class357 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3202(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3204(1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3201(2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3199(3),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3203(4);

	@ObfuscatedName("gn")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("as")
	final int field3205;

	class357(int var3) {
		this.field3205 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3205;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1942157821"
	)
	static int method1945(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var4 = ArchiveLoader.widgetDefinition.method1785(var3);
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
		}

		if (var0 == 1000) {
			Interpreter.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			UserComparator5.invalidateWidget(var4);
			class193.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class167.revalidateWidgetScroll(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == 1001) {
			Interpreter.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			UserComparator5.invalidateWidget(var4);
			class193.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class167.revalidateWidgetScroll(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == 1003) {
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				UserComparator5.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == 1005) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == 1006) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
