import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("aq")
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("aw")
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("al")
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("ai")
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "-85"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		super.field2112 = var1.readUnsignedByte();
		super.planes = var1.readUnsignedByte();
		super.field2113 = var1.readUnsignedShort();
		super.field2114 = var1.readUnsignedShort();
		this.chunkXLow = var1.readUnsignedByte();
		this.chunkYLow = var1.readUnsignedByte();
		super.regionX = var1.readUnsignedShort();
		super.regionY = var1.readUnsignedShort();
		this.chunkX = var1.readUnsignedByte();
		this.chunkY = var1.readUnsignedByte();
		super.groupId = var1.readNullableLargeSmart();
		super.fileId = var1.readNullableLargeSmart();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-2145241583"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2108 = new byte[super.planes][64][64];
		super.field2107 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedByte();
		int var4 = var1.readUnsignedByte();
		int var5 = var1.readUnsignedByte();
		int var6 = var1.readUnsignedByte();
		if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
			for (int var7 = 0; var7 < 8; ++var7) {
				for (int var8 = 0; var8 < 8; ++var8) {
					this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
				}
			}

		} else {
			throw new IllegalStateException("");
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1709830324"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "106"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1340209237"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (var2.regionX == super.regionX && var2.regionY == super.regionY) {
				return this.chunkX == var2.chunkX && var2.chunkY == this.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "1466454237"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class376.method1987(var0, 10, var1) : Integer.toString(var0);
	}
}
