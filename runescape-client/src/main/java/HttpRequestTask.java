import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("as")
	static int field58;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final HttpRequest field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lax;Lak;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field60 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field60.connect()) {
				LoginPacket.method764(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field60.getResponse();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "-1281441350"
	)
	static int method59(Widget var0) {
		if (var0.type != 11) {
			--class60.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method1913(var1);
			return 1;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "94"
	)
	static int method60(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3903) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == 3904) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == 3905) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == 3906) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == 3907) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == 3908) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var12;
			if (var0 == 3910) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var13;
				if (var0 == 3914) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (FileSystem.grandExchangeEvents != null) {
						FileSystem.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var13);
					}

					return 1;
				} else if (var0 == 3915) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (FileSystem.grandExchangeEvents != null) {
						FileSystem.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var13);
					}

					return 1;
				} else if (var0 == 3916) {
					Interpreter.Interpreter_intStackSize -= 2;
					var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
					boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					if (FileSystem.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var4;
						FileSystem.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var13);
					}

					return 1;
				} else if (var0 == 3917) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (FileSystem.grandExchangeEvents != null) {
						FileSystem.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var13);
					}

					return 1;
				} else if (var0 == 3918) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (FileSystem.grandExchangeEvents != null) {
						FileSystem.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var13);
					}

					return 1;
				} else if (var0 == 3919) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FileSystem.grandExchangeEvents == null ? 0 : FileSystem.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var11;
					if (var0 == 3920) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.world;
						return 1;
					} else if (var0 == 3921) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var11.getOfferName();
						return 1;
					} else if (var0 == 3922) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var11.getPreviousOfferName();
						return 1;
					} else if (var0 == 3923) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3);
						long var5 = SecureRandomCallable.method465() - class334.field2955 - var11.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == 3924) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == 3925) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == 3926) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.id;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("me")
	static final void method61(double var0) {
		Rasterizer3D.method1454(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (Tiles.worldMap != null) {
			Tiles.worldMap.method2477();
		}

		ItemComposition.ItemDefinition_cachedSprites.clear();
		class30.clientPreferences.updateBrightness(var0);
	}
}
