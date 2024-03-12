import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class167 extends class145 {
	@ObfuscatedName("nc")
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("aq")
	long field1457;
	@ObfuscatedName("aw")
	String field1456;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class167(class148 var1) {
		this.this$0 = var1;
		this.field1457 = -1L;
		this.field1456 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	@Export("vmethod3512")
	void vmethod3512(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1457 = var1.readLong();
		}

		this.field1456 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method823(this.field1457, this.field1456);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)Ldf;",
		garbageValue = "1422"
	)
	static ClientPreferences method875() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = VarcInt.getPreferencesFile("", class28.field84.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "441714061"
	)
	public static int method874(int var0) {
		return (var0 & class527.field4219) - 1;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "([Lng;Lng;ZS)V",
		garbageValue = "-26660"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * -1956261573 * 633921523 : var1.width * 7972343 * 671919047;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -584689567 * 2008959905 : var1.height * -119051865 * 1546300951;
		class343.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class343.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			VarpDefinition.method903(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
