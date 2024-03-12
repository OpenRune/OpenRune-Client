import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class232 {
	@ObfuscatedName("aq")
	final int[][] field1986;
	@ObfuscatedName("aw")
	final int[][] field1987;
	@ObfuscatedName("al")
	int field1982;
	@ObfuscatedName("ai")
	int field1981;
	@ObfuscatedName("ar")
	final int[] field1984;
	@ObfuscatedName("as")
	final int[] field1985;
	@ObfuscatedName("aa")
	final int field1983;

	class232(int var1, int var2) {
		this.field1986 = new int[var1][var2];
		this.field1987 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = class318.method1693(var3 / 4);
		this.field1984 = new int[var4];
		this.field1985 = new int[var4];
		this.field1983 = var4 - 1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1608928141"
	)
	void method1211() {
		for (int var1 = 0; var1 < this.field1986.length; ++var1) {
			for (int var2 = 0; var2 < this.field1986[var1].length; ++var2) {
				this.field1986[var1][var2] = 0;
				this.field1987[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-568406997"
	)
	void method1212(int var1, int var2) {
		this.field1982 = var1;
		this.field1981 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	int method1213() {
		return this.field1982;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method1214() {
		return this.field1981;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	int method1215() {
		return this.field1986.length;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1744860747"
	)
	int method1216() {
		return this.field1986[0].length;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1119637625"
	)
	int[][] method1217() {
		return this.field1986;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1174942864"
	)
	int[][] method1218() {
		return this.field1987;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1882943904"
	)
	int[] method1219() {
		return this.field1984;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1914104479"
	)
	int[] method1220() {
		return this.field1985;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-43299646"
	)
	int method1221() {
		return this.field1983;
	}
}
