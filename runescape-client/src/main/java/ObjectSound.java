import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("aw")
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@Export("maxX")
	int maxX;
	@ObfuscatedName("as")
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	int field721;
	@ObfuscatedName("az")
	int field731;
	@ObfuscatedName("ao")
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ak")
	int field725;
	@ObfuscatedName("ah")
	int field723;
	@ObfuscatedName("aj")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("af")
	int field722;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field721 = var2.int7 * 128;
			this.field731 = var2.int8 * 128;
			this.field725 = var2.int5;
			this.field723 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field721 = 0;
			this.field731 = 0;
			this.field725 = 0;
			this.field723 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			SceneTilePaint.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "78"
	)
	static final boolean method418(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (BoundaryObject.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class512.field4174;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class512.field4173;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhj;",
		garbageValue = "-688519849"
	)
	static HorizontalAlignment[] method417() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1555, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1556};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "20"
	)
	static final boolean method420(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}
}
