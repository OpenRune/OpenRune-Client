import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field1565;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("as")
	@Export("id")
	public int id;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("az")
	@Export("size")
	public int size;
	@ObfuscatedName("ao")
	@Export("models")
	int[] models;
	@ObfuscatedName("au")
	int[] field1576;
	@ObfuscatedName("ak")
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ah")
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("aj")
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("af")
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ax")
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("an")
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ag")
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("am")
	public int field1597;
	@ObfuscatedName("ad")
	public int field1590;
	@ObfuscatedName("at")
	public int field1600;
	@ObfuscatedName("ay")
	public int field1603;
	@ObfuscatedName("ae")
	public int field1591;
	@ObfuscatedName("ac")
	public int field1589;
	@ObfuscatedName("ab")
	public int field1588;
	@ObfuscatedName("av")
	public int field1601;
	@ObfuscatedName("ap")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bu")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bo")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bd")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bi")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bq")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("ba")
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bt")
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bk")
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bm")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bw")
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bv")
	@Export("contrast")
	int contrast;
	@ObfuscatedName("by")
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bb")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bn")
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("br")
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bp")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bf")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bg")
	public boolean field1584;
	@ObfuscatedName("be")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bc")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bz")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.field1597 = -1;
		this.field1590 = -1;
		this.field1600 = -1;
		this.field1603 = -1;
		this.field1591 = -1;
		this.field1589 = -1;
		this.field1588 = -1;
		this.field1601 = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClipped = true;
		this.field1584 = false;
		this.isFollower = false;
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-132261211"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "0"
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
		garbageValue = "2079469647"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
		} else if (var2 == 18) {
			var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
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
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field1576 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1576[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * 5;
		} else {
			int var5;
			if (var2 == 102) {
				var3 = var1.readUnsignedByte();
				var4 = 0;

				for (var5 = var3; var5 != 0; var5 >>= 1) {
					++var4;
				}

				this.headIconArchiveIds = new int[var4];
				this.headIconSpriteIndex = new short[var4];

				for (int var6 = 0; var6 < var4; ++var6) {
					if ((var3 & 1 << var6) == 0) {
						this.headIconArchiveIds[var6] = -1;
						this.headIconSpriteIndex[var6] = -1;
					} else {
						this.headIconArchiveIds[var6] = var1.readNullableLargeSmart();
						this.headIconSpriteIndex[var6] = (short)var1.readShortSmartSub();
					}
				}
			} else if (var2 == 103) {
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.isInteractable = false;
				} else if (var2 == 109) {
					this.isClipped = false;
				} else if (var2 == 114) {
					this.field1597 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field1597 = var1.readUnsignedShort();
					this.field1590 = var1.readUnsignedShort();
					this.field1600 = var1.readUnsignedShort();
					this.field1603 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field1591 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field1591 = var1.readUnsignedShort();
					this.field1589 = var1.readUnsignedShort();
					this.field1588 = var1.readUnsignedShort();
					this.field1601 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.field1584 = true;
				} else if (var2 == 123) {
					this.isFollower = true;
				} else if (var2 == 249) {
					this.params = class324.readStringIntParameters(var1, this.params);
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort();
				if (this.transformVarbit == 65535) {
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort();
				if (this.transformVarp == 65535) {
					this.transformVarp = -1;
				}

				var3 = -1;
				if (var2 == 118) {
					var3 = var1.readUnsignedShort();
					if (var3 == 65535) {
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte();
				this.transforms = new int[var4 + 2];

				for (var5 = 0; var5 <= var4; ++var5) {
					this.transforms[var5] = var1.readUnsignedShort();
					if (this.transforms[var5] == 65535) {
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3;
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhs;ILhs;ILht;I)Lkz;",
		garbageValue = "-1363556981"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var6 = this.transform();
			return var6 == null ? null : var6.getModel(var1, var2, var3, var4, var5);
		} else {
			long var10 = (long)this.id;
			if (var5 != null) {
				var10 |= var5.field1564 << 16;
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var10);
			if (var8 == null) {
				ModelData var9 = this.getModelData(this.models, var5);
				if (var9 == null) {
					return null;
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var8, var10);
			}

			Model var12;
			if (var1 != null && var3 != null) {
				var12 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) {
				var12 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) {
				var12 = var3.transformActorModel(var8, var4);
			} else {
				var12 = var8.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var12.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var12;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)Lkf;",
		garbageValue = "3"
	)
	public final ModelData method954(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method954(var1);
		} else {
			return this.getModelData(this.field1576, var1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([ILht;I)Lkf;",
		garbageValue = "1934764414"
	)
	@Export("getModelData")
	ModelData getModelData(int[] var1, NpcOverrides var2) {
		int[] var3 = var1;
		if (var2 != null && var2.modelIds != null) {
			var3 = var2.modelIds;
		}

		if (var3 == null) {
			return null;
		} else {
			boolean var4 = false;

			for (int var5 = 0; var5 < var3.length; ++var5) {
				if (var3[var5] != -1 && !field1565.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field1565, var3[var6], 0);
				}

				ModelData var10;
				if (var9.length == 1) {
					var10 = var9[0];
					if (var10 == null) {
						var10 = new ModelData(var9, var9.length);
					}
				} else {
					var10 = new ModelData(var9, var9.length);
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) {
					var7 = this.recolorTo;
					if (var2 != null && var2.recolorTo != null) {
						var7 = var2.recolorTo;
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) {
						var10.recolor(this.recolorFrom[var8], var7[var8]);
					}
				}

				if (this.retextureFrom != null) {
					var7 = this.retextureTo;
					if (var2 != null && var2.retextureTo != null) {
						var7 = var2.retextureTo;
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) {
						var10.retexture(this.retextureFrom[var8], var7[var8]);
					}
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lho;",
		garbageValue = "82"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class332.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? VarcInt.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-10620"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class332.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-692597377"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "232488627"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1591783850"
	)
	public boolean method961() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-692020245"
	)
	public int[] method962() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-466777872"
	)
	public int method963(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-2092456263"
	)
	public short[] method964() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)S",
		garbageValue = "256"
	)
	public short method965(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmj;",
		garbageValue = "-756894589"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2703, ServerPacket.EVENT_WORLDHOP, ServerPacket.field2698, ServerPacket.field2695, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field2687, ServerPacket.REBUILD_REGION, ServerPacket.field2701, ServerPacket.field2707, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field2696, ServerPacket.field2692, ServerPacket.field2710, ServerPacket.field2700, ServerPacket.URL_OPEN, ServerPacket.field2699, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field2691, ServerPacket.field2689, ServerPacket.PLAYER_INFO, ServerPacket.field2708, ServerPacket.field2702, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field2727, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.MESSAGE_PRIVATE, ServerPacket.IF_SETCOLOUR, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field2732, ServerPacket.IF_SETOBJECT, ServerPacket.IF_CLOSESUB, ServerPacket.field2735, ServerPacket.field2734, ServerPacket.field2737, ServerPacket.field2714, ServerPacket.MIDI_SONG, ServerPacket.CAM_LOOKAT, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field2718, ServerPacket.LOGOUT, ServerPacket.field2717, ServerPacket.field2715, ServerPacket.field2738, ServerPacket.field2720, ServerPacket.field2731, ServerPacket.field2722, ServerPacket.field2724, ServerPacket.field2736, ServerPacket.field2757, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.IF_SETPOSITION, ServerPacket.IF_SETMODEL, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.IF_MOVESUB, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field2747, ServerPacket.LOGOUT_FULL, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field2762, ServerPacket.field2761, ServerPacket.REFLECTION_CHECKER, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field2743, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field2748, ServerPacket.field2758, ServerPacket.UPDATE_INV_FULL, ServerPacket.HINT_ARROW, ServerPacket.field2754, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.field2740, ServerPacket.field2755, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field2756, ServerPacket.NPC_SPOTANIM, ServerPacket.field2767, ServerPacket.field2779, ServerPacket.field2811, ServerPacket.field2776, ServerPacket.SET_PRIVCHATMODE, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field2785, ServerPacket.field2784, ServerPacket.field2777, ServerPacket.field2765, ServerPacket.CAM_RESET, ServerPacket.REBUILD_NORMAL, ServerPacket.field2772, ServerPacket.field2774, ServerPacket.UPDATE_UID192, ServerPacket.field2783, ServerPacket.field2788, ServerPacket.MINIMAP_TOGGLE, ServerPacket.field2780, ServerPacket.CAM_SETANGLE, ServerPacket.IF_SETHIDE, ServerPacket.field2766, ServerPacket.VARP_SMALL, ServerPacket.field2778, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field2790, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.VARP_LARGE, ServerPacket.MESSAGE_GAME, ServerPacket.field2809, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field2806, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.IF_SETNPCHEAD, ServerPacket.field2795, ServerPacket.field2812, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.field2794, ServerPacket.UPDATE_STAT, ServerPacket.UPDATE_IGNORELIST, ServerPacket.SET_PLAYER_OP, ServerPacket.field2804, ServerPacket.field2805, ServerPacket.field2801, ServerPacket.IF_SETANGLE};
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1209928476"
	)
	static void method956() {
		try {
			File var0 = new File(class334.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label34:
				for (int var1 = 0; var1 < class136.field1331.length; ++var1) {
					for (var2 = 0; var2 < HttpRequest.field27.length; ++var2) {
						File var3 = new File(HttpRequest.field27[var2] + class136.field1331[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}
}
