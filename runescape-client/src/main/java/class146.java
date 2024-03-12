import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class146 extends class145 {
	@ObfuscatedName("ip")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("aq")
	int field1364;
	@ObfuscatedName("aw")
	boolean field1363;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class146(class148 var1) {
		this.this$0 = var1;
		this.field1364 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		this.field1364 = var1.readUnsignedShort();
		this.field1363 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method827(this.field1364, this.field1363);
	}
}
