import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ar")
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("as")
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("aa")
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("az")
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ao")
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("au")
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ak")
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("ah")
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("aj")
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("af")
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ax")
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("an")
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ag")
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("am")
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ad")
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("at")
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ay")
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field150;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "-12"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = SecureRandomCallable.method465();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)I",
		garbageValue = "-266471782"
	)
	static int method160(AbstractArchive var0) {
		int var1 = Login.field806.length + Login.field807.length;
		String[] var2 = Login.field805;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) {
				++var1;
			}
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIII)V",
		garbageValue = "2057198044"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3131 == null) {
			throw new RuntimeException();
		} else {
			var0.field3131[var1] = var2;
			var0.field3132[var1] = var3;
		}
	}
}
