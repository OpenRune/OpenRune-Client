import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("wb")
	static Iterator field3845;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("aq")
	long field3852;
	@ObfuscatedName("aw")
	long field3855;
	@ObfuscatedName("al")
	public boolean field3856;
	@ObfuscatedName("ai")
	long field3851;
	@ObfuscatedName("ar")
	long field3853;
	@ObfuscatedName("as")
	long field3854;
	@ObfuscatedName("aa")
	int field3847;
	@ObfuscatedName("az")
	int field3850;
	@ObfuscatedName("ao")
	int field3848;
	@ObfuscatedName("au")
	int field3849;

	public Timer() {
		this.field3852 = -1L;
		this.field3855 = -1L;
		this.field3856 = false;
		this.field3851 = 0L;
		this.field3853 = 0L;
		this.field3854 = 0L;
		this.field3847 = 0;
		this.field3850 = 0;
		this.field3848 = 0;
		this.field3849 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	public void method2230() {
		this.field3852 = SecureRandomCallable.method465();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method2231() {
		if (this.field3852 != -1L) {
			this.field3853 = SecureRandomCallable.method465() - this.field3852;
			this.field3852 = -1L;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method2232(int var1) {
		this.field3855 = SecureRandomCallable.method465();
		this.field3847 = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1323143876"
	)
	public void method2233() {
		if (this.field3855 != -1L) {
			this.field3851 = SecureRandomCallable.method465() - this.field3855;
			this.field3855 = -1L;
		}

		++this.field3848;
		this.field3856 = true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1204226511"
	)
	public void method2234() {
		this.field3856 = false;
		this.field3850 = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	public void method2235() {
		this.method2233();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "70494875"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3853;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field3851;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field3854;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field3847);
		var1.writeShort(this.field3850);
		var1.writeShort(this.field3848);
		var1.writeShort(this.field3849);
	}
}
