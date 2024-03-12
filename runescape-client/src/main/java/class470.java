import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class470 {
	@ObfuscatedName("aq")
	float field3983;
	@ObfuscatedName("aw")
	float field3987;
	@ObfuscatedName("al")
	float field3981;
	@ObfuscatedName("ai")
	float field3979;
	@ObfuscatedName("ar")
	float field3984;
	@ObfuscatedName("as")
	float field3985;
	@ObfuscatedName("aa")
	float field3977;
	@ObfuscatedName("az")
	float field3988;
	@ObfuscatedName("ao")
	float field3982;
	@ObfuscatedName("au")
	float field3986;
	@ObfuscatedName("ak")
	float field3980;
	@ObfuscatedName("ah")
	float field3978;

	static {
		new class470();
	}

	class470() {
		this.method2389();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-320720084"
	)
	void method2389() {
		this.field3978 = 0.0F;
		this.field3980 = 0.0F;
		this.field3986 = 0.0F;
		this.field3988 = 0.0F;
		this.field3977 = 0.0F;
		this.field3985 = 0.0F;
		this.field3979 = 0.0F;
		this.field3981 = 0.0F;
		this.field3987 = 0.0F;
		this.field3982 = 1.0F;
		this.field3984 = 1.0F;
		this.field3983 = 1.0F;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "46"
	)
	void method2390(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field3987;
		float var5 = this.field3984;
		float var6 = this.field3988;
		float var7 = this.field3980;
		this.field3987 = var4 * var2 - var3 * this.field3981;
		this.field3981 = var4 * var3 + var2 * this.field3981;
		this.field3984 = var5 * var2 - this.field3985 * var3;
		this.field3985 = var3 * var5 + this.field3985 * var2;
		this.field3988 = var2 * var6 - this.field3982 * var3;
		this.field3982 = var2 * this.field3982 + var3 * var6;
		this.field3980 = var2 * var7 - var3 * this.field3978;
		this.field3978 = var2 * this.field3978 + var7 * var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-22"
	)
	void method2391(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field3983;
		float var5 = this.field3979;
		float var6 = this.field3977;
		float var7 = this.field3986;
		this.field3983 = var4 * var2 + var3 * this.field3981;
		this.field3981 = this.field3981 * var2 - var3 * var4;
		this.field3979 = this.field3985 * var3 + var5 * var2;
		this.field3985 = var2 * this.field3985 - var5 * var3;
		this.field3977 = this.field3982 * var3 + var2 * var6;
		this.field3982 = var2 * this.field3982 - var3 * var6;
		this.field3986 = var7 * var2 + this.field3978 * var3;
		this.field3978 = var2 * this.field3978 - var3 * var7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1616340143"
	)
	void method2392(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field3983;
		float var5 = this.field3979;
		float var6 = this.field3977;
		float var7 = this.field3986;
		this.field3983 = var2 * var4 - var3 * this.field3987;
		this.field3987 = this.field3987 * var2 + var3 * var4;
		this.field3979 = var5 * var2 - var3 * this.field3984;
		this.field3984 = this.field3984 * var2 + var3 * var5;
		this.field3977 = var2 * var6 - var3 * this.field3988;
		this.field3988 = var3 * var6 + var2 * this.field3988;
		this.field3986 = var2 * var7 - this.field3980 * var3;
		this.field3980 = this.field3980 * var2 + var3 * var7;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1732882038"
	)
	void method2393(float var1, float var2, float var3) {
		this.field3986 += var1;
		this.field3980 += var2;
		this.field3978 += var3;
	}

	public String toString() {
		return this.field3983 + "," + this.field3979 + "," + this.field3977 + "," + this.field3986 + "\n" + this.field3987 + "," + this.field3984 + "," + this.field3988 + "," + this.field3980 + "\n" + this.field3981 + "," + this.field3985 + "," + this.field3982 + "," + this.field3978;
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1484781205"
	)
	static final boolean method2394() {
		return Client.isMenuOpen;
	}
}
