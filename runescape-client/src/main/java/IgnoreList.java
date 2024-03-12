import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	final LoginType field3877;

	@ObfuscatedSignature(
		descriptor = "(Lte;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field3877 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lra;",
		garbageValue = "4"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IS)[Lra;",
		garbageValue = "19510"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "7"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.field3877);
				boolean var5 = false;
				InterfaceParent.friendSystem.removeIgnore(var4.getName(), var5);
			} else {
				boolean var9 = (var3 & 1) != 0;
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field3877);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field3877);
				var1.readStringCp1252NullTerminated();
				Ignored var7 = (Ignored)this.getByCurrentUsername(var10);
				if (var9) {
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
					if (var8 != null && var7 != var8) {
						if (var7 != null) {
							this.remove(var8);
						} else {
							var7 = var8;
						}
					}
				}

				if (var7 != null) {
					this.changeName(var7, var10, var6);
				} else if (this.getSize() < 400) {
					int var11 = this.getSize();
					var7 = (Ignored)this.addLast(var10, var6);
					var7.id = var11;
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	static final void method2268(String var0) {
		PacketBufferNode var1 = ViewportMouse.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
