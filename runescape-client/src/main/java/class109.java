import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class109 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1163;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1167;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1160;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1157;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1164;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1165;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1154;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1169;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1162;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1166;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1159;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1156;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1158;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("field1390")
	static final class109 field1390;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1168;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class109 field1161;
	@ObfuscatedName("ag")
	int field1170;

	static {
		field1163 = new class109(0);
		field1167 = new class109(1);
		field1160 = new class109(2);
		field1157 = new class109(3);
		field1164 = new class109(4);
		field1165 = new class109(5);
		field1154 = new class109(6);
		field1169 = new class109(7);
		field1162 = new class109(8);
		field1166 = new class109(9);
		field1159 = new class109(10);
		field1156 = new class109(11);
		field1158 = new class109(12);
		field1390 = new class109(13);
		field1168 = new class109(14);
		field1161 = new class109(15);
	}

	class109(int var1) {
		this.field1170 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	static void method631() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			SecureUrlRequester.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.length() == 0) {
			SecureUrlRequester.setLoginResponseString("", "Please enter your password.", "");
		} else {
			SecureUrlRequester.setLoginResponseString("", "Connecting to server...", "");
			ScriptEvent.setAuthenticationScheme(false);
			Interpreter.updateGameState(20);
		}
	}
}
