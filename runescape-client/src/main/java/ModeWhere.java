import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3723("", 0, new class389[]{class389.field3697, class389.field3699}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3727("", 1, new class389[]{class389.field3698, class389.field3697, class389.field3699}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3721("", 2, new class389[]{class389.field3698, class389.field3700, class389.field3697}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3718("", 3, new class389[]{class389.field3698}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3724("", 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3725("", 5, new class389[]{class389.field3698, class389.field3697}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3716("", 6, new class389[]{class389.field3697}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3728("", 8, new class389[]{class389.field3698, class389.field3697}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3722("", 9, new class389[]{class389.field3698, class389.field3700}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3726("", 10, new class389[]{class389.field3698}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3720("", 11, new class389[]{class389.field3698}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3717("", 12, new class389[]{class389.field3698, class389.field3697}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field3719("", 13, new class389[]{class389.field3698});

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static IndexedSprite field3715;
	@ObfuscatedName("af")
	@Export("id")
	final int id;
	@ObfuscatedName("ax")
	final Set field3730;

	static {
		$values();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Low;)V"
	)
	ModeWhere(String var3, int var4, class389[] var5) {
		this.field3730 = new HashSet();
		this.id = var4;
		class389[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class389 var8 = var6[var7];
			this.field3730.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3730 = new HashSet();
		this.id = var4;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpl;",
		garbageValue = "1"
	)
	@Export("$values")
	static ModeWhere[] $values() {
		return new ModeWhere[]{field3723, field3716, field3717, field3720, field3725, field3724, field3722, field3721, field3727, field3726, field3719, field3718, field3728};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lng;I[B[BI)V",
		garbageValue = "1875065031"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3063 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3063 = new byte[11][];
			var0.field3062 = new byte[11][];
			var0.field3131 = new int[11];
			var0.field3132 = new int[11];
		}

		var0.field3063[var1] = var2;
		if (var2 != null) {
			var0.field3054 = true;
		} else {
			var0.field3054 = false;

			for (int var4 = 0; var4 < var0.field3063.length; ++var4) {
				if (var0.field3063[var4] != null) {
					var0.field3054 = true;
					break;
				}
			}
		}

		var0.field3062[var1] = var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	public static void method2064() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(III)Lih;",
		garbageValue = "-580270022"
	)
	static RouteStrategy method2066(int var0, int var1) {
		Client.field679.approxDestinationX = var0;
		Client.field679.approxDestinationY = var1;
		Client.field679.approxDestinationSizeX = 1;
		Client.field679.approxDestinationSizeY = 1;
		return Client.field679;
	}
}
