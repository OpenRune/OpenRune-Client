import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ah")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("az")
	@Export("index")
	int index;
	@ObfuscatedName("ao")
	volatile int field3622;
	@ObfuscatedName("au")
	boolean field3613;
	@ObfuscatedName("ak")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("aj")
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("af")
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ax")
	int field3616;
	@ObfuscatedName("an")
	boolean field3612;
	@ObfuscatedName("ag")
	boolean field3611;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	JagNetThread field3618;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;Lot;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field3622 = 0;
		this.field3613 = false;
		this.field3616 = -1;
		this.field3612 = false;
		this.field3611 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field3613 = var7;
		this.field3612 = var8;
		this.field3611 = var9;
		this.field3618 = var3;
		this.field3618.method2020(this, this.index);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "41"
	)
	public boolean method1972() {
		return this.field3622 == 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "293660627"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3622 == 1 || this.field3612 && this.field3622 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field3618.method2024(255, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "27999"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field3618.method2023(this.index, var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "48"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			GrandExchangeOfferOwnWorldComparator.method349(var1, this.archiveDisk, this);
		} else {
			this.field3618.method2022(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1307905316"
	)
	void method1977() {
		this.field3622 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "32"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			GrandExchangeOfferOwnWorldComparator.method349(this.index, this.masterDisk, this);
		} else {
			this.field3618.method2022(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1429389196"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3622 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				class321.method1696(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				class321.method1696(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				Object[] var5 = super.groups;
				Object var7;
				if (var2 == null) {
					var7 = null;
				} else if (var2.length > 136) {
					DirectByteArrayCopier var8 = new DirectByteArrayCopier();
					var8.set(var2);
					var7 = var8;
				} else {
					var7 = var2;
				}

				var5[var1] = var7;
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I[BZS)V",
		garbageValue = "19234"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3622 == 1) {
				throw new RuntimeException();
			} else if (var3 == null) {
				this.field3618.method2022(this, 255, this.index, this.indexCrc, (byte)0, true);
			} else {
				Archive_crc.reset();
				Archive_crc.update(var3, 0, var3.length);
				var5 = (int)Archive_crc.getValue();
				if (var5 != this.indexCrc) {
					this.field3618.method2022(this, 255, this.index, this.indexCrc, (byte)0, true);
				} else {
					Buffer var6 = new Buffer(class311.decompressBytes(var3));
					int var7 = var6.readUnsignedByte();
					if (var7 != 5 && var7 != 6) {
						throw new RuntimeException(var7 + "," + this.index + "," + var2);
					} else {
						int var8 = 0;
						if (var7 >= 6) {
							var8 = var6.readInt();
						}

						if (var8 != this.indexVersion) {
							this.field3618.method2022(this, 255, this.index, this.indexCrc, (byte)0, true);
						} else {
							this.decodeIndex(var3);
							this.loadAllLocal();
						}
					}
				}
			}
		} else {
			if (!var4 && var2 == this.field3616) {
				this.field3622 = 1;
			}

			if (var3 != null && var3.length > 2) {
				Archive_crc.reset();
				Archive_crc.update(var3, 0, var3.length - 2);
				var5 = (int)Archive_crc.getValue();
				int var11 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				if (var5 == super.groupCrcs[var2] && var11 == super.groupVersions[var2]) {
					this.validGroups[var2] = true;
					if (var4) {
						Object[] var12 = super.groups;
						Object var9;
						if (var3 == null) {
							var9 = null;
						} else if (var3.length > 136) {
							DirectByteArrayCopier var10 = new DirectByteArrayCopier();
							var10.set(var3);
							var9 = var10;
						} else {
							var9 = var3;
						}

						var12[var2] = var9;
					}

				} else {
					this.validGroups[var2] = false;
					if (this.field3613 || var4) {
						this.field3618.method2022(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
					}

				}
			} else {
				this.validGroups[var2] = false;
				if (this.field3613 || var4) {
					this.field3618.method2022(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-67451079"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3622 = 1;
		} else {
			this.field3616 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					ArchiveDisk var2 = this.archiveDisk;
					ArchiveDiskAction var4 = new ArchiveDiskAction();
					var4.type = 1;
					var4.key = (long)var1;
					var4.archiveDisk = var2;
					var4.archive = this;
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
					}

					synchronized(ArchiveDiskActionHandler.field3606) {
						if (ArchiveDiskActionHandler.field3605 == 0) {
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
						}

						ArchiveDiskActionHandler.field3605 = 600;
						ArchiveDiskActionHandler.field3604 = false;
					}

					this.field3616 = var1;
				}
			}

			if (this.field3616 == -1) {
				this.field3622 = 1;
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-395303036"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field3618.method2024(this.index, var1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-909920285"
	)
	public boolean method1983(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "7"
	)
	public boolean method1984(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0;
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) {
			if (super.fileCounts[var3] > 0) {
				var1 += 100;
				var2 += this.groupLoadPercent(var3);
			}
		}

		if (var1 == 0) {
			return 100;
		} else {
			var3 = var2 * 100 / var1;
			return var3;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2050143917"
	)
	public static void method1974(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "3"
	)
	static int method1986(int var0, Script var1, boolean var2) {
		String var3;
		if (var0 == 3100) {
			var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
			class209.addGameMessage(0, "", var3);
			return 1;
		} else if (var0 == 3101) {
			Interpreter.Interpreter_intStackSize -= 2;
			class485.performPlayerAnimation(VarpDefinition.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == 3103) {
			if (!Interpreter.field733) {
				Interpreter.field734 = true;
			}

			return 1;
		} else {
			int var10;
			if (var0 == 3104) {
				var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				var10 = 0;
				if (BoundaryObject.isNumber(var3)) {
					var10 = class129.method707(var3);
				}

				PacketBufferNode var15 = ViewportMouse.getPacketBufferNode(ClientPacket.RESUME_COUNTDIALOG, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeInt(var10);
				Client.packetWriter.addNode(var15);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == 3105) {
					var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					var12 = ViewportMouse.getPacketBufferNode(ClientPacket.RESUME_NAMEDIALOG, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var3.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == 3106) {
					var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
					var12 = ViewportMouse.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var3.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					String var7;
					int var8;
					if (var0 == 3107) {
						var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
						SecureRandomCallable.method467(var8, var7);
						return 1;
					} else if (var0 == 3108) {
						Interpreter.Interpreter_intStackSize -= 3;
						var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						Widget var11 = ArchiveLoader.widgetDefinition.method1785(var5);
						class27.clickWidget(var11, var8, var10);
						return 1;
					} else if (var0 == 3109) {
						Interpreter.Interpreter_intStackSize -= 2;
						var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						Widget var14 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
						class27.clickWidget(var14, var8, var10);
						return 1;
					} else if (var0 == 3110) {
						DbTableType.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3111) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class30.clientPreferences.isRoofsHidden() ? 1 : 0;
						return 1;
					} else if (var0 == 3112) {
						class30.clientPreferences.updateRoofsHidden(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == 3113) {
						var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						class137.openURL(var3, var4, false);
						return 1;
					} else if (var0 == 3115) {
						var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var12 = ViewportMouse.getPacketBufferNode(ClientPacket.RESUME_OBJDIALOG, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShort(var8);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == 3116) {
						var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						class60.Interpreter_stringStackSize -= 2;
						var7 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
						String var9 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
						if (var7.length() > 500) {
							return 1;
						} else if (var9.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = ViewportMouse.getPacketBufferNode(ClientPacket.field2606, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class145.stringCp1252NullTerminatedByteSize(var7) + class145.stringCp1252NullTerminatedByteSize(var9));
							var6.packetBuffer.writeByteSub(var8);
							var6.packetBuffer.writeStringCp1252NullTerminated(var7);
							var6.packetBuffer.writeStringCp1252NullTerminated(var9);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == 3117) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == 3118) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3119) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == 3125) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3126) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3127) {
						class93.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == 3128) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == 3132) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArea.canvasHeight;
						return 1;
					} else if (var0 == 3133) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == 3134) {
						return 1;
					} else if (var0 == 3135) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field518 = 3;
						Client.field525 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field518 = 2;
						Client.field525 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field518 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field518 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field518 = 3;
						Client.field525 = var2 ? Interpreter.scriptDotWidget.id * -917460645 * 403660499 : class141.scriptActiveWidget.id * -917460645 * 403660499;
						return 1;
					} else {
						boolean var13;
						if (var0 == 3141) {
							var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class30.clientPreferences.updateHideUsername(var13);
							return 1;
						} else if (var0 == 3142) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class30.clientPreferences.isUsernameHidden() ? 1 : 0;
							return 1;
						} else if (var0 == 3143) {
							var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var13;
							if (!var13) {
								class30.clientPreferences.updateRememberedUsername("");
							}

							return 1;
						} else if (var0 == 3144) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == 3146) {
							var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class30.clientPreferences.updateTitleMusicDisabled(!var13);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class30.clientPreferences.isTitleMusicDisabled() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class538.method2692();
							return 1;
						} else if (var0 == 3155) {
							--class60.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class60.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class60.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class60.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							class182.method936(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Frames.method1562();
							return 1;
						} else if (var0 == 3189) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							InvDefinition.method891(var8);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}
}
