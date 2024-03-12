import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class228 implements class29 {
	@ObfuscatedName("aq")
	char[] field1950;
	@ObfuscatedName("aw")
	int[] field1956;
	@ObfuscatedName("al")
	public int[] field1960;
	@ObfuscatedName("ai")
	public int field1959;
	@ObfuscatedName("ar")
	int[] field1955;
	@ObfuscatedName("as")
	int field1953;
	@ObfuscatedName("aa")
	int field1951;
	@ObfuscatedName("az")
	int field1954;
	@ObfuscatedName("ao")
	int field1952;
	@ObfuscatedName("au")
	boolean[] field1949;
	@ObfuscatedName("ak")
	boolean[] field1948;
	@ObfuscatedName("ah")
	boolean[] field1947;
	@ObfuscatedName("aj")
	public char field1957;
	@ObfuscatedName("af")
	public int field1958;

	public class228() {
		this.field1950 = new char[128];
		this.field1956 = new int[128];
		this.field1960 = new int[128];
		this.field1959 = 0;
		this.field1955 = new int[128];
		this.field1953 = 0;
		this.field1951 = 0;
		this.field1954 = 0;
		this.field1952 = 0;
		this.field1949 = new boolean[112];
		this.field1948 = new boolean[112];
		this.field1947 = new boolean[112];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2108130536"
	)
	@Export("vmethod4425")
	public boolean vmethod4425(int var1) {
		this.method1180(var1);
		this.field1949[var1] = true;
		this.field1948[var1] = true;
		this.field1947[var1] = false;
		this.field1960[++this.field1959 - 1] = var1;
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2132067941"
	)
	@Export("vmethod4442")
	public boolean vmethod4442(int var1) {
		this.field1949[var1] = false;
		this.field1948[var1] = false;
		this.field1947[var1] = true;
		this.field1955[++this.field1953 - 1] = var1;
		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-71"
	)
	@Export("vmethod4427")
	public boolean vmethod4427(char var1) {
		int var2 = this.field1954 + 1 & 127;
		if (var2 != this.field1951) {
			this.field1956[this.field1954] = -1;
			this.field1950[this.field1954] = var1;
			this.field1954 = var2;
		}

		return false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "289932078"
	)
	@Export("vmethod4467")
	public boolean vmethod4467(boolean var1) {
		return false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1730569940"
	)
	void method1180(int var1) {
		int var2 = this.field1954 + 1 & 127;
		if (var2 != this.field1951) {
			this.field1956[this.field1954] = var1;
			this.field1950[this.field1954] = 0;
			this.field1954 = var2;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-675299948"
	)
	public void method1183() {
		this.field1951 = this.field1952;
		this.field1952 = this.field1954;
		this.field1959 = 0;
		this.field1953 = 0;
		Arrays.fill(this.field1948, false);
		Arrays.fill(this.field1947, false);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-994185275"
	)
	public final boolean method1184() {
		if (this.field1951 == this.field1952) {
			return false;
		} else {
			this.field1958 = this.field1956[this.field1951];
			this.field1957 = this.field1950[this.field1951];
			this.field1951 = this.field1951 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1518666013"
	)
	public boolean method1185(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field1948[var1] : false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "93"
	)
	public boolean method1186(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field1949[var1] : false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-223195809"
	)
	public boolean method1187(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field1947[var1] : false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-36"
	)
	public int[] method1188() {
		int[] var1 = new int[this.field1959];

		for (int var2 = 0; var2 < this.field1959; ++var2) {
			var1[var2] = this.field1960[var2];
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1306645428"
	)
	public int[] method1189() {
		int[] var1 = new int[this.field1953];

		for (int var2 = 0; var2 < this.field1953; ++var2) {
			var1[var2] = this.field1955[var2];
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "36"
	)
	static int method1190(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 100) {
			Interpreter.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = ArchiveLoader.widgetDefinition.method1785(var3);
				if (var6.children == null) {
					var6.children = new Widget[var5 + 1];
				}

				if (var6.children.length <= var5) {
					Widget[] var7 = new Widget[var5 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var5 > 0 && var6.children[var5 - 1] == null) {
					throw new RuntimeException("" + (var5 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var5;
					var12.isIf3 = true;
					if (var4 == 12) {
						var12.method1922();
						var12.method1923().method1856(new class106(var12));
						var12.method1923().method1855(new class107(var12));
					}

					var6.children[var5] = var12;
					if (var2) {
						Interpreter.scriptDotWidget = var12;
					} else {
						class141.scriptActiveWidget = var12;
					}

					UserComparator5.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var9;
			if (var0 == 101) {
				var9 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
				Widget var11 = ArchiveLoader.widgetDefinition.method1785(var9.id);
				var11.children[var9.childIndex] = null;
				UserComparator5.invalidateWidget(var11);
				return 1;
			} else if (var0 == 102) {
				var9 = ArchiveLoader.widgetDefinition.method1785(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				var9.children = null;
				UserComparator5.invalidateWidget(var9);
				return 1;
			} else if (var0 != 200) {
				if (var0 == 201) {
					var9 = ArchiveLoader.widgetDefinition.method1785(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					if (var9 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							Interpreter.scriptDotWidget = var9;
						} else {
							class141.scriptActiveWidget = var9;
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Widget var10 = ArchiveLoader.widgetDefinition.getWidgetChild(var3, var4);
				if (var10 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						Interpreter.scriptDotWidget = var10;
					} else {
						class141.scriptActiveWidget = var10;
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lig;III)Lbf;",
		garbageValue = "-1928191246"
	)
	public static final PcmPlayer method1181(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class33.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field191 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (class362.field3232 > 0 && class27.soundSystem == null) {
					class27.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class27.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class27.soundSystem != null) {
					if (class27.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					class27.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "341313905"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ArchiveLoader.widgetDefinition.loadInterface(var0)) {
			ModelData0.field2514 = null;
			class129.drawInterface(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (ModelData0.field2514 != null) {
				class129.drawInterface(ModelData0.field2514, -1412584499, var1, var2, var3, var4, class103.field1125, BoundaryObject.field2515, var7);
				ModelData0.field2514 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
