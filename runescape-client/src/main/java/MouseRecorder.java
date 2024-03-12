import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("aq")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("aw")
	@Export("lock")
	Object lock;
	@ObfuscatedName("al")
	@Export("index")
	int index;
	@ObfuscatedName("ai")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ar")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("as")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

//	@Export("run")
//	@ObfuscatedName("run")
	public void run() {
		for (; this.isRunning; LoginPacket.method764(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "320985503"
	)
	static void method483() {
		GrandExchangeOfferAgeComparator.Tiles_underlays = null;
		TriBool.Tiles_overlays = null;
		class173.Tiles_shapes = null;
		class350.field3188 = null;
		Tiles.field878 = null;
		class151.Tiles_underlays2 = null;
		Tiles.field876 = null;
		Huffman.Tiles_hue = null;
		MilliClock.Tiles_saturation = null;
		ApproximateRouteStrategy.Tiles_lightness = null;
		class182.Tiles_hueMultiplier = null;
		class324.field2901 = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "684237694"
	)
	public static void method484(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method484(var0, var1, var2, var5 - 1);
			method484(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIII)V",
		garbageValue = "720381236"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class190.method968();
		SpriteMask var4 = var0.method1901(ArchiveLoader.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = VarpDefinition.localPlayer.x / 32 + 48;
				int var7 = 464 - VarpDefinition.localPlayer.y / 32;
				KeyHandler.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var9;
				int var10;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var9 = Client.mapIconXs[var8] * 4 + 2 - VarpDefinition.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - VarpDefinition.localPlayer.y / 32;
					class11.drawSpriteOnMinimap(var1, var2, var9, var10, Client.mapIcons[var8], var4);
				}

				int var12;
				int var16;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var9 = 0; var9 < 104; ++var9) {
						NodeDeque var15 = Client.groundItems[class473.Client_plane][var8][var9];
						if (var15 != null) {
							var16 = var8 * 4 + 2 - VarpDefinition.localPlayer.x / 32;
							var12 = var9 * 4 + 2 - VarpDefinition.localPlayer.y / 32;
							class11.drawSpriteOnMinimap(var1, var2, var16, var12, class246.field2076[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var14 = Client.npcs[Client.npcIndices[var8]];
					if (var14 != null && var14.isVisible()) {
						NPCComposition var18 = var14.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var16 = var14.x / 32 - VarpDefinition.localPlayer.x / 32;
							var12 = var14.y / 32 - VarpDefinition.localPlayer.y / 32;
							class11.drawSpriteOnMinimap(var1, var2, var16, var12, class246.field2076[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var11 = Client.players[var17[var10]];
					if (var11 != null && var11.isVisible() && !var11.isHidden && var11 != VarpDefinition.localPlayer) {
						var12 = var11.x / 32 - VarpDefinition.localPlayer.x / 32;
						int var13 = var11.y / 32 - VarpDefinition.localPlayer.y / 32;
						if (var11.isFriend()) {
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2076[3], var4);
						} else if (VarpDefinition.localPlayer.team != 0 && var11.team != 0 && var11.team == VarpDefinition.localPlayer.team) {
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2076[4], var4);
						} else if (var11.isFriendsChatMember()) {
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2076[5], var4);
						} else if (var11.isClanMember()) {
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2076[6], var4);
						} else {
							class11.drawSpriteOnMinimap(var1, var2, var12, var13, class246.field2076[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var16 = var19.x / 32 - VarpDefinition.localPlayer.x / 32;
							var12 = var19.y / 32 - VarpDefinition.localPlayer.y / 32;
							HttpResponse.worldToMinimap(var1, var2, var16, var12, Players.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - Projectile.baseX * 4 + 2 - VarpDefinition.localPlayer.x / 32;
						var16 = Client.hintArrowY * 4 - GameEngine.baseY * 4 + 2 - VarpDefinition.localPlayer.y / 32;
						HttpResponse.worldToMinimap(var1, var2, var10, var16, Players.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var16 = var20.x / 32 - VarpDefinition.localPlayer.x / 32;
							var12 = var20.y / 32 - VarpDefinition.localPlayer.y / 32;
							HttpResponse.worldToMinimap(var1, var2, var16, var12, Players.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - VarpDefinition.localPlayer.x / 32;
					var16 = Client.destinationY * 4 + 2 - VarpDefinition.localPlayer.y / 32;
					class11.drawSpriteOnMinimap(var1, var2, var10, var16, Players.mapDotSprites[0], var4);
				}

				if (!VarpDefinition.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field430[var3] = true;
		}
	}
}
