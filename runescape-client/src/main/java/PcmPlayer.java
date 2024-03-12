import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ar")
	public static int field183;
	@ObfuscatedName("as")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("az")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("af")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("an")
	int field194;
	@ObfuscatedName("ag")
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("am")
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ad")
	int field191;
	@ObfuscatedName("at")
	int field195;
	@ObfuscatedName("ay")
	long field199;
	@ObfuscatedName("ae")
	int field192;
	@ObfuscatedName("ac")
	int field190;
	@ObfuscatedName("ab")
	int field189;
	@ObfuscatedName("av")
	long field198;
	@ObfuscatedName("ap")
	boolean field188;
	@ObfuscatedName("ba")
	int field196;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	PcmStream[] field187;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	PcmStream[] field186;

	protected PcmPlayer() {
		this.field194 = 32;
		this.timeMs = SecureRandomCallable.method465();
		this.field199 = 0L;
		this.field192 = 0;
		this.field190 = 0;
		this.field189 = 0;
		this.field198 = 0L;
		this.field188 = true;
		this.field196 = 0;
		this.field187 = new PcmStream[8];
		this.field186 = new PcmStream[8];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "41"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "810849571"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ai")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-114"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1411350214"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbj;I)V",
		garbageValue = "-1154054246"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1197971386"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = SecureRandomCallable.method465();

			try {
				if (0L != this.field199) {
					if (var1 < this.field199) {
						return;
					}

					this.open(this.capacity);
					this.field199 = 0L;
					this.field188 = true;
				}

				int var3 = this.position();
				if (this.field189 - var3 > this.field192) {
					this.field192 = this.field189 - var3;
				}

				int var4 = this.field191 + this.field195;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field188 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field195 = var4 - this.field191;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field198) {
					if (!this.field188) {
						if (this.field192 == 0 && this.field190 == 0) {
							this.close();
							this.field199 = 2000L + var1;
							return;
						}

						this.field195 = Math.min(this.field190, this.field192);
						this.field190 = this.field192;
					} else {
						this.field188 = false;
					}

					this.field192 = 0;
					this.field198 = 2000L + var1;
				}

				this.field189 = var3;
			} catch (Exception var7) {
				this.close();
				this.field199 = var1 + 2000L;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field183);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	public final void method190() {
		this.field188 = true;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field188 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field199 = SecureRandomCallable.method465() + 2000L;
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-21100"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class27.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class27.soundSystem.players[var2]) {
					class27.soundSystem.players[var2] = null;
				}

				if (class27.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				class27.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1435517864"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field196 -= var1;
		if (this.field196 < 0) {
			this.field196 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bq")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class428.clearIntArray(var1, 0, var3);
		this.field196 -= var2;
		if (this.stream != null && this.field196 <= 0) {
			this.field196 += field183 >> 4;
			class60.PcmStream_disable(this.stream);
			this.method195(this.stream, this.stream.vmethod1014());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label105:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field187[var7];

						label99:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label99;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod6346();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field194) {
										break label105;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field243; var14 != null; var14 = var11.nextSubStream()) {
											this.method195(var14, var15 * var14.vmethod1014() >> 8);
										}
									}

									PcmStream var16 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field187[var7] = var16;
									} else {
										var10.after = var16;
									}

									if (var16 == null) {
										this.field186[var7] = var10;
									}

									var11 = var16;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var17 = this.field187[var6];
				PcmStream[] var18 = this.field187;
				this.field186[var6] = null;

				for (var18[var6] = null; var17 != null; var17 = var10) {
					var10 = var17.after;
					var17.after = null;
				}
			}
		}

		if (this.field196 < 0) {
			this.field196 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = SecureRandomCallable.method465();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lbj;IB)V",
		garbageValue = "1"
	)
	final void method195(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field186[var3];
		if (var4 == null) {
			this.field187[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field186[var3] = var1;
		var1.field243 = var2;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1753341754"
	)
	static int method202(int var0, Script var1, boolean var2) {
		int var3;
		int var5;
		int var7;
		Object var21;
		DbTable var22;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var4;
				int var6;
				if (var0 == 7502) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					var6 = class133.method734(var4);
					var7 = class227.method1176(var4);
					int var8 = class167.method874(var4);
					DbRowType var23 = FadeOutTask.getDbRowType(var3);
					DbTableType var24 = WorldMapScaleHandler.getDbTableType(var6);
					int[] var25 = var24.types[var7];
					int var12 = 0;
					int var13 = var25.length;
					if (var8 >= 0) {
						if (var8 >= var13) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
						}

						var12 = var8;
						var13 = var8 + 1;
					}

					Object[] var14 = var23.getColumnType(var7);
					if (var14 == null && var24.defaultValues != null) {
						var14 = var24.defaultValues[var7];
					}

					int var15;
					int var16;
					if (var14 == null) {
						for (var15 = var12; var15 < var13; ++var15) {
							var16 = var25[var15];
							class521 var19 = class297.method1653(var16);
							if (var19 == class521.field4198) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class383.method2034(var16);
							}
						}

						return 1;
					} else {
						var15 = var14.length / var25.length;
						if (var5 >= 0 && var5 < var15) {
							for (var16 = var12; var16 < var13; ++var16) {
								int var17 = var16 + var25.length * var5;
								class521 var18 = class297.method1653(var25[var16]);
								if (var18 == class521.field4198) {
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = 0;
					var6 = class133.method734(var4);
					var7 = class227.method1176(var4);
					DbRowType var26 = FadeOutTask.getDbRowType(var3);
					DbTableType var9 = WorldMapScaleHandler.getDbTableType(var6);
					int[] var10 = var9.types[var7];
					Object[] var11 = var26.getColumnType(var7);
					if (var11 == null && var9.defaultValues != null) {
						var11 = var9.defaultValues[var7];
					}

					if (var11 != null) {
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
					return 1;
				} else if (var0 != 7504 && var0 != 7510) {
					if (var0 == 7505) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						DbRowType var28 = FadeOutTask.getDbRowType(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var28.tableId;
						return 1;
					} else if (var0 == 7506) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = -1;
						if (class173.field1476 != null && var3 >= 0 && var3 < class173.field1476.size()) {
							var4 = (Integer)class173.field1476.get(var3);
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
						return 1;
					} else if (var0 != 7507 && var0 != 7509) {
						return 2;
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var21 = class319.method1694(var3);
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var22 = ModelData0.getDbTable(var5);
						if (var22 == null) {
							throw new RuntimeException();
						} else if (class133.method734(var5) != Client.field573) {
							throw new RuntimeException();
						} else if (class173.field1476 == null && class173.field1476.isEmpty()) {
							throw new RuntimeException();
						} else {
							var7 = class167.method874(var5);
							List var20 = var22.method2580(var21, var7);
							class173.field1476 = new LinkedList(class173.field1476);
							if (var20 != null) {
								class173.field1476.retainAll(var20);
							} else {
								class173.field1476.clear();
							}

							Timer.field3845 = class173.field1476.iterator();
							if (var0 == 7507) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class173.field1476.size();
							}

							return 1;
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					DbTable var27 = DelayFadeTask.method2207(var3);
					if (var27 == null) {
						throw new RuntimeException();
					} else {
						class173.field1476 = var27.method2580(0, 0);
						var5 = 0;
						if (class173.field1476 != null) {
							Client.field573 = var3;
							Timer.field3845 = class173.field1476.iterator();
							var5 = class173.field1476.size();
						}

						if (var0 == 7504) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1;
					}
				}
			} else {
				if (Timer.field3845 != null && Timer.field3845.hasNext()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)Timer.field3845.next();
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				}

				return 1;
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var21 = class319.method1694(var3);
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var22 = ModelData0.getDbTable(var5);
			if (var22 == null) {
				throw new RuntimeException();
			} else {
				var7 = class167.method874(var5);
				class173.field1476 = var22.method2580(var21, var7);
				if (class173.field1476 != null) {
					Client.field573 = class133.method734(var5);
					Timer.field3845 = class173.field1476.iterator();
					if (var0 == 7500) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class173.field1476.size();
					}
				} else {
					Client.field573 = -1;
					Timer.field3845 = null;
					if (var0 == 7500) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Z",
		garbageValue = "-1595987533"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
