import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class211 {
	@ObfuscatedName("fo")
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	public UrlRequest field1873;
	@ObfuscatedName("aw")
	public float[] field1874;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lit;)V"
	)
	class211(class221 var1) {
		this.this$0 = var1;
		this.field1874 = new float[4];
	}
}
