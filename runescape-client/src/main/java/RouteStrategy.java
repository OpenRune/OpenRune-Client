import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("aq")
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("aw")
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("al")
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ai")
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILiz;I)Z",
		garbageValue = "-101996106"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-107"
	)
	public static void method1207() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1091177009"
	)
	static int method1208(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "89"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class141.fontPlain12.lineWidth(var0, 250);
			int var6 = class141.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 16777215);
			class141.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			Language.method2061(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6);
			if (var1) {
				UserComparator8.rasterProvider.drawFull(0, 0);
			} else {
				class106.method626(var3, var4, var5, var6);
			}

		}
	}
}
