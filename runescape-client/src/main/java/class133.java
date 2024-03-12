import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class133 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1300;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1303;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1299;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1298;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1301;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1302;
	@ObfuscatedName("gt")
	static int field1296;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("aa")
	final int field1304;
	@ObfuscatedName("az")
	final int field1306;
	@ObfuscatedName("ao")
	final int field1305;

	static {
		field1300 = new class133(0, 0, (String)null, 0);
		field1303 = new class133(1, 1, (String)null, 9);
		field1299 = new class133(2, 2, (String)null, 3);
		field1298 = new class133(3, 3, (String)null, 6);
		field1301 = new class133(4, 4, (String)null, 1);
		field1302 = new class133(5, 5, (String)null, 3);
	}

	class133(int var1, int var2, String var3, int var4) {
		this.field1304 = var1;
		this.field1306 = var2;
		this.field1305 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1306;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "91"
	)
	int method735() {
		return this.field1305;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method734(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "-2"
	)
	public static void method737(ArrayList var0, int var1, int var2, int var3, int var4) {
		class321.field2858.clear();
		class321.field2858.addAll(var0);
		ScriptFrame.method327(var1, var2, var3, var4);
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("clear")
	static final void clear() {
		class183.field2007.clear();
		class185.field2023.clear();
		class160.method847();
		KitDefinition.method921();
		class168.method879();
		class257.method1379();
		class132.method727();
		AsyncRestClient.method46();
		FloorDecoration.method1447();
		class59.method317();
		class173.field1913.clear();
		SequenceDefinition.method1064();
		ClientPacket.method1674();
		class151.method797();
		class30.method112();
		ItemContainer.method471();
		MusicPatchPcmStream.method1768();
		class190.method967();
		ParamComposition.ParamDefinition_cached.clear();
		ModeWhere.method2064();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		StructComposition.StructDefinition_cached.clear();
		VarbitComposition.VarbitDefinition_cached.clear();
		if (EnumComposition.field1543 != null) {
			EnumComposition.field1543.method2558();
		}

		if (ApproximateRouteStrategy.field359 != null) {
			ApproximateRouteStrategy.field359.method2558();
		}

		class31.method113();
		class192.field2022.clear();
		VarcInt.VarcInt_cached.clear();
		class177.field1864.clear();
		class172.field1842.clear();
		class175.field1851.clear();
		class198.field1909.clear();
		HorizontalAlignment.method945();
		class196.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field2997.clearFiles();
		PlayerComposition.field2995 = 0;
		if (ArchiveLoader.widgetDefinition != null) {
			ArchiveLoader.widgetDefinition.method1789();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear();
		Client.field661.clearFiles();
		if (class154.field1393 != null) {
			class154.field1393.clearFiles();
		}

		if (Client.field651 != null) {
			Client.field651.clearFiles();
		}

		if (ScriptFrame.archive10 != null) {
			ScriptFrame.archive10.clearFiles();
		}

		if (WorldMapSectionType.archive12 != null) {
			WorldMapSectionType.archive12.clearFiles();
		}

		if (HttpRequestTask.archive2 != null) {
			HttpRequestTask.archive2.clearFiles();
		}

		if (class150.field1376 != null) {
			class150.field1376.clearFiles();
		}

		if (SecureRandomSSLSocket.field40 != null) {
			SecureRandomSSLSocket.field40.clearFiles();
		}

		if (KeyHandler.archive13 != null) {
			KeyHandler.archive13.clearFiles();
		}

		if (ScriptFrame.archive4 != null) {
			ScriptFrame.archive4.clearFiles();
		}

		if (MouseHandler.field150 != null) {
			MouseHandler.field150.clearFiles();
		}

		if (class376.field3623 != null) {
			class376.field3623.clearFiles();
		}

		if (WorldMapSectionType.field2096 != null) {
			WorldMapSectionType.field2096.clearFiles();
		}

		if (JagexCache.archive9 != null) {
			JagexCache.archive9.clearFiles();
		}

		if (Renderable.archive6 != null) {
			Renderable.archive6.clearFiles();
		}

		if (class198.field1661 != null) {
			class198.field1661.clearFiles();
		}

		if (class86.field893 != null) {
			class86.field893.clearFiles();
		}

		if (class311.archive8 != null) {
			class311.archive8.clearFiles();
		}

		if (Varcs.field1172 != null) {
			Varcs.field1172.clearFiles();
		}

		if (class391.field3703 != null) {
			class391.field3703.clearFiles();
		}

		if (class362.field3234 != null) {
			class362.field3234.clearFiles();
		}

		if (SpotAnimationDefinition.field1631 != null) {
			SpotAnimationDefinition.field1631.clearFiles();
		}

		if (PlayerCompositionColorTextureOverride.field1465 != null) {
			PlayerCompositionColorTextureOverride.field1465.clearFiles();
		}

	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1122616449"
	)
	static final void method739(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method869()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = ViewportMouse.getPacketBufferNode(ClientPacket.field2591, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class145.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
