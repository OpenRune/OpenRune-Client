import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class160 extends class145 {
	@ObfuscatedName("om")
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("aq")
	long field1436;
	@ObfuscatedName("aw")
	String field1435;
	@ObfuscatedName("al")
	int field1434;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class160(class148 var1) {
		this.this$0 = var1;
		this.field1436 = -1L;
		this.field1435 = null;
		this.field1434 = 0;
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
			this.field1436 = var1.readLong();
		}

		this.field1435 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1434 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	@Export("vmethod3513")
	void vmethod3513(ClanSettings var1) {
		var1.method820(this.field1436, this.field1435, this.field1434);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1817056438"
	)
	static boolean method848(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IZI)Lks;",
		garbageValue = "-1328743255"
	)
	public static Frames method846(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	public static void method847() {
		class174.field1915.clear();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1866097351"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = VarcInt.getPreferencesFile("", class28.field84.name, true);
			Buffer var1 = class30.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}
}
