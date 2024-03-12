import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class140 extends DualNode {
	@ObfuscatedName("aq")
	int field1335;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[Lfr;"
	)
	public class132[][] field1339;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lfr;"
	)
	class132[][] field1334;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	public Skeleton field1340;
	@ObfuscatedName("ar")
	int field1336;
	@ObfuscatedName("as")
	boolean field1333;
	@ObfuscatedName("ao")
	Future field1338;
	@ObfuscatedName("au")
	List field1337;

	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IZ)V"
	)
	class140(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1339 = null;
		this.field1334 = null;
		this.field1336 = 0;
		this.field1335 = var3;
		byte[] var5 = var1.takeFile(this.field1335 >> 16 & 65535, this.field1335 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1340 = new Skeleton(var8, var9);
		this.field1337 = new ArrayList();
		this.field1338 = GrandExchangeOfferUnitPriceComparator.field3691.submit(new class139(this, var6, var7));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-883395869"
	)
	void method753(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1336 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1334 = new class132[this.field1340.method1498().method1479()][];
		this.field1339 = new class132[this.field1340.method1497()][];
		class131[] var4 = new class131[var3];

		int var5;
		int var7;
		int var17;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class133[] var8 = new class133[]{class133.field1300, class133.field1303, class133.field1299, class133.field1298, class133.field1301, class133.field1302};
			class133 var9 = (class133)class356.findEnumerated(var8, var7);
			if (var9 == null) {
				var9 = class133.field1300;
			}

			var17 = var1.readShortSmart();
			int var11 = var1.readUnsignedByte();
			class134 var12 = (class134)class356.findEnumerated(class136.method745(), var11);
			if (var12 == null) {
				var12 = class134.field1319;
			}

			class132 var13 = new class132();
			var13.method724(var1, var2);
			var4[var5] = new class131(this, var13, var9, var12, var17);
			int var14 = var9.method735();
			class132[][] var15;
			if (var9 == class133.field1303) {
				var15 = this.field1334;
			} else {
				var15 = this.field1339;
			}

			if (var15[var17] == null) {
				var15[var17] = new class132[var14];
			}

			if (var9 == class133.field1301) {
				this.field1333 = true;
			}
		}

		var5 = var3 / class520.field4196;
		int var6 = var3 % class520.field4196;
		int var16 = 0;

		for (var17 = 0; var17 < class520.field4196; ++var17) {
			var7 = var16;
			var16 += var5;
			if (var6 > 0) {
				++var16;
				--var6;
			}

			if (var7 == var16) {
				break;
			}

			this.field1337.add(GrandExchangeOfferUnitPriceComparator.field3691.submit(new class135(this, var7, var16, var4)));
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1351092140"
	)
	public boolean method754() {
		if (this.field1338 == null && this.field1337 == null) {
			return true;
		} else {
			if (this.field1338 != null) {
				if (!this.field1338.isDone()) {
					return false;
				}

				this.field1338 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1337.size(); ++var2) {
				if (!((Future)this.field1337.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1337.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1337 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	public int method755() {
		return this.field1336;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method756() {
		return this.field1333;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILez;IIB)V",
		garbageValue = "0"
	)
	public void method757(int var1, class129 var2, int var3, int var4) {
		class469 var5 = UserComparator9.method685();
		this.method758(var5, var3, var2, var1);
		this.method760(var5, var3, var2, var1);
		this.method759(var5, var3, var2, var1);
		var2.method708(var5);
		var5.method2373();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ILez;II)V",
		garbageValue = "1394144447"
	)
	void method758(class469 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method712(this.field1336);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1334[var2] != null) {
			class132 var9 = this.field1334[var2][0];
			class132 var10 = this.field1334[var2][1];
			class132 var11 = this.field1334[var2][2];
			if (var9 != null) {
				var6 = var9.method726(var4);
			}

			if (var10 != null) {
				var7 = var10.method726(var4);
			}

			if (var11 != null) {
				var8 = var11.method726(var4);
			}
		}

		class468 var16 = class350.method1929();
		var16.method2370(1.0F, 0.0F, 0.0F, var6);
		class468 var14 = class350.method1929();
		var14.method2370(0.0F, 1.0F, 0.0F, var7);
		class468 var15 = class350.method1929();
		var15.method2370(0.0F, 0.0F, 1.0F, var8);
		class468 var12 = class350.method1929();
		var12.method2372(var15);
		var12.method2372(var16);
		var12.method2372(var14);
		class469 var13 = UserComparator9.method685();
		var13.method2384(var12);
		var1.method2383(var13);
		var16.method2368();
		var14.method2368();
		var15.method2368();
		var12.method2368();
		var13.method2373();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ILez;IB)V",
		garbageValue = "52"
	)
	void method759(class469 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method713(this.field1336);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1334[var2] != null) {
			class132 var9 = this.field1334[var2][3];
			class132 var10 = this.field1334[var2][4];
			class132 var11 = this.field1334[var2][5];
			if (var9 != null) {
				var6 = var9.method726(var4);
			}

			if (var10 != null) {
				var7 = var10.method726(var4);
			}

			if (var11 != null) {
				var8 = var11.method726(var4);
			}
		}

		var1.field3976[12] = var6;
		var1.field3976[13] = var7;
		var1.field3976[14] = var8;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ILez;II)V",
		garbageValue = "492204297"
	)
	void method760(class469 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method714(this.field1336);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1334[var2] != null) {
			class132 var9 = this.field1334[var2][6];
			class132 var10 = this.field1334[var2][7];
			class132 var11 = this.field1334[var2][8];
			if (var9 != null) {
				var6 = var9.method726(var4);
			}

			if (var10 != null) {
				var7 = var10.method726(var4);
			}

			if (var11 != null) {
				var8 = var11.method726(var4);
			}
		}

		class469 var12 = UserComparator9.method685();
		var12.method2381(var6, var7, var8);
		var1.method2383(var12);
		var12.method2373();
	}

	@ObfuscatedName("aq")
	static double method752(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}
}
