import java.util.BitSet;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class334 extends Node {
	@ObfuscatedName("vs")
	static long field2955;
	@ObfuscatedName("ac")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("aq")
	int field2956;
	@ObfuscatedName("aw")
	BitSet field2957;

	class334(int var1) {
		this.field2956 = var1;
		this.field2957 = new BitSet(128);
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIILdz;B)V",
		garbageValue = "95"
	)
	static void method1777(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field1844 != null && var0.field1844.containsKey(var1)) {
				class202 var5 = (class202)var0.field1844.get(var1);
				if (var5 != null) {
					int var6 = var5.field1693 & 31;
					if ((var6 <= 0 || class30.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var6 != 0 || class30.clientPreferences.getSoundEffectsVolume() != 0)) {
						class94.method520(var5, var2, var3, var4 == VarpDefinition.localPlayer);
					}
				}
			}
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1890087459"
	)
	static void method1778(String var0) {
		class106.field1139 = var0;

		try {
			String var1 = class193.client.getParameter(Integer.toString(18));
			String var2 = class193.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = SecureRandomCallable.method465() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}

			class26.method91(class193.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var15) {
		}

	}
}
