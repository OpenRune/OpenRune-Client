import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("aq")
	public int field3952;
	@ObfuscatedName("aw")
	public int field3956;
	@ObfuscatedName("al")
	public int field3950;
	@ObfuscatedName("ai")
	public int field3948;
	@ObfuscatedName("ar")
	public int field3953;
	@ObfuscatedName("as")
	public int field3954;
	@ObfuscatedName("aa")
	public int field3947;
	@ObfuscatedName("az")
	public int field3957;
	@ObfuscatedName("ao")
	public int field3951;
	@ObfuscatedName("au")
	public int field3955;
	@ObfuscatedName("ak")
	public int field3949;

	public GraphicsDefaults() {
		this.field3952 = -1;
		this.field3956 = -1;
		this.field3950 = -1;
		this.field3948 = -1;
		this.field3953 = -1;
		this.field3954 = -1;
		this.field3947 = -1;
		this.field3957 = -1;
		this.field3951 = -1;
		this.field3955 = -1;
		this.field3949 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "1825537488"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3945.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.field3952 = var3.readNullableLargeSmart();
				this.field3956 = var3.readNullableLargeSmart();
				this.field3950 = var3.readNullableLargeSmart();
				this.field3948 = var3.readNullableLargeSmart();
				this.field3953 = var3.readNullableLargeSmart();
				this.field3954 = var3.readNullableLargeSmart();
				this.field3947 = var3.readNullableLargeSmart();
				this.field3957 = var3.readNullableLargeSmart();
				this.field3951 = var3.readNullableLargeSmart();
				this.field3955 = var3.readNullableLargeSmart();
				this.field3949 = var3.readNullableLargeSmart();
			}
		}
	}
}
