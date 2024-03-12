import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class222 {
	@ObfuscatedName("ai")
	public String field1934;
	@ObfuscatedName("ar")
	public float[] field1930;
	@ObfuscatedName("as")
	public int field1932;
	@ObfuscatedName("aa")
	public int field1931;
	@ObfuscatedName("az")
	public int field1933;
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
	class222(class221 var1) {
		this.this$0 = var1;
		this.field1930 = new float[4];
		this.field1932 = 1;
		this.field1931 = 1;
		this.field1933 = 0;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "17"
	)
	static final void method1148(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class30.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
