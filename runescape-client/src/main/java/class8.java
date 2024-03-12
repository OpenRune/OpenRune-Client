import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class8 {
	@ObfuscatedName("aq")
	final int field14;
	@ObfuscatedName("aw")
	final int field15;
	@ObfuscatedName("al")
	final String field16;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field14 = var1;
		this.field15 = var2;
		this.field16 = var3;
	}

	@ObfuscatedName("aq")
	String method20() {
		return Integer.toHexString(this.field14) + Integer.toHexString(this.field15) + this.field16;
	}

	@ObfuscatedName("aw")
	int method21() {
		return this.field15;
	}
}
