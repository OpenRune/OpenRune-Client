import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class230 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field1969;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field1972;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field1968;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field1967;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field1970;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field1971;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field1966;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lic;"
	)
	static final class230[] field1973;
	@ObfuscatedName("az")
	final int field1976;
	@ObfuscatedName("ao")
	final int field1974;
	@ObfuscatedName("au")
	final int field1975;

	static {
		field1969 = new class230(0, 8, 8);
		field1972 = new class230(6, 16, 16);
		field1968 = new class230(3, 32, 32);
		field1967 = new class230(1, 48, 48);
		field1970 = new class230(2, 64, 64);
		field1971 = new class230(4, 96, 96);
		field1966 = new class230(5, 128, 128);
		field1973 = DirectByteArrayCopier.method1937();
		Arrays.sort(field1973, new class235());
	}

	class230(int var1, int var2, int var3) {
		this.field1976 = var1;
		this.field1974 = var2;
		this.field1975 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "140463448"
	)
	int method1206() {
		return this.field1975 * this.field1974;
	}
}
