import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	static final DefaultsGroup field3944;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	static final DefaultsGroup field3945;
	@ObfuscatedName("al")
	@Export("group")
	final int group;

	static {
		field3944 = new DefaultsGroup(1);
		field3945 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-664569182"
	)
	public static void method2357(AbstractArchive var0) {
		GrandExchangeOfferWorldComparator.EnumDefinition_archive = var0;
	}
}
