import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static final PrivateChatMode field4376;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	public static final PrivateChatMode field4374;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static final PrivateChatMode field4375;
	@ObfuscatedName("ai")
	public final int field4377;

	static {
		field4376 = new PrivateChatMode(0);
		field4374 = new PrivateChatMode(1);
		field4375 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field4377 = var1;
	}
}
