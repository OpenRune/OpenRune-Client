import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("World")
public class World {
	@ObfuscatedName("as")
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("aa")
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("az")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ao")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ak")
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@Export("properties")
	int properties;
	@ObfuscatedName("aj")
	@Export("population")
	int population;
	@ObfuscatedName("af")
	@Export("host")
	String host;
	@ObfuscatedName("ax")
	@Export("activity")
	String activity;
	@ObfuscatedName("an")
	@Export("location")
	int location;
	@ObfuscatedName("ag")
	@Export("index")
	int index;
	@ObfuscatedName("am")
	String field709;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-103"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class529.field4227.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-92"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class529.field4221.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	boolean method393() {
		return (class529.field4228.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1754226121"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class529.field4224.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1235435531"
	)
	boolean method395() {
		return (class529.field4222.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1039182462"
	)
	boolean method396() {
		return (class529.field4229.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-239511272"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class529.field4226.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
	)
	boolean method398() {
		return (class529.field4231.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-325415547"
	)
	boolean method399() {
		return (class529.field4225.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "29712"
	)
	boolean method400() {
		return (class529.field4230.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILkq;Liz;I)V",
		garbageValue = "-2055164667"
	)
	static final void method401(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap var9) {
		ObjectComposition var10 = class127.getObjectDefinition(var4);
		int var11 = var7 >= 0 ? var7 : var10.animationId * -1635606557 * -121659957;
		int var12;
		int var13;
		if (var5 != 1 && var5 != 3) {
			var12 = var10.sizeX;
			var13 = var10.sizeY;
		} else {
			var12 = var10.sizeY;
			var13 = var10.sizeX;
		}

		int var14;
		int var15;
		if (var12 + var2 <= 104) {
			var14 = (var12 >> 1) + var2;
			var15 = var2 + (var12 + 1 >> 1);
		} else {
			var14 = var2;
			var15 = var2 + 1;
		}

		int var16;
		int var17;
		if (var3 + var13 <= 104) {
			var16 = var3 + (var13 >> 1);
			var17 = var3 + (var13 + 1 >> 1);
		} else {
			var16 = var3;
			var17 = var3 + 1;
		}

		int[][] var18 = Tiles.Tiles_heights[var1];
		int var19 = var18[var15][var16] + var18[var14][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
		int var20 = (var2 << 7) + (var12 << 6);
		int var21 = (var3 << 7) + (var13 << 6);
		long var22 = AsyncHttpResponse.calculateTag(var2, var3, 2, var10.int1 == 0, var4);
		int var24 = (var5 << 6) + var6;
		if (var10.int3 == 1) {
			var24 += 256;
		}

		Object var25;
		if (var6 == 22) {
			if (var11 == -1 && var10.transforms == null) {
				var25 = var10.getModel(22, var5, var18, var20, var19, var21);
			} else {
				var25 = new DynamicObject(var4, 22, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
			}

			var8.newFloorDecoration(var0, var2, var3, var19, (Renderable)var25, var22, var24);
			if (var10.interactType == 1) {
				var9.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) {
			if (var6 >= 12) {
				if (var11 == -1 && var10.transforms == null) {
					var25 = var10.getModel(var6, var5, var18, var20, var19, var21);
				} else {
					var25 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
				}

				var8.method1512(var0, var2, var3, var19, 1, 1, (Renderable)var25, 0, var22, var24);
				if (var10.interactType != 0) {
					var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
				}

			} else if (var6 == 0) {
				if (var11 == -1 && var10.transforms == null) {
					var25 = var10.getModel(0, var5, var18, var20, var19, var21);
				} else {
					var25 = new DynamicObject(var4, 0, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
				}

				var8.newBoundaryObject(var0, var2, var3, var19, (Renderable)var25, (Renderable)null, Tiles.field882[var5], 0, var22, var24);
				if (var10.interactType != 0) {
					var9.method1194(var2, var3, var6, var5, var10.boolean1);
				}

			} else if (var6 == 1) {
				if (var11 == -1 && var10.transforms == null) {
					var25 = var10.getModel(1, var5, var18, var20, var19, var21);
				} else {
					var25 = new DynamicObject(var4, 1, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
				}

				var8.newBoundaryObject(var0, var2, var3, var19, (Renderable)var25, (Renderable)null, Tiles.field884[var5], 0, var22, var24);
				if (var10.interactType != 0) {
					var9.method1194(var2, var3, var6, var5, var10.boolean1);
				}

			} else {
				int var31;
				if (var6 == 2) {
					var31 = var5 + 1 & 3;
					Object var26;
					Object var27;
					if (var11 == -1 && var10.transforms == null) {
						var26 = var10.getModel(2, var5 + 4, var18, var20, var19, var21);
						var27 = var10.getModel(2, var31, var18, var20, var19, var21);
					} else {
						var26 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						var27 = new DynamicObject(var4, 2, var31, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
					}

					var8.newBoundaryObject(var0, var2, var3, var19, (Renderable)var26, (Renderable)var27, Tiles.field882[var5], Tiles.field882[var31], var22, var24);
					if (var10.interactType != 0) {
						var9.method1194(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 3) {
					if (var11 == -1 && var10.transforms == null) {
						var25 = var10.getModel(3, var5, var18, var20, var19, var21);
					} else {
						var25 = new DynamicObject(var4, 3, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
					}

					var8.newBoundaryObject(var0, var2, var3, var19, (Renderable)var25, (Renderable)null, Tiles.field884[var5], 0, var22, var24);
					if (var10.interactType != 0) {
						var9.method1194(var2, var3, var6, var5, var10.boolean1);
					}

				} else if (var6 == 9) {
					if (var11 == -1 && var10.transforms == null) {
						var25 = var10.getModel(var6, var5, var18, var20, var19, var21);
					} else {
						var25 = new DynamicObject(var4, var6, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
					}

					var8.method1512(var0, var2, var3, var19, 1, 1, (Renderable)var25, 0, var22, var24);
					if (var10.interactType != 0) {
						var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
					}

				} else if (var6 == 4) {
					if (var11 == -1 && var10.transforms == null) {
						var25 = var10.getModel(4, var5, var18, var20, var19, var21);
					} else {
						var25 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
					}

					var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var25, (Renderable)null, Tiles.field882[var5], 0, 0, 0, var22, var24);
				} else {
					Object var28;
					long var32;
					if (var6 == 5) {
						var31 = 16;
						var32 = var8.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var32) {
							var31 = class127.getObjectDefinition(Message.Entity_unpackID(var32)).int2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var28 = var10.getModel(4, var5, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						}

						var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, Tiles.field882[var5], 0, var31 * Tiles.field885[var5], var31 * Tiles.field883[var5], var22, var24);
					} else if (var6 == 6) {
						var31 = 8;
						var32 = var8.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var32) {
							var31 = class127.getObjectDefinition(Message.Entity_unpackID(var32)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						}

						var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var28, (Renderable)null, 256, var5, var31 * Tiles.field881[var5], var31 * Tiles.field880[var5], var22, var24);
					} else if (var6 == 7) {
						int var34 = var5 + 2 & 3;
						if (var11 == -1 && var10.transforms == null) {
							var25 = var10.getModel(4, var34 + 4, var18, var20, var19, var21);
						} else {
							var25 = new DynamicObject(var4, 4, var34 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						}

						var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var25, (Renderable)null, 256, var34, 0, 0, var22, var24);
					} else if (var6 == 8) {
						var31 = 8;
						var32 = var8.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var32) {
							var31 = class127.getObjectDefinition(Message.Entity_unpackID(var32)).int2 / 2;
						}

						int var30 = var5 + 2 & 3;
						Object var29;
						if (var11 == -1 && var10.transforms == null) {
							var28 = var10.getModel(4, var5 + 4, var18, var20, var19, var21);
							var29 = var10.getModel(4, var30 + 4, var18, var20, var19, var21);
						} else {
							var28 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
							var29 = new DynamicObject(var4, 4, var30 + 4, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
						}

						var8.newWallDecoration(var0, var2, var3, var19, (Renderable)var28, (Renderable)var29, 256, var5, var31 * Tiles.field881[var5], var31 * Tiles.field880[var5], var22, var24);
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) {
				var25 = var10.getModel(10, var5, var18, var20, var19, var21);
			} else {
				var25 = new DynamicObject(var4, 10, var5, var1, var2, var3, var11, var10.boolean3, (Renderable)null);
			}

			if (var25 != null) {
				var8.method1512(var0, var2, var3, var19, var12, var13, (Renderable)var25, var6 == 11 ? 256 : 0, var22, var24);
			}

			if (var10.interactType != 0) {
				var9.addGameObject(var2, var3, var12, var13, var10.boolean1);
			}

		}
	}
}
