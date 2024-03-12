import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1895581424"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "112"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class324.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1611023709"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "29"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lof;Ljava/lang/String;Ljava/lang/String;B)[Lvd;",
		garbageValue = "100"
	)
	public static SpritePixels[] method1006(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class138.method750(var0, var3, var4);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "47"
	)
	static int method1007(int var0, Script var1, boolean var2) {
		if (var0 == 5000) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == 5001) {
			Interpreter.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			class133.privateChatMode = class177.method904(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (class133.privateChatMode == null) {
				class133.privateChatMode = PrivateChatMode.field4374;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			PacketBufferNode var11 = ViewportMouse.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var11.packetBuffer.writeByte(Client.publicChatMode);
			var11.packetBuffer.writeByte(class133.privateChatMode.field4377);
			var11.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var11);
			return 1;
		} else {
			String var3;
			int var4;
			int var5;
			PacketBufferNode var6;
			if (var0 == 5002) {
				var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				Interpreter.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var6 = ViewportMouse.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var3) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var3);
				var6.packetBuffer.writeByte(var4 - 1);
				var6.packetBuffer.writeByte(var5);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var7;
				Message var8;
				if (var0 == 5003) {
					Interpreter.Interpreter_intStackSize -= 2;
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var8 = class106.Messages_getByChannelAndID(var7, var4);
					if (var8 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.count;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.cycle;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.sender != null ? var8.sender : "";
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.prefix != null ? var8.prefix : "";
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.text != null ? var8.text : "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.isFromFriend() ? 1 : (var8.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var9;
					if (var0 == 5004) {
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var9 = Client.Messages_getMessage(var7);
						if (var9 != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.type;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.cycle;
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.sender != null ? var9.sender : "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.prefix != null ? var9.prefix : "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.text != null ? var9.text : "";
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.isFromFriend() ? 1 : (var9.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 5005) {
						if (class133.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class133.privateChatMode.field4377;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == 5008) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var12 = LoginType.method2541(var4, var3, WorldMapCacheName.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == 5009) {
							class60.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
							String var13 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
							var12 = ViewportMouse.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var3);
							TaskHandler.method1104(var12.packetBuffer, var13);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == 5010) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var6 = LoginType.method2541(var4, var3, WorldMapCacheName.clientLanguage, var5);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != 5015) {
							if (var0 == 5016) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == 5017) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class315.Messages_getHistorySize(var7);
								return 1;
							} else if (var0 == 5018) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.Messages_getLastChatID(var7);
								return 1;
							} else if (var0 == 5019) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class28.method104(var7);
								return 1;
							} else if (var0 == 5020) {
								var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
								NPC.doCheat(var3);
								return 1;
							} else if (var0 == 5021) {
								Client.field628 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == 5022) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Client.field628;
								return 1;
							} else if (var0 == 5023) {
								var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
								System.out.println(var3);
								return 1;
							} else if (var0 == 5030) {
								Interpreter.Interpreter_intStackSize -= 2;
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								var8 = class106.Messages_getByChannelAndID(var7, var4);
								if (var8 != null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.count;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.cycle;
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.sender != null ? var8.sender : "";
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.prefix != null ? var8.prefix : "";
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var8.text != null ? var8.text : "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8.isFromFriend() ? 1 : (var8.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var9 = Client.Messages_getMessage(var7);
								if (var9 != null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.type;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.cycle;
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.sender != null ? var9.sender : "";
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.prefix != null ? var9.prefix : "";
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.text != null ? var9.text : "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.isFromFriend() ? 1 : (var9.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (VarpDefinition.localPlayer != null && VarpDefinition.localPlayer.username != null) {
								var3 = VarpDefinition.localPlayer.username.getName();
							} else {
								var3 = "";
							}

							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3;
							return 1;
						}
					}
				}
			}
		}
	}
}
