import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class227 extends Node {
	@ObfuscatedName("al")
	public int field1944;
	@ObfuscatedName("ai")
	public int field1943;
	@ObfuscatedName("ar")
	public int field1945;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	public Widget field1946;

	@ObfuscatedSignature(
		descriptor = "(IIILng;)V"
	)
	public class227(int var1, int var2, int var3, Widget var4) {
		this.field1945 = var1;
		this.field1944 = var2;
		this.field1943 = var3;
		this.field1946 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "14"
	)
	public static int method1176(int var0) {
		return var0 >>> 4 & class527.field4218;
	}
}
