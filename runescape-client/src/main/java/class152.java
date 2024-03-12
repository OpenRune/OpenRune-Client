import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class152 extends class145 {
	@ObfuscatedName("aq")
	boolean field1386;
	@ObfuscatedName("aw")
	byte field1390;
	@ObfuscatedName("al")
	byte field1388;
	@ObfuscatedName("ai")
	byte field1387;
	@ObfuscatedName("ar")
	byte field1389;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class152(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		this.field1386 = var1.readUnsignedByte() == 1;
		this.field1390 = var1.readByte();
		this.field1388 = var1.readByte();
		this.field1387 = var1.readByte();
		this.field1389 = var1.readByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.allowGuests = this.field1386;
		var1.field1412 = this.field1390;
		var1.field1413 = this.field1388;
		var1.field1411 = this.field1387;
		var1.field1410 = this.field1389;
	}

	@ObfuscatedName("ah")
	static final void method799(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}
}
