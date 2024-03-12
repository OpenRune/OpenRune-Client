import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("aq")
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ak")
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lla;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("aj")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("af")
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ax")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("an")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ag")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("am")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ad")
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("at")
	int field2256;
	@ObfuscatedName("ay")
	int field2259;
	@ObfuscatedName("ae")
	int field2250;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FB)F",
		garbageValue = "2"
	)
	static float method1451(class132 var0, float var1) {
		if (var0 != null && var0.method733() != 0) {
			if (var1 < (float)var0.field1277[0].field1236) {
				return var0.field1279 == class130.field1263 ? var0.field1277[0].field1235 : class297.method1654(var0, var1, true);
			} else if (var1 > (float)var0.field1277[var0.method733() - 1].field1236) {
				return var0.field1278 == class130.field1263 ? var0.field1277[var0.method733() - 1].field1235 : class297.method1654(var0, var1, false);
			} else if (var0.field1276) {
				return var0.field1277[0].field1235;
			} else {
				class127 var2 = var0.method732(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1233 == 0.0D && 0.0D == (double)var2.field1234) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1233 && Float.MAX_VALUE == var2.field1234) {
						var4 = true;
					} else if (var2.field1230 != null) {
						if (var0.field1273) {
							var5 = (float)var2.field1236;
							float var9 = var2.field1235;
							var6 = var2.field1233 * 0.33333334F + var5;
							float var10 = var2.field1234 * 0.33333334F + var9;
							float var8 = (float)var2.field1230.field1236;
							float var12 = var2.field1230.field1235;
							var7 = var8 - var2.field1230.field1232 * 0.33333334F;
							float var11 = var12 - var2.field1230.field1231 * 0.33333334F;
							if (var0.field1274) {
								float var15 = var10;
								float var16 = var11;
								if (var0 != null) {
									float var17 = var8 - var5;
									if ((double)var17 != 0.0D) {
										float var18 = var6 - var5;
										float var19 = var7 - var5;
										float[] var20 = new float[]{var18 / var17, var19 / var17};
										var0.field1275 = 0.33333334F == var20[0] && 0.6666667F == var20[1];
										float var21 = var20[0];
										float var22 = var20[1];
										if ((double)var20[0] < 0.0D) {
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) {
											var20[1] = 1.0F;
										}

										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) {
											var20[1] = 1.0F - var20[1];
											if (var20[0] < 0.0F) {
												var20[0] = 0.0F;
											}

											if (var20[1] < 0.0F) {
												var20[1] = 0.0F;
											}

											if (var20[0] > 1.0F || var20[1] > 1.0F) {
												float var23 = (float)((double)var20[1] * ((double)var20[1] - 2.0D) + (double)((var20[0] - 2.0F + var20[1]) * var20[0]) + 1.0D);
												if (class128.field1237 + var23 > 0.0F) {
													if (var20[0] + class128.field1237 < 1.3333334F) {
														float var24 = var20[0] - 2.0F;
														float var25 = var20[0] - 1.0F;
														float var26 = (float)Math.sqrt((double)(var24 * var24 - var25 * var25 * 4.0F));
														float var27 = (var26 + -var24) * 0.5F;
														if (class128.field1237 + var20[1] > var27) {
															var20[1] = var27 - class128.field1237;
														} else {
															var27 = (-var24 - var26) * 0.5F;
															if (var20[1] < var27 + class128.field1237) {
																var20[1] = class128.field1237 + var27;
															}
														}
													} else {
														var20[0] = 1.3333334F - class128.field1237;
														var20[1] = 0.33333334F - class128.field1237;
													}
												}
											}

											var20[1] = 1.0F - var20[1];
										}

										if (var21 != var20[0]) {
											float var13 = var17 * var20[0] + var5;
											if (0.0D != (double)var21) {
												var15 = var9 + var20[0] * (var10 - var9) / var21;
											}
										}

										if (var22 != var20[1]) {
											float var14 = var20[1] * var17 + var5;
											if ((double)var22 != 1.0D) {
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var20[1]) / (1.0D - (double)var22));
											}
										}

										var0.field1280 = var5;
										var0.field1291 = var8;
										HttpMethod.method26(0.0F, var20[0], var20[1], 1.0F, var0);
										class93.method511(var9, var15, var16, var12, var0);
									}
								}
							} else {
								LoginPacket.method768(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.field1273 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1235;
					} else if (var4) {
						return (float)var2.field1236 != var1 && var2.field1230 != null ? var2.field1230.field1235 : var2.field1235;
					} else if (var0.field1274) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var0.field1280 == var1) {
								var6 = 0.0F;
							} else if (var1 == var0.field1291) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1280) / (var0.field1291 - var0.field1280);
							}

							if (var0.field1275) {
								var7 = var6;
							} else {
								class128.field1240[3] = var0.field1284;
								class128.field1240[2] = var0.field1286;
								class128.field1240[1] = var0.field1289;
								class128.field1240[0] = var0.field1288 - var6;
								class128.field1239[0] = 0.0F;
								class128.field1239[1] = 0.0F;
								class128.field1239[2] = 0.0F;
								class128.field1239[3] = 0.0F;
								class128.field1239[4] = 0.0F;
								int var28 = class148.method783(class128.field1240, 3, 0.0F, true, 1.0F, true, class128.field1239);
								if (var28 == 1) {
									var7 = class128.field1239[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = var0.field1285 + var7 * (var0.field1283 + var7 * (var0.field1290 + var0.field1287 * var7));
						}

						return var5;
					} else {
						return ArchiveLoader.method470(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
