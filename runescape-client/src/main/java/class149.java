import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class149 extends class145 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("aq")
	int field1374;
	@ObfuscatedName("aw")
	byte field1373;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class149(class148 var1) {
		this.this$0 = var1;
		this.field1374 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		this.field1374 = var1.readUnsignedShort();
		this.field1373 = var1.readByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method825(this.field1374, this.field1373);
	}
}
