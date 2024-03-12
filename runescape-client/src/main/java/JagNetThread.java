import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ia")
	static int field3644;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	AbstractSocket field3660;
	@ObfuscatedName("aa")
	int field3647;
	@ObfuscatedName("az")
	long field3656;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field3664;
	@ObfuscatedName("au")
	int field3651;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field3662;
	@ObfuscatedName("ah")
	int field3650;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	DualNodeDeque field3659;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field3661;
	@ObfuscatedName("ax")
	int field3652;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field3663;
	@ObfuscatedName("ag")
	int field3649;
	@ObfuscatedName("am")
	boolean field3645;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	class376 field3657;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field3665;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field3667;
	@ObfuscatedName("ae")
	int field3648;
	@ObfuscatedName("ab")
	CRC32 field3655;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field3666;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lom;"
	)
	Archive[] field3658;
	@ObfuscatedName("bu")
	int field3654;
	@ObfuscatedName("bo")
	int field3653;
	@ObfuscatedName("bd")
	byte field3646;
	@ObfuscatedName("bi")
	public int field3668;
	@ObfuscatedName("bq")
	public int field3669;

	public JagNetThread() {
		this.field3647 = 0;
		this.field3664 = new NodeHashTable(4096);
		this.field3651 = 0;
		this.field3662 = new NodeHashTable(32);
		this.field3650 = 0;
		this.field3659 = new DualNodeDeque();
		this.field3661 = new NodeHashTable(4096);
		this.field3652 = 0;
		this.field3663 = new NodeHashTable(4096);
		this.field3649 = 0;
		this.field3665 = new Buffer(8);
		this.field3648 = 0;
		this.field3655 = new CRC32();
		this.field3658 = new Archive[256];
		this.field3654 = -1;
		this.field3653 = 255;
		this.field3646 = 0;
		this.field3668 = 0;
		this.field3669 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1381298903"
	)
	public boolean method2017() {
		long var1 = SecureRandomCallable.method465();
		int var3 = (int)(var1 - this.field3656);
		this.field3656 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field3647 += var3;
		if (this.field3649 == 0 && this.field3650 == 0 && this.field3652 == 0 && this.field3651 == 0) {
			return true;
		} else if (this.field3660 == null) {
			return false;
		} else {
			try {
				if (this.field3647 > 30000) {
					throw new IOException();
				} else {
					class376 var4;
					Buffer var5;
					while (this.field3650 < 200 && this.field3651 > 0) {
						var4 = (class376)this.field3664.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field3660.write(var5.array, 0, 4);
						this.field3662.put(var4, var4.key);
						--this.field3651;
						++this.field3650;
					}

					while (this.field3649 < 200 && this.field3652 > 0) {
						var4 = (class376)this.field3659.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field3660.write(var5.array, 0, 4);
						var4.removeDual();
						this.field3663.put(var4, var4.key);
						--this.field3652;
						++this.field3649;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field3660.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field3647 = 0;
						byte var6 = 0;
						if (this.field3657 == null) {
							var6 = 8;
						} else if (this.field3648 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field3665.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field3660.read(this.field3665.array, this.field3665.offset, var7);
							if (this.field3646 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field3665.array;
									var10001 = var8 + this.field3665.offset;
									var10000[var10001] ^= this.field3646;
								}
							}

							var22 = this.field3665;
							var22.offset += var7;
							if (this.field3665.offset < var6) {
								break;
							}

							if (this.field3657 == null) {
								this.field3665.offset = 0;
								var8 = this.field3665.readUnsignedByte();
								var9 = this.field3665.readUnsignedShort();
								int var10 = this.field3665.readUnsignedByte();
								int var11 = this.field3665.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class376 var14 = (class376)this.field3662.get(var12);
								this.field3645 = true;
								if (var14 == null) {
									var14 = (class376)this.field3663.get(var12);
									this.field3645 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field3657 = var14;
								this.field3667 = new Buffer(this.field3657.field3624 + var11 + var15);
								this.field3667.writeByte(var10);
								this.field3667.writeInt(var11);
								this.field3648 = 8;
								this.field3665.offset = 0;
							} else if (this.field3648 == 0) {
								if (this.field3665.array[0] == -1) {
									this.field3648 = 1;
									this.field3665.offset = 0;
								} else {
									this.field3657 = null;
								}
							}
						} else {
							var7 = this.field3667.array.length - this.field3657.field3624;
							var8 = 512 - this.field3648;
							if (var8 > var7 - this.field3667.offset) {
								var8 = var7 - this.field3667.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field3660.read(this.field3667.array, this.field3667.offset, var8);
							if (this.field3646 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field3667.array;
									var10001 = this.field3667.offset + var9;
									var10000[var10001] ^= this.field3646;
								}
							}

							var22 = this.field3667;
							var22.offset += var8;
							this.field3648 += var8;
							if (this.field3667.offset == var7) {
								if (16711935L == this.field3657.key) {
									this.field3666 = this.field3667;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field3658[var9];
										if (var18 != null) {
											this.method2021(var18, var9);
										}
									}
								} else {
									this.field3655.reset();
									this.field3655.update(this.field3667.array, 0, var7);
									var9 = (int)this.field3655.getValue();
									if (this.field3657.field3625 != var9) {
										try {
											this.field3660.close();
										} catch (Exception var20) {
										}

										++this.field3668;
										this.field3660 = null;
										this.field3646 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field3668 = 0;
									this.field3669 = 0;
									this.field3657.field3626.write((int)(this.field3657.key & 65535L), this.field3667.array, 16711680L == (this.field3657.key & 16711680L), this.field3645);
								}

								this.field3657.remove();
								if (this.field3645) {
									--this.field3650;
								} else {
									--this.field3649;
								}

								this.field3648 = 0;
								this.field3657 = null;
								this.field3667 = null;
							} else {
								if (this.field3648 != 512) {
									break;
								}

								this.field3648 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field3660.close();
				} catch (Exception var19) {
				}

				++this.field3669;
				this.field3660 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "3"
	)
	public void method2018(boolean var1) {
		if (this.field3660 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field3660.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field3660.close();
				} catch (Exception var4) {
				}

				++this.field3669;
				this.field3660 = null;
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrr;ZI)V",
		garbageValue = "1973212289"
	)
	public void method2019(AbstractSocket var1, boolean var2) {
		if (this.field3660 != null) {
			try {
				this.field3660.close();
			} catch (Exception var7) {
			}

			this.field3660 = null;
		}

		this.field3660 = var1;
		this.method2018(var2);
		this.field3665.offset = 0;
		this.field3657 = null;
		this.field3667 = null;
		this.field3648 = 0;

		while (true) {
			class376 var3 = (class376)this.field3662.first();
			if (var3 == null) {
				while (true) {
					var3 = (class376)this.field3663.first();
					if (var3 == null) {
						if (this.field3646 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field3646);
								var8.writeShort(0);
								this.field3660.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field3660.close();
								} catch (Exception var5) {
								}

								++this.field3669;
								this.field3660 = null;
							}
						}

						this.field3647 = 0;
						this.field3656 = SecureRandomCallable.method465();
						return;
					}

					this.field3659.method2068(var3);
					this.field3661.put(var3, var3.key);
					++this.field3652;
					--this.field3649;
				}
			}

			this.field3664.put(var3, var3.key);
			++this.field3651;
			--this.field3650;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lom;IB)V",
		garbageValue = "-50"
	)
	void method2020(Archive var1, int var2) {
		if (var1.field3612 && !var1.field3611) {
			if (var2 <= this.field3654) {
				throw new RuntimeException("");
			}

			if (var2 < this.field3653) {
				this.field3653 = var2;
			}
		} else {
			if (var2 >= this.field3653) {
				throw new RuntimeException("");
			}

			if (var2 > this.field3654) {
				this.field3654 = var2;
			}
		}

		if (this.field3666 != null) {
			this.method2021(var1, var2);
		} else {
			this.method2022((Archive)null, 255, 255, 0, (byte)0, true);
			this.field3658[var2] = var1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lom;II)V",
		garbageValue = "1747803025"
	)
	void method2021(Archive var1, int var2) {
		this.field3666.offset = var2 * 8 + 5;
		if (this.field3666.offset >= this.field3666.array.length) {
			if (var1.field3612) {
				var1.method1977();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field3666.readInt();
			int var4 = this.field3666.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lom;IIIBZS)V",
		garbageValue = "-12032"
	)
	void method2022(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class376 var9 = (class376)this.field3664.get(var7);
		if (var9 == null) {
			var9 = (class376)this.field3662.get(var7);
			if (var9 == null) {
				var9 = (class376)this.field3661.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field3664.put(var9, var7);
						--this.field3652;
						++this.field3651;
					}

				} else {
					if (!var6) {
						var9 = (class376)this.field3663.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class376();
					var9.field3626 = var1;
					var9.field3625 = var4;
					var9.field3624 = var5;
					if (var6) {
						this.field3664.put(var9, var7);
						++this.field3651;
					} else {
						this.field3659.method2067(var9);
						this.field3661.put(var9, var7);
						++this.field3652;
					}

				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1602227051"
	)
	void method2023(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class376 var5 = (class376)this.field3661.get(var3);
		if (var5 != null) {
			this.field3659.method2068(var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-725249284"
	)
	int method2024(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field3657 != null && this.field3657.key == var3 ? this.field3667.offset * 99 / (this.field3667.array.length - this.field3657.field3624) + 1 : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "1411825896"
	)
	public int method2025(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field3651 + this.field3650;
		return var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2003230890"
	)
	public void method2026() {
		if (this.field3660 != null) {
			try {
				this.field3660.close();
			} catch (Exception var2) {
			}

			this.field3660 = null;
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-35"
	)
	static int method2027(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field748 - 7.0D) * 256.0D);
	}
}
