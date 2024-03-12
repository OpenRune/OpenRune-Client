import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class131 implements Callable {
	@ObfuscatedName("gd")
	static int field1268;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class132 field1270;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class133 field1271;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	final class134 field1269;
	@ObfuscatedName("ai")
	final int field1272;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class140 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;Lfr;Lfv;Lfj;I)V"
	)
	class131(class140 var1, class132 var2, class133 var3, class134 var4, int var5) {
		this.this$0 = var1;
		this.field1270 = var2;
		this.field1271 = var3;
		this.field1269 = var4;
		this.field1272 = var5;
	}

	public Object call() {
		this.field1270.method725();
		class132[][] var1;
		if (this.field1271 == class133.field1303) {
			var1 = this.this$0.field1334;
		} else {
			var1 = this.this$0.field1339;
		}

		var1[this.field1272][this.field1269.method741()] = this.field1270;
		return null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1672712163"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Class.forName(var0);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-53"
	)
	static void method722(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}
}
