import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("aq")
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("aw")
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("al")
	@Export("highX")
	public int highX;
	@ObfuscatedName("ai")
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1608314712"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "593577613"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1999653892"
	)
	public boolean method2361(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrc;I)V",
		garbageValue = "1052007605"
	)
	public void method2362(Bounds var1, Bounds var2) {
		this.method2363(var1, var2);
		this.method2364(var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrc;I)V",
		garbageValue = "201826679"
	)
	void method2363(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX = (var2.highX * 618836975 - (var1.lowX * 618836975 - this.lowX * 618836975)) * 1406589711;
			var2.lowX = var1.lowX;
		}

		if (var2.method2365() > var1.method2365()) {
			var2.highX -= var2.method2365() - var1.method2365();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrc;I)V",
		garbageValue = "1545253933"
	)
	void method2364(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY = (var2.highY * -222685789 - (var1.lowY * -222685789 - this.lowY * -222685789)) * 2012726795;
			var2.lowY = var1.lowY;
		}

		if (var2.method2366() > var1.method2366()) {
			var2.highY -= var2.method2366() - var1.method2366();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2031947970"
	)
	int method2365() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1810092175"
	)
	int method2366() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
