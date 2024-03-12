import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ue")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("av")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("aq")
	final int field4298;
	@ObfuscatedName("aw")
	final int field4301;
	@ObfuscatedName("al")
	final int field4297;
	@ObfuscatedName("ai")
	final int field4296;
	@ObfuscatedName("ar")
	final int field4299;
	@ObfuscatedName("as")
	final int field4300;
	@ObfuscatedName("aa")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("az")
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ao")
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("au")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ak")
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ah")
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("aj")
	int field4278;
	@ObfuscatedName("af")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ax")
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("an")
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ag")
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("am")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ad")
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("at")
	int field4284;
	@ObfuscatedName("ay")
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ae")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("ac")
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ab")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ap")
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bu")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bo")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bd")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bi")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bq")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ba")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bt")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bk")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bm")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bw")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bv")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("by")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bb")
	int field4288;

	BZip2State() {
		this.field4298 = 4096;
		this.field4301 = 16;
		this.field4297 = 258;
		this.field4296 = 6;
		this.field4299 = 50;
		this.field4300 = 18002;
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}
}
