import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("aq")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "67"
	)
	static int method73() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1372269351"
	)
	static int method74(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class228.method1190(var0, var1, var2);
		} else if (var0 < 1100) {
			return class357.method1945(var0, var1, var2);
		} else if (var0 < 1200) {
			return class103.method617(var0, var1, var2);
		} else if (var0 < 1300) {
			return class193.method975(var0, var1, var2);
		} else if (var0 < 1400) {
			return class175.method899(var0, var1, var2);
		} else if (var0 < 1500) {
			return SecureRandomSSLSocket.method41(var0, var1, var2);
		} else if (var0 < 1600) {
			return class155.method811(var0, var1, var2);
		} else if (var0 < 1700) {
			return VarbitComposition.method993(var0, var1, var2);
		} else if (var0 < 1800) {
			return class136.method747(var0, var1, var2);
		} else if (var0 < 1900) {
			return HttpMethod.method27(var0, var1, var2);
		} else if (var0 < 2000) {
			return UserComparator4.method672(var0, var1, var2);
		} else if (var0 < 2100) {
			return class357.method1945(var0, var1, var2);
		} else if (var0 < 2200) {
			return class103.method617(var0, var1, var2);
		} else if (var0 < 2300) {
			return class193.method975(var0, var1, var2);
		} else if (var0 < 2400) {
			return class175.method899(var0, var1, var2);
		} else if (var0 < 2500) {
			return SecureRandomSSLSocket.method41(var0, var1, var2);
		} else if (var0 < 2600) {
			return Occluder.method1563(var0, var1, var2);
		} else if (var0 < 2700) {
			return ArchiveDiskAction.method1970(var0, var1, var2);
		} else if (var0 < 2800) {
			return class11.method38(var0, var1, var2);
		} else if (var0 < 2900) {
			return HttpMethod.method28(var0, var1, var2);
		} else if (var0 < 3000) {
			return UserComparator4.method672(var0, var1, var2);
		} else if (var0 < 3200) {
			return Archive.method1986(var0, var1, var2);
		} else if (var0 < 3300) {
			return FloorUnderlayDefinition.method986(var0, var1, var2);
		} else if (var0 < 3400) {
			return Player.method508(var0, var1, var2);
		} else if (var0 < 3500) {
			return class257.method1381(var0, var1, var2);
		} else if (var0 < 3600) {
			return class366.method1953(var0, var1, var2);
		} else if (var0 < 3700) {
			return class209.method1084(var0, var1, var2);
		} else if (var0 < 3800) {
			return CollisionMap.method1203(var0, var1, var2);
		} else if (var0 < 3900) {
			return class371.method1966(var0, var1, var2);
		} else if (var0 < 4000) {
			return HttpRequestTask.method60(var0, var1, var2);
		} else if (var0 < 4100) {
			return WorldMapSprite.method1373(var0, var1, var2);
		} else if (var0 < 4200) {
			return class161.method853(var0, var1, var2);
		} else if (var0 < 4300) {
			return class218.method1127(var0, var1, var2);
		} else if (var0 < 5100) {
			return StructComposition.method1007(var0, var1, var2);
		} else if (var0 < 5400) {
			return TextureProvider.method1574(var0, var1, var2);
		} else if (var0 < 5600) {
			return LoginState.method353(var0, var1, var2);
		} else if (var0 < 5700) {
			return HttpRequest.method37(var0, var1, var2);
		} else if (var0 < 6300) {
			return class93.method514(var0, var1, var2);
		} else if (var0 < 6600) {
			return class182.method935(var0, var1, var2);
		} else if (var0 < 6700) {
			return WorldMapData_0.method1234(var0, var1, var2);
		} else if (var0 < 6800) {
			return Login.method439(var0, var1, var2);
		} else if (var0 < 6900) {
			return AABB.method1558(var0, var1, var2);
		} else if (var0 < 7000) {
			return BuddyRankComparator.method689(var0, var1, var2);
		} else if (var0 < 7100) {
			return class256.method1377(var0, var1, var2);
		} else if (var0 < 7200) {
			return class4.method7(var0, var1, var2);
		} else if (var0 < 7300) {
			return FloorOverlayDefinition.method1060(var0, var1, var2);
		} else if (var0 < 7500) {
			return class11.method39(var0, var1, var2);
		} else if (var0 < 7600) {
			return PcmPlayer.method202(var0, var1, var2);
		} else if (var0 < 7700) {
			return Client.method377(var0, var1, var2);
		} else {
			return var0 < 8100 ? CollisionMap.method1204(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1833781181"
	)
	static final int method75(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "15632"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class485.logOut();
		switch(var0) {
		case 1:
			JagexCache.method1113(24);
			SecureUrlRequester.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			class75.SpriteBuffer_reset();
		}

	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "595411787"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ArchiveLoader.widgetDefinition.loadInterface(var0)) {
			class128.runComponentCloseListeners(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
