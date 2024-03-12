import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class157 extends class161 {
	@ObfuscatedName("aq")
	String field1426;
	@ObfuscatedName("aw")
	int field1425;
	@ObfuscatedName("al")
	byte field1424;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class157(class162 var1) {
		this.this$0 = var1;
		this.field1426 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	@Export("vmethod3504")
	void vmethod3504(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1426 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1425 = var1.readUnsignedShort();
		this.field1424 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	@Export("vmethod3509")
	void vmethod3509(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1426);
		var2.world = this.field1425;
		var2.rank = this.field1424;
		var1.addMember(var2);
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1551771971"
	)
	static void method837(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
