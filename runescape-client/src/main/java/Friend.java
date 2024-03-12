import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("kx")
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("aq")
	boolean field3890;
	@ObfuscatedName("aw")
	boolean field3891;

	Friend() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)I",
		garbageValue = "1533507026"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field3890 && !var1.field3890) {
			return -1;
		} else if (!this.field3890 && var1.field3890) {
			return 1;
		} else if (this.field3891 && !var1.field3891) {
			return -1;
		} else if (!this.field3891 && var1.field3891) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lra;B)I",
		garbageValue = "-67"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldh;",
		garbageValue = "-54"
	)
	static class91[] method2284() {
		return new class91[]{class91.field927, class91.field928, class91.field924, class91.field925, class91.field929, class91.field926};
	}
}
