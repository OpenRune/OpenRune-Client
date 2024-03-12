import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class311 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2673;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2677;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2671;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2669;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2674;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2675;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2667;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2678;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2672;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2676;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2670;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field2668;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive8")
	static Archive archive8;

	static {
		field2673 = new class311(4);
		field2677 = new class311(4);
		field2671 = new class311(6);
		field2669 = new class311(7);
		field2674 = new class311(2);
		field2675 = new class311(11);
		field2667 = new class311(5);
		field2678 = new class311(14);
		field2672 = new class311(20);
		field2676 = new class311(14);
		field2670 = new class311(7);
		field2668 = new class311(5);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	class311(int var1) {
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "854314220"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 >= 0 && (AbstractArchive.field3627 == 0 || var3 <= AbstractArchive.field3627)) {
			if (var2 == 0) {
				byte[] var4 = new byte[var3];
				var1.readBytes(var4, 0, var3);
				return var4;
			} else {
				int var6 = var1.readInt();
				if (var6 < 0 || AbstractArchive.field3627 != 0 && var6 > AbstractArchive.field3627) {
					throw new RuntimeException();
				} else {
					byte[] var5 = new byte[var6];
					if (var2 == 1) {
						BZip2Decompressor.BZip2Decompressor_decompress(var5, var6, var0, var3, 9);
					} else {
						AbstractArchive.gzipDecompressor.decompress(var1, var5);
					}

					return var5;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}
}
