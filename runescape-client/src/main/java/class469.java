import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public final class class469 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lsr;"
	)
	static class469[] field3975;
	@ObfuscatedName("al")
	static int field3974;
	@ObfuscatedName("ai")
	static int field3973;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	public static final class469 field3972;
	@ObfuscatedName("ar")
	public float[] field3976;

	static {
		field3975 = new class469[0];
		field3974 = 100;
		field3975 = new class469[100];
		field3973 = 0;
		field3972 = new class469();
	}

	public class469() {
		this.field3976 = new float[16];
		this.method2377();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsr;)V"
	)
	public class469(class469 var1) {
		this.field3976 = new float[16];
		this.method2379(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Luq;Z)V"
	)
	public class469(Buffer var1, boolean var2) {
		this.field3976 = new float[16];
		this.method2374(var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "412828198"
	)
	public void method2373() {
		synchronized(field3975) {
			if (field3973 < field3974 - 1) {
				field3975[++field3973 - 1] = this;
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;ZI)V",
		garbageValue = "-984331291"
	)
	void method2374(Buffer var1, boolean var2) {
		if (var2) {
			class470 var3 = new class470();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F));
			var3.method2390(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D);
			var3.method2391(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D);
			var3.method2392(var11);
			var3.method2393((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method2385(var3);
		} else {
			for (int var13 = 0; var13 < 16; ++var13) {
				this.field3976[var13] = var1.method2624();
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1978256666"
	)
	float[] method2375() {
		float[] var1 = new float[3];
		if ((double)this.field3976[2] < 0.999D && (double)this.field3976[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field3976[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field3976[6] / var2, (double)this.field3976[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field3976[1] / var2, (double)this.field3976[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field3976[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field3976[9]), (double)this.field3976[5]);
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "232663535"
	)
	public float[] method2376() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field3976[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field3976[2];
			var6 = (double)this.field3976[10];
			double var8 = (double)this.field3976[4];
			double var10 = (double)this.field3976[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field3976[1];
			var6 = (double)this.field3976[0];
			if (this.field3976[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1212896580"
	)
	void method2377() {
		this.field3976[0] = 1.0F;
		this.field3976[1] = 0.0F;
		this.field3976[2] = 0.0F;
		this.field3976[3] = 0.0F;
		this.field3976[4] = 0.0F;
		this.field3976[5] = 1.0F;
		this.field3976[6] = 0.0F;
		this.field3976[7] = 0.0F;
		this.field3976[8] = 0.0F;
		this.field3976[9] = 0.0F;
		this.field3976[10] = 1.0F;
		this.field3976[11] = 0.0F;
		this.field3976[12] = 0.0F;
		this.field3976[13] = 0.0F;
		this.field3976[14] = 0.0F;
		this.field3976[15] = 1.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	public void method2378() {
		this.field3976[0] = 0.0F;
		this.field3976[1] = 0.0F;
		this.field3976[2] = 0.0F;
		this.field3976[3] = 0.0F;
		this.field3976[4] = 0.0F;
		this.field3976[5] = 0.0F;
		this.field3976[6] = 0.0F;
		this.field3976[7] = 0.0F;
		this.field3976[8] = 0.0F;
		this.field3976[9] = 0.0F;
		this.field3976[10] = 0.0F;
		this.field3976[11] = 0.0F;
		this.field3976[12] = 0.0F;
		this.field3976[13] = 0.0F;
		this.field3976[14] = 0.0F;
		this.field3976[15] = 0.0F;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsr;S)V",
		garbageValue = "-26778"
	)
	public void method2379(class469 var1) {
		System.arraycopy(var1.field3976, 0, this.field3976, 0, 16);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "543049726"
	)
	public void method2380(float var1) {
		this.method2381(var1, var1, var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "43"
	)
	public void method2381(float var1, float var2, float var3) {
		this.method2377();
		this.field3976[0] = var1;
		this.field3976[5] = var2;
		this.field3976[10] = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsr;B)V",
		garbageValue = "-93"
	)
	public void method2382(class469 var1) {
		for (int var2 = 0; var2 < this.field3976.length; ++var2) {
			float[] var10000 = this.field3976;
			var10000[var2] += var1.field3976[var2];
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsr;I)V",
		garbageValue = "1817605058"
	)
	public void method2383(class469 var1) {
		float var2 = var1.field3976[0] * this.field3976[0] + var1.field3976[4] * this.field3976[1] + this.field3976[2] * var1.field3976[8] + this.field3976[3] * var1.field3976[12];
		float var3 = var1.field3976[13] * this.field3976[3] + var1.field3976[5] * this.field3976[1] + this.field3976[0] * var1.field3976[1] + var1.field3976[9] * this.field3976[2];
		float var4 = var1.field3976[10] * this.field3976[2] + this.field3976[1] * var1.field3976[6] + this.field3976[0] * var1.field3976[2] + this.field3976[3] * var1.field3976[14];
		float var5 = var1.field3976[7] * this.field3976[1] + var1.field3976[3] * this.field3976[0] + var1.field3976[11] * this.field3976[2] + var1.field3976[15] * this.field3976[3];
		float var6 = var1.field3976[12] * this.field3976[7] + var1.field3976[8] * this.field3976[6] + var1.field3976[0] * this.field3976[4] + this.field3976[5] * var1.field3976[4];
		float var7 = this.field3976[6] * var1.field3976[9] + this.field3976[4] * var1.field3976[1] + var1.field3976[5] * this.field3976[5] + this.field3976[7] * var1.field3976[13];
		float var8 = this.field3976[7] * var1.field3976[14] + var1.field3976[6] * this.field3976[5] + this.field3976[4] * var1.field3976[2] + var1.field3976[10] * this.field3976[6];
		float var9 = var1.field3976[15] * this.field3976[7] + this.field3976[4] * var1.field3976[3] + this.field3976[5] * var1.field3976[7] + this.field3976[6] * var1.field3976[11];
		float var10 = this.field3976[11] * var1.field3976[12] + this.field3976[9] * var1.field3976[4] + this.field3976[8] * var1.field3976[0] + var1.field3976[8] * this.field3976[10];
		float var11 = var1.field3976[9] * this.field3976[10] + var1.field3976[5] * this.field3976[9] + var1.field3976[1] * this.field3976[8] + this.field3976[11] * var1.field3976[13];
		float var12 = var1.field3976[14] * this.field3976[11] + this.field3976[10] * var1.field3976[10] + var1.field3976[6] * this.field3976[9] + this.field3976[8] * var1.field3976[2];
		float var13 = this.field3976[11] * var1.field3976[15] + var1.field3976[7] * this.field3976[9] + var1.field3976[3] * this.field3976[8] + this.field3976[10] * var1.field3976[11];
		float var14 = var1.field3976[12] * this.field3976[15] + var1.field3976[8] * this.field3976[14] + this.field3976[12] * var1.field3976[0] + var1.field3976[4] * this.field3976[13];
		float var15 = this.field3976[14] * var1.field3976[9] + var1.field3976[1] * this.field3976[12] + var1.field3976[5] * this.field3976[13] + var1.field3976[13] * this.field3976[15];
		float var16 = this.field3976[15] * var1.field3976[14] + var1.field3976[10] * this.field3976[14] + var1.field3976[6] * this.field3976[13] + this.field3976[12] * var1.field3976[2];
		float var17 = this.field3976[15] * var1.field3976[15] + var1.field3976[3] * this.field3976[12] + var1.field3976[7] * this.field3976[13] + var1.field3976[11] * this.field3976[14];
		this.field3976[0] = var2;
		this.field3976[1] = var3;
		this.field3976[2] = var4;
		this.field3976[3] = var5;
		this.field3976[4] = var6;
		this.field3976[5] = var7;
		this.field3976[6] = var8;
		this.field3976[7] = var9;
		this.field3976[8] = var10;
		this.field3976[9] = var11;
		this.field3976[10] = var12;
		this.field3976[11] = var13;
		this.field3976[12] = var14;
		this.field3976[13] = var15;
		this.field3976[14] = var16;
		this.field3976[15] = var17;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsf;I)V",
		garbageValue = "395557333"
	)
	public void method2384(class468 var1) {
		float var2 = var1.field3968 * var1.field3968;
		float var3 = var1.field3968 * var1.field3969;
		float var4 = var1.field3968 * var1.field3970;
		float var5 = var1.field3971 * var1.field3968;
		float var6 = var1.field3969 * var1.field3969;
		float var7 = var1.field3970 * var1.field3969;
		float var8 = var1.field3971 * var1.field3969;
		float var9 = var1.field3970 * var1.field3970;
		float var10 = var1.field3970 * var1.field3971;
		float var11 = var1.field3971 * var1.field3971;
		this.field3976[0] = var6 + var2 - var11 - var9;
		this.field3976[1] = var7 + var7 + var5 + var5;
		this.field3976[2] = var8 - var4 - var4 + var8;
		this.field3976[4] = var7 + (var7 - var5 - var5);
		this.field3976[5] = var9 + var2 - var6 - var11;
		this.field3976[6] = var10 + var3 + var10 + var3;
		this.field3976[8] = var8 + var4 + var8 + var4;
		this.field3976[9] = var10 + (var10 - var3 - var3);
		this.field3976[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lss;B)V",
		garbageValue = "0"
	)
	void method2385(class470 var1) {
		this.field3976[0] = var1.field3983;
		this.field3976[1] = var1.field3987;
		this.field3976[2] = var1.field3981;
		this.field3976[3] = 0.0F;
		this.field3976[4] = var1.field3979;
		this.field3976[5] = var1.field3984;
		this.field3976[6] = var1.field3985;
		this.field3976[7] = 0.0F;
		this.field3976[8] = var1.field3977;
		this.field3976[9] = var1.field3988;
		this.field3976[10] = var1.field3982;
		this.field3976[11] = 0.0F;
		this.field3976[12] = var1.field3986;
		this.field3976[13] = var1.field3980;
		this.field3976[14] = var1.field3978;
		this.field3976[15] = 1.0F;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1728145044"
	)
	float method2386() {
		return this.field3976[12] * this.field3976[9] * this.field3976[3] * this.field3976[6] + (this.field3976[3] * this.field3976[5] * this.field3976[8] * this.field3976[14] + this.field3976[7] * this.field3976[2] * this.field3976[8] * this.field3976[13] + this.field3976[9] * this.field3976[2] * this.field3976[4] * this.field3976[15] + this.field3976[13] * this.field3976[11] * this.field3976[0] * this.field3976[6] + (this.field3976[15] * this.field3976[5] * this.field3976[0] * this.field3976[10] - this.field3976[11] * this.field3976[5] * this.field3976[0] * this.field3976[14] - this.field3976[15] * this.field3976[0] * this.field3976[6] * this.field3976[9]) + this.field3976[0] * this.field3976[7] * this.field3976[9] * this.field3976[14] - this.field3976[13] * this.field3976[10] * this.field3976[0] * this.field3976[7] - this.field3976[15] * this.field3976[10] * this.field3976[1] * this.field3976[4] + this.field3976[14] * this.field3976[4] * this.field3976[1] * this.field3976[11] + this.field3976[8] * this.field3976[1] * this.field3976[6] * this.field3976[15] - this.field3976[12] * this.field3976[11] * this.field3976[6] * this.field3976[1] - this.field3976[8] * this.field3976[7] * this.field3976[1] * this.field3976[14] + this.field3976[10] * this.field3976[7] * this.field3976[1] * this.field3976[12] - this.field3976[2] * this.field3976[4] * this.field3976[11] * this.field3976[13] - this.field3976[8] * this.field3976[5] * this.field3976[2] * this.field3976[15] + this.field3976[11] * this.field3976[5] * this.field3976[2] * this.field3976[12] - this.field3976[12] * this.field3976[9] * this.field3976[7] * this.field3976[2] - this.field3976[14] * this.field3976[3] * this.field3976[4] * this.field3976[9] + this.field3976[13] * this.field3976[4] * this.field3976[3] * this.field3976[10] - this.field3976[3] * this.field3976[5] * this.field3976[10] * this.field3976[12] - this.field3976[13] * this.field3976[8] * this.field3976[6] * this.field3976[3]);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-648106395"
	)
	public void method2387() {
		float var1 = 1.0F / this.method2386();
		float var2 = (this.field3976[9] * this.field3976[7] * this.field3976[14] + this.field3976[15] * this.field3976[5] * this.field3976[10] - this.field3976[14] * this.field3976[11] * this.field3976[5] - this.field3976[6] * this.field3976[9] * this.field3976[15] + this.field3976[11] * this.field3976[6] * this.field3976[13] - this.field3976[13] * this.field3976[7] * this.field3976[10]) * var1;
		float var3 = (this.field3976[3] * this.field3976[10] * this.field3976[13] + (this.field3976[11] * this.field3976[1] * this.field3976[14] + this.field3976[15] * -this.field3976[1] * this.field3976[10] + this.field3976[15] * this.field3976[2] * this.field3976[9] - this.field3976[13] * this.field3976[2] * this.field3976[11] - this.field3976[3] * this.field3976[9] * this.field3976[14])) * var1;
		float var4 = (this.field3976[5] * this.field3976[3] * this.field3976[14] + this.field3976[7] * this.field3976[2] * this.field3976[13] + (this.field3976[15] * this.field3976[6] * this.field3976[1] - this.field3976[14] * this.field3976[1] * this.field3976[7] - this.field3976[5] * this.field3976[2] * this.field3976[15]) - this.field3976[13] * this.field3976[3] * this.field3976[6]) * var1;
		float var5 = var1 * (this.field3976[11] * this.field3976[2] * this.field3976[5] + this.field3976[1] * this.field3976[7] * this.field3976[10] + -this.field3976[1] * this.field3976[6] * this.field3976[11] - this.field3976[9] * this.field3976[2] * this.field3976[7] - this.field3976[3] * this.field3976[5] * this.field3976[10] + this.field3976[6] * this.field3976[3] * this.field3976[9]);
		float var6 = var1 * (this.field3976[12] * this.field3976[7] * this.field3976[10] + (this.field3976[10] * -this.field3976[4] * this.field3976[15] + this.field3976[14] * this.field3976[11] * this.field3976[4] + this.field3976[15] * this.field3976[6] * this.field3976[8] - this.field3976[12] * this.field3976[11] * this.field3976[6] - this.field3976[14] * this.field3976[8] * this.field3976[7]));
		float var7 = var1 * (this.field3976[8] * this.field3976[3] * this.field3976[14] + this.field3976[10] * this.field3976[0] * this.field3976[15] - this.field3976[14] * this.field3976[11] * this.field3976[0] - this.field3976[15] * this.field3976[2] * this.field3976[8] + this.field3976[12] * this.field3976[2] * this.field3976[11] - this.field3976[3] * this.field3976[10] * this.field3976[12]);
		float var8 = (this.field3976[12] * this.field3976[6] * this.field3976[3] + (this.field3976[2] * this.field3976[4] * this.field3976[15] + this.field3976[15] * -this.field3976[0] * this.field3976[6] + this.field3976[0] * this.field3976[7] * this.field3976[14] - this.field3976[12] * this.field3976[7] * this.field3976[2] - this.field3976[3] * this.field3976[4] * this.field3976[14])) * var1;
		float var9 = (this.field3976[10] * this.field3976[4] * this.field3976[3] + this.field3976[2] * this.field3976[7] * this.field3976[8] + (this.field3976[6] * this.field3976[0] * this.field3976[11] - this.field3976[10] * this.field3976[0] * this.field3976[7] - this.field3976[4] * this.field3976[2] * this.field3976[11]) - this.field3976[6] * this.field3976[3] * this.field3976[8]) * var1;
		float var10 = (this.field3976[8] * this.field3976[7] * this.field3976[13] + this.field3976[9] * this.field3976[4] * this.field3976[15] - this.field3976[13] * this.field3976[11] * this.field3976[4] - this.field3976[8] * this.field3976[5] * this.field3976[15] + this.field3976[12] * this.field3976[5] * this.field3976[11] - this.field3976[9] * this.field3976[7] * this.field3976[12]) * var1;
		float var11 = (this.field3976[9] * this.field3976[3] * this.field3976[12] + (this.field3976[9] * -this.field3976[0] * this.field3976[15] + this.field3976[13] * this.field3976[0] * this.field3976[11] + this.field3976[8] * this.field3976[1] * this.field3976[15] - this.field3976[12] * this.field3976[11] * this.field3976[1] - this.field3976[3] * this.field3976[8] * this.field3976[13])) * var1;
		float var12 = var1 * (this.field3976[13] * this.field3976[3] * this.field3976[4] + this.field3976[12] * this.field3976[1] * this.field3976[7] + (this.field3976[15] * this.field3976[0] * this.field3976[5] - this.field3976[13] * this.field3976[7] * this.field3976[0] - this.field3976[15] * this.field3976[4] * this.field3976[1]) - this.field3976[5] * this.field3976[3] * this.field3976[12]);
		float var13 = (this.field3976[11] * this.field3976[5] * -this.field3976[0] + this.field3976[0] * this.field3976[7] * this.field3976[9] + this.field3976[11] * this.field3976[4] * this.field3976[1] - this.field3976[1] * this.field3976[7] * this.field3976[8] - this.field3976[9] * this.field3976[3] * this.field3976[4] + this.field3976[5] * this.field3976[3] * this.field3976[8]) * var1;
		float var14 = var1 * (this.field3976[5] * this.field3976[8] * this.field3976[14] + this.field3976[14] * -this.field3976[4] * this.field3976[9] + this.field3976[4] * this.field3976[10] * this.field3976[13] - this.field3976[12] * this.field3976[10] * this.field3976[5] - this.field3976[13] * this.field3976[6] * this.field3976[8] + this.field3976[12] * this.field3976[6] * this.field3976[9]);
		float var15 = (this.field3976[2] * this.field3976[8] * this.field3976[13] + this.field3976[12] * this.field3976[10] * this.field3976[1] + (this.field3976[9] * this.field3976[0] * this.field3976[14] - this.field3976[0] * this.field3976[10] * this.field3976[13] - this.field3976[14] * this.field3976[1] * this.field3976[8]) - this.field3976[12] * this.field3976[2] * this.field3976[9]) * var1;
		float var16 = var1 * (this.field3976[5] * this.field3976[2] * this.field3976[12] + (this.field3976[4] * this.field3976[1] * this.field3976[14] + this.field3976[14] * this.field3976[5] * -this.field3976[0] + this.field3976[0] * this.field3976[6] * this.field3976[13] - this.field3976[12] * this.field3976[6] * this.field3976[1] - this.field3976[13] * this.field3976[4] * this.field3976[2]));
		float var17 = var1 * (this.field3976[6] * this.field3976[1] * this.field3976[8] + (this.field3976[10] * this.field3976[5] * this.field3976[0] - this.field3976[9] * this.field3976[0] * this.field3976[6] - this.field3976[4] * this.field3976[1] * this.field3976[10]) + this.field3976[4] * this.field3976[2] * this.field3976[9] - this.field3976[8] * this.field3976[2] * this.field3976[5]);
		this.field3976[0] = var2;
		this.field3976[1] = var3;
		this.field3976[2] = var4;
		this.field3976[3] = var5;
		this.field3976[4] = var6;
		this.field3976[5] = var7;
		this.field3976[6] = var8;
		this.field3976[7] = var9;
		this.field3976[8] = var10;
		this.field3976[9] = var11;
		this.field3976[10] = var12;
		this.field3976[11] = var13;
		this.field3976[12] = var14;
		this.field3976[13] = var15;
		this.field3976[14] = var16;
		this.field3976[15] = var17;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "2002528794"
	)
	public float[] method2388() {
		float[] var1 = new float[3];
		class467 var2 = new class467(this.field3976[0], this.field3976[1], this.field3976[2]);
		class467 var3 = new class467(this.field3976[4], this.field3976[5], this.field3976[6]);
		class467 var4 = new class467(this.field3976[8], this.field3976[9], this.field3976[10]);
		var1[0] = var2.method2367();
		var1[1] = var3.method2367();
		var1[2] = var4.method2367();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method2376();
		this.method2375();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field3976[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field3976);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class469)) {
			return false;
		} else {
			class469 var2 = (class469)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field3976[var3] != var2.field3976[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
