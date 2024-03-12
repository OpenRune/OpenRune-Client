import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class150 extends class145 {
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field1376;
	@ObfuscatedName("fz")
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("aq")
	int field1379;
	@ObfuscatedName("aw")
	int field1380;
	@ObfuscatedName("al")
	int field1378;
	@ObfuscatedName("ai")
	int field1377;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class150(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		this.field1379 = var1.readInt();
		this.field1377 = var1.readInt();
		this.field1380 = var1.readUnsignedByte();
		this.field1378 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method830(this.field1379, this.field1377, this.field1380, this.field1378);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1620728648"
	)
	static void method794(int var0) {
		JagexCache.method1113(14);
		Login.Login_banType = var0;
	}
}
