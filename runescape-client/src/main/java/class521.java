import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public class class521 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	public static final class521 field4199;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	public static final class521 field4200;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	public static final class521 field4198;
	@ObfuscatedName("gh")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("ai")
	public final int field4203;
	@ObfuscatedName("ar")
	public final int field4204;
	@ObfuscatedName("as")
	public final Class field4205;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	final class517 field4202;

	static {
		field4199 = new class521(1, 0, Integer.class, new class518());
		field4200 = new class521(2, 1, Long.class, new class520());
		field4198 = new class521(0, 2, String.class, new class522());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Ltq;)V"
	)
	class521(int var1, int var2, Class var3, class517 var4) {
		this.field4203 = var1;
		this.field4204 = var2;
		this.field4205 = var3;
		this.field4202 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4204;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)Ljava/lang/Object;",
		garbageValue = "-72937018"
	)
	public Object method2572(Buffer var1) {
		return this.field4202.vmethod9338(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Luh;",
		garbageValue = "376094599"
	)
	public static class521[] method2568() {
		return new class521[]{field4198, field4199, field4200};
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Luh;",
		garbageValue = "-1236805071"
	)
	public static class521 method2569(Class var0) {
		class521[] var1 = method2568();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class521 var3 = var1[var2];
			if (var3.field4205 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Ltq;",
		garbageValue = "-487755960"
	)
	public static class517 method2570(Class var0) {
		class521 var1 = method2569(var0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field4202;
		}
	}
}
