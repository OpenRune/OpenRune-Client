import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ap")
	public static boolean field3035;
	@ObfuscatedName("bu")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bo")
	@Export("id")
	public int id;
	@ObfuscatedName("bd")
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bi")
	String field3040;
	@ObfuscatedName("bq")
	@Export("type")
	public int type;
	@ObfuscatedName("ba")
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bt")
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bk")
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bm")
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bw")
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bv")
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("by")
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bb")
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bn")
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("br")
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bp")
	@Export("x")
	public int x;
	@ObfuscatedName("bf")
	@Export("y")
	public int y;
	@ObfuscatedName("bg")
	@Export("width")
	public int width;
	@ObfuscatedName("be")
	@Export("height")
	public int height;
	@ObfuscatedName("bc")
	public int field3066;
	@ObfuscatedName("bz")
	public int field3086;
	@ObfuscatedName("bh")
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bs")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bj")
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bl")
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bx")
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cs")
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ch")
	@Export("color")
	public int color;
	@ObfuscatedName("co")
	@Export("color2")
	public int color2;
	@ObfuscatedName("cd")
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cg")
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cn")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("ci")
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cl")
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cm")
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cx")
	public boolean field3050;
	@ObfuscatedName("cw")
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cy")
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cu")
	public String field3176;
	@ObfuscatedName("ce")
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cv")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cj")
	@Export("outline")
	public int outline;
	@ObfuscatedName("ct")
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("ck")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("ca")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cp")
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cc")
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cb")
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cq")
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cf")
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cr")
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dg")
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dc")
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("do")
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dv")
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dl")
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dk")
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dw")
	public int field3116;
	@ObfuscatedName("du")
	public int field3114;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	public PlayerComposition field3186;
	@ObfuscatedName("dm")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("da")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dq")
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dd")
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dh")
	@Export("text")
	public String text;
	@ObfuscatedName("dj")
	@Export("text2")
	public String text2;
	@ObfuscatedName("di")
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ds")
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dy")
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dz")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	class210 field3036;
	@ObfuscatedName("de")
	int field3039;
	@ObfuscatedName("df")
	HashMap field3042;
	@ObfuscatedName("db")
	HashMap field3041;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	class345 field3043;
	@ObfuscatedName("dr")
	@Export("flags")
	public int flags;
	@ObfuscatedName("ea")
	public boolean field3054;
	@ObfuscatedName("ej")
	public byte[][] field3063;
	@ObfuscatedName("ee")
	public byte[][] field3062;
	@ObfuscatedName("ei")
	public int[] field3131;
	@ObfuscatedName("ey")
	public int[] field3132;
	@ObfuscatedName("el")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("eg")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ev")
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ef")
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("er")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("eh")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ep")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("es")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("et")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("en")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ed")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("em")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ew")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("eo")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("eq")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ez")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fh")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fi")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fr")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fv")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fj")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fa")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fq")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fk")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fn")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fd")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fc")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fm")
	public Object[] field3162;
	@ObfuscatedName("fy")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fx")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("ft")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fu")
	public Object[] field3168;
	@ObfuscatedName("ff")
	public Object[] field3156;
	@ObfuscatedName("fe")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fg")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fs")
	public Object[] field3166;
	@ObfuscatedName("fw")
	public Object[] field3170;
	@ObfuscatedName("fb")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fo")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fz")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fp")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fl")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gt")
	public Object[] field3175;
	@ObfuscatedName("gd")
	public Object[] field3174;
	@ObfuscatedName("gb")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gw")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gh")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gn")
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("ga")
	public String field3181;
	@ObfuscatedName("ge")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gm")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gg")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gl")
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("go")
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gy")
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gr")
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "[Lng;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gk")
	public boolean field3058;
	@ObfuscatedName("gs")
	public boolean field3059;
	@ObfuscatedName("gq")
	public int field3126;
	@ObfuscatedName("gz")
	public int field3130;
	@ObfuscatedName("gp")
	public int field3125;
	@ObfuscatedName("gf")
	public int field3120;
	@ObfuscatedName("gi")
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gv")
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gu")
	public int[] field3139;
	@ObfuscatedName("gc")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gx")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hg")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3035 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -1;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0;
		this.rawX = 0;
		this.rawY = 0;
		this.rawWidth = 0;
		this.rawHeight = 0;
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
		this.field3066 = 1;
		this.field3086 = 1;
		this.parentId = -1;
		this.isHidden = false;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = FillMode.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field3050 = false;
		this.spriteId2 = -1;
		this.spriteId = -1;
		this.spriteAngle = 0;
		this.spriteTiling = false;
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = 1;
		this.modelId = -1;
		this.modelType2 = 1;
		this.modelId2 = -1;
		this.sequenceId = -1;
		this.sequenceId2 = -1;
		this.modelOffsetX = 0;
		this.modelOffsetY = 0;
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100;
		this.field3116 = 0;
		this.field3114 = 0;
		this.modelOrthog = false;
		this.modelTransparency = false;
		this.itemQuantityMode = 2;
		this.fontId = -1;
		this.text = "";
		this.text2 = "";
		this.textLineHeight = 0;
		this.textXAlignment = 0;
		this.textYAlignment = 0;
		this.textShadowed = false;
		this.field3039 = -1;
		this.flags = 0;
		this.field3054 = false;
		this.dataText = "";
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3181 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3058 = false;
		this.field3059 = false;
		this.field3126 = -1;
		this.field3130 = 0;
		this.field3125 = 0;
		this.field3120 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "310036603"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte();
		this.buttonType = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		this.rawHeight = var1.readUnsignedShort();
		this.transparencyTop = var1.readUnsignedByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.mouseOverRedirect = var1.readUnsignedShort();
		if (this.mouseOverRedirect == 65535) {
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte();
		int var3;
		if (var2 > 0) {
			this.cs1Comparisons = new int[var2];
			this.cs1ComparisonValues = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.cs1Comparisons[var3] = var1.readUnsignedByte();
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort();
			}
		}

		var3 = var1.readUnsignedByte();
		int var4;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				this.cs1Instructions[var4] = new int[var5];

				for (int var6 = 0; var6 < var5; ++var6) {
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort();
					if (this.cs1Instructions[var4][var6] == 65535) {
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) {
			this.scrollHeight = var1.readUnsignedShort();
			this.isHidden = var1.readUnsignedByte() == 1;
		}

		if (this.type == 1) {
			var1.readUnsignedShort();
			var1.readUnsignedByte();
		}

		if (this.type == 3) {
			this.fill = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4 || this.type == 1) {
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textLineHeight = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4) {
			this.text = var1.readStringCp1252NullTerminated();
			this.text2 = var1.readStringCp1252NullTerminated();
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) {
			this.color2 = var1.readInt();
			this.mouseOverColor = var1.readInt();
			this.mouseOverColor2 = var1.readInt();
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteId = var1.readInt();
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelType2 = 1;
			this.modelId2 = var1.readUnsignedShort();
			if (this.modelId2 == 65535) {
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort();
			if (this.sequenceId2 == 65535) {
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
		}

		if (this.type == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}

		if (this.buttonType == 2) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.field3181 = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.flags |= var4 << 11;
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.buttonText = var1.readStringCp1252NullTerminated();
			if (this.buttonText.length() == 0) {
				if (this.buttonType == 1) {
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) {
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
			this.flags |= 4194304;
		}

		if (this.buttonType == 6) {
			this.flags |= 1;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1102598991"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte();
		this.isIf3 = true;
		this.type = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		if (this.type == 9) {
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort();
		}

		this.widthAlignment = var1.readByte();
		this.heightAlignment = var1.readByte();
		this.xAlignment = var1.readByte();
		this.yAlignment = var1.readByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.isHidden = var1.readUnsignedByte() == 1;
		if (this.type == 0) {
			this.scrollWidth = var1.readUnsignedShort();
			this.scrollHeight = var1.readUnsignedShort();
			this.noClickThrough = var1.readUnsignedByte() == 1;
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteAngle = var1.readUnsignedShort();
			this.spriteTiling = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
			this.outline = var1.readUnsignedByte();
			this.spriteShadow = var1.readInt();
			this.spriteFlipV = var1.readUnsignedByte() == 1;
			this.spriteFlipH = var1.readUnsignedByte() == 1;
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort();
			this.modelOffsetY = var1.readShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
			this.modelAngleZ = var1.readUnsignedShort();
			this.modelZoom = var1.readUnsignedShort();
			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1;
			var1.readUnsignedShort();
			if (this.widthAlignment != 0) {
				this.field3116 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) {
				var1.readUnsignedShort();
			}
		}

		if (this.type == 4) {
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated();
			this.textLineHeight = var1.readUnsignedByte();
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
		}

		if (this.type == 3) {
			this.color = var1.readInt();
			this.fill = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
		}

		if (this.type == 9) {
			this.lineWid = var1.readUnsignedByte();
			this.color = var1.readInt();
			this.field3050 = var1.readUnsignedByte() == 1;
		}

		this.flags = var1.readMedium();
		this.dataText = var1.readStringCp1252NullTerminated();
		int var2 = var1.readUnsignedByte();
		if (var2 > 0) {
			this.actions = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3) {
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte();
		this.dragThreshold = var1.readUnsignedByte();
		this.isScrollBar = var1.readUnsignedByte() == 1;
		this.spellActionName = var1.readStringCp1252NullTerminated();
		this.onLoad = this.readListener(var1);
		this.onMouseOver = this.readListener(var1);
		this.onMouseLeave = this.readListener(var1);
		this.onTargetLeave = this.readListener(var1);
		this.onTargetEnter = this.readListener(var1);
		this.onVarTransmit = this.readListener(var1);
		this.onInvTransmit = this.readListener(var1);
		this.onStatTransmit = this.readListener(var1);
		this.onTimer = this.readListener(var1);
		this.onOp = this.readListener(var1);
		this.onMouseRepeat = this.readListener(var1);
		this.onClick = this.readListener(var1);
		this.onClickRepeat = this.readListener(var1);
		this.onRelease = this.readListener(var1);
		this.onHold = this.readListener(var1);
		this.onDrag = this.readListener(var1);
		this.onDragComplete = this.readListener(var1);
		this.onScroll = this.readListener(var1);
		this.varTransmitTriggers = this.readListenerTriggers(var1);
		this.invTransmitTriggers = this.readListenerTriggers(var1);
		this.statTransmitTriggers = this.readListenerTriggers(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "45"
	)
	void method1891(Buffer var1) {
		this.field3040 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)[Ljava/lang/Object;",
		garbageValue = "1748550455"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				int var5 = var1.readUnsignedByte();
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) {
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true;
			return var3;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)[I",
		garbageValue = "-443548333"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				var3[var4] = var1.readInt();
			}

			return var3;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnd;ZLel;I)Lvd;",
		garbageValue = "1021905382"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3035 = false;
		if (this.field3176 != null) {
			SpritePixels var4 = this.method1895(var1, var3);
			if (var4 != null) {
				return var4;
			}
		}

		int var8;
		if (var2) {
			var8 = this.spriteId;
		} else {
			var8 = this.spriteId2;
		}

		if (var8 == -1) {
			return null;
		} else {
			long var5 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var8 + ((long)this.outline << 36);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = FileSystem.SpriteBuffer_getSprite(var1.field2975, var8, 0);
				if (var7 == null) {
					field3035 = true;
					return null;
				} else {
					this.method1898(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lel;I)Lvd;",
		garbageValue = "168489719"
	)
	SpritePixels method1895(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method1897()) {
			return this.method1896(var1, var2);
		} else {
			String var3 = this.field3176 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field2980.method2258(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method1896(var1, var2);
				if (var5 != null) {
					var4 = var5.method2733();
					this.method1898(var4);
					var1.field2980.method2259(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lel;I)Lvd;",
		garbageValue = "1911846999"
	)
	SpritePixels method1896(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3176 != null && var2 != null) {
			class344 var3 = (class344)var1.field2981.method2258(this.field3176);
			if (var3 == null) {
				var3 = new class344(this.field3176, var2);
				var1.field2981.method2259(this.field3176, var3);
			}

			return var3.method1793();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1623659386"
	)
	boolean method1897() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvd;I)V",
		garbageValue = "871154866"
	)
	void method1898(SpritePixels var1) {
		if (this.spriteFlipV) {
			var1.flipVertically();
		}

		if (this.spriteFlipH) {
			var1.flipHorizontally();
		}

		if (this.outline > 0) {
			var1.pad(this.outline);
		}

		if (this.outline >= 1) {
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) {
			var1.shadow(this.spriteShadow);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Lpb;",
		garbageValue = "-2110854177"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3035 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field2975;
				AbstractArchive var5 = var1.field2978;
				int var6 = this.fontId;
				Font var3;
				if (!class130.method720(var4, var6, 0)) {
					var3 = null;
				} else {
					var3 = class529.fontFromBytes(var5.takeFile(var6, 0));
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field3035 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lhs;IZLnt;Lho;Lht;S)Lkz;",
		garbageValue = "-18976"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field3035 = false;
		int var8;
		int var9;
		if (var4) {
			var8 = this.modelType2;
			var9 = this.modelId2;
		} else {
			var8 = this.modelType;
			var9 = this.modelId;
		}

		if (var8 == 6) {
			if (var6 == null) {
				return null;
			}

			var9 = var6.id;
		}

		if (var8 == 0) {
			return null;
		} else if (var8 == 1 && var9 == -1) {
			return null;
		} else {
			if (var7 != null && var7.useLocalPlayer && var8 == 6) {
				var8 = 3;
			}

			long var10 = (long)(var9 + (var8 << 16));
			if (var7 != null) {
				var10 |= var7.field1564 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field2976, var9, 0);
					break;
				case 2:
					var13 = VarcInt.getNpcDefinition(var9).method954((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = ArchiveDiskActionHandler.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast;
				case 5:
				default:
					break;
				case 6:
					var13 = VarcInt.getNpcDefinition(var9).method954(var7);
				}

				if (var13 == null) {
					field3035 = true;
					return null;
				}

				var12 = var13.toModel(var14, var15, -50, -10, -50);
				var1.Widget_cachedModels.put(var12, var10);
			}

			if (var2 != null) {
				var12 = var2.transformWidgetModel(var12, var3);
			}

			return var12;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnd;ZI)Lmc;",
		garbageValue = "-2042427108"
	)
	public SpriteMask method1901(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId * 1179359499 * -1227003229 : this.spriteId2 * 433678453 * 1508583389;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var3 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40);
			SpriteMask var6 = (SpriteMask)var1.Widget_cachedSpriteMasks.get(var4);
			if (var6 != null) {
				return var6;
			} else {
				SpritePixels var7 = this.getSprite(var1, var2, (UrlRequester)null);
				if (var7 == null) {
					return null;
				} else {
					SpritePixels var8 = var7.copyNormalized();
					int[] var9 = new int[var8.subHeight];
					int[] var10 = new int[var8.subHeight];

					for (int var11 = 0; var11 < var8.subHeight; ++var11) {
						int var12 = 0;
						int var13 = var8.subWidth;

						int var14;
						for (var14 = 0; var14 < var8.subWidth; ++var14) {
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) {
								var12 = var14;
								break;
							}
						}

						for (var14 = var8.subWidth - 1; var14 >= var12; --var14) {
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) {
								var13 = var14 + 1;
								break;
							}
						}

						var9[var11] = var12;
						var10[var11] = var13 - var12;
					}

					var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3);
					var1.Widget_cachedSpriteMasks.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1929901366"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.actions != null) {
				for (int var4 = 0; var4 < this.actions.length; ++var4) {
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3;
		}

		this.actions[var1] = var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1633146451"
	)
	public boolean method1903() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "90"
	)
	public boolean method1904() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;J)V"
	)
	public void method1905(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3036 = new class210();
			if (!this.field3036.method1087(var1, var2, var3)) {
				this.field3036 = null;
			} else {
				if (this.field3042 == null || this.field3041 == null) {
					this.method1908();
				}

			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lel;I)V",
		garbageValue = "2119717106"
	)
	public void method1906(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3036 = new class210();
		if (!this.field3036.method1087(var1, var3, var6)) {
			this.field3036 = null;
		} else {
			if (this.field3042 == null || this.field3041 == null) {
				this.method1908();
			}

			this.field3036.method1088(var2, var4, var5);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;B)V",
		garbageValue = "22"
	)
	public void method1907(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3036 = new class210();
			this.field3036.method1102(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	void method1908() {
		this.field3042 = new HashMap();
		this.field3041 = new HashMap();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-174817967"
	)
	public void method1909(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3042 == null) {
				this.method1908();
			}

			this.field3042.put(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-261500780"
	)
	public void method1910(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3041 == null) {
				this.method1908();
			}

			this.field3041.put(var1, var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "2143299562"
	)
	public boolean method1911(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3036 != null && this.method1912()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3036.method1097()[0] * (float)this.width);
			int var6 = (int)(this.field3036.method1097()[1] * (float)this.height);
			int var7 = var5 + (int)(this.field3036.method1097()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3036.method1097()[3] * (float)this.height);
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-106844895"
	)
	public boolean method1912() {
		return this.field3039 == 2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1369768204"
	)
	public int method1913(String var1) {
		return this.type == 11 && this.field3036 != null && this.method1912() ? this.field3036.method1091(var1) : -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "220125130"
	)
	public String method1914(String var1) {
		return this.type == 11 && this.field3036 != null && this.method1912() ? this.field3036.method1092(var1) : null;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1652857613"
	)
	public int method1915() {
		return this.field3041 != null && this.field3041.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "860239195"
	)
	public int method1916() {
		if (this.type == 11 && this.field3036 != null && this.field3041 != null && !this.field3041.isEmpty()) {
			String var1 = this.field3036.method1096();
			return var1 != null && this.field3041.containsKey(this.field3036.method1096()) ? (Integer)this.field3041.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2039365126"
	)
	public String method1917() {
		if (this.type == 11 && this.field3036 != null) {
			String var1 = this.field3036.method1096();
			Iterator var2 = this.field3036.method1095().iterator();

			while (var2.hasNext()) {
				class224 var3 = (class224)var2.next();
				String var4 = String.format("%%%S%%", var3.method1158());
				if (var3.vmethod4366() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4368()));
				} else {
					var1.replaceAll(var4, var3.vmethod4367());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1931923105"
	)
	public int[] method1918() {
		if (this.type == 11 && this.field3036 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3036.method1095().iterator();

			while (var3.hasNext()) {
				class224 var4 = (class224)var3.next();
				if (!var4.method1158().equals("user_id")) {
					if (var4.vmethod4366() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4368();
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lil;",
		garbageValue = "2081980592"
	)
	public class210 method1919() {
		return this.field3036;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lel;I)Z",
		garbageValue = "-347360869"
	)
	public boolean method1920(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3036 != null) {
			this.field3036.method1089(var2);
			if (this.field3036.method1090() != this.field3039) {
				this.field3039 = this.field3036.method1090();
				if (this.field3039 >= 3) {
					return true;
				}

				if (this.field3039 == 2) {
					this.method1921(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "23"
	)
	void method1921(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3036.method1093();
		ArrayList var3 = this.field3036.method1094();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class211 var7 = (class211)var6.next();
			var8 = Skeleton.method1499(5, this, var5, 0, 0, 0, 0, var7.field1874);
			var8.field3176 = var7.field1873.method668();
			class344 var9 = new class344(var7.field1873);
			var1.field2981.method2259(var8.field3176, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class222 var10 = (class222)var6.next();
			var8 = Skeleton.method1499(4, this, var5, 0, 0, 0, 0, var10.field1930);
			var8.text = var10.field1934;
			var8.fontId = (Integer)this.field3042.get(var10.field1933);
			var8.textXAlignment = var10.field1932;
			var8.textYAlignment = var10.field1931;
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	public void method1922() {
		this.field3043 = new class345();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3043.field2988.method92(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3043.field2988.method93(var2, 0);
		}

		this.field3043.field2988.method93('\u0080', 0);
		this.field3043.field2988.method92(82, 2);
		this.field3043.field2988.method92(81, 2);
		this.field3043.field2988.method92(86, 2);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lnf;",
		garbageValue = "1032791719"
	)
	public class347 method1923() {
		return this.field3043 != null ? this.field3043.field2994 : null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lnv;",
		garbageValue = "-926941640"
	)
	public class341 method1924() {
		return this.field3043 != null ? this.field3043.field2989 : null;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lbo;",
		garbageValue = "-2133258203"
	)
	public class27 method1925() {
		return this.field3043 != null ? this.field3043.field2988 : null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)Lnn;",
		garbageValue = "15"
	)
	public class345 method1926() {
		return this.field3043;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnf;I)Z",
		garbageValue = "-1645217279"
	)
	boolean method1927(class347 var1) {
		boolean var2 = false;
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) {
			var6 = this.text;
			var7 = new StringBuilder(var6.length());
			var8 = 0;
			var9 = -1;

			for (var10 = 0; var10 < var6.length(); ++var10) {
				var11 = var6.charAt(var10);
				if (var11 == '<') {
					var7.append(var6.substring(var8, var10));
					var9 = var10;
				} else if (var11 == '>' && var9 != -1) {
					var12 = var6.substring(var9 + 1, var10);
					var9 = -1;
					if (var12.equals("lt")) {
						var7.append("<");
					} else if (var12.equals("gt")) {
						var7.append(">");
					} else if (var12.equals("br")) {
						var7.append("\n");
					}

					var8 = var10 + 1;
				}
			}

			if (var8 < var6.length()) {
				var7.append(var6.substring(var8, var6.length()));
			}

			var5 = var7.toString();
			var2 |= var1.method1811(var5);
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var6 = this.text2;
			var7 = new StringBuilder(var6.length());
			var8 = 0;
			var9 = -1;

			for (var10 = 0; var10 < var6.length(); ++var10) {
				var11 = var6.charAt(var10);
				if (var11 == '<') {
					var7.append(var6.substring(var8, var10));
					var9 = var10;
				} else if (var11 == '>' && var9 != -1) {
					var12 = var6.substring(var9 + 1, var10);
					var9 = -1;
					if (var12.equals("lt")) {
						var7.append("<");
					} else if (var12.equals("gt")) {
						var7.append(">");
					} else if (var12.equals("br")) {
						var7.append("\n");
					}

					var8 = var10 + 1;
				}
			}

			if (var8 < var6.length()) {
				var7.append(var6.substring(var8, var6.length()));
			}

			var5 = var7.toString();
			var2 |= var1.method1812(var5);
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Z",
		garbageValue = "-1516469261"
	)
	public boolean method1928(WidgetDefinition var1) {
		class347 var2 = this.method1923();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method1865() && this.fontId != -1) {
				int var4 = var2.method1866();
				int var5 = var2.method1867();
				int var6 = var2.method1864();
				int var7 = var2.method1863();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method1813(var8);
					var3 |= this.method1927(var2);
					var3 |= var2.method1818(var4, var5);
					var3 |= var2.method1833(var6, var7);
				}
			} else if (var2.method1865()) {
				var3 |= this.method1927(var2);
			}

			var2.method1808();
			return var3;
		}
	}
}
