import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("tq")
	static int field3240;
	@ObfuscatedName("ar")
	@Export("name")
	public final String name;
	@ObfuscatedName("as")
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lun;ILdj;IB)V",
		garbageValue = "97"
	)
	static final void method1951(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class233.field1990.field1992;
		if ((var3 & 4096) != 0) {
			var2.field1048 = var0.readByteSub();
			var2.field1054 = var0.readByteSub();
			var2.field1055 = var0.readByteSub();
			var2.field1053 = var0.readByteNeg();
			var2.spotAnimation = var0.readUnsignedShort() + Client.cycle;
			var2.field1038 = var0.readUnsignedShortAddLE() + Client.cycle;
			var2.field1052 = var0.readUnsignedShortAdd();
			if (var2.field935) {
				var2.field1048 += var2.tileX;
				var2.field1054 += var2.tileY;
				var2.field1055 += var2.tileX;
				var2.field1053 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1048 += var2.pathX[0];
				var2.field1054 += var2.pathY[0];
				var2.field1055 += var2.pathX[0];
				var2.field1053 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1057 = 0;
		}

		if ((var3 & 16384) != 0) {
			var2.field1047 = Client.cycle + var0.readUnsignedShortAdd();
			var2.field1046 = Client.cycle + var0.readUnsignedShortAddLE();
			var2.field1002 = var0.readByteAdd();
			var2.field1003 = var0.readByteAdd();
			var2.field1004 = var0.readByte();
			var2.field1001 = (byte)var0.readUnsignedByteSub();
		}

		int var5;
		if ((var3 & 8) != 0) {
			var2.targetIndex = var0.readUnsignedShortLE();
			var2.targetIndex += var0.readUnsignedByteSub() << 16;
			var5 = 16777215;
			if (var2.targetIndex == var5) {
				var2.targetIndex = -1;
			}
		}

		int var6;
		if ((var3 & 128) != 0) {
			var5 = var0.readUnsignedShortLE();
			if (var5 == 65535) {
				var5 = -1;
			}

			var6 = var0.readUnsignedByte();
			class485.performPlayerAnimation(var2, var5, var6);
		}

		if ((var3 & 32) != 0) {
			var5 = var0.readUnsignedByteAdd();
			byte[] var16 = new byte[var5];
			Buffer var7 = new Buffer(var16);
			var0.method2675(var16, 0, var5);
			Players.field1152[var1] = var7;
			var2.read(var7);
		}

		if ((var3 & 2) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				class209.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == VarpDefinition.localPlayer) {
				class209.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.field998 = false;
			var2.field1027 = 0;
			var2.field1030 = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		if ((var3 & 256) != 0) {
			class233[] var17 = Players.field1150;
			class233[] var21 = new class233[]{class233.field1988, class233.field1991, class233.field1989, class233.field1990};
			var17[var1] = (class233)class356.findEnumerated(var21, var0.readByte());
		}

		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var18;
		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByte();
			if (var5 > 0) {
				for (var6 = 0; var6 < var5; ++var6) {
					var8 = -1;
					var9 = -1;
					var10 = -1;
					var18 = var0.readUShortSmart();
					if (var18 == 32767) {
						var18 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
					} else if (var18 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var18 = -1;
					}

					var11 = var0.readUShortSmart();
					var2.addHitSplat(var18, var9, var8, var10, Client.cycle, var11);
				}
			}

			var6 = var0.readUnsignedByte();
			if (var6 > 0) {
				for (var18 = 0; var18 < var6; ++var18) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var10 = var0.readUShortSmart();
						var11 = var0.readUnsignedByteAdd();
						var12 = var9 > 0 ? var0.readUnsignedByteNeg() : var11;
						var2.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if ((var3 & 64) != 0) {
			var5 = var0.readUnsignedShortAdd();
			PlayerType var25 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var0.readUnsignedByte());
			boolean var28 = var0.readUnsignedByte() == 1;
			var8 = var0.readUnsignedByte();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var23 = false;
				if (var25.isUser && InterfaceParent.friendSystem.isIgnored(var2.username)) {
					var23 = true;
				}

				if (!var23 && Client.field515 == 0 && !var2.isHidden) {
					Players.field1151.offset = 0;
					var0.readBytes(Players.field1151.array, 0, var8);
					Players.field1151.offset = 0;
					String var19 = AbstractFont.escapeBrackets(ClanChannel.method872(class495.method2443(Players.field1151)));
					var2.overheadText = var19.trim();
					var2.field1027 = var5 >> 8;
					var2.field1030 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.field1062 = null;
					var2.field998 = var28;
					var2.field997 = var2 != VarpDefinition.localPlayer && var25.isUser && !Client.field628.isEmpty() && var19.toLowerCase().indexOf(Client.field628) == -1;
					if (var25.isPrivileged) {
						var12 = var28 ? 91 : 1;
					} else {
						var12 = var28 ? 90 : 2;
					}

					if (var25.modIcon != -1) {
						class209.addGameMessage(var12, class415.method2158(var25.modIcon) + var2.username.getName(), var19);
					} else {
						class209.addGameMessage(var12, var2.username.getName(), var19);
					}
				}
			}

			var0.offset = var9 + var8;
		}

		if ((var3 & 512) != 0) {
			var5 = var0.readUnsignedShort();
			var6 = var5 >> 8;
			var18 = var6 >= 13 && var6 <= 20 ? var6 - 12 : 0;
			PlayerType var20 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var0.readUnsignedByteSub());
			boolean var22 = var0.readUnsignedByte() == 1;
			var10 = var0.readUnsignedByteAdd();
			var11 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var24 = false;
				if (var20.isUser && InterfaceParent.friendSystem.isIgnored(var2.username)) {
					var24 = true;
				}

				if (!var24 && Client.field515 == 0 && !var2.isHidden) {
					Players.field1151.offset = 0;
					var0.method2674(Players.field1151.array, 0, var10);
					Players.field1151.offset = 0;
					String var13 = AbstractFont.escapeBrackets(ClanChannel.method872(class495.method2443(Players.field1151)));
					var2.overheadText = var13.trim();
					var2.field1027 = var5 >> 8;
					var2.field1030 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					byte[] var14 = null;
					int var15;
					if (var18 > 0 && var18 <= 8) {
						var14 = new byte[var18];

						for (var15 = 0; var15 < var18; ++var15) {
							var14[var15] = var0.readByteSub();
						}
					}

					var2.field1062 = class321.method1697(var14);
					var2.field998 = var22;
					var2.field997 = var2 != VarpDefinition.localPlayer && var20.isUser && !Client.field628.isEmpty() && var13.toLowerCase().indexOf(Client.field628) == -1;
					if (var20.isPrivileged) {
						var15 = var22 ? 91 : 1;
					} else {
						var15 = var22 ? 90 : 2;
					}

					if (var20.modIcon != -1) {
						class209.addGameMessage(var15, class415.method2158(var20.modIcon) + var2.username.getName(), var13);
					} else {
						class209.addGameMessage(var15, var2.username.getName(), var13);
					}
				}
			}

			var0.offset = var11 + var10 + var18;
		}

		if ((var3 & 1024) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 65536) != 0) {
			var5 = var0.readUnsignedByteSub();

			for (var6 = 0; var6 < var5; ++var6) {
				var18 = var0.readUnsignedByteAdd();
				var8 = var0.readUnsignedShort();
				var9 = var0.readUnsignedIntLE();
				var2.updateSpotAnimation(var18, var8, var9 >> 16, var9 & 65535);
			}
		}

		if ((var3 & 32768) != 0) {
			var4 = var0.readByte();
		}

		if ((var3 & 1) != 0) {
			var2.field1031 = var0.readUnsignedShortAddLE();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1031;
				var2.method535();
			}
		}

		if (var2.field935) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class233 var27;
				if (var4 != class233.field1990.field1992) {
					class233[] var26 = new class233[]{class233.field1988, class233.field1991, class233.field1989, class233.field1990};
					var27 = (class233)class356.findEnumerated(var26, var4);
				} else {
					var27 = Players.field1150[var1];
				}

				var2.method504(var2.tileX, var2.tileY, var27);
			}
		}

	}
}
