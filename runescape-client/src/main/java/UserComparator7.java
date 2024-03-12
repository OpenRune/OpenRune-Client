import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("tm")
	static int field1212;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;B)I",
		garbageValue = "-3"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Lea;",
		garbageValue = "-24"
	)
	static AttackOption[] method678() {
		return new AttackOption[]{AttackOption.field1133, AttackOption.field1131, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick};
	}
}
