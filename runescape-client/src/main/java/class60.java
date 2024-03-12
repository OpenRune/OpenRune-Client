import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class60 {
	@ObfuscatedName("ak")
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ng")
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("aq")
	byte[] field312;
	@ObfuscatedName("aw")
	int field314;
	@ObfuscatedName("al")
	int field313;

	class60() {
		this.field312 = null;
		this.field314 = 0;
		this.field313 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1558898831"
	)
	int method320(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field313; var1 -= var4) {
			var4 = 8 - this.field313;
			int var5 = (1 << var4) - 1;
			var2 += (this.field312[this.field314] >> this.field313 & var5) << var3;
			this.field313 = 0;
			++this.field314;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field312[this.field314] >> this.field313 & var4) << var3;
			this.field313 += var1;
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1615671029"
	)
	int method321() {
		int var1 = this.field312[this.field314] >> this.field313 & 1;
		++this.field313;
		this.field314 += this.field313 >> 3;
		this.field313 &= 7;
		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "50"
	)
	void method322(byte[] var1, int var2) {
		this.field312 = var1;
		this.field314 = var2;
		this.field313 = 0;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lbj;B)V",
		garbageValue = "8"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
