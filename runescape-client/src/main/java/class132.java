import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class132 {
	@ObfuscatedName("aq")
	boolean field1274;
	@ObfuscatedName("aw")
	boolean field1276;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class130 field1279;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class130 field1278;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	class127[] field1277;
	@ObfuscatedName("as")
	boolean field1275;
	@ObfuscatedName("aa")
	float field1280;
	@ObfuscatedName("az")
	float field1291;
	@ObfuscatedName("ao")
	float field1288;
	@ObfuscatedName("au")
	float field1289;
	@ObfuscatedName("ak")
	float field1286;
	@ObfuscatedName("ah")
	float field1284;
	@ObfuscatedName("aj")
	float field1285;
	@ObfuscatedName("af")
	float field1283;
	@ObfuscatedName("ax")
	float field1290;
	@ObfuscatedName("an")
	float field1287;
	@ObfuscatedName("ag")
	boolean field1273;
	@ObfuscatedName("am")
	int field1293;
	@ObfuscatedName("ad")
	float[] field1292;
	@ObfuscatedName("at")
	int field1294;
	@ObfuscatedName("ay")
	int field1295;
	@ObfuscatedName("ae")
	float field1282;
	@ObfuscatedName("ac")
	float field1281;

	class132() {
		this.field1273 = true;
		this.field1293 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)I",
		garbageValue = "-26"
	)
	int method724(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		class218.method1124(var1.readUnsignedByte());
		int var5 = var1.readUnsignedByte();
		class130 var6 = (class130)class356.findEnumerated(class328.method1760(), var5);
		if (var6 == null) {
			var6 = class130.field1263;
		}

		this.field1279 = var6;
		int var7 = var1.readUnsignedByte();
		class130 var8 = (class130)class356.findEnumerated(class328.method1760(), var7);
		if (var8 == null) {
			var8 = class130.field1263;
		}

		this.field1278 = var8;
		this.field1274 = var1.readUnsignedByte() != 0;
		this.field1277 = new class127[var3];
		class127 var11 = null;

		for (int var9 = 0; var9 < var3; ++var9) {
			class127 var10 = new class127();
			var10.method695(var1, var2);
			this.field1277[var9] = var10;
			if (var11 != null) {
				var11.field1230 = var10;
			}

			var11 = var10;
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	void method725() {
		this.field1294 = this.field1277[0].field1236;
		this.field1295 = this.field1277[this.method733() - 1].field1236;
		this.field1292 = new float[this.method730() + 1];

		for (int var1 = this.method728(); var1 <= this.method729(); ++var1) {
			this.field1292[var1 - this.method728()] = Tile.method1451(this, (float)var1);
		}

		this.field1277 = null;
		this.field1282 = Tile.method1451(this, (float)(this.method728() - 1));
		this.field1281 = Tile.method1451(this, (float)(this.method729() + 1));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "848750842"
	)
	public float method726(int var1) {
		if (var1 < this.method728()) {
			return this.field1282;
		} else {
			return var1 > this.method729() ? this.field1281 : this.field1292[var1 - this.method728()];
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-125"
	)
	int method728() {
		return this.field1294;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1086345403"
	)
	int method729() {
		return this.field1295;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2017937444"
	)
	int method730() {
		return this.method729() - this.method728();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1790231226"
	)
	int method731(float var1) {
		if (this.field1293 >= 0 && (float)this.field1277[this.field1293].field1236 <= var1 && (this.field1277[this.field1293].field1230 == null || (float)this.field1277[this.field1293].field1230.field1236 > var1)) {
			return this.field1293;
		} else if (var1 >= (float)this.method728() && var1 <= (float)this.method729()) {
			int var2 = this.method733();
			int var3 = this.field1293;
			if (var2 > 0) {
				int var4 = 0;
				int var5 = var2 - 1;

				do {
					int var6 = var4 + var5 >> 1;
					if (var1 < (float)this.field1277[var6].field1236) {
						if (var1 > (float)this.field1277[var6 - 1].field1236) {
							var3 = var6 - 1;
							break;
						}

						var5 = var6 - 1;
					} else {
						if (var1 <= (float)this.field1277[var6].field1236) {
							var3 = var6;
							break;
						}

						if (var1 < (float)this.field1277[var6 + 1].field1236) {
							var3 = var6;
							break;
						}

						var4 = var6 + 1;
					}
				} while(var4 <= var5);
			}

			if (var3 != this.field1293) {
				this.field1293 = var3;
				this.field1273 = true;
			}

			return this.field1293;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FI)Leo;",
		garbageValue = "1624046263"
	)
	class127 method732(float var1) {
		int var2 = this.method731(var1);
		return var2 >= 0 && var2 < this.field1277.length ? this.field1277[var2] : null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	int method733() {
		return this.field1277 == null ? 0 : this.field1277.length;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "306288239"
	)
	public static void method727() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
