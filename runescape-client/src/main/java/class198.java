import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class198 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("field1909")
	public static EvictingDualNodeHashTable field1909;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field1661;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "-1515928282"
	)
	static final void method995(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var3;
		int var4;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var3 = Players.Players_indices[var2];
			if ((Players.field1140[var3] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1140;
					var10000[var3] = (byte)(var10000[var3] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var1 = ScriptFrame.method328(var0);
						var10000 = Players.field1140;
						var10000[var3] = (byte)(var10000[var3] | 2);
					} else {
						InterfaceParent.readPlayerUpdate(var0, var3);
					}
				}
			}
		}

		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var3 = Players.Players_indices[var2];
				if ((Players.field1140[var3] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1140;
						var10000[var3] = (byte)(var10000[var3] | 2);
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var1 = ScriptFrame.method328(var0);
							var10000 = Players.field1140;
							var10000[var3] = (byte)(var10000[var3] | 2);
						} else {
							InterfaceParent.readPlayerUpdate(var0, var3);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var3 = Players.Players_emptyIndices[var2];
					if ((Players.field1140[var3] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1140;
							var10000[var3] = (byte)(var10000[var3] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = ScriptFrame.method328(var0);
								var10000 = Players.field1140;
								var10000[var3] = (byte)(var10000[var3] | 2);
							} else if (class182.updateExternalPlayer(var0, var3)) {
								var10000 = Players.field1140;
								var10000[var3] = (byte)(var10000[var3] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var3 = Players.Players_emptyIndices[var2];
						if ((Players.field1140[var3] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1140;
								var10000[var3] = (byte)(var10000[var3] | 2);
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var1 = ScriptFrame.method328(var0);
									var10000 = Players.field1140;
									var10000[var3] = (byte)(var10000[var3] | 2);
								} else if (class182.updateExternalPlayer(var0, var3)) {
									var10000 = Players.field1140;
									var10000[var3] = (byte)(var10000[var3] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.field1140;
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var5 = Client.players[var2];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
							}
						}

					}
				}
			}
		}
	}
}
