import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public final class class468 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lsf;"
	)
	static class468[] field3967;
	@ObfuscatedName("aw")
	static int field3966;
	@ObfuscatedName("al")
	static int field3965;
	@ObfuscatedName("ai")
	float field3969;
	@ObfuscatedName("ar")
	float field3970;
	@ObfuscatedName("as")
	float field3971;
	@ObfuscatedName("aa")
	float field3968;

	static {
		field3967 = new class468[0];
		field3966 = 100;
		field3967 = new class468[100];
		field3965 = 0;
		new class468();
	}

	class468() {
		this.method2371();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method2368() {
		synchronized(field3967) {
			if (field3965 < field3966 - 1) {
				field3967[++field3965 - 1] = this;
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "-101"
	)
	void method2369(float var1, float var2, float var3, float var4) {
		this.field3969 = var1;
		this.field3970 = var2;
		this.field3971 = var3;
		this.field3968 = var4;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1089175706"
	)
	public void method2370(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field3969 = var1 * var5;
		this.field3970 = var2 * var5;
		this.field3971 = var3 * var5;
		this.field3968 = var6;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "752088087"
	)
	final void method2371() {
		this.field3971 = 0.0F;
		this.field3970 = 0.0F;
		this.field3969 = 0.0F;
		this.field3968 = 1.0F;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lsf;I)V",
		garbageValue = "1990416396"
	)
	public final void method2372(class468 var1) {
		this.method2369(var1.field3969 * this.field3968 + this.field3969 * var1.field3968 + var1.field3970 * this.field3971 - var1.field3971 * this.field3970, var1.field3970 * this.field3968 + (var1.field3968 * this.field3970 - this.field3971 * var1.field3969) + this.field3969 * var1.field3971, var1.field3968 * this.field3971 + this.field3970 * var1.field3969 - this.field3969 * var1.field3970 + this.field3968 * var1.field3971, var1.field3968 * this.field3968 - this.field3969 * var1.field3969 - var1.field3970 * this.field3970 - var1.field3971 * this.field3971);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class468)) {
			return false;
		} else {
			class468 var2 = (class468)var1;
			return this.field3969 == var2.field3969 && var2.field3970 == this.field3970 && var2.field3971 == this.field3971 && var2.field3968 == this.field3968;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field3969;
		var2 = var2 * 31.0F + this.field3970;
		var2 = var2 * 31.0F + this.field3971;
		var2 = var2 * 31.0F + this.field3968;
		return (int)var2;
	}

	public String toString() {
		return this.field3969 + "," + this.field3970 + "," + this.field3971 + "," + this.field3968;
	}
}
