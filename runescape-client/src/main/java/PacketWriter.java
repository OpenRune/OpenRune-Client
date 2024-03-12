import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("al")
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("az")
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ao")
	boolean field1183;
	@ObfuscatedName("au")
	int field1186;
	@ObfuscatedName("ak")
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	ServerPacket field1423;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	ServerPacket field1191;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	ServerPacket field1189;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1183 = true;
		this.field1186 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2027798148"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmn;I)V",
		garbageValue = "2058430044"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrr;I)V",
		garbageValue = "1072013587"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2144845367"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lrr;",
		garbageValue = "-815838134"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-1568893992"
	)
	public static void method646(AbstractArchive var0) {
		class528.VarcInt_archive = var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-283981484"
	)
	public static void method648(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class321.field2849.clear();
			class321.field2848.clear();
			PendingSpawn.method525(var5);
			MusicPatchNode2.method1695(var0, var5);
			if (!class321.field2849.isEmpty()) {
				ScriptFrame.method327(var1, var2, var3, var4);
				class321.field2848.add(new AddRequestTask((SongTask)null));
				class321.field2848.add(new class427((SongTask)null, class321.field2851, class321.field2852, class321.field2850));
				ArrayList var6 = new ArrayList();
				var6.add(new class422(new FadeInTask((SongTask)null, 0, true, class321.field2855)));
				if (!class321.musicSongs.isEmpty()) {
					ArrayList var7 = new ArrayList();
					var7.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var6), class321.field2854));
					ArrayList var8 = WorldMapLabelSize.method1243();
					var7.add(new DelayFadeTask(new FadeOutTask(new class420((SongTask)null, var8), 0, false, class321.field2856), class321.musicPlayerStatus));
					class321.field2848.add(new ConcurrentMidiTask((SongTask)null, var7));
				} else {
					class321.field2848.add(new DelayFadeTask((SongTask)null, class321.field2854));
					class321.field2848.add(new ConcurrentMidiTask((SongTask)null, var6));
				}

			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lda;Ldc;IIB)V",
		garbageValue = "122"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		Interpreter.Interpreter_intStackSize = 0;
		class60.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field734 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label860: {
			label861: {
				try {
					int var13;
					try {
						var29 = true;
						class520.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						Interpreter.Interpreter_stringLocals = new String[var1.localStringCount];
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) {
							if (var4[var13] instanceof Integer) {
								var14 = (Integer)var4[var13];
								if (var14 == -2147483647) {
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) {
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) {
									var14 = var0.widget != null ? var0.widget.id * -917460645 * 403660499 : -1;
								}

								if (var14 == -2147483644) {
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) {
									var14 = var0.widget != null ? var0.widget.childIndex * -1764737119 * 756900961 : -1;
								}

								if (var14 == -2147483642) {
									var14 = var0.dragTarget != null ? var0.dragTarget.id * -917460645 * 403660499 : -1;
								}

								if (var14 == -2147483641) {
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -1764737119 * 756900961 : -1;
								}

								if (var14 == -2147483640) {
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) {
									var14 = var0.keyPressed;
								}

								class520.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field739 = var0.field901;

						label841:
						while (true) {
							++var10;
							if (var10 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var32 = var6[var5];
							if (var32 >= 100) {
								boolean var34;
								if (var1.intOperands[var5] == 1) {
									var34 = true;
								} else {
									var34 = false;
								}

								var14 = Canvas.method74(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label841;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								FriendSystem.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 21) {
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label861;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
								var1 = var39.script;
								var6 = var1.opcodes;
								var7 = var1.intOperands;
								var5 = var39.pc;
								class520.Interpreter_intLocals = var39.intLocals;
								Interpreter.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class332.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								class130.method717(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class520.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								class520.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class60.Interpreter_stringStackSize -= var13;
								var20 = PacketBufferNode.method1676(Interpreter.Interpreter_stringStack, class60.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--Interpreter.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class60.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										ScriptFrame.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										if (var23 < 0 || var23 > 5000) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23;
										byte var24 = -1;
										if (var14 == 105) {
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) {
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) {
										var13 = var7[var5];
										var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										Interpreter.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = ScriptFrame.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											ScriptFrame.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = ScriptFrame.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											ScriptFrame.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = class53.field255.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = class73.field763.method2396(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = GrandExchangeOfferOwnWorldComparator.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class60.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									Interpreter.Interpreter_intStackSize -= var35.intArgumentCount;
									class60.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = class520.Interpreter_intLocals;
									var22.stringLocals = Interpreter.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									class520.Interpreter_intLocals = var15;
									Interpreter.Interpreter_stringLocals = var16;
								}
							}
						}
					} catch (Exception var30) {
						var9 = true;
						StringBuilder var26 = new StringBuilder(30);
						var26.append("").append(var1.key).append(" ");

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8);
						class315.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label860;
					}
				} finally {
					if (var29) {
						while (Interpreter.field745.size() > 0) {
							class103 var19 = (class103)Interpreter.field745.remove(0);
							class185.widgetDefaultMenuAction(var19.method612(), var19.method613(), var19.method614(), var19.method615(), "");
						}

						if (Interpreter.field734) {
							Interpreter.field734 = false;
							class272.method1486();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class315.RunException_sendStackTrace("Warning: Script " + var1.field856 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field745.size() > 0) {
					class103 var33 = (class103)Interpreter.field745.remove(0);
					class185.widgetDefaultMenuAction(var33.method612(), var33.method613(), var33.method614(), var33.method615(), "");
				}

				if (Interpreter.field734) {
					Interpreter.field734 = false;
					class272.method1486();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class315.RunException_sendStackTrace("Warning: Script " + var1.field856 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field745.size() > 0) {
				class103 var40 = (class103)Interpreter.field745.remove(0);
				class185.widgetDefaultMenuAction(var40.method612(), var40.method613(), var40.method614(), var40.method615(), "");
			}

			if (Interpreter.field734) {
				Interpreter.field734 = false;
				class272.method1486();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class315.RunException_sendStackTrace("Warning: Script " + var1.field856 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field745.size() > 0) {
			class103 var25 = (class103)Interpreter.field745.remove(0);
			class185.widgetDefaultMenuAction(var25.method612(), var25.method613(), var25.method614(), var25.method615(), "");
		}

		if (Interpreter.field734) {
			Interpreter.field734 = false;
			class272.method1486();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class315.RunException_sendStackTrace("Warning: Script " + var1.field856 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}
}
