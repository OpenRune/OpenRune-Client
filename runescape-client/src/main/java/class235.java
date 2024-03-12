import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public class class235 implements Comparator {
	@ObfuscatedName("as")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("az")
	static int field1995;

	class235() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;B)I",
		garbageValue = "31"
	)
	int method1231(class230 var1, class230 var2) {
		return var1.method1206() - var2.method1206();
	}

	public int compare(Object var1, Object var2) {
		return this.method1231((class230)var1, (class230)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
