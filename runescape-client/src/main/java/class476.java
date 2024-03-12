import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public abstract class class476 implements class296 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	class521 field4001;

	class476(int var1) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1596270008"
	)
	@Export("vmethod8737")
	abstract void vmethod8737(Buffer var1, int var2);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1129594658"
	)
	public void method2403(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class472[] var3 = new class472[]{class472.field3995, class472.field3994, class472.field3992, class472.field3993};
			class472 var4 = (class472)class356.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field3996) {
				case 0:
					class370[] var5 = new class370[]{class370.field3568, class370.field3569, class370.field3571, class370.field3570};
					class356.findEnumerated(var5, var1.readUnsignedByte());
					break;
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
					int var6 = var1.readUnsignedByte();
					this.field4001 = class297.method1653(var6);
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			} else {
				this.vmethod8737(var1, var2);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-87852554"
	)
	boolean method2404() {
		return this.field4001 != null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-2127993541"
	)
	Object method2405() {
		if (this.field4001 == class521.field4199) {
			return 0;
		} else if (this.field4001 == class521.field4200) {
			return -1L;
		} else {
			return this.field4001 == class521.field4198 ? "" : null;
		}
	}
}
