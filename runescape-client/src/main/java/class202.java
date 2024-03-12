import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class202 {
	@ObfuscatedName("aq")
	public int field1694;
	@ObfuscatedName("aw")
	public int field1695;
	@ObfuscatedName("al")
	public int field1693;
	@ObfuscatedName("ai")
	public int field1692;

	class202(int var1, int var2, int var3, int var4) {
		this.field1694 = 0;
		this.field1695 = 0;
		this.field1693 = 0;
		this.field1692 = 0;
		this.field1694 = var1;
		this.field1695 = var2;
		this.field1693 = var3;
		this.field1692 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Lvd;",
		garbageValue = "1978049322"
	)
	public static final SpritePixels method1018(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var7 * var6];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbm;I)V",
		garbageValue = "-1796017443"
	)
	static void method1019(GameEngine var0) {
		class228 var1 = PacketBufferNode.method1678();

		while (var1.method1184()) {
			if (var1.field1958 == 13) {
				AbstractWorldMapData.method1367();
				return;
			}

			if (var1.field1958 == 96) {
				if (Login.worldSelectPage > 0 && WorldMapSectionType.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var1.field1958 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class516.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var2 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(0, 1);
				return;
			}

			int var3 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(1, 1);
				return;
			}

			int var4 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(2, 1);
				return;
			}

			int var5 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				MusicPatch.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				AbstractWorldMapData.method1367();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var6 = class256.World_worlds[Login.hoveredWorldIndex];
				boolean var7 = class59.method312(Client.worldProperties, class529.field4221);
				boolean var8 = var6.isDeadman();
				WorldMapScaleHandler.field2162 = var8;
				var6.field709 = var8 ? "beta" : var6.field709;
				class246.changeWorld(var6);
				AbstractWorldMapData.method1367();
				if (var8 != var7) {
					class371.method1964();
				}

				return;
			}

			if (Login.worldSelectPage > 0 && WorldMapSectionType.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= WorldMapSectionType.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapArea.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapArea.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class516.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class516.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= WorldMapArea.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= WorldMapArea.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILns;ZI)V",
		garbageValue = "660409340"
	)
	static void method1020(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class485.getWorldMap().getMapArea(var0);
		int var4 = VarpDefinition.localPlayer.plane;
		int var5 = (VarpDefinition.localPlayer.x >> 7) + Projectile.baseX;
		int var6 = (VarpDefinition.localPlayer.y >> 7) + GameEngine.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		class485.getWorldMap().method2474(var3, var7, var1, var2);
	}
}
