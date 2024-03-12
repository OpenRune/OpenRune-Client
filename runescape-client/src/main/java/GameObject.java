import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("wf")
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("dk")
	static boolean field2536;
	@ObfuscatedName("aq")
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ai")
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("as")
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aa")
	@Export("startX")
	int startX;
	@ObfuscatedName("az")
	@Export("endX")
	int endX;
	@ObfuscatedName("ao")
	@Export("startY")
	int startY;
	@ObfuscatedName("au")
	@Export("endY")
	int endY;
	@ObfuscatedName("ak")
	int field2542;
	@ObfuscatedName("ah")
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("aj")
	@Export("tag")
	public long tag;
	@ObfuscatedName("af")
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-788767206"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1015 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = AsyncHttpResponse.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					Actor.scene.drawEntity(class473.Client_plane, var2.x, var2.y, class272.getTileHeight(var2.field1015 * 64 - 64 + var2.x, var2.field1015 * 64 - 64 + var2.y, class473.Client_plane), var2.field1015 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-99454612"
	)
	static void method1652() {
		if (Client.isSpellSelected) {
			Widget var0 = ArchiveLoader.widgetDefinition.getWidgetChild(class160.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class177.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			UserComparator5.invalidateWidget(var0);
		}
	}
}
