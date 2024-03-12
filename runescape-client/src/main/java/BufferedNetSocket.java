import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("ae")
	@Export("osName")
	static String osName;
	@ObfuscatedName("aq")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("sink")
	BufferedSink sink;

	public BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "854871960"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1869781257"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1680246450"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIIS)I",
		garbageValue = "230"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "437315408"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("close")
	public void close() {
		this.sink.close();

		try {
			this.socket.close();
		} catch (IOException var2) {
		}

		this.source.close();
	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2019836049"
	)
	static void method2344() {
		if (Client.field438 == class93.field977) {
			class376.field3623 = ScriptFrame.newArchive(4, false, true, true, false);
			Renderable.archive6 = ScriptFrame.newArchive(6, true, true, true, false);
			class311.archive8 = ScriptFrame.newArchive(8, false, true, true, false);
			ScriptFrame.archive10 = ScriptFrame.newArchive(10, false, true, true, false);
			KeyHandler.archive13 = ScriptFrame.newArchive(13, true, false, true, false);
			class391.field3703 = ScriptFrame.newArchive(14, false, true, true, false);
			class86.field893 = ScriptFrame.newArchive(15, false, true, true, false);
			class128.method701(20, "Connecting to update server");
			WorldMapDecoration.method1371(class93.field966);
		} else {
			int var0;
			byte var39;
			if (Client.field438 == class93.field966) {
				var39 = 0;
				var0 = var39 + class376.field3623.percentage() * 53 / 100;
				var0 += Renderable.archive6.percentage() * 5 / 100;
				var0 += class311.archive8.percentage() * 36 / 100;
				var0 += ScriptFrame.archive10.percentage() / 100;
				var0 += KeyHandler.archive13.percentage() / 100;
				var0 += class391.field3703.percentage() * 3 / 100;
				var0 += class86.field893.percentage() / 100;
				if (var0 != 100) {
					if (var0 != 0) {
						class128.method701(30, "Checking for updates - " + var0 + "%");
					}

				} else {
					Login.method437(class376.field3623, "Sound FX");
					Login.method437(Renderable.archive6, "Music Tracks");
					Login.method437(class311.archive8, "Sprites");
					Login.method437(class391.field3703, "Music Samples");
					Login.method437(class86.field893, "Music Patches");
					class128.method701(40, "Loaded update list");
					WorldMapDecoration.method1371(class93.field975);
				}
			} else {
				int var2;
				Archive var29;
				if (Client.field438 == class93.field975) {
					SoundSystem.method208(22050, !Client.isLowDetail, 2);
					ArrayList var42 = new ArrayList(3);
					AuthenticationScheme.pcmPlayer1 = class228.method1181(GameEngine.taskHandler, 0, 2048);
					SceneTilePaint.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var36 = new PcmStreamMixer();
					var36.addSubStream(SceneTilePaint.pcmStreamMixer);

					for (var2 = 0; var2 < 3; ++var2) {
						MidiPcmStream var3 = new MidiPcmStream(AuthenticationScheme.pcmPlayer1);
						var3.method1709(9, 128);
						var36.addSubStream(var3);
						var42.add(var3);
					}

					AuthenticationScheme.pcmPlayer1.setStream(var36);
					var29 = class86.field893;
					Archive var34 = class391.field3703;
					Archive var4 = class376.field3623;
					class321.field2851 = var29;
					class321.field2852 = var34;
					class321.field2850 = var4;
					class321.field2846 = var42;
					class73.decimator = new Decimator(22050, PcmPlayer.field183);
					class128.method701(60, "Prepared sound engine");
					WorldMapDecoration.method1371(class93.field962);
				} else if (Client.field438 == class93.field962) {
					if (class183.field1541 == null) {
						class183.field1541 = new Fonts(class311.archive8, KeyHandler.archive13);
					}

					var0 = FontName.method2520().length;
					Client.fontsMap = class183.field1541.createMap(FontName.method2520());
					if (Client.fontsMap.size() < var0) {
						class128.method701(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var0 + "%");
					} else {
						class60.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class141.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						class166.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						class31.platformInfo = Client.field675.get();
						class128.method701(80, "Loaded fonts");
						WorldMapDecoration.method1371(class93.field979);
					}
				} else {
					int var30;
					if (Client.field438 == class93.field979) {
						var0 = class234.method1228(ScriptFrame.archive10, class311.archive8);
						var30 = MouseHandler.method160(class311.archive8);
						if (var0 < var30) {
							class128.method701(90, "Loading title screen - " + var0 * 100 / var30 + "%");
						} else {
							class128.method701(100, "Loaded title screen");
							if (WorldMapScaleHandler.field2162) {
								Interpreter.updateGameState(5);
								WorldMapDecoration.method1371(class93.field964);
							} else {
								WorldMapDecoration.method1371(class93.field969);
							}

						}
					} else if (Client.field438 == class93.field964) {
						Interpreter.updateGameState(10);
					} else if (Client.field438 == class93.field969) {
						class154.field1393 = ScriptFrame.newArchive(0, false, true, true, false);
						Client.field651 = ScriptFrame.newArchive(1, false, true, true, false);
						HttpRequestTask.archive2 = ScriptFrame.newArchive(2, true, false, true, false);
						ScriptFrame.archive4 = ScriptFrame.newArchive(3, false, true, true, false);
						JagexCache.archive9 = ScriptFrame.newArchive(5, true, true, true, false);
						class198.field1661 = ScriptFrame.newArchive(7, false, true, true, false);
						Varcs.field1172 = ScriptFrame.newArchive(9, false, true, true, false);
						WorldMapSectionType.field2096 = ScriptFrame.newArchive(11, false, true, true, false);
						WorldMapSectionType.archive12 = ScriptFrame.newArchive(12, false, true, true, false);
						SecureRandomSSLSocket.field40 = ScriptFrame.newArchive(17, true, true, true, false);
						SpotAnimationDefinition.field1631 = ScriptFrame.newArchive(18, false, true, true, false);
						PlayerCompositionColorTextureOverride.field1465 = ScriptFrame.newArchive(19, false, true, true, false);
						class362.field3234 = ScriptFrame.newArchive(20, false, true, true, false);
						class150.field1376 = ScriptFrame.newArchive(21, false, true, true, false);
						MouseHandler.field150 = class186.method943(22, false, true, true, true, true);
						class128.method701(20, "Connecting to update server");
						WorldMapDecoration.method1371(class93.field974);
					} else if (class93.field974 == Client.field438) {
						var39 = 0;
						var0 = var39 + class154.field1393.percentage() * 5 / 100;
						var0 += Client.field651.percentage() * 2 / 100;
						var0 += HttpRequestTask.archive2.percentage() / 100;
						var0 += ScriptFrame.archive4.percentage() / 100;
						var0 += JagexCache.archive9.percentage() * 10 / 100;
						var0 += class198.field1661.percentage() * 65 / 100;
						var0 += Varcs.field1172.percentage() / 100;
						var0 += WorldMapSectionType.field2096.percentage() / 100;
						var0 += WorldMapSectionType.archive12.percentage() * 6 / 100;
						var0 += PlayerCompositionColorTextureOverride.field1465.percentage() / 100;
						var0 += SpotAnimationDefinition.field1631.percentage() * 2 / 100;
						var0 += class362.field3234.percentage() * 2 / 100;
						var0 += class150.field1376.percentage() / 100;
						var0 += MouseHandler.field150.percentage() / 100;
						var0 += SecureRandomSSLSocket.field40.method1972() && SecureRandomSSLSocket.field40.isFullyLoaded() ? 1 : 0;
						if (var0 != 100) {
							if (var0 != 0) {
								class128.method701(30, "Checking for updates - " + var0 + "%");
							}

						} else {
							Login.method437(class154.field1393, "Animations");
							Login.method437(Client.field651, "Skeletons");
							Login.method437(JagexCache.archive9, "Maps");
							Login.method437(class198.field1661, "Models");
							Login.method437(WorldMapSectionType.field2096, "Music Jingles");
							Login.method437(PlayerCompositionColorTextureOverride.field1465, "World Map");
							Login.method437(SpotAnimationDefinition.field1631, "World Map Geography");
							Login.method437(class362.field3234, "World Map Ground");
							class128.field1243 = new GraphicsDefaults();
							class128.field1243.decode(SecureRandomSSLSocket.field40);
							class128.method701(30, "Loaded update list");
							WorldMapDecoration.method1371(class93.field973);
						}
					} else if (Client.field438 == class93.field973) {
						Actor.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

						for (var0 = 0; var0 < 4; ++var0) {
							Client.collisionMaps[var0] = new CollisionMap(104, 104);
						}

						KeyHandler.sceneMinimapSprite = new SpritePixels(512, 512);
						class128.method701(30, "Starting game engine...");
						WorldMapDecoration.method1371(class93.field972);
					} else if (Client.field438 == class93.field972) {
						if (!HttpRequestTask.archive2.isFullyLoaded()) {
							class128.method701(40, "Loading config - " + HttpRequestTask.archive2.loadPercent() + "%");
						} else if (!class150.field1376.isFullyLoaded()) {
							class128.method701(40, "Loading config - " + (80 + WorldMapSectionType.archive12.loadPercent() / 6) + "%");
						} else {
							ItemComposition.method1034(HttpRequestTask.archive2);
							Archive var41 = HttpRequestTask.archive2;
							FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var41;
							class417.method2195(HttpRequestTask.archive2, class198.field1661);
							Archive var35 = HttpRequestTask.archive2;
							var29 = class198.field1661;
							boolean var43 = Client.isLowDetail;
							boolean var44 = Client.field449 >= 220;
							ObjectComposition.ObjectDefinition_archive = var35;
							ObjectComposition.ObjectDefinition_modelsArchive = var29;
							ObjectComposition.ObjectDefinition_isLowDetail = var43;
							ObjectComposition.ObjectDefinition_isRev220SoundData = var44;
							Archive var37 = HttpRequestTask.archive2;
							Archive var6 = class198.field1661;
							NPCComposition.NpcDefinition_archive = var37;
							NPCComposition.field1565 = var6;
							Archive var38 = HttpRequestTask.archive2;
							StructComposition.StructDefinition_archive = var38;
							Archive var8 = HttpRequestTask.archive2;
							Archive var9 = class198.field1661;
							boolean var10 = Client.isMembersWorld;
							Font var11 = class60.fontPlain11;
							ItemComposition.ItemDefinition_archive = var8;
							ItemComposition.ItemDefinition_modelArchive = var9;
							HealthBarUpdate.ItemDefinition_inMembersWorld = var10;
							ItemComposition.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
							Decimator.ItemDefinition_fontPlain11 = var11;
							Archive var12 = HttpRequestTask.archive2;
							Archive var13 = class154.field1393;
							Archive var14 = Client.field651;
							boolean var15 = Client.field449 >= 220;
							class149.SequenceDefinition_archive = var12;
							class135.SequenceDefinition_animationsArchive = var13;
							class138.SequenceDefinition_skeletonsArchive = var14;
							SequenceDefinition.field1820 = var15;
							Archive var16 = HttpRequestTask.archive2;
							Archive var17 = class198.field1661;
							SpotAnimationDefinition.SpotAnimationDefinition_archive = var16;
							SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var17;
							WorldMapSection2.method1251(HttpRequestTask.archive2);
							Login.method434(HttpRequestTask.archive2);
							ArchiveLoader.widgetDefinition = new WidgetDefinition(ScriptFrame.archive4, class198.field1661, class311.archive8, KeyHandler.archive13, MouseHandler.field150);
							FontName.method2521(HttpRequestTask.archive2);
							DefaultsGroup.method2357(HttpRequestTask.archive2);
							PacketWriter.method646(HttpRequestTask.archive2);
							Archive var18 = HttpRequestTask.archive2;
							class36.method162(HttpRequestTask.archive2);
							HealthBarUpdate.method537(HttpRequestTask.archive2);
							class91.method487(HttpRequestTask.archive2);
							EnumComposition.field1543 = new class516(class28.field84, 54, WorldMapCacheName.clientLanguage, HttpRequestTask.archive2);
							ApproximateRouteStrategy.field359 = new class516(class28.field84, 47, WorldMapCacheName.clientLanguage, HttpRequestTask.archive2);
							ScriptFrame.varcs = new Varcs();
							Archive var19 = HttpRequestTask.archive2;
							Archive var20 = class311.archive8;
							Archive var21 = KeyHandler.archive13;
							HitSplatDefinition.HitSplatDefinition_archive = var19;
							class17.field53 = var20;
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var21;
							Archive var22 = HttpRequestTask.archive2;
							Archive var23 = class311.archive8;
							HealthBarDefinition.HealthBarDefinition_archive = var22;
							HealthBarDefinition.field1524 = var23;
							Archive var24 = HttpRequestTask.archive2;
							Archive var25 = class311.archive8;
							WorldMapElement.WorldMapElement_archive = var25;
							if (var24.isFullyLoaded()) {
								WorldMapElement.WorldMapElement_count = var24.getGroupFileCount(35);
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

								for (int var26 = 0; var26 < WorldMapElement.WorldMapElement_count; ++var26) {
									byte[] var27 = var24.takeFile(35, var26);
									WorldMapElement.WorldMapElement_cached[var26] = new WorldMapElement(var26);
									if (var27 != null) {
										WorldMapElement.WorldMapElement_cached[var26].decode(new Buffer(var27));
										WorldMapElement.WorldMapElement_cached[var26].method908();
									}
								}
							}

							class128.method701(50, "Loaded config");
							WorldMapDecoration.method1371(class93.field976);
						}
					} else if (class93.field976 == Client.field438) {
						var0 = 0;
						if (Varps.compass == null) {
							Varps.compass = FileSystem.SpriteBuffer_getSprite(class311.archive8, class128.field1243.field3952, 0);
						} else {
							++var0;
						}

						if (ItemComposition.redHintArrowSprite == null) {
							ItemComposition.redHintArrowSprite = FileSystem.SpriteBuffer_getSprite(class311.archive8, class128.field1243.field3956, 0);
						} else {
							++var0;
						}

						IndexedSprite[] var1;
						IndexedSprite[] var5;
						IndexedSprite var7;
						int var31;
						int var33;
						if (AbstractSocket.mapSceneSprites == null) {
							var29 = class311.archive8;
							var31 = class128.field1243.field3950;
							if (!class130.method720(var29, var31, 0)) {
								var1 = null;
							} else {
								var5 = new IndexedSprite[class548.SpriteBuffer_spriteCount];

								for (var33 = 0; var33 < class548.SpriteBuffer_spriteCount; ++var33) {
									var7 = var5[var33] = new IndexedSprite();
									var7.width = class548.SpriteBuffer_spriteWidth;
									var7.height = class548.SpriteBuffer_spriteHeight;
									var7.xOffset = class548.SpriteBuffer_xOffsets[var33];
									var7.yOffset = class548.SpriteBuffer_yOffsets[var33];
									var7.subWidth = class235.SpriteBuffer_spriteWidths[var33];
									var7.subHeight = class548.SpriteBuffer_spriteHeights[var33];
									var7.palette = AbstractSocket.SpriteBuffer_spritePalette;
									var7.pixels = class548.SpriteBuffer_pixels[var33];
								}

								class548.SpriteBuffer_xOffsets = null;
								class548.SpriteBuffer_yOffsets = null;
								class235.SpriteBuffer_spriteWidths = null;
								class548.SpriteBuffer_spriteHeights = null;
								AbstractSocket.SpriteBuffer_spritePalette = null;
								class548.SpriteBuffer_pixels = null;
								var1 = var5;
							}

							AbstractSocket.mapSceneSprites = var1;
						} else {
							++var0;
						}

						if (class13.headIconPkSprites == null) {
							class13.headIconPkSprites = class138.method750(class311.archive8, class128.field1243.field3948, 0);
						} else {
							++var0;
						}

						if (class168.headIconPrayerSprites == null) {
							class168.headIconPrayerSprites = class138.method750(class311.archive8, class128.field1243.field3953, 0);
						} else {
							++var0;
						}

						if (ChatChannel.headIconHintSprites == null) {
							ChatChannel.headIconHintSprites = class138.method750(class311.archive8, class128.field1243.field3954, 0);
						} else {
							++var0;
						}

						if (Players.mapDotSprites == null) {
							Players.mapDotSprites = class138.method750(class311.archive8, class128.field1243.field3947, 0);
						} else {
							++var0;
						}

						if (GrandExchangeOfferOwnWorldComparator.crossSprites == null) {
							GrandExchangeOfferOwnWorldComparator.crossSprites = class138.method750(class311.archive8, class128.field1243.field3957, 0);
						} else {
							++var0;
						}

						if (class246.field2076 == null) {
							class246.field2076 = class138.method750(class311.archive8, class128.field1243.field3951, 0);
						} else {
							++var0;
						}

						if (ClanChannelMember.scrollBarSprites == null) {
							var29 = class311.archive8;
							var31 = class128.field1243.field3955;
							if (!class130.method720(var29, var31, 0)) {
								var1 = null;
							} else {
								var5 = new IndexedSprite[class548.SpriteBuffer_spriteCount];

								for (var33 = 0; var33 < class548.SpriteBuffer_spriteCount; ++var33) {
									var7 = var5[var33] = new IndexedSprite();
									var7.width = class548.SpriteBuffer_spriteWidth;
									var7.height = class548.SpriteBuffer_spriteHeight;
									var7.xOffset = class548.SpriteBuffer_xOffsets[var33];
									var7.yOffset = class548.SpriteBuffer_yOffsets[var33];
									var7.subWidth = class235.SpriteBuffer_spriteWidths[var33];
									var7.subHeight = class548.SpriteBuffer_spriteHeights[var33];
									var7.palette = AbstractSocket.SpriteBuffer_spritePalette;
									var7.pixels = class548.SpriteBuffer_pixels[var33];
								}

								class548.SpriteBuffer_xOffsets = null;
								class548.SpriteBuffer_yOffsets = null;
								class235.SpriteBuffer_spriteWidths = null;
								class548.SpriteBuffer_spriteHeights = null;
								AbstractSocket.SpriteBuffer_spritePalette = null;
								class548.SpriteBuffer_pixels = null;
								var1 = var5;
							}

							ClanChannelMember.scrollBarSprites = var1;
						} else {
							++var0;
						}

						if (WorldMapCacheName.field2156 == null) {
							var29 = class311.archive8;
							var31 = class128.field1243.field3949;
							if (!class130.method720(var29, var31, 0)) {
								var1 = null;
							} else {
								var5 = new IndexedSprite[class548.SpriteBuffer_spriteCount];

								for (var33 = 0; var33 < class548.SpriteBuffer_spriteCount; ++var33) {
									var7 = var5[var33] = new IndexedSprite();
									var7.width = class548.SpriteBuffer_spriteWidth;
									var7.height = class548.SpriteBuffer_spriteHeight;
									var7.xOffset = class548.SpriteBuffer_xOffsets[var33];
									var7.yOffset = class548.SpriteBuffer_yOffsets[var33];
									var7.subWidth = class235.SpriteBuffer_spriteWidths[var33];
									var7.subHeight = class548.SpriteBuffer_spriteHeights[var33];
									var7.palette = AbstractSocket.SpriteBuffer_spritePalette;
									var7.pixels = class548.SpriteBuffer_pixels[var33];
								}

								class548.SpriteBuffer_xOffsets = null;
								class548.SpriteBuffer_yOffsets = null;
								class235.SpriteBuffer_spriteWidths = null;
								class548.SpriteBuffer_spriteHeights = null;
								AbstractSocket.SpriteBuffer_spritePalette = null;
								class548.SpriteBuffer_pixels = null;
								var1 = var5;
							}

							WorldMapCacheName.field2156 = var1;
						} else {
							++var0;
						}

						if (var0 < 11) {
							class128.method701(70, "Loading sprites - " + var0 * 100 / 12 + "%");
						} else {
							AbstractFont.AbstractFont_modIconSprites = WorldMapCacheName.field2156;
							ItemComposition.redHintArrowSprite.normalize();
							var30 = (int)(Math.random() * 21.0D) - 10;
							var2 = (int)(Math.random() * 21.0D) - 10;
							var31 = (int)(Math.random() * 21.0D) - 10;
							int var32 = (int)(Math.random() * 41.0D) - 20;
							AbstractSocket.mapSceneSprites[0].shiftColors(var32 + var30, var2 + var32, var31 + var32);
							class128.method701(60, "Loaded sprites");
							WorldMapDecoration.method1371(class93.field968);
						}
					} else if (Client.field438 == class93.field968) {
						if (!Varcs.field1172.isFullyLoaded()) {
							class128.method701(70, "Loading textures - " + "0%");
						} else {
							class159.textureProvider = new TextureProvider(Varcs.field1172, class311.archive8, 20, class30.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
							Rasterizer3D.method1453(class159.textureProvider);
							Rasterizer3D.method1454(class30.clientPreferences.getBrightness());
							WorldMapDecoration.method1371(class93.field965);
						}
					} else if (Client.field438 == class93.field965) {
						var0 = class159.textureProvider.getLoadedPercentage();
						if (var0 < 100) {
							class128.method701(80, "Loading textures - " + var0 + "%");
						} else {
							class128.method701(90, "Loaded textures");
							WorldMapDecoration.method1371(class93.field967);
						}
					} else if (class93.field967 == Client.field438) {
						ByteArrayPool.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(ByteArrayPool.mouseRecorder, 10);
						class128.method701(92, "Loaded input handler");
						WorldMapDecoration.method1371(class93.field963);
					} else if (Client.field438 == class93.field963) {
						if (!ScriptFrame.archive10.tryLoadFileByNames("huffman", "")) {
							class128.method701(94, "Loading wordpack - " + 0 + "%");
						} else {
							Huffman var40 = new Huffman(ScriptFrame.archive10.takeFileByNames("huffman", ""));
							class405.huffman = var40;
							class128.method701(94, "Loaded wordpack");
							WorldMapDecoration.method1371(class93.field978);
						}
					} else if (class93.field978 == Client.field438) {
						if (!ScriptFrame.archive4.isFullyLoaded()) {
							class128.method701(96, "Loading interfaces - " + ScriptFrame.archive4.loadPercent() * 4 / 5 + "%");
						} else if (!MouseHandler.field150.isFullyLoaded()) {
							class128.method701(96, "Loading interfaces - " + MouseHandler.field150.loadPercent() * 4 / 5 + "%");
						} else if (!WorldMapSectionType.archive12.isFullyLoaded()) {
							class128.method701(96, "Loading interfaces - " + (80 + WorldMapSectionType.archive12.loadPercent() / 6) + "%");
						} else if (!KeyHandler.archive13.isFullyLoaded()) {
							class128.method701(96, "Loading interfaces - " + (96 + KeyHandler.archive13.loadPercent() / 50) + "%");
						} else {
							class128.method701(98, "Loaded interfaces");
							if (WorldMapSectionType.archive12.isValidFileName("version.dat", "")) {
								Buffer var28 = new Buffer(WorldMapSectionType.archive12.takeFileByNames("version.dat", ""));
								var28.readUnsignedShort();
							}

							WorldMapDecoration.method1371(class93.field971);
						}
					} else if (Client.field438 == class93.field971) {
						if (PlayerCompositionColorTextureOverride.field1465.getGroupCount() > 0 && !PlayerCompositionColorTextureOverride.field1465.tryLoadGroupByName(WorldMapCacheName.field2151.name)) {
							class128.method701(100, "Loading world map - " + PlayerCompositionColorTextureOverride.field1465.groupLoadPercentByName(WorldMapCacheName.field2151.name) / 10 + "%");
						} else {
							if (Tiles.worldMap == null) {
								Tiles.worldMap = new WorldMap();
								Tiles.worldMap.init(PlayerCompositionColorTextureOverride.field1465, SpotAnimationDefinition.field1631, class362.field3234, class166.fontBold12, Client.fontsMap, AbstractSocket.mapSceneSprites);
							}

							class128.method701(100, "Loaded world map");
							if (WorldMapScaleHandler.field2162) {
								WorldMapDecoration.method1371(class93.field970);
							} else {
								WorldMapDecoration.method1371(class93.field964);
							}

							Client.field399 = false;
						}
					} else {
						if (class93.field970 == Client.field438) {
							VarbitComposition.field1654 = false;
							Interpreter.updateGameState(20);
							class407.method2107(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
						}

					}
				}
			}
		}
	}
}
