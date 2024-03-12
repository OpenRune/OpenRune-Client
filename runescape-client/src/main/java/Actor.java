import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ba")
	@Export("x")
	int x;
	@ObfuscatedName("bt")
	@Export("y")
	int y;
	@ObfuscatedName("bk")
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bm")
	int field1015;
	@ObfuscatedName("bw")
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bv")
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("by")
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bb")
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bn")
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("br")
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bp")
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bf")
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bg")
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("be")
	int field1008;
	@ObfuscatedName("bc")
	int field1007;
	@ObfuscatedName("bz")
	int field1024;
	@ObfuscatedName("bh")
	int field1011;
	@ObfuscatedName("bs")
	int field1019;
	@ObfuscatedName("bj")
	int field1012;
	@ObfuscatedName("bl")
	int field1014;
	@ObfuscatedName("bx")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cs")
	boolean field998;
	@ObfuscatedName("ch")
	boolean field997;
	@ObfuscatedName("co")
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cd")
	int field1027;
	@ObfuscatedName("cg")
	int field1030;
	@ObfuscatedName("cn")
	int[] field1062;
	@ObfuscatedName("ci")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cl")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cm")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cx")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cw")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cy")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("ce")
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cv")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cj")
	int field1031;
	@ObfuscatedName("ct")
	int field1037;
	@ObfuscatedName("ck")
	int field1032;
	@ObfuscatedName("ca")
	boolean field996;
	@ObfuscatedName("cp")
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cc")
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cb")
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cq")
	int field1035;
	@ObfuscatedName("cf")
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cr")
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dg")
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dc")
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("do")
	int field1051;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dl")
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dk")
	int field1048;
	@ObfuscatedName("dw")
	int field1055;
	@ObfuscatedName("du")
	int field1054;
	@ObfuscatedName("dt")
	int field1053;
	@ObfuscatedName("dm")
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("da")
	int field1038;
	@ObfuscatedName("dq")
	int field1052;
	@ObfuscatedName("dd")
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dh")
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dj")
	int field1047;
	@ObfuscatedName("di")
	int field1046;
	@ObfuscatedName("ds")
	byte field1002;
	@ObfuscatedName("dy")
	byte field1003;
	@ObfuscatedName("dz")
	byte field1004;
	@ObfuscatedName("dp")
	byte field1001;
	@ObfuscatedName("de")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("df")
	int field1043;
	@ObfuscatedName("db")
	int field1039;
	@ObfuscatedName("dx")
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dn")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dr")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	@Export("pathTraversed")
	class233[] pathTraversed;
	@ObfuscatedName("ej")
	int field1059;
	@ObfuscatedName("ee")
	int field1057;
	@ObfuscatedName("ei")
	int field1058;

	Actor() {
		this.isWalking = false;
		this.field1015 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1008 = -1;
		this.field1007 = -1;
		this.field1024 = -1;
		this.field1011 = -1;
		this.field1019 = -1;
		this.field1012 = -1;
		this.field1014 = -1;
		this.overheadText = null;
		this.field997 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1027 = 0;
		this.field1030 = 0;
		this.field1062 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1031 = -1;
		this.field1037 = -1;
		this.field1032 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1035 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1051 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1047 = -1;
		this.field1046 = -1;
		this.field1043 = 0;
		this.field1039 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class233[10];
		this.field1059 = 0;
		this.field1057 = 0;
		this.field1058 = -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16409"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "709886252"
	)
	final void method526() {
		this.pathLength = 0;
		this.field1057 = 0;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1723210572"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = Language.method2058(var1);
			var10 = var12.field1685;
			var11 = var12.field1687;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1922704024"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = VarcInt.method914(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1534 == var7.field1534) {
				var12.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var12.definition.int1 <= var7.int1) {
				var8 = var12;
			}

			if (var12.definition.int2 > var10) {
				var9 = var12;
				var10 = var12.definition.int2;
			}
		}

		if (var9 != null || var11 < 4) {
			var12 = new HealthBar(var7);
			if (var8 == null) {
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
			}

			var12.put(var2 + var4, var5, var6, var3);
			if (var11 >= 4) {
				var9.remove();
			}

		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1919875371"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = VarcInt.method914(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1566666540"
	)
	@Export("updateSpotAnimation")
	void updateSpotAnimation(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle;
		ActorSpotAnim var6 = (ActorSpotAnim)this.spotAnimations.get((long)var1);
		if (var6 != null) {
			var6.remove();
			--this.graphicsCount;
		}

		if (var2 != 65535 && var2 != -1) {
			byte var7 = 0;
			if (var4 > 0) {
				var7 = -1;
			}

			this.spotAnimations.put(new ActorSpotAnim(var2, var3, var5, var7), (long)var1);
			++this.graphicsCount;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)Lta;",
		garbageValue = "-43"
	)
	IterableNodeHashTable method532() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "230480918"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method2526(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lkz;B)Lkz;",
		garbageValue = "1"
	)
	Model method534(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2472;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method2526(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = VarbitComposition.SpotAnimationDefinition_get(var7.spotAnimation).method979();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method1578(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method2526(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = VarbitComposition.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method1578(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "811106472"
	)
	void method535() {
		this.field996 = false;
		this.field1031 = -1;
		this.field1037 = -1;
		this.field1032 = -1;
	}
}
