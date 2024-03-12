import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class207 {
	@ObfuscatedName("wq")
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field1857;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field1859;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field1856;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field1854;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field1849;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field1858;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field1845;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field1851;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field1848;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field1850;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field1847;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field1846;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field1855;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field1853;
	@ObfuscatedName("ax")
	public final int field1860;

	static {
		field1857 = new class207(0);
		field1859 = new class207(1);
		field1856 = new class207(2);
		field1854 = new class207(3);
		field1849 = new class207(4, class193.field1622);
		field1858 = new class207(5);
		field1845 = new class207(6, class193.field1621);
		field1851 = new class207(7, class193.field1625);
		field1848 = new class207(8, class193.field1623);
		field1850 = new class207(9, class193.field1624);
		field1847 = new class207(10, class193.field1620);
		field1846 = new class207(11, class193.field1626);
		field1855 = new class207(12);
		field1853 = new class207(13);
	}

	class207(int var1) {
		this(var1, (class193)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILhx;)V"
	)
	class207(int var1, class193 var2) {
		this.field1860 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2078236639"
	)
	static String method1077() {
		return class30.clientPreferences.isUsernameHidden() ? class368.method1957(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldd;",
		garbageValue = "3"
	)
	static class90[] method1076() {
		return new class90[]{class90.field919, class90.field918, class90.field920, class90.field917, class90.field921};
	}
}
