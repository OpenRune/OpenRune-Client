import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("gw")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("aw")
	Collection field77;
	@ObfuscatedName("al")
	Collection field76;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	class29[] field74;
	@ObfuscatedName("ar")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("as")
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.field74 = new class29[3];
		this.KeyHandler_pressedKeys = new boolean[112];
		this.KeyHandler_idleCycles = 0;
		this.field77 = new ArrayList(100);
		this.field76 = new ArrayList(100);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "100415818"
	)
	void method84(class29 var1, int var2) {
		this.field74[var2] = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1183692105"
	)
	int method85() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "1"
	)
	void method86(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1423851275"
	)
	synchronized void method87(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field77.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	void method88() {
		++this.KeyHandler_idleCycles;
		this.method89();
		Iterator var1 = this.field76.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field74.length && !var2.method120(this.field74[var3]); ++var3) {
			}
		}

		this.field76.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-361948226"
	)
	synchronized void method89() {
		Collection var1 = this.field76;
		this.field76 = this.field77;
		this.field77 = var1;
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label27: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					int var5 = class28.KeyHandler_keyCodes[var2];
					var2 = var5;
					boolean var6 = (var5 & 128) != 0;
					if (var6) {
						var2 = -1;
					}
					break label27;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_idleCycles = 0;
			}

			this.KeyHandler_pressedKeys[var2] = true;
			this.field77.add(new class33(1, var2));
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label16: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					int var5 = class28.KeyHandler_keyCodes[var2];
					var2 = var5 & -129;
					break label16;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = false;
			this.field77.add(new class33(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff' && class237.method1236(var2)) {
			this.field77.add(new class33(3, var2));
		}

		var1.consume();
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field77.add(new class33(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field77.add(new class33(2, var2));
			}
		}

		this.field77.add(new class33(4, 0));
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	static void method90() {
		if (Client.renderSelf) {
			class475.addPlayerToScene(VarpDefinition.localPlayer, false);
		}

	}
}
