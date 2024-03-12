import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class162 {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("aq")
	long field1439;
	@ObfuscatedName("aw")
	public long field1441;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	IterableNodeDeque field1440;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public class162(Buffer var1) {
		this.field1441 = -1L;
		this.field1440 = new IterableNodeDeque();
		this.method857(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-175058432"
	)
	void method857(Buffer var1) {
		this.field1439 = var1.readLong();
		this.field1441 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class157(this);
			} else if (var2 == 4) {
				var3 = new class168(this);
			} else if (var2 == 3) {
				var3 = new class153(this);
			} else if (var2 == 2) {
				var3 = new class151(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class158(this);
			}

			((class161)var3).vmethod3504(var1);
			this.field1440.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2036232616"
	)
	public void method858(ClanChannel var1) {
		if (var1.key == this.field1439 && var1.field1453 == this.field1441) {
			for (class161 var2 = (class161)this.field1440.last(); var2 != null; var2 = (class161)this.field1440.previous()) {
				var2.vmethod3509(var1);
			}

			++var1.field1453;
		} else {
			throw new RuntimeException("");
		}
	}
}
