import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3212(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3227(1, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3210(2, 0),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3209(3, 0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3213(9, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3214(4, 1),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3206(5, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3217(6, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3211(7, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3215(8, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3223(12, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3221(13, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3222(14, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3219(15, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3228(16, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3225(17, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3220(18, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3224(19, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3218(20, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3226(21, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3216(10, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3208(11, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3207(22, 3);

	@ObfuscatedName("ab")
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "420595556"
	)
	static void method1947(String var0) {
		Login.displayName = class361.method1949(var0);
	}
}
