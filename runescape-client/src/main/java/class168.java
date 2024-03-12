import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class168 extends class161 {
	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("aq")
	String field1461;
	@ObfuscatedName("aw")
	byte field1460;
	@ObfuscatedName("al")
	byte field1459;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class168(class162 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	@Export("vmethod3504")
	void vmethod3504(Buffer var1) {
		this.field1461 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1461 != null) {
			var1.readUnsignedByte();
			this.field1460 = var1.readByte();
			this.field1459 = var1.readByte();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	@Export("vmethod3509")
	void vmethod3509(ClanChannel var1) {
		var1.name = this.field1461;
		if (this.field1461 != null) {
			var1.field1449 = this.field1460;
			var1.field1450 = this.field1459;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "835485151"
	)
	public static void method879() {
		DbTableType.DBTableType_cache.clear();
	}
}
