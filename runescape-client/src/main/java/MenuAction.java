import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cb")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("cf")
	@Export("otp")
	static String otp;
	@ObfuscatedName("aq")
	@Export("param0")
	int param0;
	@ObfuscatedName("aw")
	@Export("param1")
	int param1;
	@ObfuscatedName("al")
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ai")
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ar")
	@Export("itemId")
	int itemId;
	@ObfuscatedName("as")
	@Export("action")
	String action;
	@ObfuscatedName("aa")
	@Export("target")
	String target;

	MenuAction() {
	}
}
