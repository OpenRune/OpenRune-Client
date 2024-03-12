import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class27 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("aa")
	int[] field80;
	@ObfuscatedName("az")
	int[] field81;

	public class27() {
		this.field80 = new int[112];
		this.field81 = new int[192];
		Arrays.fill(this.field80, 3);
		Arrays.fill(this.field81, 3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-77"
	)
	public void method92(int var1, int var2) {
		if (this.method100(var1) && this.method102(var2)) {
			this.field80[var1] = var2;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "1201352236"
	)
	public void method93(char var1, int var2) {
		if (this.method101(var1) && this.method102(var2)) {
			this.field81[var1] = var2;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1745274365"
	)
	public int method94(int var1) {
		return this.method100(var1) ? this.field80[var1] : 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "155074636"
	)
	public int method95(char var1) {
		return this.method101(var1) ? this.field81[var1] : 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1589962869"
	)
	public boolean method96(int var1) {
		return this.method100(var1) && (this.field80[var1] == 1 || this.field80[var1] == 3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-674999067"
	)
	public boolean method97(char var1) {
		return this.method101(var1) && (this.field81[var1] == 1 || this.field81[var1] == 3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-729885849"
	)
	public boolean method98(int var1) {
		return this.method100(var1) && (this.field80[var1] == 2 || this.field80[var1] == 3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1669763559"
	)
	public boolean method99(char var1) {
		return this.method101(var1) && (this.field81[var1] == 2 || this.field81[var1] == 3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2047713770"
	)
	boolean method100(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2055456568"
	)
	boolean method101(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-51"
	)
	boolean method102(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIB)V",
		garbageValue = "-59"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var5 = var0;
				int var7 = class429.getWidgetFlags(var0);
				int var6 = var7 >> 17 & 7;
				int var8 = var6;
				Widget var4;
				int var9;
				if (var6 == 0) {
					var4 = null;
				} else {
					var9 = 0;

					while (true) {
						if (var9 >= var8) {
							var4 = var5;
							break;
						}

						var5 = ArchiveLoader.widgetDefinition.method1785(var5.parentId);
						if (var5 == null) {
							var4 = null;
							break;
						}

						++var9;
					}
				}

				Widget var10 = var4;
				if (var4 == null) {
					var10 = var0.parent;
				}

				if (var10 != null) {
					Client.clickedWidget = var0;
					var5 = var0;
					var7 = class429.getWidgetFlags(var0);
					var6 = var7 >> 17 & 7;
					var8 = var6;
					if (var6 == 0) {
						var4 = null;
					} else {
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								var4 = var5;
								break;
							}

							var5 = ArchiveLoader.widgetDefinition.method1785(var5.parentId);
							if (var5 == null) {
								var4 = null;
								break;
							}

							++var9;
						}
					}

					var10 = var4;
					if (var4 == null) {
						var10 = var0.parent;
					}

					Client.clickedWidgetParent = var10;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					WorldMapLabelSize.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var11 = FontName.method2524();
					if (var11 != -1) {
						class363.tempMenuAction = new MenuAction();
						class363.tempMenuAction.param0 = Client.menuArguments1[var11];
						class363.tempMenuAction.param1 = Client.menuArguments2[var11];
						class363.tempMenuAction.opcode = Client.menuOpcodes[var11];
						class363.tempMenuAction.identifier = Client.menuIdentifiers[var11];
						class363.tempMenuAction.itemId = Client.menuItemIds[var11];
						class363.tempMenuAction.action = Client.menuActions[var11];
						class363.tempMenuAction.target = Client.menuTargets[var11];
					}

					return;
				}
			}

		}
	}
}
