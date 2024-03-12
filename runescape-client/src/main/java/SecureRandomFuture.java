import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("aq")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("aw")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-29566"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "255"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-124866990"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1715856735"
	)
	public static int method450() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(ZLun;B)V",
		garbageValue = "-96"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field512 = 0;
		Client.field472 = 0;
		var1.importIndex();
		int var2 = var1.readBits(8);
		int var3;
		if (var2 < Client.npcCount) {
			for (var3 = var2; var3 < Client.npcCount; ++var3) {
				Client.field585[++Client.field512 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			int var4;
			int var6;
			int var7;
			int var8;
			int var9;
			for (var3 = 0; var3 < var2; ++var3) {
				var4 = Client.npcIndices[var3];
				NPC var5 = Client.npcs[var4];
				var6 = var1.readBits(1);
				if (var6 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var4;
					var5.npcCycle = Client.cycle;
				} else {
					var7 = var1.readBits(2);
					if (var7 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var4;
						var5.npcCycle = Client.cycle;
						Client.field575[++Client.field472 - 1] = var4;
					} else if (var7 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var4;
						var5.npcCycle = Client.cycle;
						var8 = var1.readBits(3);
						var5.method592(var8, class233.field1989);
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.field575[++Client.field472 - 1] = var4;
						}
					} else if (var7 == 2) {
						Client.npcIndices[++Client.npcCount - 1] = var4;
						var5.npcCycle = Client.cycle;
						if (var1.readBits(1) == 1) {
							var8 = var1.readBits(3);
							var5.method592(var8, class233.field1988);
							var9 = var1.readBits(3);
							var5.method592(var9, class233.field1988);
						} else {
							var8 = var1.readBits(3);
							var5.method592(var8, class233.field1991);
						}

						var8 = var1.readBits(1);
						if (var8 == 1) {
							Client.field575[++Client.field472 - 1] = var4;
						}
					} else if (var7 == 3) {
						Client.field585[++Client.field512 - 1] = var4;
					}
				}
			}

			int var10;
			int var12;
			while (true) {
				byte var22 = 16;
				var3 = 1 << var22;
				if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var22 + 12) {
					break;
				}

				var4 = var1.readBits(var22);
				if (var4 == var3 - 1) {
					break;
				}

				boolean var14 = false;
				if (Client.npcs[var4] == null) {
					Client.npcs[var4] = new NPC();
					var14 = true;
				}

				NPC var15 = Client.npcs[var4];
				Client.npcIndices[++Client.npcCount - 1] = var4;
				var15.npcCycle = Client.cycle;
				var10 = var1.readBits(1);
				if (var10 == 1) {
					Client.field575[++Client.field472 - 1] = var4;
				}

				boolean var11 = var1.readBits(1) == 1;
				if (var11) {
					var1.readBits(32);
				}

				if (var0) {
					var8 = var1.readBits(8);
					if (var8 > 127) {
						var8 -= 256;
					}
				} else {
					var8 = var1.readBits(5);
					if (var8 > 15) {
						var8 -= 32;
					}
				}

				var15.definition = VarcInt.getNpcDefinition(var1.readBits(14));
				var7 = var1.readBits(1);
				var12 = Client.defaultRotations[var1.readBits(3)];
				if (var14) {
					var15.orientation = var15.rotation = var12;
				}

				if (var0) {
					var9 = var1.readBits(8);
					if (var9 > 127) {
						var9 -= 256;
					}
				} else {
					var9 = var1.readBits(5);
					if (var9 > 15) {
						var9 -= 32;
					}
				}

				LoginPacket.method770(var15);
				if (var15.field1039 == 0) {
					var15.rotation = 0;
				}

				var15.method593(VarpDefinition.localPlayer.pathX[0] + var8, VarpDefinition.localPlayer.pathY[0] + var9, var7 == 1);
			}

			var1.exportIndex();

			for (var2 = 0; var2 < Client.field472; ++var2) {
				var3 = Client.field575[var2];
				NPC var16 = Client.npcs[var3];
				int var25 = var1.readUnsignedByte();
				if ((var25 & 8) != 0) {
					var6 = var1.readUnsignedByte();
					var25 += var6 << 8;
				}

				if ((var25 & 256) != 0) {
					var6 = var1.readUnsignedByte();
					var25 += var6 << 16;
				}

				if ((var25 & 32) != 0) {
					var16.overheadText = var1.readStringCp1252NullTerminated();
					var16.overheadTextCyclesRemaining = 100;
				}

				if ((var25 & 16384) != 0) {
					var16.field1048 = var1.readByteSub();
					var16.field1054 = var1.readByteNeg();
					var16.field1055 = var1.readByte();
					var16.field1053 = var1.readByte();
					var16.spotAnimation = var1.readUnsignedShortAddLE() + Client.cycle;
					var16.field1038 = var1.readUnsignedShortAddLE() + Client.cycle;
					var16.field1052 = var1.readUnsignedShortAdd();
					var16.pathLength = 1;
					var16.field1057 = 0;
					var16.field1048 += var16.pathX[0];
					var16.field1054 += var16.pathY[0];
					var16.field1055 += var16.pathX[0];
					var16.field1053 += var16.pathY[0];
				}

				if ((var25 & 131072) != 0) {
					var6 = var1.readUnsignedIntME();
					var16.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShortLE() : var16.definition.turnLeftSequence * -1362113179 * 1730976877;
					var16.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShortLE() : var16.definition.turnRightSequence * -369839719 * 1359614633;
					var16.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortAdd() : var16.definition.walkSequence * 752028021 * -1810055459;
					var16.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortAddLE() : var16.definition.walkBackSequence * 347826019 * -964079029;
					var16.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShort() : var16.definition.walkLeftSequence * -161297065 * 1604087399;
					var16.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShortAdd() : var16.definition.walkRightSequence * -336340197 * -213186797;
					var16.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShortLE() : var16.definition.field1597 * -604495979 * -739363907;
					var16.field1008 = (var6 & 128) != 0 ? var1.readUnsignedShortAdd() : var16.definition.field1590 * -1035998327 * -1414268231;
					var16.field1007 = (var6 & 256) != 0 ? var1.readUnsignedShortAddLE() : var16.definition.field1600 * 529883483 * -1836325165;
					var16.field1024 = (var6 & 512) != 0 ? var1.readUnsignedShort() : var16.definition.field1603 * 2060153769 * -569057127;
					var16.field1011 = (var6 & 1024) != 0 ? var1.readUnsignedShortAddLE() : var16.definition.field1591 * -1127379603 * 1208452197;
					var16.field1019 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var16.definition.field1589 * 1090622731 * -1053389149;
					var16.field1012 = (var6 & 4096) != 0 ? var1.readUnsignedShortLE() : var16.definition.field1588 * 529265241 * 1033123305;
					var16.field1014 = (var6 & 8192) != 0 ? var1.readUnsignedShort() : var16.definition.field1601 * 1878087069 * -905258827;
					var16.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortLE() : var16.definition.idleSequence * -641444085 * 1619147939;
				}

				int[] var17;
				short[] var18;
				short[] var19;
				long var20;
				int var23;
				boolean var24;
				if ((var25 & 32768) != 0) {
					var6 = var1.readUnsignedByte();
					if ((var6 & 1) == 1) {
						var16.method606();
					} else {
						var17 = null;
						if ((var6 & 2) == 2) {
							var8 = var1.readUnsignedByteNeg();
							var17 = new int[var8];

							for (var9 = 0; var9 < var8; ++var9) {
								var10 = var1.readUnsignedShortAddLE();
								var10 = var10 == 65535 ? -1 : var10;
								var17[var9] = var10;
							}
						}

						var18 = null;
						if ((var6 & 4) == 4) {
							var9 = 0;
							if (var16.definition.recolorTo != null) {
								var9 = var16.definition.recolorTo.length;
							}

							var18 = new short[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var18[var10] = (short)var1.readUnsignedShortAdd();
							}
						}

						var19 = null;
						if ((var6 & 8) == 8) {
							var10 = 0;
							if (var16.definition.retextureTo != null) {
								var10 = var16.definition.retextureTo.length;
							}

							var19 = new short[var10];

							for (var23 = 0; var23 < var10; ++var23) {
								var19[var23] = (short)var1.readUnsignedShortLE();
							}
						}

						var24 = false;
						if ((var6 & 16) != 0) {
							var24 = var1.readUnsignedByteAdd() == 1;
						}

						var20 = (long)(++NPC.field1109 - 1);
						var16.method604(new NpcOverrides(var20, var17, var18, var19, var24));
					}
				}

				if ((var25 & 128) != 0) {
					var6 = var1.readUnsignedShortAddLE();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var1.readUnsignedByteSub();
					if (var6 == var16.sequence && var6 != -1) {
						var8 = MilliClock.SequenceDefinition_get(var6).restartMode;
						if (var8 == 1) {
							var16.sequenceFrame = 0;
							var16.sequenceFrameCycle = 0;
							var16.sequenceDelay = var7;
							var16.field1051 = 0;
						}

						if (var8 == 2) {
							var16.field1051 = 0;
						}
					} else if (var6 == -1 || var16.sequence == -1 || MilliClock.SequenceDefinition_get(var6).field1833 >= MilliClock.SequenceDefinition_get(var16.sequence).field1833) {
						var16.sequence = var6;
						var16.sequenceFrame = 0;
						var16.sequenceFrameCycle = 0;
						var16.sequenceDelay = var7;
						var16.field1051 = 0;
						var16.field1057 = var16.pathLength;
					}
				}

				if ((var25 & 16) != 0) {
					var6 = var1.readUnsignedShortAdd();
					var7 = var1.readUnsignedShort();
					var16.field996 = var1.readUnsignedByteNeg() == 1;
					var16.field1037 = var6;
					var16.field1032 = var7;
				}

				if ((var25 & 2) != 0) {
					var16.targetIndex = var1.readUnsignedShortLE();
					var16.targetIndex += var1.readUnsignedByteSub() << 16;
					var6 = 16777215;
					if (var6 == var16.targetIndex) {
						var16.targetIndex = -1;
					}
				}

				if ((var25 & 1024) != 0) {
					var16.method588(var1.readStringCp1252NullTerminated());
				}

				if ((var25 & 4096) != 0) {
					var16.field1058 = var1.readUnsignedIntME();
				}

				if ((var25 & 64) != 0) {
					var6 = var1.readUnsignedByteAdd();
					if (var6 > 0) {
						for (var7 = 0; var7 < var6; ++var7) {
							var9 = -1;
							var10 = -1;
							var23 = -1;
							var8 = var1.readUShortSmart();
							if (var8 == 32767) {
								var8 = var1.readUShortSmart();
								var10 = var1.readUShortSmart();
								var9 = var1.readUShortSmart();
								var23 = var1.readUShortSmart();
							} else if (var8 != 32766) {
								var10 = var1.readUShortSmart();
							} else {
								var8 = -1;
							}

							var12 = var1.readUShortSmart();
							var16.addHitSplat(var8, var10, var9, var23, Client.cycle, var12);
						}
					}

					var7 = var1.readUnsignedByteSub();
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							if (var10 != 32767) {
								var23 = var1.readUShortSmart();
								var12 = var1.readUnsignedByte();
								int var13 = var10 > 0 ? var1.readUnsignedByteAdd() : var12;
								var16.addHealthBar(var9, Client.cycle, var10, var23, var12, var13);
							} else {
								var16.removeHealthBar(var9);
							}
						}
					}
				}

				if ((var25 & 65536) != 0) {
					var6 = var1.readUnsignedByteNeg();

					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var1.readUnsignedByte();
						var9 = var1.readUnsignedShortLE();
						var10 = var1.readUnsignedIntIME();
						var16.updateSpotAnimation(var8, var9, var10 >> 16, var10 & 65535);
					}
				}

				if ((var25 & 262144) != 0) {
					var6 = var1.readUnsignedByteAdd();
					var17 = new int[8];
					var18 = new short[8];

					for (var9 = 0; var9 < 8; ++var9) {
						if ((var6 & 1 << var9) != 0) {
							var17[var9] = var1.readNullableLargeSmart();
							var18[var9] = (short)var1.readShortSmartSub();
						} else {
							var17[var9] = -1;
							var18[var9] = -1;
						}
					}

					var16.method599(var17, var18);
				}

				if ((var25 & 512) != 0) {
					var6 = var1.readUnsignedByteNeg();
					if ((var6 & 1) == 1) {
						var16.method605();
					} else {
						var17 = null;
						if ((var6 & 2) == 2) {
							var8 = var1.readUnsignedByteAdd();
							var17 = new int[var8];

							for (var9 = 0; var9 < var8; ++var9) {
								var10 = var1.readUnsignedShort();
								var10 = var10 == 65535 ? -1 : var10;
								var17[var9] = var10;
							}
						}

						var18 = null;
						if ((var6 & 4) == 4) {
							var9 = 0;
							if (var16.definition.recolorTo != null) {
								var9 = var16.definition.recolorTo.length;
							}

							var18 = new short[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var18[var10] = (short)var1.readUnsignedShort();
							}
						}

						var19 = null;
						if ((var6 & 8) == 8) {
							var10 = 0;
							if (var16.definition.retextureTo != null) {
								var10 = var16.definition.retextureTo.length;
							}

							var19 = new short[var10];

							for (var23 = 0; var23 < var10; ++var23) {
								var19[var23] = (short)var1.readUnsignedShortAdd();
							}
						}

						var24 = false;
						if ((var6 & 16) != 0) {
							var24 = var1.readUnsignedByteAdd() == 1;
						}

						var20 = (long)(++NPC.field1110 - 1);
						var16.method602(new NpcOverrides(var20, var17, var18, var19, var24));
					}
				}

				if ((var25 & 8192) != 0) {
					var16.method589(var1.readUnsignedByteSub());
				}

				if ((var25 & 4) != 0) {
					var16.definition = VarcInt.getNpcDefinition(var1.readUnsignedShort());
					LoginPacket.method770(var16);
					var16.method601();
				}

				if ((var25 & 2048) != 0) {
					var16.field1047 = Client.cycle + var1.readUnsignedShortAddLE();
					var16.field1046 = Client.cycle + var1.readUnsignedShortAdd();
					var16.field1002 = var1.readByte();
					var16.field1003 = var1.readByteSub();
					var16.field1004 = var1.readByteNeg();
					var16.field1001 = (byte)var1.readUnsignedByteSub();
				}

				if ((var25 & 1) != 0) {
					var1.readUnsignedShortAdd();
					var1.readInt();
				}
			}

			for (var2 = 0; var2 < Client.field512; ++var2) {
				var3 = Client.field585[var2];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var2 = 0; var2 < Client.npcCount; ++var2) {
					if (Client.npcs[Client.npcIndices[var2]] == null) {
						throw new RuntimeException(var2 + "," + Client.npcCount);
					}
				}

			}
		}
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Ldm;ZI)V",
		garbageValue = "1781553248"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			ArchiveLoader.widgetDefinition.method1788(var2);
		}

		class28.method105(var2);
		Widget var4 = ArchiveLoader.widgetDefinition.method1785(var3);
		if (var4 != null) {
			UserComparator5.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			Canvas.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
