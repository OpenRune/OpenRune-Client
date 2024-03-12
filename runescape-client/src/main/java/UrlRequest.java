import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("aw")
	static int field1204;
	@ObfuscatedName("al")
	static int field1203;
	@ObfuscatedName("aq")
	final URL field1205;
	@ObfuscatedName("ai")
	volatile int field1207;
	@ObfuscatedName("ar")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1204 = -1;
		field1203 = -2;
	}

	UrlRequest(URL var1) {
		this.field1207 = field1204;
		this.field1205 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1623052910"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1207 != field1204;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)[B",
		garbageValue = "-6055"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-122"
	)
	public String method668() {
		return this.field1205.toString();
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-1648762980"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class246.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false);
	}
}
