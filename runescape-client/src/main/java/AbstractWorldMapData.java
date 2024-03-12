import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ar")
	int field2113;
	@ObfuscatedName("as")
	int field2114;
	@ObfuscatedName("aa")
	@Export("regionX")
	int regionX;
	@ObfuscatedName("az")
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ao")
	int field2112;
	@ObfuscatedName("au")
	@Export("planes")
	int planes;
	@ObfuscatedName("ak")
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ah")
	@Export("fileId")
	int fileId;
	@ObfuscatedName("aj")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("af")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ax")
	byte[][][] field2108;
	@ObfuscatedName("an")
	byte[][][] field2107;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[[[Ljk;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("am")
	boolean field2106;
	@ObfuscatedName("ad")
	boolean field2105;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2106 = false;
		this.field2105 = false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-2145241583"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1976221798"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2106 && this.field2105;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-1409434879"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2106 = true;
				this.field2105 = true;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1853690656"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2108 = null;
		this.field2107 = null;
		this.decorations = null;
		this.field2106 = false;
		this.field2105 = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILuq;I)V",
		garbageValue = "1344412054"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method1363(var1, var2, var3, var4);
			} else {
				this.method1364(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IILuq;II)V",
		garbageValue = "-822100848"
	)
	void method1363(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IILuq;II)V",
		garbageValue = "2113154650"
	)
	void method1364(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var10 = var3.readUnsignedShort();
				if (var10 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var10;
					var11 = var3.readUnsignedByte();
					this.field2108[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2107[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var14 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readNullableLargeSmart();
						int var13 = var3.readUnsignedByte();
						var14[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16630"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-374771233"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	static void method1367() {
		Login.worldSelectOpen = false;
		Login.leftTitleSprite.drawAt(Login.xPadding, 0);
		WorldMapLabelSize.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
	}
}
