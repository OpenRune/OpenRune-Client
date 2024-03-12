import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field1524;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("cl")
	static String field1525;
	@ObfuscatedName("ar")
	public int field1534;
	@ObfuscatedName("az")
	@Export("int1")
	public int int1;
	@ObfuscatedName("ao")
	@Export("int2")
	public int int2;
	@ObfuscatedName("au")
	@Export("int3")
	public int int3;
	@ObfuscatedName("ak")
	public int field1531;
	@ObfuscatedName("ah")
	@Export("int5")
	public int int5;
	@ObfuscatedName("aj")
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("af")
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ax")
	@Export("width")
	public int width;
	@ObfuscatedName("an")
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1531 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-63873767"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "2094699463"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-50741515"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(field1524, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-885015404"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(field1524, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lte;I)Ljava/lang/String;",
		garbageValue = "-1625455498"
	)
	public static String method928(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var5 = var0.charAt(var2);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}
			}

			while (var3 > var2) {
				var5 = var0.charAt(var3 - 1);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}

				--var3;
			}

			int var11 = var3 - var2;
			if (var11 >= 1 && var11 <= class75.method429(var1)) {
				StringBuilder var10 = new StringBuilder(var11);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					if (ObjectSound.method418(var7)) {
						char var8;
						switch(var7) {
						case ' ':
						case '-':
						case '_':
						case ' ':
							var8 = '_';
							break;
						case '#':
						case '[':
						case ']':
							var8 = var7;
							break;
						case 'À':
						case 'Á':
						case 'Â':
						case 'Ã':
						case 'Ä':
						case 'à':
						case 'á':
						case 'â':
						case 'ã':
						case 'ä':
							var8 = 'a';
							break;
						case 'Ç':
						case 'ç':
							var8 = 'c';
							break;
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var8 = 'e';
							break;
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var8 = 'i';
							break;
						case 'Ñ':
						case 'ñ':
							var8 = 'n';
							break;
						case 'Ò':
						case 'Ó':
						case 'Ô':
						case 'Õ':
						case 'Ö':
						case 'ò':
						case 'ó':
						case 'ô':
						case 'õ':
						case 'ö':
							var8 = 'o';
							break;
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var8 = 'u';
							break;
						case 'ß':
							var8 = 'b';
							break;
						case 'ÿ':
						case 'Ÿ':
							var8 = 'y';
							break;
						default:
							var8 = Character.toLowerCase(var7);
						}

						if (var8 != 0) {
							var10.append(var8);
						}
					}
				}

				if (var10.length() == 0) {
					return null;
				} else {
					return var10.toString();
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)V",
		garbageValue = "-694290164"
	)
	static final void method932(class311 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var4;
		int var5;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (class311.field2678 == var0) {
			var2 = var1.readUnsignedShortAdd();
			byte var3 = var1.readByte();
			var4 = var1.readUnsignedShortLE();
			var5 = var1.readUnsignedShort();
			byte var6 = var1.readByteAdd();
			var7 = var1.readUnsignedByteSub();
			var8 = var7 >> 2;
			var9 = var7 & 3;
			var10 = Client.field680[var8];
			var11 = var1.readUnsignedByteAdd();
			var12 = (var11 >> 4 & 7) + JagexCache.field1885;
			var13 = (var11 & 7) + class4.field3;
			var14 = var1.readUnsignedShortLE();
			byte var15 = var1.readByteNeg();
			byte var16 = var1.readByteNeg();
			Player var17;
			if (var5 == Client.localPlayerIndex) {
				var17 = VarpDefinition.localPlayer;
			} else {
				var17 = Client.players[var5];
			}

			if (var17 != null) {
				int var18 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				class388.method2055(var18, var12, var13, var8, var9, var10, var2, var4, var14, var16, var6, var3, var15, var17);
			}
		}

		int var20;
		int var21;
		if (class311.field2677 == var0) {
			var2 = var1.readUnsignedByteAdd();
			var20 = (var2 >> 4 & 7) + JagexCache.field1885;
			var4 = (var2 & 7) + class4.field3;
			var5 = var1.readUnsignedByteAdd();
			var21 = var1.readUnsignedShortLE();
			if (var20 >= 0 && var4 >= 0 && var20 < 104 && var4 < 104) {
				var7 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				ApproximateRouteStrategy.method343(var7, var20, var4, var21, var5);
			}

		} else if (class311.field2668 == var0) {
			var2 = var1.readUnsignedByte();
			var20 = (var2 >> 4 & 7) + JagexCache.field1885;
			var4 = (var2 & 7) + class4.field3;
			var5 = var1.readUnsignedShort();
			var21 = var1.readUnsignedByte();
			var7 = var1.readUnsignedByteAdd();
			var8 = var7 >> 4 & 15;
			var9 = var7 & 7;
			if (var20 >= 0 && var4 >= 0 && var20 < 104 && var4 < 104) {
				var10 = var8 + 1;
				if (VarpDefinition.localPlayer.pathX[0] >= var20 - var10 && VarpDefinition.localPlayer.pathX[0] <= var20 + var10 && VarpDefinition.localPlayer.pathY[0] >= var4 - var10 && VarpDefinition.localPlayer.pathY[0] <= var10 + var4 && class30.clientPreferences.getAreaSoundEffectsVolume() != 0 && var9 > 0 && Client.soundEffectCount < 50) {
					Client.soundEffectIds[Client.soundEffectCount] = var5;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var21;
					Client.soundEffects[Client.soundEffectCount] = null;
					Client.soundLocations[Client.soundEffectCount] = var8 + (var4 << 8) + (var20 << 16);
					Client.field609[Client.soundEffectCount] = 0;
					++Client.soundEffectCount;
				}
			}

		} else if (class311.field2669 == var0) {
			var2 = var1.readUnsignedByte();
			var20 = var1.readUnsignedShortAddLE();
			var4 = var1.readUnsignedByte();
			var5 = var1.readUnsignedByte();
			var21 = var1.readUnsignedByteSub();
			var7 = (var21 >> 4 & 7) + JagexCache.field1885;
			var8 = (var21 & 7) + class4.field3;
			var9 = var1.readUnsignedByteSub() & 31;
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				var10 = var9 + 1;
				if (VarpDefinition.localPlayer.pathX[0] >= var7 - var10 && VarpDefinition.localPlayer.pathX[0] <= var7 + var10 && VarpDefinition.localPlayer.pathY[0] >= var8 - var10 && VarpDefinition.localPlayer.pathY[0] <= var10 + var8 && class30.clientPreferences.getAreaSoundEffectsVolume() != 0 && var4 > 0 && Client.soundEffectCount < 50) {
					Client.soundEffectIds[Client.soundEffectCount] = var20;
					Client.soundEffects[Client.soundEffectCount] = null;
					Client.soundLocations[Client.soundEffectCount] = var9 + (var8 << 8) + (var7 << 16);
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
					Client.field609[Client.soundEffectCount] = var5;
					++Client.soundEffectCount;
				}
			}

		} else if (class311.field2675 == var0) {
			var2 = var1.readUnsignedIntLE();
			var20 = var1.readUnsignedByteNeg();
			var4 = (var20 >> 4 & 7) + JagexCache.field1885;
			var5 = (var20 & 7) + class4.field3;
			var21 = var1.readUnsignedIntME();
			var7 = var1.readUnsignedShortAdd();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var8 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				GraphicsObject.method427(var8, var4, var5, var7, var21, var2);
			}

		} else if (class311.field2674 == var0) {
			var2 = var1.readUnsignedByteNeg();
			var20 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field680[var20];
			var21 = var1.readUnsignedByteNeg();
			var7 = (var21 >> 4 & 7) + JagexCache.field1885;
			var8 = (var21 & 7) + class4.field3;
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				var9 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				class91.method490(var9, var7, var8, var5, -1, var20, var4, 31, 0, -1);
			}

		} else if (class311.field2671 == var0) {
			var2 = var1.readUnsignedByteAdd();
			var20 = var1.readUnsignedShort();
			var4 = var1.readUnsignedByteAdd();
			var5 = (var4 >> 4 & 7) + JagexCache.field1885;
			var21 = (var4 & 7) + class4.field3;
			var7 = var1.readUnsignedShort();
			if (var5 >= 0 && var21 >= 0 && var5 < 104 && var21 < 104) {
				var5 = var5 * 128 + 64;
				var21 = var21 * 128 + 64;
				var8 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				GraphicsObject var19 = new GraphicsObject(var7, var8, var5, var21, class272.getTileHeight(var5, var21, var8) - var2, var20, Client.cycle);
				Client.graphicsObjects.addFirst(var19);
			}

		} else if (class311.field2672 == var0) {
			var2 = var1.readUnsignedByteSub();
			var20 = (var2 >> 4 & 7) + JagexCache.field1885;
			var4 = (var2 & 7) + class4.field3;
			var5 = var1.readUnsignedShortAdd();
			var21 = var1.readUnsignedShortAddLE();
			var7 = var1.readUnsignedByteNeg();
			var8 = var1.method2667();
			var9 = var1.readUnsignedByte() * 4;
			byte var23 = var1.readByte();
			var11 = var1.method2667();
			var12 = var1.readUnsignedByte() * 4;
			byte var25 = var1.readByteAdd();
			var14 = var1.readUnsignedShortAdd();
			int var26 = var1.readUnsignedShortAddLE();
			var13 = var25 + var20;
			var10 = var23 + var4;
			if (var20 >= 0 && var4 >= 0 && var20 < 104 && var4 < 104 && var13 >= 0 && var10 >= 0 && var13 < 104 && var10 < 104 && var26 != 65535) {
				int var27 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				SoundCache.method220(var27, var20, var4, var13, var10, var11, var26, var9, var12, var14, var21, var7, var5, var8);
			}

		} else if (class311.field2670 == var0) {
			var2 = var1.readUnsignedByteSub();
			var20 = (var2 >> 4 & 7) + JagexCache.field1885;
			var4 = (var2 & 7) + class4.field3;
			var5 = var1.readUnsignedShort();
			var21 = var1.readInt();
			if (var20 >= 0 && var4 >= 0 && var20 < 104 && var4 < 104) {
				var7 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				class360.method1948(var7, var20, var4, var5, var21);
			}

		} else if (class311.field2667 == var0) {
			var2 = var1.readUnsignedByteSub();
			var20 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedByteAdd();
			var5 = var4 >> 2;
			var21 = var4 & 3;
			var7 = Client.field680[var5];
			var8 = var1.readUnsignedByteSub();
			var9 = (var8 >> 4 & 7) + JagexCache.field1885;
			var10 = (var8 & 7) + class4.field3;
			if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
				var11 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				class91.method490(var11, var9, var10, var7, var20, var5, var21, var2, 0, -1);
			}

		} else if (class311.field2676 == var0) {
			var2 = var1.readUnsignedByteNeg();
			var20 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedByteSub();
			var5 = (var4 >> 4 & 7) + JagexCache.field1885;
			var21 = (var4 & 7) + class4.field3;
			var7 = var1.readUnsignedByteNeg();
			var8 = var1.readUnsignedShort();
			boolean var22 = var1.readUnsignedByteSub() == 1;
			var10 = var1.readUnsignedShort();
			var11 = var1.readInt();
			if (var5 >= 0 && var21 >= 0 && var5 < 104 && var21 < 104) {
				var12 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				class151.method798(var12, var5, var21, var8, var11, var2, var10, var20, var7, var22);
			}

		} else if (class311.field2673 == var0) {
			var2 = var1.readUnsignedShortLE();
			var20 = var1.readUnsignedByte();
			var4 = var20 >> 2;
			var5 = var20 & 3;
			var21 = Client.field680[var4];
			var7 = var1.readUnsignedByteSub();
			var8 = (var7 >> 4 & 7) + JagexCache.field1885;
			var9 = (var7 & 7) + class4.field3;
			if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
				var10 = Client.field482 == -1 ? class473.Client_plane * -1215891921 * 440668367 : Client.field482 * -131614477 * -136437701;
				boolean var24 = PlayerCompositionColorTextureOverride.method886(var10, var8, var9, var4, var5, var21, var2);
				if (var24) {
					return;
				}

				Fonts.method2518(var10, var8, var9, var21, var2);
			}

		}
	}
}
