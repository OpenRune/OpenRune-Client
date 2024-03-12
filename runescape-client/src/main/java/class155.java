import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class155 extends class145 {
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("aq")
	int field1397;
	@ObfuscatedName("aw")
	String field1398;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class155(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		this.field1397 = var1.readInt();
		this.field1398 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method832(this.field1397, this.field1398);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
		garbageValue = "1"
	)
	static void method808(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class31.field87.startsWith("win") && !var3) {
				AbstractSocket.method2331(var0, 0, "openjs");
				return;
			}

			if (class31.field87.startsWith("mac")) {
				AbstractSocket.method2331(var0, 1, var2);
				return;
			}

			AbstractSocket.method2331(var0, 2, "openjs");
		} else {
			AbstractSocket.method2331(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1815025797"
	)
	static int method811(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
		if (var0 == 1500) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == 1501) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == 1502) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == 1503) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == 1504) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == 1505) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
