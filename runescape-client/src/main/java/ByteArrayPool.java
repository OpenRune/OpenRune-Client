import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ar")
	static final Object field3844;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("aa")
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("az")
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ao")
	static int field3840;
	@ObfuscatedName("au")
	static int field3842;
	@ObfuscatedName("ak")
	static int field3839;
	@ObfuscatedName("ah")
	static int field3837;
	@ObfuscatedName("aj")
	static int field3838;
	@ObfuscatedName("af")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("an")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ag")
	static byte[][] field3832;
	@ObfuscatedName("am")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ay")
	public static ArrayList field3830;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	static {
		field3844 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field3840 = 0;
		field3842 = 1000;
		field3839 = 250;
		field3837 = 100;
		field3838 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field3832 = new byte[50][];
		field3830 = new ArrayList();
		Message.method334();
		new HashMap();
	}
}
