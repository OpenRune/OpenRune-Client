import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vt")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("aq")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("aw")
	public static String field4393;
	@ObfuscatedName("al")
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ai")
	public static int field4389;
	@ObfuscatedName("ar")
	public static int field4391;
	@ObfuscatedName("as")
	String field4394;
	@ObfuscatedName("aa")
	Throwable throwable;
}
