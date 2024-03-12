import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public abstract class class145 extends Node {
	class145() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	abstract void vmethod3512(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	abstract void vmethod3513(ClanSettings var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgu;",
		garbageValue = "-66"
	)
	public static VarcInt method774(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class528.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method913(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
