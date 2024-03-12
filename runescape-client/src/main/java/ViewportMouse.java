import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("aq")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("aw")
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("al")
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("ai")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("ar")
	static int field2486;
	@ObfuscatedName("af")
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("ax")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Llt;Lvk;S)Lmn;",
		garbageValue = "-19962"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = FadeOutTask.method2209();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}
}
