import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("al")
	static int field3605;
	@ObfuscatedName("ai")
	static boolean field3604;
	@ObfuscatedName("ar")
	static Object field3606;
	@ObfuscatedName("as")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3605 = 0;
		field3604 = false;
		field3606 = new Object();
	}

	ArchiveDiskActionHandler() {
	}

//	@Export("run")
//	@ObfuscatedName("run")
	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field3606) {
						if ((field3604 || field3605 <= 1) && ArchiveDiskActionHandler_requestQueue.method2080()) {
							field3605 = 0;
							field3606.notifyAll();
							return;
						}

						field3605 = 600;
					}
				} else {
					LoginPacket.method764(100L);
					synchronized(field3606) {
						if ((field3604 || field3605 <= 1) && ArchiveDiskActionHandler_requestQueue.method2080()) {
							field3605 = 0;
							field3606.notifyAll();
							return;
						}

						--field3605;
					}
				}
			}
		} catch (Exception var13) {
			class315.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhb;",
		garbageValue = "-21"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!HealthBarUpdate.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = UserComparator4.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
