import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("ao")
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("af")
	@Export("id")
	int id;
	@ObfuscatedName("ax")
	@Export("model")
	int model;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("am")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ad")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("at")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ay")
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ae")
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("ac")
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ab")
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("av")
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("ap")
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bd")
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bi")
	@Export("price")
	public int price;
	@ObfuscatedName("bq")
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("ba")
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bt")
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bk")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bm")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bw")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("by")
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bb")
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bn")
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("br")
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bp")
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bf")
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bg")
	int field1763;
	@ObfuscatedName("be")
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bc")
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bz")
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bh")
	int field1764;
	@ObfuscatedName("bs")
	int field1769;
	@ObfuscatedName("bj")
	int field1765;
	@ObfuscatedName("bl")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bx")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cs")
	@Export("note")
	public int note;
	@ObfuscatedName("ch")
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("co")
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cd")
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cg")
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cn")
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("cz")
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("ci")
	@Export("team")
	public int team;
	@ObfuscatedName("cl")
	public int field1796;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cx")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cw")
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cy")
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cu")
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("ce")
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		this.name = "null";
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.offsetX2d = 0;
		this.offsetY2d = 0;
		this.isStackable = 0;
		this.price = 1;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleModel2 = -1;
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
		this.inventoryActions = new String[]{null, null, null, null, "Drop"};
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field1763 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field1764 = -1;
		this.field1769 = -1;
		this.field1765 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field1796 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-649799587"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field1796 = 0;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1893249645"
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
		descriptor = "(Luq;II)V",
		garbageValue = "1652121078"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) {
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.readInt();
		} else if (var2 == 13) {
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) {
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.maleHeadModel = var1.readUnsignedShort();
			this.field1763 = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) {
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 42) {
				this.shiftClickIndex = var1.readByte();
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 75) {
				this.field1796 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field1769 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field1764 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field1765 = var1.readUnsignedShort();
			} else if (var2 == 94) {
				var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort();
				this.countco[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) {
				this.ambient = var1.readByte();
			} else if (var2 == 114) {
				this.contrast = var1.readByte() * 5;
			} else if (var2 == 115) {
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) {
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = class324.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhb;Lhb;I)V",
		garbageValue = "-46950701"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhb;Lhb;B)V",
		garbageValue = "-37"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var2.recolorFrom;
		this.recolorTo = var2.recolorTo;
		this.retextureFrom = var2.retextureFrom;
		this.retextureTo = var2.retextureTo;
		this.name = var2.name;
		this.isMembersOnly = var2.isMembersOnly;
		this.isStackable = var2.isStackable;
		this.maleModel = var2.maleModel;
		this.maleModel1 = var2.maleModel1;
		this.maleModel2 = var2.maleModel2;
		this.femaleModel = var2.femaleModel;
		this.femaleModel1 = var2.femaleModel1;
		this.femaleModel2 = var2.femaleModel2;
		this.maleHeadModel = var2.maleHeadModel;
		this.maleHeadModel2 = var2.maleHeadModel2;
		this.femaleHeadModel = var2.femaleHeadModel;
		this.femaleHeadModel2 = var2.femaleHeadModel2;
		this.field1764 = var2.field1764;
		this.field1769 = var2.field1769;
		this.field1765 = var2.field1765;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field1796 = var2.field1796;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		this.price = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lhb;Lhb;I)V",
		garbageValue = "-1911210382"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.isStackable = var1.isStackable;
		this.name = var2.name;
		this.price = 0;
		this.isMembersOnly = false;
		this.isTradable = false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lkf;",
		garbageValue = "-294923025"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return ArchiveDiskActionHandler.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lkz;",
		garbageValue = "-2054922799"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return ArchiveDiskActionHandler.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var5 != null) {
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
			if (var6 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				var5 = var6.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var5.isSingleTile = true;
				ItemDefinition_cachedModels.put(var5, (long)this.id);
				return var5;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhb;",
		garbageValue = "1398519870"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return ArchiveDiskActionHandler.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "227209011"
	)
	public final boolean method1045(int var1) {
		int var2 = this.femaleModel;
		int var3 = this.femaleModel1;
		int var4 = this.femaleModel2;
		if (var1 == 1) {
			var2 = this.maleHeadModel;
			var3 = this.maleHeadModel2;
			var4 = this.femaleHeadModel;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var5 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lkf;",
		garbageValue = "-2134659808"
	)
	public final ModelData method1046(int var1) {
		int var2 = this.femaleModel;
		int var3 = this.femaleModel1;
		int var4 = this.femaleModel2;
		if (var1 == 1) {
			var2 = this.maleHeadModel;
			var3 = this.maleHeadModel2;
			var4 = this.femaleHeadModel;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				if (var4 != -1) {
					ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
					ModelData[] var8 = new ModelData[]{var5, var6, var7};
					var5 = new ModelData(var8, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6};
					var5 = new ModelData(var10, 2);
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) {
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field1763 != 0) {
				var5.changeOffset(0, this.field1763, 0);
			}

			int var9;
			if (this.recolorFrom != null) {
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
				}
			}

			if (this.retextureFrom != null) {
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-939245100"
	)
	public final boolean method1047(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field1764;
		if (var1 == 1) {
			var2 = this.field1769;
			var3 = this.field1765;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var4 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
				var4 = false;
			}

			if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var4 = false;
			}

			return var4;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lkf;",
		garbageValue = "1217792188"
	)
	public final ModelData method1048(int var1) {
		int var2 = this.femaleHeadModel2;
		int var3 = this.field1764;
		if (var1 == 1) {
			var2 = this.field1769;
			var3 = this.field1765;
		}

		if (var2 == -1) {
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
			if (var3 != -1) {
				ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
				ModelData[] var6 = new ModelData[]{var4, var5};
				var4 = new ModelData(var6, 2);
			}

			int var7;
			if (this.recolorFrom != null) {
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
				}
			}

			if (this.retextureFrom != null) {
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1575903710"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-528685286"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex * -1983492725 * 2088956451 : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	boolean method1052() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "649898718"
	)
	boolean method1053() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "1190985814"
	)
	public static void method1034(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILkq;Liz;I)V",
		garbageValue = "255747182"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class127.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var11][var14] + var15[var11][var13] + var15[var12][var13] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = AsyncHttpResponse.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				WorldMapScaleHandler.createObjectSound(var0, var1, var2, var8, var4);
			}

			Object var22;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var22 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var22 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var22, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var31;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var22 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var22 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.method1512(var0, var1, var2, var16, 1, 1, (Renderable)var22, 0, var19, var21);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = Tiles.field878[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var22 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var22 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, Tiles.field882[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								class151.Tiles_underlays2[var0][var1][var2] = 50;
								class151.Tiles_underlays2[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Tiles.field878[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								class151.Tiles_underlays2[var0][var1][var2 + 1] = 50;
								class151.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Tiles.field878[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								class151.Tiles_underlays2[var0][var1 + 1][var2] = 50;
								class151.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Tiles.field878[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								class151.Tiles_underlays2[var0][var1][var2] = 50;
								class151.Tiles_underlays2[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Tiles.field878[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method1194(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method1518(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var22 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var22 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, Tiles.field884[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								class151.Tiles_underlays2[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class151.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class151.Tiles_underlays2[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class151.Tiles_underlays2[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method1194(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var28;
						if (var5 == 2) {
							var28 = var4 + 1 & 3;
							Object var23;
							Object var24;
							if (var8.animationId == -1 && var8.transforms == null) {
								var23 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
								var24 = var8.getEntity(2, var28, var15, var17, var16, var18);
							} else {
								var23 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								var24 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var23, (Renderable)var24, Tiles.field882[var4], Tiles.field882[var28], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = Tiles.field878[var0][var1];
									var10000[var2] |= 585;
									var10000 = Tiles.field878[var0][var1];
									var10000[1 + var2] |= 1170;
								} else if (var4 == 1) {
									var10000 = Tiles.field878[var0][var1];
									var10000[1 + var2] |= 1170;
									var10000 = Tiles.field878[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = Tiles.field878[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = Tiles.field878[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = Tiles.field878[var0][var1];
									var10000[var2] |= 1170;
									var10000 = Tiles.field878[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method1194(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method1518(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var22 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var22 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, Tiles.field884[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									class151.Tiles_underlays2[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class151.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class151.Tiles_underlays2[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class151.Tiles_underlays2[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method1194(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var22 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var22 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.method1512(var0, var1, var2, var16, 1, 1, (Renderable)var22, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method1518(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var22 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var22 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, Tiles.field882[var4], 0, 0, 0, var19, var21);
						} else {
							Object var25;
							long var29;
							if (var5 == 5) {
								var28 = 16;
								var29 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var29) {
									var28 = class127.getObjectDefinition(Message.Entity_unpackID(var29)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field882[var4], 0, var28 * Tiles.field885[var4], var28 * Tiles.field883[var4], var19, var21);
							} else if (var5 == 6) {
								var28 = 8;
								var29 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var29 != 0L) {
									var28 = class127.getObjectDefinition(Message.Entity_unpackID(var29)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field881[var4], var28 * Tiles.field880[var4], var19, var21);
							} else if (var5 == 7) {
								var31 = var4 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var22 = var8.getEntity(4, var31 + 4, var15, var17, var16, var18);
								} else {
									var22 = new DynamicObject(var3, 4, var31 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var22, (Renderable)null, 256, var31, 0, 0, var19, var21);
							} else if (var5 == 8) {
								var28 = 8;
								var29 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var29 != 0L) {
									var28 = class127.getObjectDefinition(Message.Entity_unpackID(var29)).int2 / 2;
								}

								int var27 = var4 + 2 & 3;
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field881[var4], var28 * Tiles.field880[var4], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var22 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var22 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var22 != null && var6.method1512(var0, var1, var2, var16, var9, var10, (Renderable)var22, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var31 = 15;
						if (var22 instanceof Model) {
							var31 = ((Model)var22).method1586() / 4;
							if (var31 > 30) {
								var31 = 30;
							}
						}

						for (int var32 = 0; var32 <= var9; ++var32) {
							for (int var33 = 0; var33 <= var10; ++var33) {
								if (var31 > class151.Tiles_underlays2[var0][var32 + var1][var33 + var2]) {
									class151.Tiles_underlays2[var0][var32 + var1][var33 + var2] = (byte)var31;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}
}
