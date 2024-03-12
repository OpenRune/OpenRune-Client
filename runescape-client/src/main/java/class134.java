import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class134 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1319;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1323;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1316;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1313;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1320;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1321;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1309;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1325;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1318;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1322;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1315;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1312;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1314;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1310;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1324;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1317;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1311;
	@ObfuscatedName("gf")
	static String field1307;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("am")
	final int field1327;
	@ObfuscatedName("ad")
	final int field1326;
	@ObfuscatedName("at")
	final int field1328;

	static {
		field1319 = new class134(0, 0, (String)null, -1, -1);
		field1323 = new class134(1, 1, (String)null, 0, 2);
		field1316 = new class134(2, 2, (String)null, 1, 2);
		field1313 = new class134(3, 3, (String)null, 2, 2);
		field1320 = new class134(4, 4, (String)null, 3, 1);
		field1321 = new class134(5, 5, (String)null, 4, 1);
		field1309 = new class134(6, 6, (String)null, 5, 1);
		field1325 = new class134(7, 7, (String)null, 6, 3);
		field1318 = new class134(8, 8, (String)null, 7, 3);
		field1322 = new class134(9, 9, (String)null, 8, 3);
		field1315 = new class134(10, 10, (String)null, 0, 7);
		field1312 = new class134(11, 11, (String)null, 1, 7);
		field1314 = new class134(12, 12, (String)null, 2, 7);
		field1310 = new class134(13, 13, (String)null, 3, 7);
		field1324 = new class134(14, 14, (String)null, 4, 7);
		field1317 = new class134(15, 15, (String)null, 5, 7);
		field1311 = new class134(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class134(int var1, int var2, String var3, int var4, int var5) {
		this.field1327 = var1;
		this.field1326 = var2;
		this.field1328 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1326;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	int method741() {
		return this.field1328;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "104"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class30.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			Client.field609[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
