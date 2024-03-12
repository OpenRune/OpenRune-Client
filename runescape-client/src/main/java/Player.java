import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("jz")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("al")
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ai")
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("as")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aa")
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("az")
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ao")
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("au")
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ak")
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ah")
	int field942;
	@ObfuscatedName("aj")
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("af")
	int field940;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ag")
	@Export("minX")
	int minX;
	@ObfuscatedName("am")
	@Export("minY")
	int minY;
	@ObfuscatedName("ad")
	@Export("maxX")
	int maxX;
	@ObfuscatedName("at")
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ay")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ae")
	@Export("team")
	int team;
	@ObfuscatedName("ac")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ab")
	@Export("plane")
	int plane;
	@ObfuscatedName("av")
	@Export("index")
	int index;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bd")
	boolean field935;
	@ObfuscatedName("bi")
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bq")
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field935 = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "80"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		byte var2 = var1.readByte();
		boolean var3 = true;
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var4 = -1;
		this.team = 0;
		int[] var5 = new int[12];

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 == 0) {
				var5[var6] = 0;
			} else {
				var8 = var1.readUnsignedByte();
				var5[var6] = var8 + (var7 << 8);
				if (var6 == 0 && var5[0] == 65535) {
					var4 = var1.readUnsignedShort();
					break;
				}

				if (var5[var6] >= 512) {
					var9 = ArchiveDiskActionHandler.ItemDefinition_get(var5[var6] - 512).team;
					if (var9 != 0) {
						this.team = var9;
					}
				}
			}
		}

		int[] var26 = new int[12];

		for (var7 = 0; var7 < 12; ++var7) {
			var8 = var1.readUnsignedByte();
			if (var8 == 0) {
				var26[var7] = 0;
			} else {
				var9 = var1.readUnsignedByte();
				var26[var7] = var9 + (var8 << 8);
			}
		}

		int[] var27 = new int[5];

		for (var8 = 0; var8 < 5; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= class407.field3753[var8].length) {
				var9 = 0;
			}

			var27[var8] = var9;
		}

		super.idleSequence = var1.readUnsignedShort();
		if (super.idleSequence == 65535) {
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort();
		if (super.turnLeftSequence == 65535) {
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence;
		super.walkSequence = var1.readUnsignedShort();
		if (super.walkSequence == 65535) {
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) {
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort();
		if (super.walkRightSequence == 65535) {
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort();
		if (super.runSequence == 65535) {
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), FriendLoginUpdate.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method500();
		if (this == VarpDefinition.localPlayer) {
			RunException.field4393 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		PlayerCompositionColorTextureOverride[] var28 = null;
		boolean var30 = false;
		int var10 = var1.readUnsignedShort();
		var30 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) {
			var28 = new PlayerCompositionColorTextureOverride[12];

			for (var11 = 0; var11 < 12; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					int var16 = var5[var11] - 512;
					int var17 = var1.readUnsignedByte();
					boolean var18 = (var17 & 1) != 0;
					boolean var19 = (var17 & 2) != 0;
					PlayerCompositionColorTextureOverride var20 = new PlayerCompositionColorTextureOverride(var16);
					int var21;
					int[] var22;
					boolean var23;
					int var24;
					short var25;
					if (var18) {
						var21 = var1.readUnsignedByte();
						var22 = new int[]{var21 & 15, var21 >> 4 & 15};
						var23 = var20.playerCompositionRecolorTo != null && var22.length == var20.playerCompositionRecolorTo.length;

						for (var24 = 0; var24 < 2; ++var24) {
							if (var22[var24] != 15) {
								var25 = (short)var1.readUnsignedShort();
								if (var23) {
									var20.playerCompositionRecolorTo[var22[var24]] = var25;
								}
							}
						}
					}

					if (var19) {
						var21 = var1.readUnsignedByte();
						var22 = new int[]{var21 & 15, var21 >> 4 & 15};
						var23 = var20.playerCompositionRetextureTo != null && var22.length == var20.playerCompositionRetextureTo.length;

						for (var24 = 0; var24 < 2; ++var24) {
							if (var22[var24] != 15) {
								var25 = (short)var1.readUnsignedShort();
								if (var23) {
									var20.playerCompositionRetextureTo[var22[var24]] = var25;
								}
							}
						}
					}

					var28[var11] = var20;
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.actions[var11] = var1.readStringCp1252NullTerminated();
		}

		byte var29 = var1.readByte();
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method1796(var26, var5, var28, var30, var27, var2, var4, var29);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? MilliClock.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && !this.isUnanimated && (super.movementSequence != super.idleSequence || var1 == null) ? MilliClock.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method534(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field942 - super.x, this.tileHeight2 - this.tileHeight, this.field940 - super.y);
						if (super.orientation == 512) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5};
						var3 = new Model(var6, 2);
						if (super.orientation == 512) {
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						}

						var5.offsetBy(super.x - this.field942, this.tileHeight - this.tileHeight2, super.y - this.field940);
					}
				}

				var3.isSingleTile = true;
				if (super.field1001 != 0 && Client.cycle >= super.field1047 && Client.cycle < super.field1046) {
					var3.overrideHue = super.field1002;
					var3.overrideSaturation = super.field1003;
					var3.overrideLuminance = super.field1004;
					var3.overrideAmount = super.field1001;
					var3.field2480 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1732942306"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1877485699"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2081922763"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = InterfaceParent.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1964405610"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1461345651"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "862221179"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = Projectile.friendsChat != null && Projectile.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method816(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-58"
	)
	void method500() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1766189372"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-26"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? VarcInt.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILip;I)V",
		garbageValue = "1011163909"
	)
	final void method504(int var1, int var2, class233 var3) {
		if (super.sequence != -1 && MilliClock.SequenceDefinition_get(super.sequence).field1839 == 1) {
			super.sequence = -1;
		}

		this.method535();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class233.field1988) {
					Player var4 = this;
					class233 var5 = class233.field1988;
					int var6 = super.pathX[0];
					int var7 = super.pathY[0];
					int var8 = this.transformedSize();
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) {
						int var9 = Client.field684.method1225(var6, var7, this.transformedSize(), ModeWhere.method2066(var1, var2), Client.collisionMaps[this.plane], true, Client.field617, Client.field618);
						if (var9 >= 1) {
							for (int var10 = 0; var10 < var9 - 1; ++var10) {
								var4.method506(Client.field617[var10], Client.field618[var10], var5);
							}
						}
					}
				}

				this.method506(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-933652265"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1057 = 0;
		super.field1059 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILip;I)V",
		garbageValue = "-609876944"
	)
	final void method506(int var1, int var2, class233 var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16409"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "450825303"
	)
	@Export("shift8LeftAndAdd")
	public static int shift8LeftAndAdd(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1936855348"
	)
	static int method508(int var0, Script var1, boolean var2) {
		if (var0 == 3300) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == 3301) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class218.method1123(var3, var4);
				return 1;
			} else if (var0 == 3302) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class223.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == 3303) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class402.method2104(var3, var4);
				return 1;
			} else if (var0 == 3304) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == 3305) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == 3306) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == 3307) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == 3308) {
					var3 = class473.Client_plane;
					var4 = (VarpDefinition.localPlayer.x >> 7) + Projectile.baseX;
					var5 = (VarpDefinition.localPlayer.y >> 7) + GameEngine.baseY;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == 3309) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == 3310) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == 3311) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == 3312) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == 3313) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class218.method1123(var3, var4);
					return 1;
				} else if (var0 == 3314) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class223.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == 3315) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class402.method2104(var3, var4);
					return 1;
				} else if (var0 == 3316) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 3317) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == 3318) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == 3321) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == 3322) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == 3323) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 3324) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == 3325) {
					Interpreter.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field452;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field460;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field591[var3];
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
