import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public final class class316 {
	@ObfuscatedName("al")
	static final HashMap field2829;
	@ObfuscatedName("cp")
	static int field2827;
	@ObfuscatedName("fp")
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	static {
		field2829 = new HashMap();
		java.util.Calendar.getInstance(method1687("Europe/London"));
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-2147246650"
	)
	static TimeZone method1687(String var0) {
		synchronized(field2829) {
			TimeZone var2 = (TimeZone)field2829.get(var0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(var0);
				field2829.put(var0, var2);
			}

			return var2;
		}
	}
}
