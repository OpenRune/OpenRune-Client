import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class158 extends class161 {
	@ObfuscatedName("aq")
	int field1429;
	@ObfuscatedName("aw")
	byte field1427;
	@ObfuscatedName("al")
	int field1428;
	@ObfuscatedName("ai")
	String field1430;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class158(class162 var1) {
		this.this$0 = var1;
		this.field1429 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	@Export("vmethod3504")
	void vmethod3504(Buffer var1) {
		var1.readUnsignedByte();
		this.field1429 = var1.readUnsignedShort();
		this.field1427 = var1.readByte();
		this.field1428 = var1.readUnsignedShort();
		var1.readLong();
		this.field1430 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	@Export("vmethod3509")
	void vmethod3509(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1429);
		var2.rank = this.field1427;
		var2.world = this.field1428;
		var2.username = new Username(this.field1430);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lng;III)V",
		garbageValue = "512140024"
	)
	public static void method840(Widget var0, int var1, int var2) {
		var0.field3186.bodyColors[var1] = var2;
		var0.field3186.method1807();
	}
}
