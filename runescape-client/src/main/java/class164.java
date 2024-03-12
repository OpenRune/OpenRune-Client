import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class164 extends class145 {
	@ObfuscatedName("af")
	static int field1444;
	@ObfuscatedName("aq")
	int field1445;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class164(class148 var1) {
		this.this$0 = var1;
		this.field1445 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		this.field1445 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method826(this.field1445);
	}

	@ObfuscatedName("az")
	public static boolean method862(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-22481"
	)
	public static final void method863(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}
}
