import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("aq")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aw")
	@Export("planes")
	int planes;
	@ObfuscatedName("al")
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ai")
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ar")
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("as")
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("aa")
	int field2010;
	@ObfuscatedName("az")
	int field2019;
	@ObfuscatedName("ao")
	int field2013;
	@ObfuscatedName("au")
	int field2017;

	WorldMapSection2() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljw;I)V",
		garbageValue = "1490465463"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2010) {
			var1.regionLowX = this.field2010;
		}

		if (var1.regionHighX < this.field2013) {
			var1.regionHighX = this.field2013;
		}

		if (var1.regionLowY > this.field2019) {
			var1.regionLowY = this.field2019;
		}

		if (var1.regionHighY < this.field2017) {
			var1.regionHighY = this.field2017;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1956662927"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
		return var1 >> 6 >= this.field2010 && var1 >> 6 <= this.field2013 && var2 >> 6 >= this.field2019 && var2 >> 6 <= this.field2017;
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
			int[] var4 = new int[]{var2 + (this.field2010 * 64 - this.regionStartX * 64), var3 + (this.field2019 * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.field2010 * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.field2019 * 64);
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1659975265"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2010 = var1.readUnsignedShort();
		this.field2019 = var1.readUnsignedShort();
		this.field2013 = var1.readUnsignedShort();
		this.field2017 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "703671461"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)V",
		garbageValue = "0"
	)
	public static void method1251(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}
}
