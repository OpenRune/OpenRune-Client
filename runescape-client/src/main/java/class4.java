import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public final class class4 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("jn")
	static int field3;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfm;",
		garbageValue = "1472575201"
	)
	static class141[] method6() {
		return new class141[]{class141.field1347, class141.field1350, class141.field1345, class141.field1344, class141.field1348, class141.field1349, class141.field1343, class141.field1351, class141.field1346};
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "2032896608"
	)
	static int method7(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class470.method2394() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
