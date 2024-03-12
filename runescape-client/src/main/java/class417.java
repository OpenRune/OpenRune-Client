import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class417 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class413 field3805;
	@ObfuscatedName("aw")
	int field3804;
	@ObfuscatedName("al")
	int field3803;

	@ObfuscatedSignature(
		descriptor = "(Lpv;II)V"
	)
	class417(class413 var1, int var2, int var3) {
		this.field3804 = 0;
		this.field3803 = 0;
		this.field3805 = var1;
		this.field3804 = var2;
		this.field3803 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-418333105"
	)
	public String method2193() {
		if (this.method2196()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method2197());

			for (int var2 = this.field3804; var2 < this.field3803; ++var2) {
				class415 var3 = this.field3805.method2116(var2);
				var1.append(var3.field3778);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "15"
	)
	boolean method2194(int var1) {
		return this.field3805.method2147() == 2 || this.field3805.method2147() == 1 && (!this.field3805.field3767 || this.field3803 - 1 != var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "277524048"
	)
	public boolean method2196() {
		return this.field3803 == this.field3804;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-76"
	)
	public int method2197() {
		return this.field3803 - this.field3804;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpu;I)Z",
		garbageValue = "718811765"
	)
	boolean method2198(class415 var1) {
		if (this.field3805.field3774 == 2) {
			return true;
		} else if (this.field3805.field3774 == 0) {
			return false;
		} else {
			return this.field3805.method2117() != var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "51"
	)
	int method2199() {
		if (this.method2196()) {
			return 0;
		} else {
			class415 var1 = this.field3805.method2116(this.field3803 - 1);
			if (var1.field3778 == '\n') {
				return 0;
			} else if (this.method2198(var1)) {
				return this.field3805.field3776.advances[42];
			} else {
				int var2 = this.field3805.field3776.advances[var1.field3778];
				if (var2 == 0) {
					return var1.field3778 == '\t' ? this.field3805.field3776.advances[32] * 3 : this.field3805.field3776.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lth;",
		garbageValue = "-1055719771"
	)
	public class504 method2200() {
		if (this.method2196()) {
			return new class504(0, 0);
		} else {
			class415 var1 = this.field3805.method2116(this.field3803 - 1);
			return new class504(var1.field3780 + this.method2199(), var1.field3779);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpu;",
		garbageValue = "-113"
	)
	public class415 method2201(int var1) {
		return var1 >= 0 && var1 < this.method2197() ? this.field3805.method2116(this.field3804 + var1) : null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;I)V",
		garbageValue = "-2012193885"
	)
	public static void method2195(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		class4.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}
}
