import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("aj")
	public static short[] field2998;
	@ObfuscatedName("ax")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	public static class442 field2997;
	@ObfuscatedName("at")
	public static int field2995;
	@ObfuscatedName("aq")
	int[] field3003;
	@ObfuscatedName("aw")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("al")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ai")
	public int field3007;
	@ObfuscatedName("ar")
	@Export("gender")
	public int gender;
	@ObfuscatedName("as")
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("aa")
	@Export("hash")
	long hash;
	@ObfuscatedName("az")
	long field3006;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lgj;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("au")
	boolean field3000;

	static {
		equipmentIndices = new int[]{class207.field1848.field1860, class207.field1846.field1860, class207.field1849.field1860, class207.field1845.field1860, class207.field1850.field1860, class207.field1851.field1860, class207.field1847.field1860};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field2997 = new class442(16, class440.field3863);
		field2995 = 0;
	}

	public PlayerComposition() {
		this.field3007 = -1;
		this.gender = 0;
		this.field3000 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3007 = -1;
		this.gender = 0;
		this.field3000 = false;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field3003, var1.field3003.length);
		PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method1796(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3007);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgj;Z[IIIII)V",
		garbageValue = "-1147007725"
	)
	public void method1796(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3000 = var4;
		this.field3007 = var8;
		this.method1797(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "366816373"
	)
	public void method1797(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method1798(var4);
		}

		if (var2 == null) {
			var2 = this.method1798(var4);
		}

		this.field3003 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1738741900"
	)
	int[] method1798(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			class175.method898(var1, var2, var3);
		}

		return var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2140190800"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[equipmentIndices[var1]];
		if (var3 != 0) {
			var3 -= 256;

			KitDefinition var4;
			do {
				if (!var2) {
					--var3;
					if (var3 < 0) {
						var3 = KitDefinition.KitDefinition_fileCount - 1;
					}
				} else {
					++var3;
					if (var3 >= KitDefinition.KitDefinition_fileCount) {
						var3 = 0;
					}
				}

				var4 = GrandExchangeOfferWorldComparator.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.gender == 1 ? 7 : 0) + var1);

			this.equipment[equipmentIndices[var1]] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1917247523"
	)
	public void method1800(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class407.field3753[var1].length - 1;
				}
			} while(!class160.method848(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= class407.field3753[var1].length) {
					var3 = 0;
				}
			} while(!class160.method848(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	public void method1801(int var1) {
		if (this.gender != var1) {
			this.method1797((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-2017235297"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[equipmentIndices[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1192088733"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		int var3 = this.equipment[5];
		int var4 = this.equipment[9];
		this.equipment[5] = var4;
		this.equipment[9] = var3;
		this.hash = 0L;

		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			this.hash <<= 4;
			if (this.equipment[var5] >= 256) {
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) {
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) {
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += (long)this.bodyColors[var5];
		}

		this.hash <<= 1;
		this.hash += (long)this.gender;
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && this.hash != var1 || this.field3000) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhs;ILhs;IB)Lkz;",
		garbageValue = "-19"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return VarcInt.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) {
					var5 += (long)(var1.shield - this.equipment[5] << 40);
					var7[5] = var1.shield;
				}

				if (var1.weapon >= 0) {
					var5 += (long)(var1.weapon - this.equipment[3] << 48);
					var7[3] = var1.weapon;
				}
			}

			Model var18 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var18 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512) {
						KitDefinition var12 = GrandExchangeOfferWorldComparator.KitDefinition_get(var11 - 256);
						if (var12 != null && !var12.ready()) {
							var9 = true;
						}
					}

					if (var11 >= 512 && !ArchiveDiskActionHandler.ItemDefinition_get(var11 - 512).method1045(this.gender)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field3006) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3006);
					}

					if (var18 == null) {
						return null;
					}
				}

				if (var18 == null) {
					ModelData[] var19 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var20 = 0; var20 < 12; ++var20) {
						var13 = var7[var20];
						ModelData var15;
						if (var13 >= 256 && var13 < 512) {
							KitDefinition var14 = GrandExchangeOfferWorldComparator.KitDefinition_get(var13 - 256);
							var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var19[var11++] = var15;
							}
						}

						if (var13 >= 512) {
							ItemComposition var23 = ArchiveDiskActionHandler.ItemDefinition_get(var13 - 512);
							var15 = var23.method1046(this.gender);
							if (var15 != null) {
								if (this.playerCompositionColorTextureOverrides != null) {
									PlayerCompositionColorTextureOverride var16 = this.playerCompositionColorTextureOverrides[var20];
									if (var16 != null) {
										int var17;
										if (var16.playerCompositionRecolorTo != null && var23.recolorFrom != null && var16.playerCompositionRecolorTo.length == var23.recolorTo.length) {
											for (var17 = 0; var17 < var23.recolorFrom.length; ++var17) {
												var15.recolor(var23.recolorTo[var17], var16.playerCompositionRecolorTo[var17]);
											}
										}

										if (var16.playerCompositionRetextureTo != null && var23.retextureFrom != null && var23.retextureTo.length == var16.playerCompositionRetextureTo.length) {
											for (var17 = 0; var17 < var23.retextureFrom.length; ++var17) {
												var15.retexture(var23.retextureTo[var17], var16.playerCompositionRetextureTo[var17]);
											}
										}
									}
								}

								var19[var11++] = var15;
							}
						}
					}

					ModelData var22 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class407.field3753[var13].length) {
							var22.recolor(Messages.field1178[var13], class407.field3753[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < LoginPacket.field1358[var13].length) {
							var22.recolor(field2998[var13], LoginPacket.field1358[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var22.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3006 = var5;
				}
			}

			Model var21;
			if (var1 == null && var3 == null) {
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) {
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) {
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4);
			}

			return var21;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lkf;",
		garbageValue = "-27"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return VarcInt.getNpcDefinition(this.npcTransformId).method954((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512) {
					KitDefinition var4 = GrandExchangeOfferWorldComparator.KitDefinition_get(var3 - 256);
					if (var4 != null && !var4.method924()) {
						var1 = true;
					}
				}

				if (var3 >= 512 && !ArchiveDiskActionHandler.ItemDefinition_get(var3 - 512).method1047(this.gender)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var8 = new ModelData[12];
				var3 = 0;

				int var5;
				for (int var9 = 0; var9 < 12; ++var9) {
					var5 = this.equipment[var9];
					if (var5 >= 256 && var5 < 512) {
						KitDefinition var6 = GrandExchangeOfferWorldComparator.KitDefinition_get(var5 - 256);
						ModelData var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (var5 >= 512) {
						ModelData var11 = ArchiveDiskActionHandler.ItemDefinition_get(var5 - 512).method1048(this.gender);
						if (var11 != null) {
							var8[var3++] = var11;
						}
					}
				}

				ModelData var10 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class407.field3753[var5].length) {
						var10.recolor(Messages.field1178[var5], class407.field3753[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < LoginPacket.field1358[var5].length) {
						var10.recolor(field2998[var5], LoginPacket.field1358[var5][this.bodyColors[var5]]);
					}
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "906284880"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field2997.method2258(var1);
		if (var3 == null) {
			var3 = ++field2995 - 1;
			field2997.method2259(var1, var3);
			field2995 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-33"
	)
	void method1807() {
		this.method1797(this.field3003, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}
}
