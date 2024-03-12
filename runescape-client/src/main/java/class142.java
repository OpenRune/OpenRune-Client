import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class142 extends class145 {
	@ObfuscatedName("aq")
	int field1356;
	@ObfuscatedName("aw")
	int field1357;
	@ObfuscatedName("al")
	int field1355;
	@ObfuscatedName("ai")
	int field1354;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class142(class148 var1) {
		this.this$0 = var1;
		this.field1356 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		this.field1356 = var1.readUnsignedShort();
		this.field1357 = var1.readInt();
		this.field1355 = var1.readUnsignedByte();
		this.field1354 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method828(this.field1356, this.field1357, this.field1355, this.field1354);
	}
}
