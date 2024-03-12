import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	public static class388 field1892;
	@ObfuscatedName("ak")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("aq")
	long[] field1899;
	@ObfuscatedName("aw")
	int field1897;
	@ObfuscatedName("al")
	int field1894;
	@ObfuscatedName("ai")
	long field1898;
	@ObfuscatedName("ar")
	int field1895;
	@ObfuscatedName("as")
	int field1896;

	MilliClock() {
		this.field1899 = new long[10];
		this.field1897 = 256;
		this.field1894 = 1;
		this.field1895 = 0;
		this.field1898 = SecureRandomCallable.method465();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1899[var1] = this.field1898;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "481365769"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1899[var1] = 0L;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-29"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1897;
		int var4 = this.field1894;
		this.field1897 = 300;
		this.field1894 = 1;
		this.field1898 = SecureRandomCallable.method465();
		if (this.field1899[this.field1896] == 0L) {
			this.field1897 = var3;
			this.field1894 = var4;
		} else if (this.field1898 > this.field1899[this.field1896]) {
			this.field1897 = (int)((long)(var1 * 2560) / (this.field1898 - this.field1899[this.field1896]));
		}

		if (this.field1897 < 25) {
			this.field1897 = 25;
		}

		if (this.field1897 > 256) {
			this.field1897 = 256;
			this.field1894 = (int)((long)var1 - (this.field1898 - this.field1899[this.field1896]) / 10L);
		}

		if (this.field1894 > var1) {
			this.field1894 = var1;
		}

		this.field1899[this.field1896] = this.field1898;
		this.field1896 = (this.field1896 + 1) % 10;
		int var5;
		if (this.field1894 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field1899[var5] != 0L) {
					this.field1899[var5] += (long)this.field1894;
				}
			}
		}

		if (this.field1894 < var2) {
			this.field1894 = var2;
		}

		LoginPacket.method764((long)this.field1894);

		for (var5 = 0; this.field1895 < 256; this.field1895 += this.field1897) {
			++var5;
		}

		this.field1895 &= 255;
		return var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhs;",
		garbageValue = "1405746606"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class149.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[Llq;",
		garbageValue = "53"
	)
	public static class311[] method1117() {
		return new class311[]{class311.field2673, class311.field2677, class311.field2671, class311.field2669, class311.field2674, class311.field2675, class311.field2667, class311.field2678, class311.field2672, class311.field2676, class311.field2670, class311.field2668};
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIII)V",
		garbageValue = "-584845785"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (VarpDefinition.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = VarpDefinition.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = class370.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = class370.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = class370.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = class370.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = class370.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = class370.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = class370.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = class370.colorStartTag(12648192);
					} else {
						var6 = class370.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					UrlRequest.insertMenuItemNoShift("Use", Client.field625 + " " + "->" + " " + class370.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((class128.selectedSpellFlags & 8) == 8) {
						UrlRequest.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class370.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > VarpDefinition.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (VarpDefinition.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == VarpDefinition.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (AttackOption.field1133 == Client.playerAttackOption && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							UrlRequest.insertMenuItemNoShift(Client.playerMenuActions[var10], class370.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = class370.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
