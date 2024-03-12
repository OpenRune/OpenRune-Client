import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public enum class371 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3575(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3576(1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3574(2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3573(3);

	@ObfuscatedName("ar")
	public final int field3577;

	class371(int var3) {
		this.field3577 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3577;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "1597878920"
	)
	@Export("base64Encode")
	public static String base64Encode(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder();

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class404.field3749[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class404.field3749[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class404.field3749[(var6 & 15) << 2 | var7 >>> 6]).append(class404.field3749[var7 & 63]);
				} else {
					var3.append(class404.field3749[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class404.field3749[(var5 & 3) << 4]).append("==");
			}
		}

		String var1 = var3.toString();
		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)I",
		garbageValue = "8"
	)
	static int method1965(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var0.method1914(var1);
			return 1;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "519993372"
	)
	static int method1966(int var0, Script var1, boolean var2) {
		if (var0 == 3800) {
			if (class223.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
				class53.field255 = class223.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == 3801) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					class53.field255 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class53.field255.name;
				return 1;
			} else if (var0 == 3803) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.field1412;
				return 1;
			} else if (var0 == 3805) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.field1413;
				return 1;
			} else if (var0 == 3806) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.field1411;
				return 1;
			} else if (var0 == 3807) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.field1410;
				return 1;
			} else if (var0 == 3809) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.memberCount;
				return 1;
			} else if (var0 == 3810) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class53.field255.memberNames[var3];
				return 1;
			} else if (var0 == 3811) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.memberRanks[var3];
				return 1;
			} else if (var0 == 3812) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.bannedMemberCount;
				return 1;
			} else if (var0 == 3813) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class53.field255.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == 3814) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.method817(var3, var6, var5);
					return 1;
				} else if (var0 == 3815) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.currentOwner;
					return 1;
				} else if (var0 == 3816) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.field1419;
					return 1;
				} else if (var0 == 3817) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.method816(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == 3818) {
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class53.field255.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == 3819) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					class133.method739(var6, var3);
					return 1;
				} else if (var0 == 3820) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.field1420[var3];
					return 1;
				} else {
					if (var0 == 3821) {
						Interpreter.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						HealthBar.method587(var5, var3, var4);
					}

					if (var0 == 3822) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.field255.field1409[var3] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (class316.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							SecureRandomSSLSocket.field37 = class316.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							SecureRandomSSLSocket.field37 = Client.currentClanChannels[var3];
							Interpreter.field737 = var3;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = SecureRandomSSLSocket.field37.name;
						return 1;
					} else if (var0 == 3853) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field37.field1450;
						return 1;
					} else if (var0 == 3854) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field37.field1449;
						return 1;
					} else if (var0 == 3855) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field37.method869();
						return 1;
					} else if (var0 == 3856) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ((ClanChannelMember)SecureRandomSSLSocket.field37.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == 3857) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)SecureRandomSSLSocket.field37.members.get(var3)).rank;
						return 1;
					} else if (var0 == 3858) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)SecureRandomSSLSocket.field37.members.get(var3)).world;
						return 1;
					} else if (var0 == 3859) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						class93.method516(Interpreter.field737, var3);
						return 1;
					} else if (var0 == 3860) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field37.method870(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == 3861) {
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = SecureRandomSSLSocket.field37.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == 3890) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class73.field763 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1764737119"
	)
	static void method1964() {
		Client.field399 = true;
		if (ScriptFrame.varcs != null && ScriptFrame.varcs.hasUnwrittenChanges()) {
			ScriptFrame.varcs.write();
		}

		HttpMethod.method29();
		Message.method342();
		if (ByteArrayPool.mouseRecorder != null) {
			ByteArrayPool.mouseRecorder.isRunning = false;
		}

		ByteArrayPool.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var3) {
			}
		}

		GameEngine.taskHandler = null;
		class133.clear();
		LoginPacket.method769();
		if (Actor.scene != null) {
			Actor.scene.clear();
		}

		for (int var1 = 0; var1 < Client.collisionMaps.length; ++var1) {
			if (Client.collisionMaps[var1] != null) {
				Client.collisionMaps[var1].clear();
			}
		}

		Tiles.worldMap = null;
		class169.method882(0, 0);
		GrandExchangeOfferOwnWorldComparator.method350();
		Client.playingJingle = false;
		InterfaceParent.method475();
		if (AuthenticationScheme.pcmPlayer1 != null) {
			AuthenticationScheme.pcmPlayer1.shutdown();
		}

		class356.field3198.method2026();
		class193.method974();
		if (InvDefinition.urlRequester != null) {
			InvDefinition.urlRequester.close();
		}

		class94.method518();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		class173.JagexCache_idxFiles = null;
		class136.method744();
		class155.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field574 = 0;
		class356.field3198 = new JagNetThread();
		InvDefinition.urlRequester = new SecureUrlRequester(class193.client.https, 220);

		try {
			class30.method110("oldschool", class28.field83, class129.field1245.name, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class155.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		class193.client.method142();
		WorldMapDecoration.method1371(class93.field977);
		Interpreter.updateGameState(0);
	}
}
