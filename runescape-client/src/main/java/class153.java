import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class153 extends class161 {
	@ObfuscatedName("aq")
	int field1391;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class153(class162 var1) {
		this.this$0 = var1;
		this.field1391 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	@Export("vmethod3504")
	void vmethod3504(Buffer var1) {
		this.field1391 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	@Export("vmethod3509")
	void vmethod3509(ClanChannel var1) {
		var1.removeMember(this.field1391);
	}
}
