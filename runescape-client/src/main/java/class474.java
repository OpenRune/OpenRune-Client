import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
public abstract class class474 extends class297 implements class541 {
	@ObfuscatedSignature(
		descriptor = "(Lox;Lpe;I)V"
	)
	protected class474(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsy;",
		garbageValue = "79"
	)
	@Export("vmethod9278")
	protected abstract class476 vmethod9278(int var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	public int method2397() {
		return super.field2552;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-276041869"
	)
	@Export("vmethod9769")
	public Object vmethod9769(int var1) {
		class476 var2 = this.vmethod9278(var1);
		return var2 != null && var2.method2404() ? var2.method2405() : null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)Luk;",
		garbageValue = "568285893"
	)
	public class542 method2399(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class476 var3 = this.vmethod9278(var2);
		class542 var4 = new class542(var2);
		Class var5 = var3.field4001.field4205;
		if (var5 == Integer.class) {
			var4.field4314 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4314 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4314 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class537.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class537 var6 = (class537)var5.newInstance();
				var6.method2689(var1);
				var4.field4314 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
