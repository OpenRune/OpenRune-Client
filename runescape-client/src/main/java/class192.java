import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class192 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field2022")
	public static EvictingDualNodeHashTable field2022;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2103900652"
	)
	static final void method971() {
		int var0;
		int var1;
		int var2;
		if (!Client.field422) {
			var0 = WorldMapArea.field2021 * 128 + 64;
			var1 = UserComparator7.field1212 * 128 + 64;
			var2 = class272.getTileHeight(var0, var1, class473.Client_plane) - WorldMapSectionType.field2095;
			class7.method19(var0, var2, var1);
		} else if (Client.field670 != null) {
			ClanMate.cameraX = Client.field670.vmethod8869();
			class317.cameraZ = Client.field670.vmethod8868();
			if (Client.field427) {
				AsyncHttpResponse.cameraY = Client.field670.vmethod8874();
			} else {
				AsyncHttpResponse.cameraY = class272.getTileHeight(ClanMate.cameraX, class317.cameraZ, class473.Client_plane) - Client.field670.vmethod8874();
			}

			Client.field670.method2451();
		}

		if (!Client.field423) {
			var0 = VarbitComposition.field1655 * 128 + 64;
			var1 = class11.field35 * 128 + 64;
			var2 = class272.getTileHeight(var0, var1, class473.Client_plane) - ChatChannel.field868;
			int var3 = var0 - ClanMate.cameraX;
			int var4 = var2 - AsyncHttpResponse.cameraY;
			int var5 = var1 - class317.cameraZ;
			int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			ScriptEvent.method481(var7, var8);
		} else {
			if (Client.field671 != null) {
				FriendSystem.cameraPitch = Client.field671.method2447();
				FriendSystem.cameraPitch = Math.min(Math.max(FriendSystem.cameraPitch, 128), 383);
				Client.field671.method2451();
			}

			if (Client.field672 != null) {
				Script.cameraYaw = Client.field672.method2447() & 2047;
				Client.field672.method2451();
			}
		}

	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "997645488"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAddLE(var1);
		var2.packetBuffer.writeIntLE(var0);
		Client.packetWriter.addNode(var2);
	}
}
