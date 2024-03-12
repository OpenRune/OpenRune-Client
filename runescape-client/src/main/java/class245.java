import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class245 implements WorldMapSection {
	@ObfuscatedName("nf")
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("aq")
	int field2070;
	@ObfuscatedName("aw")
	int field2074;
	@ObfuscatedName("al")
	int field2068;
	@ObfuscatedName("ai")
	int field2067;
	@ObfuscatedName("ar")
	int field2071;
	@ObfuscatedName("as")
	int field2072;
	@ObfuscatedName("aa")
	int field2066;
	@ObfuscatedName("az")
	int field2075;
	@ObfuscatedName("ao")
	int field2069;
	@ObfuscatedName("au")
	int field2073;

	class245() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljw;I)V",
		garbageValue = "1490465463"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2071) {
			var1.regionLowX = this.field2071;
		}

		if (var1.regionHighX < this.field2071) {
			var1.regionHighX = this.field2071;
		}

		if (var1.regionLowY > this.field2072) {
			var1.regionLowY = this.field2072;
		}

		if (var1.regionHighY < this.field2072) {
			var1.regionHighY = this.field2072;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1956662927"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2070 && var1 < this.field2070 + this.field2074) {
			return var2 >= (this.field2068 << 6) + (this.field2066 << 3) && var2 <= (this.field2068 << 6) + (this.field2066 << 3) + 7 && var3 >= (this.field2067 << 6) + (this.field2075 << 3) && var3 <= (this.field2067 << 6) + (this.field2075 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-677960221"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2071 << 6) + (this.field2069 << 3) && var1 <= (this.field2071 << 6) + (this.field2069 << 3) + 7 && var2 >= (this.field2072 << 6) + (this.field2073 << 3) && var2 <= (this.field2072 << 6) + (this.field2073 << 3) + 7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1252911580"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field2071 * 64 - this.field2068 * 64) + (this.field2069 * 8 - this.field2066 * 8), var3 + (this.field2072 * 64 - this.field2067 * 64) + (this.field2073 * 8 - this.field2075 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Lns;",
		garbageValue = "-1671728396"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2068 * 64 - this.field2071 * 64 + (this.field2066 * 8 - this.field2069 * 8) + var1;
			int var4 = var2 + (this.field2067 * 64 - this.field2072 * 64) + (this.field2075 * 8 - this.field2073 * 8);
			return new Coord(this.field2070, var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1659975265"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2070 = var1.readUnsignedByte();
		this.field2074 = var1.readUnsignedByte();
		this.field2068 = var1.readUnsignedShort();
		this.field2066 = var1.readUnsignedByte();
		this.field2067 = var1.readUnsignedShort();
		this.field2075 = var1.readUnsignedByte();
		this.field2071 = var1.readUnsignedShort();
		this.field2069 = var1.readUnsignedByte();
		this.field2072 = var1.readUnsignedShort();
		this.field2073 = var1.readUnsignedByte();
		this.method1342();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1575864257"
	)
	void method1342() {
	}
}
