import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
public class class350 {
	@ObfuscatedName("aa")
	static byte[][][] field3188;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;",
		garbageValue = "1898243774"
	)
	public static class468 method1929() {
		synchronized(class468.field3967) {
			if (class468.field3965 == 0) {
				return new class468();
			} else {
				class468.field3967[--class468.field3965].method2371();
				return class468.field3967[class468.field3965];
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "0"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + class226.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}
}
