import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("aq")
	int field234;
	@ObfuscatedName("aw")
	int field238;
	@ObfuscatedName("al")
	int field232;
	@ObfuscatedName("ai")
	int field230;
	@ObfuscatedName("ar")
	int field235;
	@ObfuscatedName("as")
	int field236;
	@ObfuscatedName("aa")
	int field227;
	@ObfuscatedName("az")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ao")
	@Export("start")
	int start;
	@ObfuscatedName("au")
	@Export("end")
	int end;
	@ObfuscatedName("ak")
	boolean field226;
	@ObfuscatedName("ah")
	int field229;
	@ObfuscatedName("aj")
	int field231;
	@ObfuscatedName("af")
	int field228;
	@ObfuscatedName("ax")
	int field239;

	@ObfuscatedSignature(
		descriptor = "(Lbr;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field226 = var1.field169;
		this.field238 = var2;
		this.field232 = var3;
		this.field230 = var4;
		this.field234 = 0;
		this.method230();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbr;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field226 = var1.field169;
		this.field238 = var2;
		this.field232 = var3;
		this.field230 = 8192;
		this.field234 = 0;
		this.method230();
	}

	@ObfuscatedName("ar")
	void method230() {
		this.field235 = this.field232;
		this.field236 = method225(this.field232, this.field230);
		this.field227 = method226(this.field232, this.field230);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("az")
	@Export("vmethod6346")
	protected int vmethod6346() {
		return this.field232 == 0 && this.field229 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ao")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field232 == 0 && this.field229 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field234 < 0) {
				if (this.field238 <= 0) {
					this.method239();
					this.remove();
					return;
				}

				this.field234 = 0;
			}

			if (this.field234 >= var7) {
				if (this.field238 >= 0) {
					this.method239();
					this.remove();
					return;
				}

				this.field234 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field226) {
					if (this.field238 < 0) {
						var9 = this.method253(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field234 >= var5) {
							return;
						}

						this.field234 = var5 + var5 - 1 - this.field234;
						this.field238 = -this.field238;
					}

					while (true) {
						var9 = this.method252(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field234 < var6) {
							return;
						}

						this.field234 = var6 + var6 - 1 - this.field234;
						this.field238 = -this.field238;
						var9 = this.method253(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field234 >= var5) {
							return;
						}

						this.field234 = var5 + var5 - 1 - this.field234;
						this.field238 = -this.field238;
					}
				} else if (this.field238 < 0) {
					while (true) {
						var9 = this.method253(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field234 >= var5) {
							return;
						}

						this.field234 = var6 - 1 - (var6 - 1 - this.field234) % var8;
					}
				} else {
					while (true) {
						var9 = this.method252(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field234 < var6) {
							return;
						}

						this.field234 = var5 + (this.field234 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field226) {
						label133: {
							if (this.field238 < 0) {
								var9 = this.method253(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field234 >= var5) {
									return;
								}

								this.field234 = var5 + var5 - 1 - this.field234;
								this.field238 = -this.field238;
								if (--this.numLoops == 0) {
									break label133;
								}
							}

							do {
								var9 = this.method252(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field234 < var6) {
									return;
								}

								this.field234 = var6 + var6 - 1 - this.field234;
								this.field238 = -this.field238;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method253(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field234 >= var5) {
									return;
								}

								this.field234 = var5 + var5 - 1 - this.field234;
								this.field238 = -this.field238;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field238 < 0) {
							while (true) {
								var9 = this.method253(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field234 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field234) / var8;
								if (var10 >= this.numLoops) {
									this.field234 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field234 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method252(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field234 < var6) {
									return;
								}

								var10 = (this.field234 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field234 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field234 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field238 < 0) {
					this.method253(var1, var9, 0, var3, 0);
					if (this.field234 < 0) {
						this.field234 = -1;
						this.method239();
						this.remove();
					}
				} else {
					this.method252(var1, var9, var7, var3, 0);
					if (this.field234 >= var7) {
						this.field234 = var7;
						this.method239();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("au")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("ak")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field229 > 0) {
			if (var1 >= this.field229) {
				if (this.field232 == Integer.MIN_VALUE) {
					this.field232 = 0;
					this.field227 = 0;
					this.field236 = 0;
					this.field235 = 0;
					this.remove();
					var1 = this.field229;
				}

				this.field229 = 0;
				this.method230();
			} else {
				this.field235 += this.field231 * var1;
				this.field236 += this.field228 * var1;
				this.field227 += this.field239 * var1;
				this.field229 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field234 < 0) {
			if (this.field238 <= 0) {
				this.method239();
				this.remove();
				return;
			}

			this.field234 = 0;
		}

		if (this.field234 >= var5) {
			if (this.field238 >= 0) {
				this.method239();
				this.remove();
				return;
			}

			this.field234 = var5 - 1;
		}

		this.field234 += this.field238 * var1;
		if (this.numLoops < 0) {
			if (!this.field226) {
				if (this.field238 < 0) {
					if (this.field234 >= var3) {
						return;
					}

					this.field234 = var4 - 1 - (var4 - 1 - this.field234) % var6;
				} else {
					if (this.field234 < var4) {
						return;
					}

					this.field234 = var3 + (this.field234 - var3) % var6;
				}

			} else {
				if (this.field238 < 0) {
					if (this.field234 >= var3) {
						return;
					}

					this.field234 = var3 + var3 - 1 - this.field234;
					this.field238 = -this.field238;
				}

				while (this.field234 >= var4) {
					this.field234 = var4 + var4 - 1 - this.field234;
					this.field238 = -this.field238;
					if (this.field234 >= var3) {
						return;
					}

					this.field234 = var3 + var3 - 1 - this.field234;
					this.field238 = -this.field238;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field226) {
					label121: {
						if (this.field238 < 0) {
							if (this.field234 >= var3) {
								return;
							}

							this.field234 = var3 + var3 - 1 - this.field234;
							this.field238 = -this.field238;
							if (--this.numLoops == 0) {
								break label121;
							}
						}

						do {
							if (this.field234 < var4) {
								return;
							}

							this.field234 = var4 + var4 - 1 - this.field234;
							this.field238 = -this.field238;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field234 >= var3) {
								return;
							}

							this.field234 = var3 + var3 - 1 - this.field234;
							this.field238 = -this.field238;
						} while(--this.numLoops != 0);
					}
				} else {
					label153: {
						int var7;
						if (this.field238 < 0) {
							if (this.field234 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field234) / var6;
							if (var7 >= this.numLoops) {
								this.field234 += var6 * this.numLoops;
								this.numLoops = 0;
								break label153;
							}

							this.field234 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field234 < var4) {
								return;
							}

							var7 = (this.field234 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field234 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label153;
							}

							this.field234 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field238 < 0) {
				if (this.field234 < 0) {
					this.field234 = -1;
					this.method239();
					this.remove();
				}
			} else if (this.field234 >= var5) {
				this.field234 = var5;
				this.method239();
				this.remove();
			}

		}
	}

	@ObfuscatedName("ah")
	public synchronized void method232(int var1) {
		this.method234(var1 << 6, this.method236());
	}

	@ObfuscatedName("aj")
	synchronized void method233(int var1) {
		this.method234(var1, this.method236());
	}

	@ObfuscatedName("af")
	synchronized void method234(int var1, int var2) {
		this.field232 = var1;
		this.field230 = var2;
		this.field229 = 0;
		this.method230();
	}

	@ObfuscatedName("ax")
	public synchronized int method235() {
		return this.field232 == Integer.MIN_VALUE ? 0 : this.field232;
	}

	@ObfuscatedName("an")
	public synchronized int method236() {
		return this.field230 < 0 ? -1 : this.field230;
	}

	@ObfuscatedName("ag")
	public synchronized void method237(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field234 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method238() {
		this.field238 = (this.field238 ^ this.field238 >> 31) + (this.field238 >>> 31);
		this.field238 = -this.field238;
	}

	@ObfuscatedName("ad")
	void method239() {
		if (this.field229 != 0) {
			if (this.field232 == Integer.MIN_VALUE) {
				this.field232 = 0;
			}

			this.field229 = 0;
			this.method230();
		}

	}

	@ObfuscatedName("at")
	public synchronized void method240(int var1, int var2) {
		this.method241(var1, var2, this.method236());
	}

	@ObfuscatedName("ay")
	public synchronized void method241(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method234(var2, var3);
		} else {
			int var4 = method225(var2, var3);
			int var5 = method226(var2, var3);
			if (var4 == this.field236 && var5 == this.field227) {
				this.field229 = 0;
			} else {
				int var6 = var2 - this.field235;
				if (this.field235 - var2 > var6) {
					var6 = this.field235 - var2;
				}

				if (var4 - this.field236 > var6) {
					var6 = var4 - this.field236;
				}

				if (this.field236 - var4 > var6) {
					var6 = this.field236 - var4;
				}

				if (var5 - this.field227 > var6) {
					var6 = var5 - this.field227;
				}

				if (this.field227 - var5 > var6) {
					var6 = this.field227 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field229 = var1;
				this.field232 = var2;
				this.field230 = var3;
				this.field231 = (var2 - this.field235) / var1;
				this.field228 = (var4 - this.field236) / var1;
				this.field239 = (var5 - this.field227) / var1;
			}
		}
	}

	@ObfuscatedName("ae")
	public synchronized void method242(int var1) {
		if (var1 == 0) {
			this.method233(0);
			this.remove();
		} else if (this.field236 == 0 && this.field227 == 0) {
			this.field229 = 0;
			this.field232 = 0;
			this.field235 = 0;
			this.remove();
		} else {
			int var2 = -this.field235;
			if (this.field235 > var2) {
				var2 = this.field235;
			}

			if (-this.field236 > var2) {
				var2 = -this.field236;
			}

			if (this.field236 > var2) {
				var2 = this.field236;
			}

			if (-this.field227 > var2) {
				var2 = -this.field227;
			}

			if (this.field227 > var2) {
				var2 = this.field227;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field229 = var1;
			this.field232 = Integer.MIN_VALUE;
			this.field231 = -this.field235 / var1;
			this.field228 = -this.field236 / var1;
			this.field239 = -this.field227 / var1;
		}
	}

	@ObfuscatedName("ac")
	public synchronized void method243(int var1) {
		if (this.field238 < 0) {
			this.field238 = -var1;
		} else {
			this.field238 = var1;
		}

	}

	@ObfuscatedName("ab")
	public synchronized int method244() {
		return this.field238 < 0 ? -this.field238 : this.field238;
	}

	@ObfuscatedName("bw")
	public boolean method245() {
		return this.field234 < 0 || this.field234 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bv")
	public boolean method246() {
		return this.field229 != 0;
	}

	@ObfuscatedName("by")
	int method252(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field229 > 0) {
				int var6 = var2 + this.field229;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field229 += var2;
				if (this.field238 == 256 && (this.field234 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method264(0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field236, this.field227, this.field228, this.field239, 0, var6, var3, this);
					} else {
						var2 = method263(((RawSound)super.sound).samples, var1, this.field234, var2, this.field235, this.field231, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method268(0, 0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field236, this.field227, this.field228, this.field239, 0, var6, var3, this, this.field238, var5);
				} else {
					var2 = method267(0, 0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field235, this.field231, 0, var6, var3, this, this.field238, var5);
				}

				this.field229 -= var2;
				if (this.field229 != 0) {
					return var2;
				}

				if (!this.method254()) {
					continue;
				}

				return var4;
			}

			if (this.field238 == 256 && (this.field234 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method256(0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field236, this.field227, 0, var4, var3, this);
				}

				return method255(((RawSound)super.sound).samples, var1, this.field234, var2, this.field235, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method260(0, 0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field236, this.field227, 0, var4, var3, this, this.field238, var5);
			}

			return method259(0, 0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field235, 0, var4, var3, this, this.field238, var5);
		}
	}

	@ObfuscatedName("bb")
	int method253(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field229 > 0) {
				int var6 = var2 + this.field229;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field229 += var2;
				if (this.field238 == -256 && (this.field234 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method266(0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field236, this.field227, this.field228, this.field239, 0, var6, var3, this);
					} else {
						var2 = method265(((RawSound)super.sound).samples, var1, this.field234, var2, this.field235, this.field231, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method270(0, 0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field236, this.field227, this.field228, this.field239, 0, var6, var3, this, this.field238, var5);
				} else {
					var2 = method269(0, 0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field235, this.field231, 0, var6, var3, this, this.field238, var5);
				}

				this.field229 -= var2;
				if (this.field229 != 0) {
					return var2;
				}

				if (!this.method254()) {
					continue;
				}

				return var4;
			}

			if (this.field238 == -256 && (this.field234 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method258(0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field236, this.field227, 0, var4, var3, this);
				}

				return method257(((RawSound)super.sound).samples, var1, this.field234, var2, this.field235, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method262(0, 0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field236, this.field227, 0, var4, var3, this, this.field238, var5);
			}

			return method261(0, 0, ((RawSound)super.sound).samples, var1, this.field234, var2, this.field235, 0, var4, var3, this, this.field238, var5);
		}
	}

	@ObfuscatedName("bf")
	boolean method254() {
		int var1 = this.field232;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method225(var1, this.field230);
			var3 = method226(var1, this.field230);
		}

		if (var1 == this.field235 && var2 == this.field236 && var3 == this.field227) {
			if (this.field232 == Integer.MIN_VALUE) {
				this.field232 = 0;
				this.field227 = 0;
				this.field236 = 0;
				this.field235 = 0;
				this.remove();
				return true;
			} else {
				this.method230();
				return false;
			}
		} else {
			if (this.field235 < var1) {
				this.field231 = 1;
				this.field229 = var1 - this.field235;
			} else if (this.field235 > var1) {
				this.field231 = -1;
				this.field229 = this.field235 - var1;
			} else {
				this.field231 = 0;
			}

			if (this.field236 < var2) {
				this.field228 = 1;
				if (this.field229 == 0 || this.field229 > var2 - this.field236) {
					this.field229 = var2 - this.field236;
				}
			} else if (this.field236 > var2) {
				this.field228 = -1;
				if (this.field229 == 0 || this.field229 > this.field236 - var2) {
					this.field229 = this.field236 - var2;
				}
			} else {
				this.field228 = 0;
			}

			if (this.field227 < var3) {
				this.field239 = 1;
				if (this.field229 == 0 || this.field229 > var3 - this.field227) {
					this.field229 = var3 - this.field227;
				}
			} else if (this.field227 > var3) {
				this.field239 = -1;
				if (this.field229 == 0 || this.field229 > this.field227 - var3) {
					this.field229 = this.field227 - var3;
				}
			} else {
				this.field239 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("bh")
	@Export("vmethod1014")
	int vmethod1014() {
		int var1 = this.field235 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field234 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("aq")
	static int method225(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("aw")
	static int method226(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lbr;II)Lbs;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field183 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lbr;III)Lbs;"
	)
	public static RawPcmStream method229(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbs;)I"
	)
	static int method255(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field234 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbs;)I"
	)
	static int method256(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field234 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbs;)I"
	)
	static int method257(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field234 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbs;)I"
	)
	static int method258(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field234 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbs;II)I"
	)
	static int method259(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field234 = var4;
		return var5;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method260(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field234 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbs;II)I"
	)
	static int method261(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field234 = var4;
		return var5;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method262(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field234 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbs;)I"
	)
	static int method263(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field236 += var9.field228 * (var6 - var3);
		var9.field227 += var9.field239 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field235 = var4 >> 2;
		var9.field234 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbs;)I"
	)
	static int method264(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field235 += var12.field231 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field236 = var5 >> 2;
		var12.field227 = var6 >> 2;
		var12.field234 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbs;)I"
	)
	static int method265(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field236 += var9.field228 * (var6 - var3);
		var9.field227 += var9.field239 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field235 = var4 >> 2;
		var9.field234 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbs;)I"
	)
	static int method266(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field235 += var12.field231 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field236 = var5 >> 2;
		var12.field227 = var6 >> 2;
		var12.field234 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method267(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field236 -= var11.field228 * var5;
		var11.field227 -= var11.field239 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field236 += var11.field228 * var5;
		var11.field227 += var11.field239 * var5;
		var11.field235 = var6;
		var11.field234 = var4;
		return var5;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbs;II)I"
	)
	static int method268(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field235 -= var5 * var13.field231;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field235 += var13.field231 * var5;
		var13.field236 = var6;
		var13.field227 = var7;
		var13.field234 = var4;
		return var5;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method269(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field236 -= var11.field228 * var5;
		var11.field227 -= var11.field239 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field236 += var11.field228 * var5;
		var11.field227 += var11.field239 * var5;
		var11.field235 = var6;
		var11.field234 = var4;
		return var5;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbs;II)I"
	)
	static int method270(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field235 -= var5 * var13.field231;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field235 += var13.field231 * var5;
		var13.field236 = var6;
		var13.field227 = var7;
		var13.field234 = var4;
		return var5;
	}
}
