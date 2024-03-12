import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class7 {
	@ObfuscatedName("aj")
	static int field9;
	@ObfuscatedName("aq")
	ExecutorService field10;
	@ObfuscatedName("aw")
	Future field11;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	final Buffer field13;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class3 field12;

	@ObfuscatedSignature(
		descriptor = "(Luq;Lai;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field10 = Executors.newSingleThreadExecutor();
		this.field13 = var1;
		this.field12 = var2;
		this.method17();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "385185200"
	)
	public boolean method14() {
		return this.field11.isDone();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	public void method15() {
		this.field10.shutdown();
		this.field10 = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Luq;",
		garbageValue = "-1961365501"
	)
	public Buffer method16() {
		try {
			return (Buffer)this.field11.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "764307874"
	)
	void method17() {
		this.field11 = this.field10.submit(new class1(this, this.field13, this.field12));
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "393503738"
	)
	static void method18(int var0, int var1) {
		if (class30.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(WorldMapSectionType.field2096, var0, 0, class30.clientPreferences.getMusicVolume(), false));
			PacketWriter.method648(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1011099662"
	)
	static final void method19(int var0, int var1, int var2) {
		if (ClanMate.cameraX < var0) {
			ClanMate.cameraX = (var0 - ClanMate.cameraX) * GameBuild.field3240 / 1000 + ClanMate.cameraX + class516.field4190;
			if (ClanMate.cameraX > var0) {
				ClanMate.cameraX = var0;
			}
		}

		if (ClanMate.cameraX > var0) {
			ClanMate.cameraX -= (ClanMate.cameraX - var0) * GameBuild.field3240 / 1000 + class516.field4190;
			if (ClanMate.cameraX < var0) {
				ClanMate.cameraX = var0;
			}
		}

		if (AsyncHttpResponse.cameraY < var1) {
			AsyncHttpResponse.cameraY = (var1 - AsyncHttpResponse.cameraY) * GameBuild.field3240 / 1000 + AsyncHttpResponse.cameraY + class516.field4190;
			if (AsyncHttpResponse.cameraY > var1) {
				AsyncHttpResponse.cameraY = var1;
			}
		}

		if (AsyncHttpResponse.cameraY > var1) {
			AsyncHttpResponse.cameraY -= (AsyncHttpResponse.cameraY - var1) * GameBuild.field3240 / 1000 + class516.field4190;
			if (AsyncHttpResponse.cameraY < var1) {
				AsyncHttpResponse.cameraY = var1;
			}
		}

		if (class317.cameraZ < var2) {
			class317.cameraZ = (var2 - class317.cameraZ) * GameBuild.field3240 / 1000 + class317.cameraZ + class516.field4190;
			if (class317.cameraZ > var2) {
				class317.cameraZ = var2;
			}
		}

		if (class317.cameraZ > var2) {
			class317.cameraZ -= (class317.cameraZ - var2) * GameBuild.field3240 / 1000 + class516.field4190;
			if (class317.cameraZ < var2) {
				class317.cameraZ = var2;
			}
		}

	}
}
