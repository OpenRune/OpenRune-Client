import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public enum class91 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field926(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field929(1, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field925(2, 3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field924(3, 4),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field927(4, 5),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field928(5, 6);

	@ObfuscatedName("aa")
	final int field930;
	@ObfuscatedName("az")
	final int field931;

	class91(int var3, int var4) {
		this.field930 = var3;
		this.field931 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field931;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-514020540"
	)
	public static void method487(AbstractArchive var0) {
		DbRowType.field4214 = var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lgk;",
		garbageValue = "55141962"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)V",
		garbageValue = "1635049666"
	)
	static final void method490(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null;

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new PendingSpawn();
			var10.plane = var0;
			var10.type = var3;
			var10.x = var1;
			var10.y = var2;
			var10.field984 = -1;
			class209.method1085(var10);
			Client.pendingSpawns.addFirst(var10);
		}

		var10.field993 = var4;
		var10.field990 = var5;
		var10.field986 = var6;
		var10.delay = var8;
		var10.hitpoints = var9;
		var10.method521(var7);
	}
}
