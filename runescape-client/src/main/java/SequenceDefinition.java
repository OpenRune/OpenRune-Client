import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("aq")
	static boolean field1822;
	@ObfuscatedName("az")
	public static boolean field1820;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ah")
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("aj")
	public Map field1844;
	@ObfuscatedName("af")
	int field1826;
	@ObfuscatedName("ax")
	int field1827;
	@ObfuscatedName("an")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ag")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("am")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lhy;"
	)
	@Export("soundEffects")
	public class202[] soundEffects;
	@ObfuscatedName("at")
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ay")
	int[] field1829;
	@ObfuscatedName("ae")
	boolean[] field1825;
	@ObfuscatedName("ac")
	public boolean field1830;
	@ObfuscatedName("ab")
	public int field1833;
	@ObfuscatedName("av")
	@Export("shield")
	public int shield;
	@ObfuscatedName("ap")
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("bu")
	public int field1841;
	@ObfuscatedName("bo")
	public boolean field1831;
	@ObfuscatedName("bd")
	public int field1838;
	@ObfuscatedName("bi")
	public int field1839;
	@ObfuscatedName("bq")
	@Export("restartMode")
	public int restartMode;

	static {
		field1822 = false;
		field1820 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field1826 = 0;
		this.field1827 = 0;
		this.frameCount = -1;
		this.field1830 = false;
		this.field1833 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field1841 = 99;
		this.field1831 = false;
		this.field1838 = -1;
		this.field1839 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-471377319"
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
		garbageValue = "-225778054"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field1829 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1829[var4] = var1.readUnsignedByte();
			}

			this.field1829[var3] = 9999999;
		} else if (var2 == 4) {
			this.field1830 = true;
		} else if (var2 == 5) {
			this.field1833 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field1841 = var1.readUnsignedByte();
			this.field1831 = true;
		} else if (var2 == 9) {
			this.field1838 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field1839 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.restartMode = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else {
			boolean var8;
			boolean var9;
			int var11;
			int var17;
			int var18;
			int var19;
			if (var2 == 13) {
				var3 = var1.readUnsignedByte();
				this.soundEffects = new class202[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					class202 var13;
					class202[] var14;
					label132: {
						var14 = this.soundEffects;
						if (var1 != null) {
							var8 = false;
							var9 = false;
							boolean var10 = false;
							var11 = 0;
							if (!field1820) {
								int var12 = var1.readMedium();
								var19 = var12 & 15;
								var17 = var12 >> 8;
								var18 = var12 >> 4 & 7;
							} else {
								var17 = var1.readUnsignedShort();
								var18 = var1.readUnsignedByte();
								var19 = var1.readUnsignedByte();
								var11 = var1.readUnsignedByte();
							}

							if (var17 >= 1 && var18 >= 1 && var19 >= 0 && var11 >= 0) {
								var13 = new class202(var17, var18, var19, var11);
								break label132;
							}
						}

						var13 = null;
					}

					var14[var4] = var13;
				}
			} else if (var2 == 14) {
				this.SequenceDefinition_cachedModelId = var1.readInt();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedShort();
				this.field1844 = new HashMap();

				for (var4 = 0; var4 < var3; ++var4) {
					int var5;
					class202 var6;
					label146: {
						var5 = var1.readUnsignedShort();
						if (var1 != null) {
							boolean var7 = false;
							var8 = false;
							var9 = false;
							var19 = 0;
							int var16;
							if (!field1820) {
								var11 = var1.readMedium();
								var18 = var11 & 15;
								var16 = var11 >> 8;
								var17 = var11 >> 4 & 7;
							} else {
								var16 = var1.readUnsignedShort();
								var17 = var1.readUnsignedByte();
								var18 = var1.readUnsignedByte();
								var19 = var1.readUnsignedByte();
							}

							if (var16 >= 1 && var17 >= 1 && var18 >= 0 && var19 >= 0) {
								var6 = new class202(var16, var17, var18, var19);
								break label146;
							}
						}

						var6 = null;
					}

					this.field1844.put(var5, var6);
				}
			} else if (var2 == 16) {
				this.field1826 = var1.readUnsignedShort();
				this.field1827 = var1.readUnsignedShort();
			} else if (var2 == 17) {
				this.field1825 = new boolean[256];

				for (var3 = 0; var3 < this.field1825.length; ++var3) {
					this.field1825[var3] = false;
				}

				var3 = var1.readUnsignedByte();

				for (var4 = 0; var4 < var3; ++var4) {
					this.field1825[var1.readUnsignedByte()] = true;
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1373764768"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field1838 == -1) {
			if (this.field1829 == null && this.field1825 == null) {
				this.field1838 = 0;
			} else {
				this.field1838 = 2;
			}
		}

		if (this.field1839 == -1) {
			if (this.field1829 == null && this.field1825 == null) {
				this.field1839 = 0;
			} else {
				this.field1839 = 2;
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkz;II)Lkz;",
		garbageValue = "-1346011414"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var10 = class332.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var10 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var4 = var1.toSharedSequenceModel(!var10.hasAlphaTransform(var2));
				var4.animate(var10, var2);
				return var4;
			}
		} else {
			int var8 = this.SequenceDefinition_cachedModelId;
			class140 var7 = (class140)SequenceDefinition_cachedModel.get((long)var8);
			class140 var6;
			if (var7 != null) {
				var6 = var7;
			} else {
				var7 = class93.method509(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var8, false);
				if (var7 != null) {
					SequenceDefinition_cachedModel.put(var7, (long)var8);
				}

				var6 = var7;
			}

			int var5;
			if (var6 == null) {
				var5 = 2;
			} else {
				var5 = var6.method754() ? 0 : 1;
			}

			class140 var3;
			if (var5 != 0) {
				var3 = null;
			} else {
				var7 = (class140)SequenceDefinition_cachedModel.get((long)var8);
				if (var7 != null) {
					var6 = var7;
				} else {
					var7 = class93.method509(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var8, false);
					if (var7 != null) {
						SequenceDefinition_cachedModel.put(var7, (long)var8);
					}

					var6 = var7;
				}

				var3 = var6;
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var11 = var1.toSharedSequenceModel(!var3.method756());
				var11.method1589(var3, var2);
				return var11;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lkz;III)Lkz;",
		garbageValue = "1542813033"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var11 = class332.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var11 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var5 = var1.toSharedSequenceModel(!var11.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var11, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		} else {
			int var9 = this.SequenceDefinition_cachedModelId;
			class140 var8 = (class140)SequenceDefinition_cachedModel.get((long)var9);
			class140 var7;
			if (var8 != null) {
				var7 = var8;
			} else {
				var8 = class93.method509(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var9, false);
				if (var8 != null) {
					SequenceDefinition_cachedModel.put(var8, (long)var9);
				}

				var7 = var8;
			}

			int var6;
			if (var7 == null) {
				var6 = 2;
			} else {
				var6 = var7.method754() ? 0 : 1;
			}

			class140 var4;
			if (var6 != 0) {
				var4 = null;
			} else {
				var8 = (class140)SequenceDefinition_cachedModel.get((long)var9);
				if (var8 != null) {
					var7 = var8;
				} else {
					var8 = class93.method509(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var9, false);
					if (var8 != null) {
						SequenceDefinition_cachedModel.put(var8, (long)var9);
					}

					var7 = var8;
				}

				var4 = var7;
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var12 = var1.toSharedSequenceModel(!var4.method756());
				var3 &= 3;
				if (var3 == 1) {
					var12.rotateY270Ccw();
				} else if (var3 == 2) {
					var12.rotateY180();
				} else if (var3 == 3) {
					var12.rotateY90Ccw();
				}

				var12.method1589(var4, var2);
				if (var3 == 1) {
					var12.rotateY90Ccw();
				} else if (var3 == 2) {
					var12.rotateY180();
				} else if (var3 == 3) {
					var12.rotateY270Ccw();
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkz;II)Lkz;",
		garbageValue = "725333832"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var10 = class332.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var10 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var4 = var1.toSharedSpotAnimationModel(!var10.hasAlphaTransform(var2));
				var4.animate(var10, var2);
				return var4;
			}
		} else {
			int var8 = this.SequenceDefinition_cachedModelId;
			class140 var7 = (class140)SequenceDefinition_cachedModel.get((long)var8);
			class140 var6;
			if (var7 != null) {
				var6 = var7;
			} else {
				var7 = class93.method509(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var8, false);
				if (var7 != null) {
					SequenceDefinition_cachedModel.put(var7, (long)var8);
				}

				var6 = var7;
			}

			int var5;
			if (var6 == null) {
				var5 = 2;
			} else {
				var5 = var6.method754() ? 0 : 1;
			}

			class140 var3;
			if (var5 != 0) {
				var3 = null;
			} else {
				var7 = (class140)SequenceDefinition_cachedModel.get((long)var8);
				if (var7 != null) {
					var6 = var7;
				} else {
					var7 = class93.method509(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var8, false);
					if (var7 != null) {
						SequenceDefinition_cachedModel.put(var7, (long)var8);
					}

					var6 = var7;
				}

				var3 = var6;
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var11 = var1.toSharedSpotAnimationModel(!var3.method756());
				var11.method1589(var3, var2);
				return var11;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lkz;ILhs;II)Lkz;",
		garbageValue = "-2132715747"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field1822 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method1070(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class140 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method1074();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field1825 == null) {
					var5.method1589(var9, var2);
					return var5;
				}

				var8 = var9.field1340;
				var5.method1593(var8, var9, var2, this.field1825, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class332.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field1829 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field1829 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method1594(var7, var2, this.field1829, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method1074();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1340;
				}

				var5.method1593(var8, var9, var4, this.field1825, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class332.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method1594(var10, var4, this.field1829, true);
			}

			if (var6 && var7 != null) {
				var5.method1594(var7, var2, this.field1829, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lkz;ILhs;IB)Lkz;",
		garbageValue = "21"
	)
	Model method1070(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class332.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class332.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field1829);
				return var7;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkz;II)Lkz;",
		garbageValue = "-1066115582"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class332.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class332.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if (var5 != null && var6 != 65535) {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-20"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	public int method1073() {
		return this.field1827 - this.field1826;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lfc;",
		garbageValue = "-1356929050"
	)
	class140 method1074() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class140 var5 = (class140)SequenceDefinition_cachedModel.get((long)var2);
			class140 var4;
			if (var5 != null) {
				var4 = var5;
			} else {
				var5 = class93.method509(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var2, false);
				if (var5 != null) {
					SequenceDefinition_cachedModel.put(var5, (long)var2);
				}

				var4 = var5;
			}

			int var3;
			if (var4 == null) {
				var3 = 2;
			} else {
				var3 = var4.method754() ? 0 : 1;
			}

			class140 var1;
			if (var3 != 0) {
				var1 = null;
			} else {
				var5 = (class140)SequenceDefinition_cachedModel.get((long)var2);
				if (var5 != null) {
					var4 = var5;
				} else {
					var5 = class93.method509(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var2, false);
					if (var5 != null) {
						SequenceDefinition_cachedModel.put(var5, (long)var2);
					}

					var4 = var5;
				}

				var1 = var4;
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1088349080"
	)
	public static void method1064() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1954725929"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (AsyncRestClient.garbageCollector == null || !AsyncRestClient.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						AsyncRestClient.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (AsyncRestClient.garbageCollector != null) {
			long var9 = SecureRandomCallable.method465();
			long var3 = AsyncRestClient.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}
}
