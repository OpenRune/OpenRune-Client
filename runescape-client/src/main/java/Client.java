import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSClient;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class327 {
	@ObfuscatedName("wh")
	public static int field390;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	static final class234 field684;
	@ObfuscatedName("wm")
	static int[] field617;
	@ObfuscatedName("wu")
	static int[] field618;
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final ApproximateRouteStrategy field679;
	@ObfuscatedName("wz")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wg")
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ws")
	static int field574;
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static class494 field675;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	static class442 field661;
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wi")
	static int field573;
	@ObfuscatedName("wy")
	static List field635;
	@ObfuscatedName("bl")
	static boolean field394;
	@ObfuscatedName("bx")
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cs")
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("co")
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cn")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cz")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cw")
	static int field450;
	@ObfuscatedName("cy")
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cu")
	static int field448;
	@ObfuscatedName("ce")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cv")
	static int field449;
	@ObfuscatedName("dc")
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("do")
	static boolean field398;
	@ObfuscatedName("dv")
	static boolean field399;
	@ObfuscatedName("dw")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("du")
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dt")
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("da")
	static int field452;
	@ObfuscatedName("dq")
	static int field460;
	@ObfuscatedName("dd")
	static long field638;
	@ObfuscatedName("dh")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dj")
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("di")
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ds")
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dy")
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dz")
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dp")
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("de")
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("df")
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("db")
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ej")
	@Export("z")
	static boolean z;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static class93 field438;
	@ObfuscatedName("ef")
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("er")
	static int field466;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field651;
	@ObfuscatedName("fy")
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("ff")
	static int field468;
	@ObfuscatedName("fe")
	static int field467;
	@ObfuscatedName("fg")
	static int field469;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static class538 field676;
	@ObfuscatedName("gq")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("gz")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("ht")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hr")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("hh")
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hi")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("hy")
	static int field472;
	@ObfuscatedName("he")
	static int[] field575;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("is")
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("if")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("iv")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("it")
	static String field625;
	@ObfuscatedName("in")
	static int field475;
	@ObfuscatedName("ir")
	static int field476;
	@ObfuscatedName("ie")
	static int field474;
	@ObfuscatedName("iw")
	static int field478;
	@ObfuscatedName("ic")
	static int field473;
	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "[Liz;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jr")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jv")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jw")
	static final int[] field680;
	@ObfuscatedName("jq")
	static int field482;
	@ObfuscatedName("jj")
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("jp")
	static int field481;
	@ObfuscatedName("ju")
	static int field483;
	@ObfuscatedName("jd")
	static int field479;
	@ObfuscatedName("kl")
	static int field488;
	@ObfuscatedName("kv")
	static boolean field405;
	@ObfuscatedName("ki")
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kw")
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("km")
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("kn")
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("kg")
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ku")
	static int field495;
	@ObfuscatedName("kq")
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("kt")
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ky")
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("kd")
	static int field484;
	@ObfuscatedName("kh")
	static int field486;
	@ObfuscatedName("kp")
	static int field491;
	@ObfuscatedName("kr")
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lr")
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lk")
	@Export("revision")
	static int revision;
	@ObfuscatedName("lp")
	static boolean field407;
	@ObfuscatedName("le")
	static int field500;
	@ObfuscatedName("lm")
	static boolean field406;
	@ObfuscatedName("lv")
	static int field508;
	@ObfuscatedName("lf")
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lo")
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("lc")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("la")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("lj")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("lg")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ln")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("lx")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("lw")
	static int[][] field620;
	@ObfuscatedName("ls")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("lh")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("ll")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("lu")
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("lb")
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ly")
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ld")
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("li")
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("lz")
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("lt")
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("lq")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mn")
	static int field515;
	@ObfuscatedName("mf")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "[Ldj;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("ml")
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mm")
	static int field514;
	@ObfuscatedName("mh")
	@Export("userId")
	static long userId;
	@ObfuscatedName("mt")
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("ms")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("mz")
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("md")
	static int field512;
	@ObfuscatedName("mu")
	static int[] field585;
	@ObfuscatedName("mv")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("my")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("me")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ma")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("mc")
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "[[[Lpr;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nv")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nb")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nj")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nm")
	static int[] field591;
	@ObfuscatedName("nn")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("nt")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nq")
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nh")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ne")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ny")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("nz")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("nk")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("nr")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("na")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("nl")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("nu")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ni")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oy")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ox")
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oe")
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oz")
	static int field528;
	@ObfuscatedName("oi")
	static int field522;
	@ObfuscatedName("oo")
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("or")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("og")
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("of")
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ov")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("oc")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ol")
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("od")
	static int field518;
	@ObfuscatedName("oq")
	static int field525;
	@ObfuscatedName("ow")
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pt")
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pe")
	@Export("weight")
	static int weight;
	@ObfuscatedName("pl")
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pf")
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pd")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("py")
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pq")
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ps")
	static boolean field420;
	@ObfuscatedName("pg")
	static int field532;
	@ObfuscatedName("px")
	static int field537;
	@ObfuscatedName("pk")
	static boolean field419;
	@ObfuscatedName("pw")
	static int field536;
	@ObfuscatedName("pc")
	static int field529;
	@ObfuscatedName("pi")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pv")
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qi")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qz")
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("ql")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qg")
	static int field542;
	@ObfuscatedName("qm")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qx")
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qa")
	static int[] field595;
	@ObfuscatedName("qu")
	static int field549;
	@ObfuscatedName("qd")
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qe")
	static int field541;
	@ObfuscatedName("qh")
	static int field543;
	@ObfuscatedName("qk")
	static int field545;
	@ObfuscatedName("qj")
	static int field544;
	@ObfuscatedName("qc")
	static int field539;
	@ObfuscatedName("qr")
	static int field548;
	@ObfuscatedName("qq")
	static int field547;
	@ObfuscatedName("qn")
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static class551 field677;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	static NodeDeque field658;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("ru")
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rh")
	static int field555;
	@ObfuscatedName("rt")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("rd")
	static boolean[] field430;
	@ObfuscatedName("rk")
	static boolean[] field431;
	@ObfuscatedName("rj")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ra")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rg")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("re")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rb")
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("ry")
	static long field642;
	@ObfuscatedName("rm")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("rp")
	static int[] field603;
	@ObfuscatedName("rc")
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rf")
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("rx")
	static String field628;
	@ObfuscatedName("sr")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("ss")
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static class228 field623;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static class226 field622;
	@ObfuscatedName("sq")
	static int field560;
	@ObfuscatedName("sn")
	static int[] field606;
	@ObfuscatedName("sy")
	static int[] field607;
	@ObfuscatedName("su")
	static long field643;
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "[Lgt;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "[Lgg;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sl")
	static int field559;
	@ObfuscatedName("sw")
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sm")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sb")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sj")
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("se")
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tb")
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tp")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("th")
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tj")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ta")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tl")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("ty")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ti")
	static int[] field609;
	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "[Lbn;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("tw")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("td")
	static boolean field422;
	@ObfuscatedName("to")
	static boolean field423;
	@ObfuscatedName("uw")
	static boolean field427;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	static class498 field670;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	static class497 field672;
	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	static class497 field671;
	@ObfuscatedName("uu")
	static boolean field426;
	@ObfuscatedName("up")
	static boolean[] field433;
	@ObfuscatedName("ul")
	static int[] field615;
	@ObfuscatedName("ug")
	static int[] field613;
	@ObfuscatedName("uj")
	static int[] field614;
	@ObfuscatedName("ur")
	static int[] field616;
	@ObfuscatedName("uk")
	static short field663;
	@ObfuscatedName("uv")
	static short field664;
	@ObfuscatedName("ua")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("uy")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vg")
	static short field668;
	@ObfuscatedName("vd")
	static short field666;
	@ObfuscatedName("vp")
	static short field669;
	@ObfuscatedName("ve")
	static short field667;
	@ObfuscatedName("vk")
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vc")
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vi")
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vo")
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vl")
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("va")
	static int field565;
	@ObfuscatedName("vu")
	static int field571;
	@ObfuscatedName("ge")
	@Export("token")
	String token;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("gl")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("go")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("gy")
	@Export("https")
	boolean https;
	@ObfuscatedName("gr")
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("gs")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field697;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	class7 field688;
	@ObfuscatedName("hn")
	@Export("accountHash")
	long accountHash;

	static {
		field394 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field450 = -1;
		clientType = -1;
		field448 = -1;
		onMobile = false;
		field449 = 220;
		gameState = 0;
		field398 = false;
		field399 = false;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field452 = -1;
		field460 = -1;
		field638 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		z = false;
		field438 = class93.field977;
		js5ConnectState = 0;
		field466 = 0;
		js5Errors = 0;
		field468 = 0;
		field467 = 0;
		field469 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field676 = class538.field4303;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		int var3;
		char var4;
		for (var3 = 0; var3 < var1; ++var3) {
			var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		BASIC_AUTH_DESKTOP_OSRS = class371.base64Encode(var2);
		var1 = "com_jagex_auth_desktop_runelite:public".length();
		var2 = new byte[var1];

		for (var3 = 0; var3 < var1; ++var3) {
			var4 = "com_jagex_auth_desktop_runelite:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		BASIC_AUTH_DESKTOP_RUNELITE = class371.base64Encode(var2);
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536];
		field472 = 0;
		field575 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field475 = 0;
		field476 = 1;
		field474 = 0;
		field478 = 1;
		field473 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field680 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field482 = -1;
		graphicsCycle = 0;
		field481 = 2301979;
		field483 = 5063219;
		field479 = 3353893;
		field488 = 7759444;
		field405 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		field495 = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field484 = 0;
		field486 = 0;
		field491 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field407 = false;
		field500 = 0;
		field406 = false;
		field508 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field620 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field515 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field514 = 0;
		userId = -1L;
		userHash = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field512 = 0;
		field585 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field591 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuItemIds = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field528 = 0;
		field522 = 50;
		isItemSelected = 0;
		field625 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field518 = 0;
		field525 = -1;
		chatEffects = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field420 = false;
		field532 = -1;
		field537 = -1;
		field419 = false;
		field536 = -1;
		field529 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field542 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field595 = new int[32];
		field549 = 0;
		chatCycle = 0;
		field541 = 0;
		field543 = 0;
		field545 = 0;
		field544 = 0;
		field539 = 0;
		field548 = 0;
		field547 = 0;
		mouseWheelRotation = 0;
		field677 = new class551();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field658 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field555 = -2;
		validRootWidgets = new boolean[100];
		field430 = new boolean[100];
		field431 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field642 = 0L;
		isResizable = true;
		field603 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field628 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field623 = new class228();
		field622 = new class226();
		field560 = 0;
		field606 = new int[128];
		field607 = new int[128];
		field643 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field559 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		field609 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field422 = false;
		field423 = false;
		field427 = false;
		field670 = null;
		field672 = null;
		field671 = null;
		field426 = false;
		field433 = new boolean[5];
		field615 = new int[5];
		field613 = new int[5];
		field614 = new int[5];
		field616 = new int[5];
		field663 = 256;
		field664 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field668 = 1;
		field666 = 32767;
		field669 = 1;
		field667 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field565 = -1;
		field571 = -1;
		field675 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field661 = new class442(8, class440.field3863);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field573 = -1;
		field390 = -1;
		field635 = new ArrayList();
		field684 = new class234();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field574 = 0;
		field679 = new ApproximateRouteStrategy();
		field617 = new int[50];
		field618 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field642 = SecureRandomCallable.method465() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method384(true);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-946246730"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1;
			class130.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			Varcs.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) {
				Varcs.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field3830.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field3830);
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null;
			class130.ByteArrayPool_altSizeArrayCounts = null;
			Varcs.ByteArrayPool_arrays = null;
			Message.method334();
		}

		WorldMapScaleHandler.field2162 = class59.method312(worldProperties, class529.field4221);
		class211.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class150.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class316.currentPort = class211.worldPort;
		Messages.field1178 = class348.field3032;
		class407.field3753 = class348.field3034;
		PlayerComposition.field2998 = class348.field3031;
		LoginPacket.field1358 = class348.field3033;
		InvDefinition.urlRequester = new SecureUrlRequester(this.https, 220);
		this.setUpKeyboard();
		this.setUpMouse();
		ServerPacket.mouseWheel = this.mouseWheel();
		this.method132(field622, 0);
		this.method132(field623, 1);
		this.setUpClipboard();
		class155.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class30.clientPreferences = class167.method875();
		String var4 = class161.field1437;
		class31.field86 = this;
		if (var4 != null) {
			class31.field87 = var4;
		}

		FloorOverlayDefinition.setWindowedMode(class30.clientPreferences.getWindowMode());
		InterfaceParent.friendSystem = new FriendSystem(FriendLoginUpdate.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		Skeleton.method1496(this);
		field684.method1224();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "156558232"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		class103.method616();
		boolean var2 = false;
		boolean var3 = false;
		if (!class321.field2848.isEmpty()) {
			SongTask var4 = (SongTask)class321.field2848.get(0);
			if (var4 == null) {
				class321.field2848.remove(0);
			} else if (var4.vmethod8043()) {
				if (var4.method2214()) {
					System.out.println("Error in midimanager.service: " + var4.method2216());
					var2 = true;
				} else {
					if (var4.method2217() != null) {
						class321.field2848.add(1, var4.method2217());
					}

					var3 = var4.method2215();
				}

				class321.field2848.remove(0);
			} else {
				var3 = var4.method2215();
			}
		}

		if (var2) {
			class321.field2848.clear();
			Iterator var13 = class321.musicSongs.iterator();

			label101:
			while (true) {
				MusicSong var5;
				do {
					if (!var13.hasNext()) {
						class321.musicSongs.clear();
						break label101;
					}

					var5 = (MusicSong)var13.next();
				} while(var5 == null);

				var5.midiPcmStream.clear();
				var5.midiPcmStream.method1704();
				var5.midiPcmStream.setPcmStreamVolume(0);
				var5.midiPcmStream.field2890 = 0;
				int var6 = var5.musicTrackGroupId;
				int var7 = var5.musicTrackFileId;
				Iterator var8 = class321.field2853.iterator();

				while (var8.hasNext()) {
					class327 var9 = (class327)var8.next();
					var9.vmethod6339(var6, var7);
				}
			}
		}

		if (var3 && playingJingle && AuthenticationScheme.pcmPlayer1 != null) {
			AuthenticationScheme.pcmPlayer1.tryDiscard();
		}

		class190.method968();
		field623.method1183();
		this.method131();
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}

		if (ServerPacket.mouseWheel != null) {
			int var14 = ServerPacket.mouseWheel.useRotation();
			mouseWheelRotation = var14;
		}

		if (gameState == 0) {
			BufferedNetSocket.method2344();
			class321.method1698();
		} else if (gameState == 5) {
			class429.loginScreen(this, class60.fontPlain11, class141.fontPlain12);
			BufferedNetSocket.method2344();
			class321.method1698();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class429.loginScreen(this, class60.fontPlain11, class141.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				class429.loginScreen(this, class60.fontPlain11, class141.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				class59.method318();
			}
		} else {
			class429.loginScreen(this, class60.fontPlain11, class141.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1901702854"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field642 && SecureRandomCallable.method465() > field642) {
			FloorOverlayDefinition.setWindowedMode(AbstractUserComparator.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, VarbitComposition.field1654);
		} else if (gameState == 5) {
			Login.drawTitle(class166.fontBold12, class60.fontPlain11, class141.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				Login.drawTitle(class166.fontBold12, class60.fontPlain11, class141.fontPlain12);
			} else if (gameState == 50) {
				Login.drawTitle(class166.fontBold12, class60.fontPlain11, class141.fontPlain12);
			} else if (gameState == 25) {
				if (field473 == 1) {
					if (field475 > field476) {
						field476 = field475;
					}

					var2 = (field476 * 50 - field475 * 50) / field476;
					RouteStrategy.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field473 == 2) {
					if (field474 > field478) {
						field478 = field474;
					}

					var2 = (field478 * 50 - field474 * 50) / field478 + 50;
					RouteStrategy.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					RouteStrategy.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				RouteStrategy.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				RouteStrategy.drawLoadingMessage("Please wait...", false);
			}
		} else {
			Login.drawTitle(class166.fontBold12, class60.fontPlain11, class141.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field430[var2]) {
					UserComparator8.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field430[var2] = false;
				}
			}
		} else if (gameState > 0) {
			UserComparator8.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field430[var2] = false;
			}
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1161058155"
	)
	@Export("kill0")
	protected final void kill0() {
		if (ScriptFrame.varcs != null && ScriptFrame.varcs.hasUnwrittenChanges()) {
			ScriptFrame.varcs.write();
		}

		if (ByteArrayPool.mouseRecorder != null) {
			ByteArrayPool.mouseRecorder.isRunning = false;
		}

		ByteArrayPool.mouseRecorder = null;
		packetWriter.close();
		method2108();
		ServerPacket.mouseWheel = null;
		if (AuthenticationScheme.pcmPlayer1 != null) {
			AuthenticationScheme.pcmPlayer1.shutdown();
		}

		class356.field3198.method2026();
		class193.method974();
		if (InvDefinition.urlRequester != null) {
			InvDefinition.urlRequester.close();
			InvDefinition.urlRequester = null;
		}

		class94.method518();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
			descriptor = "(B)V",
			garbageValue = "-101"
	)
	public static void method2108() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	@Export("vmethod1380")
	protected final void vmethod1380() {
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2010664558"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return KeyHandler.accessToken != null && !KeyHandler.accessToken.trim().isEmpty() && class521.refreshToken != null && !class521.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1964077379"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return class357.sessionId != null && !class357.sessionId.trim().isEmpty() && Renderable.characterId != null && !Renderable.characterId.trim().isEmpty();
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "65280"
	)
	boolean method360() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1903120586"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class391.field3702 + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.method2245(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.method2245(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class391.field3702)).getHost());
		var4.accept(HttpContentType.APPLICATION_JSON);
		HttpMethod var5 = HttpMethod.POST;
		RefreshAccessTokenRequester var6 = this.refreshAccessTokenRequester;
		if (var6 != null) {
			this.refreshAccessTokenRequestFuture = var6.request(var5.getName(), var3, var4.getHeaders(), "");
		} else {
			HttpRequest var7 = new HttpRequest(var3, var5, var4, this.https);
			this.asyncAccessTokenResponse = this.asyncRestClient.submitRequest(var7);
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1529205719"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class391.field3702 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HttpHeaders var3 = new HttpHeaders();
		var3.bearerToken(var1);
		HttpMethod var4 = HttpMethod.GET;
		OtlTokenRequester var5 = this.otlTokenRequester;
		if (var5 != null) {
			this.otlTokenRequestFuture = var5.request(var4.getName(), var2, var3.getHeaders(), "");
		} else {
			HttpRequest var6 = new HttpRequest(var2, var4, var3, this.https);
			this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var6);
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-160281969"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class134.field1307 + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-483617262"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = class356.field3198.method2017();
			if (!var1) {
				this.method369();
			}

		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	void method369() {
		if (class356.field3198.field3668 >= 4) {
			this.error("js5crc");
			Interpreter.updateGameState(1000);
		} else {
			if (class356.field3198.field3669 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					Interpreter.updateGameState(1000);
					return;
				}

				field466 = 3000;
				class356.field3198.field3669 = 3;
			}

			if (--field466 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						GrandExchangeOffer.js5SocketTask = GameEngine.taskHandler.newSocketTask(class183.worldHost, class316.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (GrandExchangeOffer.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (GrandExchangeOffer.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						Socket var2 = (Socket)GrandExchangeOffer.js5SocketTask.result;
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
						class210.js5Socket = var1;
						Buffer var3 = new Buffer(5);
						var3.writeByte(class314.field2821.field2824);
						var3.writeInt(220);
						class210.js5Socket.write(var3.array, 0, 5);
						++js5ConnectState;
						class73.field762 = SecureRandomCallable.method465();
					}

					if (js5ConnectState == 3) {
						if (class210.js5Socket.available() > 0) {
							int var4 = class210.js5Socket.readUnsignedByte();
							if (var4 != 0) {
								this.js5Error(var4);
								return;
							}

							++js5ConnectState;
						} else if (SecureRandomCallable.method465() - class73.field762 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						class356.field3198.method2019(class210.js5Socket, gameState > 20);
						GrandExchangeOffer.js5SocketTask = null;
						class210.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var5) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "366416062"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		GrandExchangeOffer.js5SocketTask = null;
		class210.js5Socket = null;
		js5ConnectState = 0;
		if (class211.worldPort == class316.currentPort) {
			class316.currentPort = class150.js5Port;
		} else {
			class316.currentPort = class211.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				Interpreter.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					Interpreter.updateGameState(1000);
				} else {
					field466 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			Interpreter.updateGameState(1000);
		} else {
			field466 = 3000;
		}

	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2026098259"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == LoginState.SHUTDOWN_PREVIOUS_CONNECTION) {
				if (ApproximateRouteStrategy.field358 == null && (secureRandomFuture.isDone() || field468 > 250)) {
					ApproximateRouteStrategy.field358 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (ApproximateRouteStrategy.field358 != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					ClientPreferences.field1093 = null;
					hadNetworkError = false;
					field468 = 0;
					if (field676.method2691()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class521.refreshToken);
								class407.method2107(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var21) {
								class315.RunException_sendStackTrace((String)null, var21);
								class93.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								class93.getLoginError(65);
								return;
							}

							try {
								this.authenticate(class357.sessionId, Renderable.characterId);
								class407.method2107(LoginState.REFRESHING_TOKEN);
							} catch (Exception var20) {
								class315.RunException_sendStackTrace((String)null, var20);
								class93.getLoginError(65);
								return;
							}
						}
					} else {
						class407.method2107(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var23;
			if (loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						class93.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							class93.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						KeyHandler.accessToken = var3.getAccessToken();
						class521.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var19) {
						class315.RunException_sendStackTrace((String)null, var19);
						class93.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						class93.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class315.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						class93.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var23 = this.asyncAccessTokenResponse.await();
					if (var23.getResponseCode() != 200) {
						class93.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field468 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var23.getResponseBody());

					try {
						KeyHandler.accessToken = var4.getBody().getString("access_token");
						class521.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var18) {
						class315.RunException_sendStackTrace("Error parsing tokens", var18);
						class93.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(KeyHandler.accessToken);
				class407.method2107(LoginState.REFRESHING_TOKEN);
			}

			if (LoginState.REFRESHING_TOKEN == loginState) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						class93.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var24 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var24.isSuccess()) {
							class93.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var24.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var17) {
						class315.RunException_sendStackTrace((String)null, var17);
						class93.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						class93.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class315.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						class93.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var23 = this.asyncGameSessionTokenResponse.await();
					if (var23.getResponseCode() != 200) {
						class315.RunException_sendStackTrace("Response code: " + var23.getResponseCode() + "Response body: " + var23.getResponseBody(), (Throwable)null);
						class93.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var26 = (List)var23.getHeaderFields().get("Content-Type");
					if (var26 != null && var26.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var23.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var16) {
							class315.RunException_sendStackTrace((String)null, var16);
							class93.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var23.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field468 = 0;
				class407.method2107(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (LoginState.INIT_MOUSEHANDLER_SOCKET == loginState) {
				if (ClientPreferences.field1093 == null) {
					ClientPreferences.field1093 = GameEngine.taskHandler.newSocketTask(class183.worldHost, class316.currentPort);
				}

				if (ClientPreferences.field1093.status == 2) {
					throw new IOException();
				}

				if (ClientPreferences.field1093.status == 1) {
					Socket var28 = (Socket)ClientPreferences.field1093.result;
					BufferedNetSocket var25 = new BufferedNetSocket(var28, 40000, 5000);
					var1 = var25;
					packetWriter.setSocket(var25);
					ClientPreferences.field1093 = null;
					class407.method2107(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var27;
			if (loginState == LoginState.UNMAPPED_20) {
				packetWriter.clearBuffer();
				var27 = class166.method873();
				var27.packetBuffer.writeByte(class314.field2818.field2824);
				packetWriter.addNode(var27);
				packetWriter.flush();
				var2.offset = 0;
				class407.method2107(LoginState.READ_LOGIN_STATUS);
			}

			int var12;
			if (loginState == LoginState.READ_LOGIN_STATUS) {
				if (AuthenticationScheme.pcmPlayer1 != null) {
					AuthenticationScheme.pcmPlayer1.method190();
				}

				if (((AbstractSocket)var1).isAvailable(1)) {
					var12 = ((AbstractSocket)var1).readUnsignedByte();
					if (AuthenticationScheme.pcmPlayer1 != null) {
						AuthenticationScheme.pcmPlayer1.method190();
					}

					if (var12 != 0) {
						class93.getLoginError(var12);
						return;
					}

					var2.offset = 0;
					class407.method2107(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == loginState) {
				if (var2.offset < 8) {
					var12 = ((AbstractSocket)var1).available();
					if (var12 > 8 - var2.offset) {
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var12);
						var2.offset += var12;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					VarpDefinition.field1482 = var2.readLong();
					class407.method2107(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (loginState == LoginState.WRITE_INITIAL_LOGIN_PACKET) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var29 = new PacketBuffer(500);
				int[] var30 = new int[]{ApproximateRouteStrategy.field358.nextInt(), ApproximateRouteStrategy.field358.nextInt(), ApproximateRouteStrategy.field358.nextInt(), ApproximateRouteStrategy.field358.nextInt()};
				var29.offset = 0;
				var29.writeByte(1);
				var29.writeInt(var30[0]);
				var29.writeInt(var30[1]);
				var29.writeInt(var30[2]);
				var29.writeInt(var30[3]);
				var29.writeLong(VarpDefinition.field1482);
				if (gameState == 40) {
					var29.writeInt(class1.field0[0]);
					var29.writeInt(class1.field0[1]);
					var29.writeInt(class1.field0[2]);
					var29.writeInt(class1.field0[3]);
				} else {
					if (gameState == 50) {
						var29.writeByte(AuthenticationScheme.field1225.rsOrdinal());
						var29.writeInt(class318.field2834);
					} else {
						var29.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
						case 2:
							var29.writeMedium(class36.otpMedium);
							++var29.offset;
						case 1:
						default:
							break;
						case 3:
							var29.writeInt(class30.clientPreferences.getParameterValue(Login.Login_username));
							break;
						case 4:
							var29.offset += 4;
						}
					}

					if (field676.method2691()) {
						var29.writeByte(class538.field4304.rsOrdinal());
						var29.writeStringCp1252NullTerminated(this.token);
					} else {
						var29.writeByte(class538.field4303.rsOrdinal());
						var29.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var29.encryptRsa(class75.field775, class75.field776);
				class1.field0 = var30;
				PacketBufferNode var31 = class166.method873();
				var31.packetBuffer.offset = 0;
				if (gameState == 40) {
					var31.packetBuffer.writeByte(class314.field2816.field2824);
				} else {
					var31.packetBuffer.writeByte(class314.field2817.field2824);
				}

				var31.packetBuffer.writeShort(0);
				int var6 = var31.packetBuffer.offset;
				var31.packetBuffer.writeInt(220);
				var31.packetBuffer.writeInt(1);
				var31.packetBuffer.writeByte(clientType);
				var31.packetBuffer.writeByte(field448);
				byte var7 = 0;
				var31.packetBuffer.writeByte(var7);
				var31.packetBuffer.writeBytes(var29.array, 0, var29.offset);
				int var8 = var31.packetBuffer.offset;
				var31.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var31.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var31.packetBuffer.writeShort(GameEngine.canvasWidth);
				var31.packetBuffer.writeShort(WorldMapArea.canvasHeight);
				KitDefinition.randomDatData2(var31.packetBuffer);
				var31.packetBuffer.writeStringCp1252NullTerminated(class106.field1139);
				var31.packetBuffer.writeInt(class403.field3747);
				var31.packetBuffer.writeByte(0);
				Buffer var9 = new Buffer(class31.platformInfo.size());
				class31.platformInfo.write(var9);
				var31.packetBuffer.writeBytes(var9.array, 0, var9.array.length);
				var31.packetBuffer.writeByte(clientType);
				var31.packetBuffer.writeInt(0);
				if (WorldMapScaleHandler.field2162) {
					var31.packetBuffer.writeIntLE(class311.archive8.hash);
					var31.packetBuffer.writeIntLE(class376.field3623.hash);
					var31.packetBuffer.writeIntIME(Renderable.archive6.hash);
					var31.packetBuffer.writeIntME(class391.field3703.hash);
					var31.packetBuffer.writeIntLE(class86.field893.hash);
					var31.packetBuffer.writeIntLE(ScriptFrame.archive10.hash);
					var31.packetBuffer.writeIntME(KeyHandler.archive13.hash);
				} else {
					var31.packetBuffer.writeIntLE(class311.archive8.hash);
					var31.packetBuffer.writeInt(JagexCache.archive9.hash);
					var31.packetBuffer.writeIntME(SecureRandomSSLSocket.field40.hash);
					var31.packetBuffer.writeIntME(class362.field3234.hash);
					var31.packetBuffer.writeInt(HttpRequestTask.archive2.hash);
					var31.packetBuffer.writeInt(ScriptFrame.archive4.hash);
					var31.packetBuffer.writeIntME(ScriptFrame.archive10.hash);
					var31.packetBuffer.writeIntME(class154.field1393.hash);
					var31.packetBuffer.writeIntME(0);
					var31.packetBuffer.writeIntIME(class376.field3623.hash);
					var31.packetBuffer.writeIntIME(Varcs.field1172.hash);
					var31.packetBuffer.writeInt(class198.field1661.hash);
					var31.packetBuffer.writeIntME(WorldMapSectionType.archive12.hash);
					var31.packetBuffer.writeInt(class86.field893.hash);
					var31.packetBuffer.writeInt(field651.hash);
					var31.packetBuffer.writeInt(KeyHandler.archive13.hash);
					var31.packetBuffer.writeInt(Renderable.archive6.hash);
					var31.packetBuffer.writeIntLE(PlayerCompositionColorTextureOverride.field1465.hash);
					var31.packetBuffer.writeIntIME(WorldMapSectionType.field2096.hash);
					var31.packetBuffer.writeInt(class391.field3703.hash);
					var31.packetBuffer.writeIntME(SpotAnimationDefinition.field1631.hash);
				}

				var31.packetBuffer.xteaEncrypt(var30, var8, var31.packetBuffer.offset);
				var31.packetBuffer.writeLengthShort(var31.packetBuffer.offset - var6);
				packetWriter.addNode(var31);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var30);
				int[] var10 = new int[4];

				for (int var11 = 0; var11 < 4; ++var11) {
					var10[var11] = var30[var11] + 50;
				}

				var2.newIsaacCipher(var10);
				class407.method2107(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var13;
			if (loginState == LoginState.READ_CLIENT_INFO_STATUS && ((AbstractSocket)var1).available() > 0) {
				var12 = ((AbstractSocket)var1).readUnsignedByte();
				if (var12 == 61) {
					var13 = ((AbstractSocket)var1).available();
					GameObject.field2536 = var13 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
					class407.method2107(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var12 == 21 && gameState == 20) {
					class407.method2107(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var12 == 2) {
					if (WorldMapScaleHandler.field2162) {
						class407.method2107(LoginState.UNMAPPED_21);
					} else {
						class407.method2107(LoginState.UNMAPPED);
					}
				} else if (var12 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class407.method2107(LoginState.UNMAPPED_19);
				} else if (var12 == 64) {
					class407.method2107(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var12 == 23 && field467 < 1) {
					++field467;
					class407.method2107(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var12 == 29) {
					class407.method2107(LoginState.UNMAPPED_17);
				} else {
					if (var12 != 69) {
						class93.getLoginError(var12);
						return;
					}

					class407.method2107(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (loginState == LoginState.UNMAPPED_21) {
				VarbitComposition.field1654 = true;
				WorldMapDecoration.method1371(class93.field969);
				Interpreter.updateGameState(0);
			}

			if (loginState == LoginState.READ_DIGEST_PARSER_PACKET_SIZE && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class410.field3758 = var2.readUnsignedShort();
				class407.method2107(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (LoginState.SUBMIT_DIGEST_PARSER_TASK == loginState && ((AbstractSocket)var1).available() >= class410.field3758) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class410.field3758);
				class6[] var32 = new class6[]{class6.field6};
				class6 var33 = var32[var2.readUnsignedByte()];

				try {
					class3 var34 = class218.method1122(var33);
					this.field688 = new class7(var2, var34);
					class407.method2107(LoginState.WRITE_DIGEST_PARSER_RESULT);
				} catch (Exception var15) {
					class93.getLoginError(22);
					return;
				}
			}

			if (loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field688.method14()) {
				this.field697 = this.field688.method16();
				this.field688.method15();
				this.field688 = null;
				if (this.field697 == null) {
					class93.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var27 = class166.method873();
				var27.packetBuffer.writeByte(class314.field2819.field2824);
				var27.packetBuffer.writeShort(this.field697.offset);
				var27.packetBuffer.writeBuffer(this.field697);
				packetWriter.addNode(var27);
				packetWriter.flush();
				this.field697 = null;
				class407.method2107(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (loginState == LoginState.READ_STATE_11_PACKET_SIZE && ((AbstractSocket)var1).available() > 0) {
				class133.field1296 = ((AbstractSocket)var1).readUnsignedByte();
				class407.method2107(LoginState.UNMAPPED_11);
			}

			if (loginState == LoginState.UNMAPPED_11 && ((AbstractSocket)var1).available() >= class133.field1296) {
				((AbstractSocket)var1).read(var2.array, 0, class133.field1296);
				var2.offset = 0;
				class407.method2107(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (loginState == LoginState.READ_PROFILE_TRANSFER_TIME && ((AbstractSocket)var1).available() > 0) {
				field469 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				class407.method2107(LoginState.PROFILE_TRANSFER);
			}

			if (loginState == LoginState.PROFILE_TRANSFER) {
				field468 = 0;
				SecureUrlRequester.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field469 / 60 + " seconds.");
				if (--field469 <= 0) {
					class407.method2107(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (LoginState.READ_ACCOUNT_INFO_PACKET_SIZE == loginState) {
				var27 = class166.method873();
				var27.packetBuffer.writeByte(class314.field2820.field2824);
				var27.packetBuffer.writeShort(class314.field2820.field2825);
				class161.method852(var27);
				packetWriter.addNode(var27);
				packetWriter.flush();
				class407.method2107(LoginState.UNMAPPED);
			} else {
				if (loginState == LoginState.UNMAPPED && ((AbstractSocket)var1).available() >= 1) {
					UrlRequester.field1197 = ((AbstractSocket)var1).readUnsignedByte();
					if (UrlRequester.field1197 != class314.field2815.field2825) {
						class93.getLoginError(UrlRequester.field1197);
						return;
					}

					class407.method2107(LoginState.READ_ACCOUNT_INFO);
				}

				if (LoginState.READ_ACCOUNT_INFO == loginState && ((AbstractSocket)var1).available() >= UrlRequester.field1197) {
					boolean var43 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var42 = false;
					if (var43) {
						var13 = var2.readByteIsaac() << 24;
						var13 |= var2.readByteIsaac() << 16;
						var13 |= var2.readByteIsaac() << 8;
						var13 |= var2.readByteIsaac();
						class30.clientPreferences.put(Login.Login_username, var13);
					}

					if (Login_isUsernameRemembered) {
						class30.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						class30.clientPreferences.updateRememberedUsername((String)null);
					}

					class160.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field514 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					VarbitComposition.method990().method1129(this.https);
					class407.method2107(LoginState.SET_SERVER_PROTOCOL);
				}

				if (LoginState.SET_SERVER_PROTOCOL == loginState && ((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method2591()) {
						((AbstractSocket)var1).read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var36 = NPCComposition.ServerPacket_values();
					var13 = var2.readSmartByteShortIsaac();
					if (var13 < 0 || var13 >= var36.length) {
						throw new IOException("Invalid ServerProt: " + var13 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var36[var13];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var37 = class193.client;
						JSObject.getWindow(var37).call("zap", (Object[])null);
					} catch (Throwable var14) {
					}

					class407.method2107(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS == loginState) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method2233();
						Message.method342();
						class1.updatePlayer(var2);
						JagNetThread.field3644 = -1;
						BuddyRankComparator.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field398 = false;
					}

				} else {
					if (loginState == LoginState.UNMAPPED_17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class131.field1268 = var2.readUnsignedShort();
						class407.method2107(LoginState.UNMAPPED_18);
					}

					if (LoginState.UNMAPPED_18 == loginState && ((AbstractSocket)var1).available() >= class131.field1268) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class131.field1268);
						var2.offset = 0;
						String var39 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						String var40 = var2.readStringCp1252NullTerminated();
						SecureUrlRequester.setLoginResponseString(var39, var35, var40);
						Interpreter.updateGameState(10);
						if (field676.method2691()) {
							JagexCache.method1113(9);
						}
					}

					if (loginState != LoginState.UNMAPPED_19) {
						++field468;
						if (field468 > 2000) {
							if (field467 < 1) {
								if (class211.worldPort == class316.currentPort) {
									class316.currentPort = class150.js5Port;
								} else {
									class316.currentPort = class211.worldPort;
								}

								++field467;
								class407.method2107(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								class93.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var12 = packetWriter.serverPacketLength;
							timer.method2235();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1423 = null;
							packetWriter.field1191 = null;
							packetWriter.field1189 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1186 = 0;
							rebootTimer = 0;
							menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;

							for (var13 = 0; var13 < 2048; ++var13) {
								players[var13] = null;
							}

							VarpDefinition.localPlayer = null;

							for (var13 = 0; var13 < npcs.length; ++var13) {
								NPC var41 = npcs[var13];
								if (var41 != null) {
									var41.targetIndex = -1;
									var41.false0 = false;
								}
							}

							PendingSpawn.method524();
							Interpreter.updateGameState(30);

							for (var13 = 0; var13 < 100; ++var13) {
								validRootWidgets[var13] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) {
								PacketBufferNode var38 = ViewportMouse.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, packetWriter.isaacCipher);
								var38.packetBuffer.writeByte(AbstractUserComparator.getWindowedMode());
								var38.packetBuffer.writeShort(GameEngine.canvasWidth);
								var38.packetBuffer.writeShort(WorldMapArea.canvasHeight);
								packetWriter.addNode(var38);
							}

							class1.updatePlayer(var2);
							if (var12 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var22) {
			if (field467 < 1) {
				if (class211.worldPort == class316.currentPort) {
					class316.currentPort = class150.js5Port;
				} else {
					class316.currentPort = class211.worldPort;
				}

				++field467;
				class407.method2107(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				class93.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "870333583"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			Huffman.method1942();
		} else {
			if (!isMenuOpen) {
				class255.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (class107.method628()) {
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					AbstractArchive.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (timer.field3856) {
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method2234();
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				PacketBuffer var10000;
				synchronized(ByteArrayPool.mouseRecorder.lock) {
					if (!field394) {
						ByteArrayPool.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || ByteArrayPool.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < ByteArrayPool.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = ByteArrayPool.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = ByteArrayPool.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field452 || var8 != field460) {
								if (var15 == null) {
									var15 = ViewportMouse.getPacketBufferNode(ClientPacket.field2656, packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								int var11;
								int var12;
								if (field638 != -1L) {
									var10 = var9 - field452;
									var11 = var8 - field460;
									var12 = (int)((ByteArrayPool.mouseRecorder.millis[var7] - field638) / 20L);
									var5 = (int)((long)var5 + (ByteArrayPool.mouseRecorder.millis[var7] - field638) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field452 = var9;
								field460 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var15.packetBuffer.writeByte(var12 + 128);
									var15.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var15.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field638 = ByteArrayPool.mouseRecorder.millis[var7];
							}
						}

						if (var15 != null) {
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3);
							var7 = var15.packetBuffer.offset;
							var15.packetBuffer.offset = var3;
							var15.packetBuffer.writeByte(var5 / var6);
							var15.packetBuffer.writeByte(var5 % var6);
							var15.packetBuffer.offset = var7;
							packetWriter.addNode(var15);
						}

						if (var4 >= ByteArrayPool.mouseRecorder.index) {
							ByteArrayPool.mouseRecorder.index = 0;
						} else {
							MouseRecorder var54 = ByteArrayPool.mouseRecorder;
							var54.index -= var4;
							System.arraycopy(ByteArrayPool.mouseRecorder.xs, var4, ByteArrayPool.mouseRecorder.xs, 0, ByteArrayPool.mouseRecorder.index);
							System.arraycopy(ByteArrayPool.mouseRecorder.ys, var4, ByteArrayPool.mouseRecorder.ys, 0, ByteArrayPool.mouseRecorder.index);
							System.arraycopy(ByteArrayPool.mouseRecorder.millis, var4, ByteArrayPool.mouseRecorder.millis, 0, ByteArrayPool.mouseRecorder.index);
						}
					}
				}

				if (MouseHandler.MouseHandler_lastButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var16 > 32767L) {
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > WorldMapArea.canvasHeight) {
						var3 = WorldMapArea.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > GameEngine.canvasWidth) {
						var4 = GameEngine.canvasWidth;
					}

					var5 = (int)var16;
					PacketBufferNode var18 = ViewportMouse.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}

				if (mouseWheelRotation != 0) {
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.field2658, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var14);
				}

				if (field623.field1959 > 0) {
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = SecureRandomCallable.method465();

					for (var5 = 0; var5 < field623.field1959; ++var5) {
						long var21 = var19 - field643;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}

						field643 = var19;
						var14.packetBuffer.writeMediumLE((int)var21);
						var14.packetBuffer.writeByte(field623.field1960[var5]);
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (field500 > 0) {
					--field500;
				}

				if (field623.method1186(96) || field623.method1186(97) || field623.method1186(98) || field623.method1186(99)) {
					field406 = true;
				}

				if (field406 && field500 <= 0) {
					field500 = 20;
					field406 = false;
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
					var14.packetBuffer.writeShortAdd(camAngleY);
					var14.packetBuffer.writeShortLE(camAngleX);
					packetWriter.addNode(var14);
				}

				if (FadeOutTask.hasFocus && !hadFocus) {
					hadFocus = true;
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}

				if (!FadeOutTask.hasFocus && hadFocus) {
					hadFocus = false;
					var14 = ViewportMouse.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}

				if (Tiles.worldMap != null) {
					Tiles.worldMap.method2458();
				}

				Player var40;
				if (DevicePcmPlayerProvider.ClanChat_inClanChat) {
					if (Projectile.friendsChat != null) {
						Projectile.friendsChat.sort();
					}

					for (var1 = 0; var1 < Players.Players_count; ++var1) {
						var40 = players[Players.Players_indices[var1]];
						var40.clearIsInFriendsChat();
					}

					DevicePcmPlayerProvider.ClanChat_inClanChat = false;
				}

				if (class257.field2139) {
					for (var1 = 0; var1 < Players.Players_count; ++var1) {
						var40 = players[Players.Players_indices[var1]];
						var40.method500();
					}

					class257.field2139 = false;
				}

				if (field559 != class473.Client_plane) {
					field559 = class473.Client_plane;
					Decimator.method306(class473.Client_plane);
				}

				if (gameState == 30) {
					class59.method319();

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) {
						var10002 = queuedSoundEffectDelays[var1]--;
						if (queuedSoundEffectDelays[var1] >= -10) {
							SoundEffect var41 = soundEffects[var1];
							if (var41 == null) {
								var10000 = null;
								var41 = SoundEffect.readSoundEffect(class376.field3623, soundEffectIds[var1], 0);
								if (var41 == null) {
									continue;
								}

								int[] var55 = queuedSoundEffectDelays;
								var55[var1] += var41.calculateDelay();
								soundEffects[var1] = var41;
							}

							if (queuedSoundEffectDelays[var1] < 0) {
								if (soundLocations[var1] != 0) {
									var4 = (soundLocations[var1] & 255) * 128;
									var5 = soundLocations[var1] >> 16 & 255;
									var6 = Math.abs(var5 * 128 + 64 - VarpDefinition.localPlayer.x);
									var7 = soundLocations[var1] >> 8 & 255;
									var8 = Math.abs(var7 * 128 + 64 - VarpDefinition.localPlayer.y);
									var9 = Math.max(var8 + var6 - 128, 0);
									var10 = Math.max(((field609[var1] & 31) - 1) * 128, 0);
									if (var9 >= var4) {
										queuedSoundEffectDelays[var1] = -100;
										continue;
									}

									float var37 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F;
									var3 = (int)(var37 * (float)class30.clientPreferences.getAreaSoundEffectsVolume());
								} else {
									var3 = class30.clientPreferences.getSoundEffectsVolume();
								}

								if (var3 > 0) {
									RawSound var23 = var41.toRawSound().resample(class73.decimator);
									RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3);
									var24.setNumLoops(queuedSoundEffectLoops[var1] - 1);
									SceneTilePaint.pcmStreamMixer.addSubStream(var24);
								}

								queuedSoundEffectDelays[var1] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var1; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
								field609[var2] = field609[var2 + 1];
							}

							--var1;
						}
					}

					if (playingJingle) {
						boolean var33;
						if (!class321.field2848.isEmpty()) {
							var33 = true;
						} else if (!class321.musicSongs.isEmpty() && class321.musicSongs.get(0) != null && ((MusicSong)class321.musicSongs.get(0)).midiPcmStream != null) {
							var33 = ((MusicSong)class321.musicSongs.get(0)).midiPcmStream.isReady();
						} else {
							var33 = false;
						}

						if (!var33) {
							if (class30.clientPreferences.getMusicVolume() != 0 && VarbitComposition.method992()) {
								Interpreter.method422(Renderable.archive6, class30.clientPreferences.getMusicVolume());
							}

							playingJingle = false;
						}
					}

					++packetWriter.field1186;
					if (packetWriter.field1186 > 750) {
						Huffman.method1942();
					} else {
						AbstractByteArrayCopier.method1932();
						Login.method438();
						int[] var38 = Players.Players_indices;

						for (var2 = 0; var2 < Players.Players_count; ++var2) {
							Player var25 = players[var38[var2]];
							if (var25 != null && var25.overheadTextCyclesRemaining > 0) {
								--var25.overheadTextCyclesRemaining;
								if (var25.overheadTextCyclesRemaining == 0) {
									var25.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) {
							var3 = npcIndices[var2];
							NPC var46 = npcs[var3];
							if (var46 != null && var46.overheadTextCyclesRemaining > 0) {
								--var46.overheadTextCyclesRemaining;
								if (var46.overheadTextCyclesRemaining == 0) {
									var46.overheadText = null;
								}
							}
						}

						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var39 = class134.mousedOverWidgetIf1;
						Widget var43 = FontName.field4142;
						class134.mousedOverWidgetIf1 = null;
						FontName.field4142 = null;
						draggedOnWidget = null;
						field419 = false;
						field420 = false;
						field560 = 0;

						while (field623.method1184() && field560 < 128) {
							if (staffModLevel >= 2 && field623.method1186(82) && field623.field1958 == 66) {
								StringBuilder var47 = new StringBuilder();

								Message var42;
								for (Iterator var49 = Messages.Messages_hashTable.iterator(); var49.hasNext(); var47.append(var42.text).append('\n')) {
									var42 = (Message)var49.next();
									if (var42.sender != null && !var42.sender.isEmpty()) {
										var47.append(var42.sender).append(':');
									}
								}

								String var51 = var47.toString();
								class193.client.method128(var51);
							} else if (oculusOrbState != 1 || field623.field1957 <= 0) {
								field607[field560] = field623.field1958;
								field606[field560] = field623.field1957;
								++field560;
							}
						}

						boolean var34 = staffModLevel >= 2;
						if (var34 && field623.method1186(82) && field623.method1186(81) && mouseWheelRotation != 0) {
							var4 = VarpDefinition.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != VarpDefinition.localPlayer.plane) {
								Login.method442(VarpDefinition.localPlayer.pathX[0] + Projectile.baseX, VarpDefinition.localPlayer.pathY[0] + GameEngine.baseY, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							ClanSettings.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, WorldMapArea.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var44;
							ScriptEvent var48;
							Widget var50;
							do {
								var48 = (ScriptEvent)scriptEvents2.removeLast();
								if (var48 == null) {
									while (true) {
										do {
											var48 = (ScriptEvent)scriptEvents3.removeLast();
											if (var48 == null) {
												while (true) {
													do {
														var48 = (ScriptEvent)scriptEvents.removeLast();
														if (var48 == null) {
															boolean var35 = false;

															while (true) {
																class227 var52 = (class227)field658.removeLast();
																if (var52 == null) {
																	if (!var35 && MouseHandler.MouseHandler_lastButton == 1) {
																		field622.method1168();
																	}

																	this.menu();
																	if (Tiles.worldMap != null) {
																		Tiles.worldMap.method2468(class473.Client_plane, (VarpDefinition.localPlayer.x >> 7) + Projectile.baseX, (VarpDefinition.localPlayer.y >> 7) + GameEngine.baseY, false);
																		Tiles.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method387();
																	}

																	if (Scene.shouldSendWalk()) {
																		var5 = Scene.Scene_selectedX;
																		var6 = Scene.Scene_selectedY;
																		PacketBufferNode var28 = ViewportMouse.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																		var28.packetBuffer.writeByte(5);
																		var28.packetBuffer.writeByteSub(field623.method1186(82) ? (field623.method1186(81) ? 2 : 1) : 0);
																		var28.packetBuffer.writeShortAdd(var5 + Projectile.baseX);
																		var28.packetBuffer.writeShortAdd(var6 + GameEngine.baseY);
																		packetWriter.addNode(var28);
																		Scene.method1544();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var5;
																		destinationY = var6;
																	}

																	if (var39 != class134.mousedOverWidgetIf1) {
																		if (var39 != null) {
																			UserComparator5.invalidateWidget(var39);
																		}

																		if (class134.mousedOverWidgetIf1 != null) {
																			UserComparator5.invalidateWidget(class134.mousedOverWidgetIf1);
																		}
																	}

																	if (var43 != FontName.field4142 && field528 == field522) {
																		if (var43 != null) {
																			UserComparator5.invalidateWidget(var43);
																		}

																		if (FontName.field4142 != null) {
																			UserComparator5.invalidateWidget(FontName.field4142);
																		}
																	}

																	if (FontName.field4142 != null) {
																		if (field528 < field522) {
																			++field528;
																			if (field522 == field528) {
																				UserComparator5.invalidateWidget(FontName.field4142);
																			}
																		}
																	} else if (field528 > 0) {
																		--field528;
																	}

																	class315.method1686();
																	if (field426) {
																		class7.method19(class362.field3233, ArchiveDiskAction.field3599, AABB.field2346);
																		ScriptEvent.method481(WorldMapCacheName.field2154, FriendsChat.field3881);
																		if (class362.field3233 == ClanMate.cameraX && ArchiveDiskAction.field3599 == AsyncHttpResponse.cameraY && AABB.field2346 == class317.cameraZ && WorldMapCacheName.field2154 == FriendSystem.cameraPitch && Script.cameraYaw == FriendsChat.field3881) {
																			field426 = false;
																			isCameraLocked = false;
																			field422 = false;
																			field423 = false;
																			VarbitComposition.field1655 = 0;
																			class11.field35 = 0;
																			ChatChannel.field868 = 0;
																			class135.field1330 = 0;
																			AsyncHttpResponse.field55 = 0;
																			GameBuild.field3240 = 0;
																			class516.field4190 = 0;
																			WorldMapArea.field2021 = 0;
																			UserComparator7.field1212 = 0;
																			WorldMapSectionType.field2095 = 0;
																			field670 = null;
																			field671 = null;
																			field672 = null;
																		}
																	} else if (isCameraLocked) {
																		class192.method971();
																	}

																	for (var5 = 0; var5 < 5; ++var5) {
																		var10002 = field616[var5]++;
																	}

																	ScriptFrame.varcs.tryWrite();
																	var5 = ++MouseHandler.MouseHandler_idleCycles - 1;
																	var7 = class431.method2229();
																	PacketBufferNode var53;
																	if (var5 > 15000 && var7 > 15000) {
																		logoutTimer = 250;
																		Archive.method1974(14500);
																		var53 = ViewportMouse.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var53);
																	}

																	InterfaceParent.friendSystem.processFriendUpdates();

																	for (var8 = 0; var8 < field635.size(); ++var8) {
																		var10 = (Integer)field635.get(var8);
																		class140 var29 = (class140)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var10);
																		class140 var30;
																		if (var29 != null) {
																			var30 = var29;
																		} else {
																			var29 = class93.method509(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var10, false);
																			if (var29 != null) {
																				SequenceDefinition.SequenceDefinition_cachedModel.put(var29, (long)var10);
																			}

																			var30 = var29;
																		}

																		if (var30 == null) {
																			var9 = 2;
																		} else {
																			var9 = var30.method754() ? 0 : 1;
																		}

																		if (var9 != 2) {
																			field635.remove(var8);
																			--var8;
																		}
																	}

																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var53 = ViewportMouse.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var53);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var31) {
																		Huffman.method1942();
																	}

																	VarbitComposition.method990().method1135();
																	return;
																}

																if (var52.field1946.type == 12) {
																	var35 = true;
																}

																if (var52 != null && var52.field1946 != null) {
																	if (var52.field1946.childIndex >= 0) {
																		var44 = ArchiveLoader.widgetDefinition.method1785(var52.field1946.parentId);
																		if (var44 == null || var44.children == null || var44.children.length == 0 || var52.field1946.childIndex >= var44.children.length || var52.field1946 != var44.children[var52.field1946.childIndex]) {
																			continue;
																		}
																	}

																	if (var52.field1946.type == 11 && var52.field1945 == 0) {
																		if (var52.field1946.method1911(var52.field1944, var52.field1943, 0, 0)) {
																			var52.field1946.method1919().method1086().method1128(1, var52.field1946.method1919().method1098());
																			switch(var52.field1946.method1915()) {
																			case 0:
																				class137.openURL(var52.field1946.method1917(), true, false);
																				break;
																			case 1:
																				var7 = class429.getWidgetFlags(var52.field1946);
																				boolean var36 = (var7 >> 22 & 1) != 0;
																				if (var36) {
																					int[] var26 = var52.field1946.method1918();
																					if (var26 != null) {
																						PacketBufferNode var27 = ViewportMouse.getPacketBufferNode(ClientPacket.field2600, packetWriter.isaacCipher);
																						var27.packetBuffer.writeIntLE(var52.field1946.id);
																						var27.packetBuffer.writeShort(var52.field1946.childIndex);
																						var27.packetBuffer.writeInt(var26[0]);
																						var27.packetBuffer.writeInt(var26[1]);
																						var27.packetBuffer.writeIntME(var52.field1946.method1916());
																						var27.packetBuffer.writeIntIME(var26[2]);
																						packetWriter.addNode(var27);
																					}
																				}
																			}
																		}
																	} else if (var52.field1946.type == 12) {
																		class347 var45 = var52.field1946.method1923();
																		if (var45 != null && var45.method1861()) {
																			switch(var52.field1945) {
																			case 0:
																				field622.method1166(var52.field1946);
																				var45.method1809(true);
																				var45.method1848(var52.field1944, var52.field1943, field623.method1186(82), field623.method1186(81));
																				break;
																			case 1:
																				var45.method1849(var52.field1944, var52.field1943);
																			}
																		}
																	}
																}
															}
														}

														var50 = var48.widget;
														if (var50.childIndex < 0) {
															break;
														}

														var44 = ArchiveLoader.widgetDefinition.method1785(var50.parentId);
													} while(var44 == null || var44.children == null || var50.childIndex >= var44.children.length || var50 != var44.children[var50.childIndex]);

													class177.runScriptEvent(var48);
												}
											}

											var50 = var48.widget;
											if (var50.childIndex < 0) {
												break;
											}

											var44 = ArchiveLoader.widgetDefinition.method1785(var50.parentId);
										} while(var44 == null || var44.children == null || var50.childIndex >= var44.children.length || var50 != var44.children[var50.childIndex]);

										class177.runScriptEvent(var48);
									}
								}

								var50 = var48.widget;
								if (var50.childIndex < 0) {
									break;
								}

								var44 = ArchiveLoader.widgetDefinition.method1785(var50.parentId);
							} while(var44 == null || var44.children == null || var50.childIndex >= var44.children.length || var50 != var44.children[var50.childIndex]);

							class177.runScriptEvent(var48);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "4"
	)
	@Export("vmethod6339")
	public void vmethod6339(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class30.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = ViewportMouse.getPacketBufferNode(ClientPacket.field2571, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1161058155"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth;
		int var2 = WorldMapArea.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class30.clientPreferences != null) {
			try {
				Client var3 = class193.client;
				Object[] var4 = new Object[]{AbstractUserComparator.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1160675343"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			WorldMapRenderer.method1328(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field430[var1] = true;
			}

			field431[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field555 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class228.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, WorldMapArea.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				GrandExchangeOfferOwnWorldComparator.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				GrandExchangeOfferOwnWorldComparator.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				AsyncHttpResponse.method58(viewportX, viewportY);
			}
		} else {
			class169.method885();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field431[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field430[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class473.Client_plane;
		int var2 = VarpDefinition.localPlayer.x;
		int var3 = VarpDefinition.localPlayer.y;
		int var4 = graphicsCycle;

		for (ObjectSound var5 = (ObjectSound)ObjectSound.objectSounds.last(); var5 != null; var5 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var5.soundEffectId != -1 || var5.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var5.maxX) {
					var6 += var2 - var5.maxX;
				} else if (var2 < var5.x) {
					var6 += var5.x - var2;
				}

				if (var3 > var5.maxY) {
					var6 += var3 - var5.maxY;
				} else if (var3 < var5.y) {
					var6 += var5.y - var3;
				}

				var6 = Math.max(var6 - 64, 0);
				if (var6 < var5.field721 && class30.clientPreferences.getAreaSoundEffectsVolume() != 0 && var1 == var5.plane) {
					float var7 = var5.field731 < var5.field721 ? Math.min(Math.max((float)(var5.field721 - var6) / (float)(var5.field721 - var5.field731), 0.0F), 1.0F) : 1.0F;
					int var8 = (int)(var7 * (float)class30.clientPreferences.getAreaSoundEffectsVolume());
					Object var10000;
					if (var5.stream1 == null) {
						if (var5.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var9 = SoundEffect.readSoundEffect(class376.field3623, var5.soundEffectId, 0);
							if (var9 != null) {
								RawSound var10 = var9.toRawSound().resample(class73.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var8);
								var11.setNumLoops(-1);
								SceneTilePaint.pcmStreamMixer.addSubStream(var11);
								var5.stream1 = var11;
							}
						}
					} else {
						var5.stream1.method232(var8);
					}

					if (var5.stream2 == null) {
						if (var5.soundEffectIds != null && (var5.field722 -= var4) <= 0) {
							int var13 = (int)(Math.random() * (double)var5.soundEffectIds.length);
							var10000 = null;
							SoundEffect var14 = SoundEffect.readSoundEffect(class376.field3623, var5.soundEffectIds[var13], 0);
							if (var14 != null) {
								RawSound var15 = var14.toRawSound().resample(class73.decimator);
								RawPcmStream var12 = RawPcmStream.createRawPcmStream(var15, 100, var8);
								var12.setNumLoops(0);
								SceneTilePaint.pcmStreamMixer.addSubStream(var12);
								var5.stream2 = var12;
								var5.field722 = var5.field725 + (int)(Math.random() * (double)(var5.field723 - var5.field725));
							}
						}
					} else {
						var5.stream2.method232(var8);
						if (!var5.stream2.hasNext()) {
							var5.stream2 = null;
						}
					}
				} else {
					if (var5.stream1 != null) {
						SceneTilePaint.pcmStreamMixer.removeSubStream(var5.stream1);
						var5.stream1 = null;
					}

					if (var5.stream2 != null) {
						SceneTilePaint.pcmStreamMixer.removeSubStream(var5.stream2);
						var5.stream2 = null;
					}
				}
			}
		}

		graphicsCycle = 0;
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(Lek;IB)Z",
		garbageValue = "63"
	)
	boolean method378(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			Projectile.friendsChat = null;
		} else {
			if (Projectile.friendsChat == null) {
				Projectile.friendsChat = new FriendsChat(FriendLoginUpdate.loginType, class193.client);
			}

			Projectile.friendsChat.method2278(var1.packetBuffer, var2);
		}

		field543 = cycleCntr;
		DevicePcmPlayerProvider.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)Z",
		garbageValue = "746554953"
	)
	boolean method379(PacketWriter var1) {
		if (Projectile.friendsChat != null) {
			Projectile.friendsChat.method2279(var1.packetBuffer);
		}

		field543 = cycleCntr;
		DevicePcmPlayerProvider.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)Z",
		garbageValue = "-575176954"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1183) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1186 = 0;
						var1.field1183 = false;
					}

					var3.offset = 0;
					if (var3.method2591()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1186 = 0;
					}

					var1.field1183 = true;
					ServerPacket[] var4 = NPCComposition.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1186 = 0;
				timer.method2230();
				var1.field1189 = var1.field1191;
				var1.field1191 = var1.field1423;
				var1.field1423 = var1.serverPacket;
				int var7;
				int var66;
				if (ServerPacket.field2757 == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field433[var66] = true;
					field615[var66] = var5;
					field613[var66] = var6;
					field614[var66] = var7;
					field616[var66] = 0;
					var1.serverPacket = null;
					return true;
				}

				Widget var68;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var66 = var3.readUnsignedIntIME();
					var68 = ArchiveLoader.widgetDefinition.method1785(var66);
					var68.modelType = 3;
					var68.modelId = VarpDefinition.localPlayer.appearance.getChatHeadId();
					UserComparator5.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}

				int var8;
				byte var9;
				byte var10;
				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var56;
				int var57;
				if (ServerPacket.field2766 == var1.serverPacket) {
					var12 = var3.readUnsignedShort();
					var14 = var3.readUnsignedByteAdd() * 4;
					var16 = var3.readUnsignedShortAdd();
					var6 = var3.method2666();
					var66 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var66 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var17 = var3.readUnsignedByteSub();
					var18 = var3.readUnsignedByte();
					var10 = var3.readByteAdd();
					var11 = var3.method2621();
					var15 = var3.readUnsignedShortLE();
					var9 = var3.readByteNeg();
					var13 = var3.readUnsignedByte() * 4;
					var56 = var9 + var7;
					var57 = var10 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var12 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var56 = var56 * 128 + 64;
						var57 = var57 * 128 + 64;
						var19 = new Projectile(var12, class473.Client_plane, var7, var8, class272.getTileHeight(var7, var8, class473.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14);
						var19.setDestination(var56, var57, class272.getTileHeight(var56, var57, class473.Client_plane) - var14, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					InterfaceParent.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class224.FriendSystem_invalidateIgnoreds();
					field541 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var73;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var66 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedIntIME();
					var7 = var3.readUnsignedShortAddLE();
					var73 = ArchiveLoader.widgetDefinition.method1785(var6);
					if (var66 != var73.modelAngleX || var5 != var73.modelAngleY || var7 != var73.modelZoom) {
						var73.modelAngleX = var66;
						var73.modelAngleY = var5;
						var73.modelZoom = var7;
						UserComparator5.invalidateWidget(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var66 = 0; var66 < VarpDefinition.field1479; ++var66) {
						VarpDefinition var82 = class148.VarpDefinition_get(var66);
						if (var82 != null) {
							Varps.Varps_temp[var66] = 0;
							Varps.Varps_main[var66] = 0;
						}
					}

					LoginState.method354();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var66 = var3.readInt();
					InterfaceParent var81 = (InterfaceParent)interfaceParents.get((long)var66);
					if (var81 != null) {
						SecureRandomFuture.closeInterface(var81, true);
					}

					if (meslayerContinueWidget != null) {
						UserComparator5.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method2665();
					var66 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var66 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var56 = var3.readUnsignedByteNeg();
					var57 = var56 >> 2;
					var11 = var56 & 3;
					var12 = field680[var57];
					var13 = var3.readUnsignedShortAddLE();
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
						PlayerCompositionColorTextureOverride.method886(class473.Client_plane, var7, var8, var57, var11, var12, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				String var50;
				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					Object[] var80 = new Object[var50.length() + 1];

					for (var6 = var50.length() - 1; var6 >= 0; --var6) {
						if (var50.charAt(var6) == 's') {
							var80[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var80[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var80[0] = new Integer(var3.readInt());
					ScriptEvent var89 = new ScriptEvent();
					var89.args = var80;
					class177.runScriptEvent(var89);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					LoginState.method354();
					var66 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByteSub();
					experience[var6] = var66;
					currentLevels[var6] = var5;
					levels[var6] = 1;
					field591[var6] = var5;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var66 >= Skills.Skills_experienceTable[var7]) {
							levels[var6] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2761 == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class134.queueSoundEffect(var66, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2708 == var1.serverPacket) {
					isCameraLocked = true;
					field426 = false;
					field422 = true;
					WorldMapArea.field2021 = var3.readUnsignedByte();
					UserComparator7.field1212 = var3.readUnsignedByte();
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field427 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = WorldMapArea.field2021 * 128 + 64;
					var8 = UserComparator7.field1212 * 128 + 64;
					boolean var64 = false;
					boolean var61 = false;
					if (field427) {
						var56 = AsyncHttpResponse.cameraY;
						var57 = class272.getTileHeight(var7, var8, class473.Client_plane) - var66;
					} else {
						var56 = class272.getTileHeight(ClanMate.cameraX, class317.cameraZ, class473.Client_plane) - AsyncHttpResponse.cameraY;
						var57 = var66;
					}

					field670 = new class496(ClanMate.cameraX, class317.cameraZ, var56, var7, var8, var57, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAdd() * 30;
					field547 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					VarpDefinition.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					InterfaceParent.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field541 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var24;
				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var66 = var3.readShortLE();
					var5 = var3.readUnsignedIntME();
					var6 = var3.method2662();
					var24 = ArchiveLoader.widgetDefinition.method1785(var5);
					if (var6 != var24.rawX || var66 != var24.rawY || var24.xAlignment != 0 || var24.yAlignment != 0) {
						var24.rawX = var6;
						var24.rawY = var66;
						var24.xAlignment = 0;
						var24.yAlignment = 0;
						UserComparator5.invalidateWidget(var24);
						this.alignWidget(var24);
						if (var24.type == 0) {
							class167.revalidateWidgetScroll(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var24, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				byte var20;
				long var25;
				long var27;
				long var29;
				String var32;
				boolean var60;
				if (ServerPacket.field2777 == var1.serverPacket) {
					var20 = var3.readByte();
					var25 = (long)var3.readUnsignedShort();
					var27 = (long)var3.readMedium();
					var29 = var27 + (var25 << 32);
					var60 = false;
					ClanChannel var88 = var20 >= 0 ? currentClanChannels[var20] : class316.guestClanChannel;
					if (var88 == null) {
						var60 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var29) {
								var60 = true;
								break;
							}
						}
					}

					if (!var60) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var29;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = class495.method2443(var3);
						var14 = var20 >= 0 ? 43 : 46;
						Message.addChatMessage(var14, "", var32, var88.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					Canvas.forceDisconnect(var66);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var54 = new World();
					var54.host = var3.readStringCp1252NullTerminated();
					var54.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var54.properties = var5;
					if (var54.isDeadman()) {
						var54.field709 = "beta";
						WorldMapScaleHandler.field2162 = true;
					} else {
						WorldMapScaleHandler.field2162 = false;
					}

					Interpreter.updateGameState(45);
					var2.close();
					var2 = null;
					class246.changeWorld(var54);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2804 == var1.serverPacket) {
					LoginState.method354();
					weight = var3.readShort();
					field547 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					BuddyRankComparator.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(ClanChannel.method872(class495.method2443(var3)));
					class209.addGameMessage(6, var50, var21);
					var1.serverPacket = null;
					return true;
				}

				Widget var23;
				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var66 < -70000) {
						var5 += 32768;
					}

					if (var66 >= 0) {
						var23 = ArchiveLoader.widgetDefinition.method1785(var66);
					} else {
						var23 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class1.itemContainerSetItem(var5, var7, var8 - 1, var56)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var56 = 0;
						if (var8 != 0) {
							var56 = var3.readUnsignedByte();
							if (var56 == 255) {
								var56 = var3.readInt();
							}
						}

						if (var23 != null && var7 >= 0 && var7 < var23.itemIds.length) {
							var23.itemIds[var7] = var8;
							var23.itemQuantities[var7] = var56;
						}
					}

					if (var23 != null) {
						UserComparator5.invalidateWidget(var23);
					}

					LoginState.method354();
					changedItemContainers[++field542 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2707 == var1.serverPacket) {
					var66 = var3.readUnsignedShortLE();
					if (var66 == 65535) {
						var66 = -1;
					}

					rootInterface = var66;
					this.method384(false);
					TaskHandler.method1110(var66);
					User.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteNeg();
					tradeChatMode = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2724 == var1.serverPacket) {
					var66 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readInt();
					var7 = var3.readUnsignedShortLE();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var8 = var5; var8 <= var7; ++var8) {
						var29 = ((long)var66 << 32) + (long)var8;
						Node var90 = widgetFlags.get(var29);
						if (var90 != null) {
							var90.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var29);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field426 = false;
					field423 = true;
					var66 = class173.method894(var3.readShort() & 2027);
					var5 = class190.method969(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field671 = new class497(FriendSystem.cameraPitch, var5, var6, var7);
					field672 = new class497(Script.cameraYaw, var66, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					SecureRandomFuture.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntIME();
					Varps.Varps_temp[var66] = var5;
					if (Varps.Varps_main[var66] != var5) {
						Varps.Varps_main[var66] = var5;
					}

					FriendSystem.changeGameOptions(var66);
					changedVarps[++changedVarpCount - 1 & 31] = var66;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2695 == var1.serverPacket && isCameraLocked) {
					field426 = true;
					field423 = false;
					field422 = false;

					for (var66 = 0; var66 < 5; ++var66) {
						field433[var66] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var23 = ArchiveLoader.widgetDefinition.method1785(var5);
					if (var23 != null && var23.type == 0) {
						if (var66 > var23.scrollHeight - var23.height) {
							var66 = var23.scrollHeight - var23.height;
						}

						if (var66 < 0) {
							var66 = 0;
						}

						if (var66 != var23.scrollY) {
							var23.scrollY = var66;
							UserComparator5.invalidateWidget(var23);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var59;
				if (ServerPacket.field2740 == var1.serverPacket) {
					isCameraLocked = true;
					field426 = false;
					field422 = true;
					WorldMapArea.field2021 = var3.readUnsignedByte();
					UserComparator7.field1212 = var3.readUnsignedByte();
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var6 = var3.readUnsignedByte() * 128 + 64;
					var7 = var3.readUnsignedShort();
					field427 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var56 = WorldMapArea.field2021 * 128 + 64;
					var57 = UserComparator7.field1212 * 128 + 64;
					var60 = false;
					var59 = false;
					if (field427) {
						var11 = AsyncHttpResponse.cameraY;
						var12 = class272.getTileHeight(var56, var57, class473.Client_plane) - var66;
					} else {
						var11 = class272.getTileHeight(ClanMate.cameraX, class317.cameraZ, class473.Client_plane) - AsyncHttpResponse.cameraY;
						var12 = var66;
					}

					field670 = new class495(ClanMate.cameraX, class317.cameraZ, var11, var56, var57, var12, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2754 == var1.serverPacket) {
					var66 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedByte();
					if (var66 == 65535) {
						var66 = -1;
					}

					class485.performPlayerAnimation(VarpDefinition.localPlayer, var66, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2689 == var1.serverPacket) {
					var7 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortLE();
					var8 = var3.readUnsignedShort();
					var66 = var3.readUnsignedShortAdd();
					if (var66 == 65535) {
						var66 = -1;
					}

					ArrayList var91 = new ArrayList();
					var91.add(var66);
					class136.method748(var91, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var66 = var3.readUnsignedShortAdd();
					Player var76;
					if (var66 == localPlayerIndex) {
						var76 = VarpDefinition.localPlayer;
					} else {
						var76 = players[var66];
					}

					var7 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedIntLE();
					if (var76 != null) {
						var76.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2747 == var1.serverPacket) {
					field426 = false;
					isCameraLocked = false;
					field422 = false;
					field423 = false;
					VarbitComposition.field1655 = 0;
					class11.field35 = 0;
					ChatChannel.field868 = 0;
					field427 = false;
					class135.field1330 = 0;
					AsyncHttpResponse.field55 = 0;
					GameBuild.field3240 = 0;
					class516.field4190 = 0;
					WorldMapArea.field2021 = 0;
					UserComparator7.field1212 = 0;
					WorldMapSectionType.field2095 = 0;
					field670 = null;
					field671 = null;
					field672 = null;

					for (var66 = 0; var66 < 5; ++var66) {
						field433[var66] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2699 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2673);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2774 == var1.serverPacket) {
					class534.method2680();
					var20 = var3.readByte();
					class148 var78 = new class148(var3);
					ClanSettings var87;
					if (var20 >= 0) {
						var87 = currentClanSettings[var20];
					} else {
						var87 = class223.guestClanSettings;
					}

					if (var87 == null) {
						this.method390(var20);
						var1.serverPacket = null;
						return true;
					}

					if (var78.field1371 > var87.field1417) {
						this.method390(var20);
						var1.serverPacket = null;
						return true;
					}

					if (var78.field1371 < var87.field1417) {
						var1.serverPacket = null;
						return true;
					}

					var78.method787(var87);
					var1.serverPacket = null;
					return true;
				}

				boolean var75;
				if (ServerPacket.field2756 == var1.serverPacket) {
					var75 = var3.readUnsignedByte() == 1;
					if (var75) {
						class334.field2955 = SecureRandomCallable.method465() - var3.readLong();
						FileSystem.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						FileSystem.grandExchangeEvents = null;
					}

					field548 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field426 = false;
					field423 = false;
					VarbitComposition.field1655 = var3.readUnsignedByte();
					class11.field35 = var3.readUnsignedByte();
					ChatChannel.field868 = var3.readUnsignedShort();
					class135.field1330 = var3.readUnsignedByte();
					AsyncHttpResponse.field55 = var3.readUnsignedByte();
					if (AsyncHttpResponse.field55 >= 100) {
						var66 = VarbitComposition.field1655 * 128 + 64;
						var5 = class11.field35 * 128 + 64;
						var6 = class272.getTileHeight(var66, var5, class473.Client_plane) - ChatChannel.field868;
						var7 = var66 - ClanMate.cameraX;
						var8 = var6 - AsyncHttpResponse.cameraY;
						var56 = var5 - class317.cameraZ;
						var57 = (int)Math.sqrt((double)(var7 * var7 + var56 * var56));
						FriendSystem.cameraPitch = (int)(Math.atan2((double)var8, (double)var57) * 325.9490051269531D) & 2047;
						Script.cameraYaw = (int)(Math.atan2((double)var7, (double)var56) * -325.9490051269531D) & 2047;
						if (FriendSystem.cameraPitch < 128) {
							FriendSystem.cameraPitch = 128;
						}

						if (FriendSystem.cameraPitch > 383) {
							FriendSystem.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class4.field3 = var3.readUnsignedByteAdd();
					JagexCache.field1885 = var3.readUnsignedByteSub();
					field482 = var3.readUnsignedByteNeg();

					for (var66 = JagexCache.field1885; var66 < JagexCache.field1885 + 8; ++var66) {
						for (var5 = class4.field3; var5 < class4.field3 + 8; ++var5) {
							if (groundItems[field482][var66][var5] != null) {
								groundItems[field482][var66][var5] = null;
								class73.updateItemPile(field482, var66, var5);
							}
						}
					}

					for (PendingSpawn var53 = (PendingSpawn)pendingSpawns.last(); var53 != null; var53 = (PendingSpawn)pendingSpawns.previous()) {
						if (var53.x >= JagexCache.field1885 && var53.x < JagexCache.field1885 + 8 && var53.y >= class4.field3 && var53.y < class4.field3 + 8 && var53.plane == field482) {
							var53.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2722 == var1.serverPacket) {
					var66 = var3.readShort();
					var5 = var3.readInt();
					var23 = ArchiveLoader.widgetDefinition.method1785(var5);
					if (var66 != var23.sequenceId || var66 == -1) {
						var23.sequenceId = var66;
						var23.modelFrame = 0;
						var23.modelFrameCycle = 0;
						UserComparator5.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readInt();
					var6 = SequenceDefinition.getGcDuration();
					PacketBufferNode var85 = ViewportMouse.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var85.packetBuffer.writeIntME(var66);
					var85.packetBuffer.writeIntLE(var5);
					var85.packetBuffer.writeByteAdd(GameEngine.fps);
					var85.packetBuffer.writeByteSub(var6);
					packetWriter.addNode(var85);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var6 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShortAdd();
					var66 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var83 = npcs[var66];
					if (var83 != null) {
						if (var5 == var83.sequence && var5 != -1) {
							var8 = MilliClock.SequenceDefinition_get(var5).restartMode;
							if (var8 == 1) {
								var83.sequenceFrame = 0;
								var83.sequenceFrameCycle = 0;
								var83.sequenceDelay = var6;
								var83.field1051 = 0;
							} else if (var8 == 2) {
								var83.field1051 = 0;
							}
						} else if (var5 == -1 || var83.sequence == -1 || MilliClock.SequenceDefinition_get(var5).field1833 >= MilliClock.SequenceDefinition_get(var83.sequence).field1833) {
							var83.sequence = var5;
							var83.sequenceFrame = 0;
							var83.sequenceFrameCycle = 0;
							var83.sequenceDelay = var6;
							var83.field1051 = 0;
							var83.field1057 = var83.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var79;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var66 = var3.readUnsignedIntIME();
					var5 = var3.readInt();
					InterfaceParent var86 = (InterfaceParent)interfaceParents.get((long)var5);
					var79 = (InterfaceParent)interfaceParents.get((long)var66);
					if (var79 != null) {
						SecureRandomFuture.closeInterface(var79, var86 == null || var79.group != var86.group);
					}

					if (var86 != null) {
						var86.remove();
						interfaceParents.put(var86, (long)var66);
					}

					var73 = ArchiveLoader.widgetDefinition.method1785(var5);
					if (var73 != null) {
						UserComparator5.invalidateWidget(var73);
					}

					var73 = ArchiveLoader.widgetDefinition.method1785(var66);
					if (var73 != null) {
						UserComparator5.invalidateWidget(var73);
						class167.revalidateWidgetScroll(ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var73.id >>> 16], var73, true);
					}

					if (rootInterface != -1) {
						Canvas.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				String var84;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var52 = new byte[var1.serverPacketLength];
					var3.method2593(var52, 0, var52.length);
					Buffer var77 = new Buffer(var52);
					var84 = var77.readStringCp1252NullTerminated();
					class137.openURL(var84, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var20 = var3.readByteSub();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var20;
					if (Varps.Varps_main[var5] != var20) {
						Varps.Varps_main[var5] = var20;
					}

					FriendSystem.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var66 < -70000) {
						var5 += 32768;
					}

					if (var66 >= 0) {
						var23 = ArchiveLoader.widgetDefinition.method1785(var66);
					} else {
						var23 = null;
					}

					if (var23 != null) {
						for (var7 = 0; var7 < var23.itemIds.length; ++var7) {
							var23.itemIds[var7] = 0;
							var23.itemQuantities[var7] = 0;
						}
					}

					class272.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var56 = var3.readUnsignedShortAddLE();
						var57 = var3.readUnsignedByteNeg();
						if (var57 == 255) {
							var57 = var3.readUnsignedIntME();
						}

						if (var23 != null && var8 < var23.itemIds.length) {
							var23.itemIds[var8] = var56;
							var23.itemQuantities[var8] = var57;
						}

						class1.itemContainerSetItem(var5, var8, var56 - 1, var57);
					}

					if (var23 != null) {
						UserComparator5.invalidateWidget(var23);
					}

					LoginState.method354();
					changedItemContainers[++field542 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class485.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					isCameraLocked = true;
					field426 = false;
					field423 = true;
					VarbitComposition.field1655 = var3.readUnsignedByte();
					class11.field35 = var3.readUnsignedByte();
					ChatChannel.field868 = var3.readUnsignedShort();
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = VarbitComposition.field1655 * 128 + 64;
					var7 = class11.field35 * 128 + 64;
					var8 = class272.getTileHeight(var6, var7, class473.Client_plane) - ChatChannel.field868;
					var56 = var6 - ClanMate.cameraX;
					var57 = var8 - AsyncHttpResponse.cameraY;
					var11 = var7 - class317.cameraZ;
					double var92 = Math.sqrt((double)(var11 * var11 + var56 * var56));
					var14 = class190.method969((int)(Math.atan2((double)var57, var92) * 325.9490051269531D) & 2047);
					var15 = class173.method894((int)(Math.atan2((double)var56, (double)var11) * -325.9490051269531D) & 2047);
					field671 = new class497(FriendSystem.cameraPitch, var14, var66, var5);
					field672 = new class497(Script.cameraYaw, var15, var66, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2748 == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedIntLE();
					var23 = ArchiveLoader.widgetDefinition.method1785(var5);
					UserComparator8.method675(var23, var66);
					UserComparator5.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 128;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte();
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2755 == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByte();
					var79 = (InterfaceParent)interfaceParents.get((long)var66);
					if (var79 != null) {
						SecureRandomFuture.closeInterface(var79, var5 != var79.group);
					}

					class47.openInterface(var66, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				long var35;
				if (ServerPacket.field2738 == var1.serverPacket) {
					var66 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method384(false);
						TaskHandler.method1110(rootInterface);
						User.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var95;
					for (; var6-- > 0; var95.field895 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var56 = var3.readUnsignedByte();
						var95 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var95 != null && var8 != var95.group) {
							SecureRandomFuture.closeInterface(var95, true);
							var95 = null;
						}

						if (var95 == null) {
							var95 = class47.openInterface(var7, var8, var56);
						}
					}

					for (var79 = (InterfaceParent)interfaceParents.first(); var79 != null; var79 = (InterfaceParent)interfaceParents.next()) {
						if (var79.field895) {
							var79.field895 = false;
						} else {
							SecureRandomFuture.closeInterface(var79, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var66) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var56 = var3.readUnsignedShort();
						var57 = var3.readInt();

						for (var11 = var8; var11 <= var56; ++var11) {
							var35 = (long)var11 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var57), var35);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2735 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2667);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						LoginScreenAnimation.method549(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var66 = var3.readUnsignedShortLE();
					if (var66 == 65535) {
						var66 = -1;
					}

					AbstractByteArrayCopier.playSong(var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2779 == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					if (var66 == 65535) {
						var66 = -1;
					}

					var5 = var3.method2665();
					class7.method18(var66, var5);
					var1.serverPacket = null;
					return true;
				}

				boolean var55;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var66 = var3.readUShortSmart();
					var55 = var3.readUnsignedByte() == 1;
					var84 = "";
					boolean var58 = false;
					if (var55) {
						var84 = var3.readStringCp1252NullTerminated();
						if (InterfaceParent.friendSystem.isIgnored(new Username(var84, FriendLoginUpdate.loginType))) {
							var58 = true;
						}
					}

					String var72 = var3.readStringCp1252NullTerminated();
					if (!var58) {
						class209.addGameMessage(var66, var84, var72);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2785 == var1.serverPacket) {
					class73.field763 = new class473(ApproximateRouteStrategy.field359);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2783 == var1.serverPacket) {
					var75 = var3.readBoolean();
					if (var75) {
						if (MilliClock.field1892 == null) {
							MilliClock.field1892 = new class388();
						}
					} else {
						MilliClock.field1892 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2702 == var1.serverPacket) {
					InterfaceParent.friendSystem.method403();
					field541 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2715 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2677);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var57 = var3.readUnsignedByteNeg();
					var6 = var3.readMedium();
					var66 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var66 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var11 = var3.readUnsignedShort();
					var56 = var3.readUnsignedShortAdd();
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var31 = new GraphicsObject(var56, class473.Client_plane, var7, var8, class272.getTileHeight(var7, var8, class473.Client_plane) - var57, var11, cycle);
						graphicsObjects.addFirst(var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2714 == var1.serverPacket) {
					class534.method2680();
					var20 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var20 >= 0) {
							currentClanSettings[var20] = null;
						} else {
							class223.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var20 >= 0) {
						currentClanSettings[var20] = new ClanSettings(var3);
					} else {
						class223.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				NPC var22;
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var6 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedByteAdd();
					var66 = var3.readUnsignedShortAdd();
					var22 = npcs[var66];
					var5 = var3.readUnsignedIntME();
					if (var22 != null) {
						var22.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					SecureRandomFuture.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2795 == var1.serverPacket) {
					isCameraLocked = true;
					field426 = false;
					field422 = false;
					WorldMapArea.field2021 = var3.readUnsignedByte();
					UserComparator7.field1212 = var3.readUnsignedByte();
					WorldMapSectionType.field2095 = var3.readUnsignedShort();
					class516.field4190 = var3.readUnsignedByte();
					GameBuild.field3240 = var3.readUnsignedByte();
					if (GameBuild.field3240 >= 100) {
						ClanMate.cameraX = WorldMapArea.field2021 * 128 + 64;
						class317.cameraZ = UserComparator7.field1212 * 128 + 64;
						AsyncHttpResponse.cameraY = class272.getTileHeight(ClanMate.cameraX, class317.cameraZ, class473.Client_plane) - WorldMapSectionType.field2095;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntME();
					var23 = ArchiveLoader.widgetDefinition.method1785(var5);
					if (var23.modelType != 2 || var66 != var23.modelId) {
						var23.modelType = 2;
						var23.modelId = var66;
						UserComparator5.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var66] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var66] = new GrandExchangeOffer(var3, false);
					}

					field539 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					BuddyRankComparator.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2765 == var1.serverPacket) {
					return this.method378(var1, 1);
				}

				if (ServerPacket.field2701 == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortAdd();
					var66 = var3.readUnsignedShort();
					class75.method431(var66, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2698 == var1.serverPacket) {
					var66 = var3.readInt();
					if (var66 != revision) {
						revision = var66;
						class173.method895();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2776 == var1.serverPacket) {
					return this.method379(var1);
				}

				if (ServerPacket.field2788 == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortAddLE();
					class169.method882(var66, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2696 == var1.serverPacket) {
					class4.field3 = var3.readUnsignedByte();
					JagexCache.field1885 = var3.readUnsignedByte();
					field482 = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var66 = 0; var66 < Varps.Varps_main.length; ++var66) {
						if (Varps.Varps_main[var66] != Varps.Varps_temp[var66]) {
							Varps.Varps_main[var66] = Varps.Varps_temp[var66];
							FriendSystem.changeGameOptions(var66);
							changedVarps[++changedVarpCount - 1 & 31] = var66;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					var21 = var3.readStringCp1252NullTerminated();
					var6 = var3.readUnsignedByteAdd();
					if (var6 >= 1 && var6 <= 8) {
						if (var21.equalsIgnoreCase("null")) {
							var21 = null;
						}

						playerMenuActions[var6 - 1] = var21;
						playerOptionsPriorities[var6 - 1] = var66 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				String var45;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var20 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var38 = (long)var3.readUnsignedShort();
					long var40 = (long)var3.readMedium();
					PlayerType var94 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var3.readUnsignedByte());
					long var42 = (var38 << 32) + var40;
					boolean var62 = false;
					ClanChannel var44 = null;
					var44 = var20 >= 0 ? currentClanChannels[var20] : class316.guestClanChannel;
					if (var44 == null) {
						var62 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var94.isUser && InterfaceParent.friendSystem.isIgnored(new Username(var21, FriendLoginUpdate.loginType))) {
									var62 = true;
								}
								break;
							}

							if (var42 == crossWorldMessageIds[var15]) {
								var62 = true;
								break;
							}

							++var15;
						}
					}

					if (!var62) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var42;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var45 = AbstractFont.escapeBrackets(class495.method2443(var3));
						var16 = var20 >= 0 ? 41 : 44;
						if (var94.modIcon != -1) {
							Message.addChatMessage(var16, class415.method2158(var94.modIcon) + var21, var45, var44.name);
						} else {
							Message.addChatMessage(var16, var21, var45, var44.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					ChatChannel.updatePlayers(var3, var1.serverPacketLength);
					HttpContentType.method2409();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2710 == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntME();
					var23 = ArchiveLoader.widgetDefinition.method1785(var5);
					WorldMapElement.method912(var23, VarpDefinition.localPlayer.appearance.gender, var66);
					UserComparator5.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2703 == var1.serverPacket) {
					class73.field763 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2691 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2670);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2794 == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					TextureProvider.method1575(var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedShortAddLE();
					if (var6 == 65535) {
						var6 = -1;
					}

					var24 = ArchiveLoader.widgetDefinition.method1785(var66);
					ItemComposition var69;
					if (!var24.isIf3) {
						if (var6 == -1) {
							var24.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var69 = ArchiveDiskActionHandler.ItemDefinition_get(var6).getCountObj(var5);
						var24.modelType = 4;
						var24.modelId = var6;
						var24.modelAngleX = var69.xan2d;
						var24.modelAngleY = var69.yan2d;
						var24.modelZoom = var69.zoom2d * 100 / var5;
						UserComparator5.invalidateWidget(var24);
					} else {
						var24.itemId = var6;
						var24.itemQuantity = var5;
						var69 = ArchiveDiskActionHandler.ItemDefinition_get(var6).getCountObj(var5);
						var24.modelAngleX = var69.xan2d;
						var24.modelAngleY = var69.yan2d;
						var24.modelAngleZ = var69.zan2d;
						var24.modelOffsetX = var69.offsetX2d;
						var24.modelOffsetY = var69.offsetY2d;
						var24.modelZoom = var69.zoom2d;
						if (var69.isStackable == 1) {
							var24.itemQuantityMode = 1;
						} else {
							var24.itemQuantityMode = 2;
						}

						if (var24.field3116 > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.field3116;
						} else if (var24.rawWidth > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.rawWidth;
						}

						UserComparator5.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var66 = var3.readUnsignedShortLE();
					class131.method722(var66);
					changedItemContainers[++field542 - 1 & 31] = var66 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2700 == var1.serverPacket) {
					var66 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAdd();
					var23 = ArchiveLoader.widgetDefinition.method1785(var66);
					if (var23.modelType != 6 || var5 != var23.modelId) {
						var23.modelType = 6;
						var23.modelId = var5;
						UserComparator5.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2801 == var1.serverPacket) {
					if (class73.field763 == null) {
						class73.field763 = new class473(ApproximateRouteStrategy.field359);
					}

					class542 var51 = ApproximateRouteStrategy.field359.method2399(var3);
					class73.field763.field4000.vmethod9186(var51.field4315, var51.field4314);
					field595[++field549 - 1 & 31] = var51.field4315;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2692 == var1.serverPacket) {
					var66 = var3.readUnsignedIntLE();
					var21 = var3.readStringCp1252NullTerminated();
					var23 = ArchiveLoader.widgetDefinition.method1785(var66);
					if (!var21.equals(var23.text)) {
						var23.text = var21;
						UserComparator5.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2734 == var1.serverPacket) {
					field544 = cycleCntr;
					var20 = var3.readByte();
					class162 var70 = new class162(var3);
					ClanChannel var74;
					if (var20 >= 0) {
						var74 = currentClanChannels[var20];
					} else {
						var74 = class316.guestClanChannel;
					}

					if (var74 == null) {
						this.method389(var20);
						var1.serverPacket = null;
						return true;
					}

					if (var70.field1441 > var74.field1453) {
						this.method389(var20);
						var1.serverPacket = null;
						return true;
					}

					if (var70.field1441 < var74.field1453) {
						var1.serverPacket = null;
						return true;
					}

					var70.method858(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2778 == var1.serverPacket) {
					class334.method1778(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2727 == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					var23 = ArchiveLoader.widgetDefinition.method1785(var66);
					if (var23.modelType != 1 || var5 != var23.modelId) {
						var23.modelType = 1;
						var23.modelId = var5;
						UserComparator5.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2780 == var1.serverPacket) {
					LoginState.method354();
					var66 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedByteSub();
					var7 = var3.readInt();
					experience[var6] = var7;
					currentLevels[var6] = var5;
					levels[var6] = 1;
					field591[var6] = var66;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var7 >= Skills.Skills_experienceTable[var8]) {
							levels[var6] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2809 == var1.serverPacket) {
					for (var66 = 0; var66 < players.length; ++var66) {
						if (players[var66] != null) {
							players[var66].sequence = -1;
						}
					}

					for (var66 = 0; var66 < npcs.length; ++var66) {
						if (npcs[var66] != null) {
							npcs[var66].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2687 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2671);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var66 = var3.readInt();
					var55 = var3.readUnsignedByteNeg() == 1;
					var23 = ArchiveLoader.widgetDefinition.method1785(var66);
					if (var55 != var23.isHidden) {
						var23.isHidden = var55;
						UserComparator5.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class133.privateChatMode = class177.method904(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2767 == var1.serverPacket) {
					var75 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.readUnsignedIntLE();
					var23 = ArchiveLoader.widgetDefinition.method1785(var5);
					AsyncRestClient.method47(var23, VarpDefinition.localPlayer.appearance, var75);
					UserComparator5.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var66 = var3.readInt();
					var68 = ArchiveLoader.widgetDefinition.method1785(var66);

					for (var6 = 0; var6 < var68.itemIds.length; ++var6) {
						var68.itemIds[var6] = -1;
						var68.itemIds[var6] = 0;
					}

					UserComparator5.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					JagexCache.field1885 = var3.readUnsignedByte();
					field482 = var3.readUnsignedByteAdd();
					class4.field3 = var3.readUnsignedByteNeg();

					while (var3.offset < var1.serverPacketLength) {
						var66 = var3.readUnsignedByte();
						class311 var67 = MilliClock.method1117()[var66];
						HealthBarDefinition.method932(var67);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2806 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2668);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2731 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var25 = (long)var3.readUnsignedShort();
					var27 = (long)var3.readMedium();
					PlayerType var34 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var3.readUnsignedByte());
					long var46 = var27 + (var25 << 32);
					var59 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (crossWorldMessageIds[var13] == var46) {
							var59 = true;
							break;
						}
					}

					if (InterfaceParent.friendSystem.isIgnored(new Username(var50, FriendLoginUpdate.loginType))) {
						var59 = true;
					}

					if (!var59 && field515 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = AbstractFont.escapeBrackets(ClanChannel.method872(class495.method2443(var3)));
						byte var65;
						if (var34.isPrivileged) {
							var65 = 7;
						} else {
							var65 = 3;
						}

						if (var34.modIcon != -1) {
							class209.addGameMessage(var65, class415.method2158(var34.modIcon) + var50, var32);
						} else {
							class209.addGameMessage(var65, var50, var32);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var66 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var56 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var93 = ArchiveLoader.widgetDefinition.method1785(var66);
					if (var56 != var93.color) {
						var93.color = var56;
						UserComparator5.invalidateWidget(var93);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2790 == var1.serverPacket) {
					short var71 = (short)var3.method2662();
					var5 = var3.readUnsignedByte();
					var6 = var3.readInt();
					var7 = var3.readUnsignedShortLE();
					var22 = npcs[var7];
					if (var22 != null) {
						var22.method598(var5, var6, var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2736 == var1.serverPacket) {
					var66 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShortAddLE();
					var24 = ArchiveLoader.widgetDefinition.method1785(var66);
					var24.field3114 = var6 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2762 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2674);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var25 = var3.readLong();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					PlayerType var33 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var3.readUnsignedByte());
					var35 = (var27 << 32) + var29;
					boolean var63 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var35) {
							var63 = true;
							break;
						}
					}

					if (var33.isUser && InterfaceParent.friendSystem.isIgnored(new Username(var50, FriendLoginUpdate.loginType))) {
						var63 = true;
					}

					if (!var63 && field515 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var35;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var45 = AbstractFont.escapeBrackets(ClanChannel.method872(class495.method2443(var3)));
						if (var33.modIcon != -1) {
							Message.addChatMessage(9, class415.method2158(var33.modIcon) + var50, var45, class224.base37DecodeLong(var25));
						} else {
							Message.addChatMessage(9, var50, var45, class224.base37DecodeLong(var25));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						Canvas.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2743 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2676);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2732 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2675);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2784 == var1.serverPacket) {
					return this.method378(var1, 2);
				}

				if (ServerPacket.field2718 == var1.serverPacket) {
					var66 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedIntIME();
					var24 = ArchiveLoader.widgetDefinition.method1785(var6);
					class158.method840(var24, var5, var66);
					UserComparator5.invalidateWidget(var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2805 == var1.serverPacket) {
					LoginState.method354();
					runEnergy = var3.readUnsignedShort();
					field547 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2737 == var1.serverPacket) {
					isCameraLocked = true;
					field426 = false;
					field423 = true;
					var66 = var3.readShort();
					var5 = var3.readShort();
					var6 = class190.method969(var5 + FriendSystem.cameraPitch & 2027);
					var7 = var66 + Script.cameraYaw;
					var8 = var3.readUnsignedShort();
					var56 = var3.readUnsignedByte();
					field671 = new class497(FriendSystem.cameraPitch, var6, var8, var56);
					field672 = new class497(Script.cameraYaw, var7, var8, var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2758 == var1.serverPacket) {
					var7 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortAddLE();
					var56 = var3.readUnsignedShortAddLE();
					var8 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var66 = var3.readUnsignedShort();
					if (var66 == 65535) {
						var66 = -1;
					}

					ArrayList var37 = new ArrayList();
					var37.add(var66);
					var37.add(var5);
					class136.method748(var37, var6, var7, var8, var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2772 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2672);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var15 = var3.readUnsignedShortLE();
					var18 = var3.readUnsignedShortAddLE();
					var10 = var3.readByteNeg();
					var12 = var3.readUnsignedShortAdd();
					var9 = var3.readByteNeg();
					var6 = var3.method2664();
					var66 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var66 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var17 = var3.readUnsignedByte();
					var13 = var3.readUnsignedByte() * 4;
					var14 = var3.readUnsignedByteSub() * 4;
					var16 = var3.readUnsignedShortLE();
					var11 = var3.method2621();
					var56 = var9 + var7;
					var57 = var10 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var12 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var56 = var56 * 128 + 64;
						var57 = var57 * 128 + 64;
						var19 = new Projectile(var12, class473.Client_plane, var7, var8, class272.getTileHeight(var7, var8, class473.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14);
						var19.setDestination(var56, var57, class272.getTileHeight(var56, var57, class473.Client_plane) - var14, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2717 == var1.serverPacket) {
					HealthBarDefinition.method932(class311.field2678);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2720 == var1.serverPacket) {
					field544 = cycleCntr;
					var20 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var20 >= 0) {
							currentClanChannels[var20] = null;
						} else {
							class316.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var20 >= 0) {
						currentClanChannels[var20] = new ClanChannel(var3);
					} else {
						class316.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				class315.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 1612999125 * 71665533 : -1) + "," + (var1.field1191 != null ? var1.field1191.id * 1612999125 * 71665533 : -1) + "," + (var1.field1189 != null ? var1.field1189.id * 1612999125 * 71665533 : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class485.logOut();
			} catch (IOException var48) {
				Huffman.method1942();
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 1612999125 * 71665533 : -1) + "," + (var1.field1191 != null ? var1.field1191.id * 1612999125 * 71665533 : -1) + "," + (var1.field1189 != null ? var1.field1189.id * 1612999125 * 71665533 : -1) + "," + var1.serverPacketLength + "," + (VarpDefinition.localPlayer.pathX[0] + Projectile.baseX) + "," + (VarpDefinition.localPlayer.pathY[0] + GameEngine.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var21 = var21 + var3.array[var6] + ",";
				}

				class315.RunException_sendStackTrace(var21, var49);
				class485.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "846839081"
	)
	@Export("menu")
	final void menu() {
		class317.method1690();
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			int var2;
			if (isMenuOpen) {
				int var3;
				if (var1 != 1 && (DbTableType.mouseCam || var1 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < class245.menuX - 10 || var2 > class245.menuX + class60.menuWidth + 10 || var3 < Decimator.menuY - 10 || var3 > class167.menuHeight + Decimator.menuY + 10) {
						isMenuOpen = false;
						Language.method2061(class245.menuX, Decimator.menuY, class60.menuWidth, class167.menuHeight);
					}
				}

				if (var1 == 1 || !DbTableType.mouseCam && var1 == 4) {
					var2 = class245.menuX;
					var3 = Decimator.menuY;
					int var4 = class60.menuWidth;
					int var5 = MouseHandler.MouseHandler_lastPressedX;
					int var6 = MouseHandler.MouseHandler_lastPressedY;
					int var7 = -1;

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
						int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
						if (var5 > var2 && var5 < var4 + var2 && var6 > var9 - 13 && var6 < var9 + 3) {
							var7 = var8;
						}
					}

					if (var7 != -1) {
						class129.method715(var7);
					}

					isMenuOpen = false;
					Language.method2061(class245.menuX, Decimator.menuY, class60.menuWidth, class167.menuHeight);
				}
			} else {
				var2 = FontName.method2524();
				if ((var1 == 1 || !DbTableType.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
					var1 = 2;
				}

				if ((var1 == 1 || !DbTableType.mouseCam && var1 == 4) && menuOptionsCount > 0) {
					class129.method715(var2);
				}

				if (var1 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-942182958"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = FontName.method2524();
		return (leftClickOpensMenu && menuOptionsCount > 2 || BufferedSource.method2350(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "450506472"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class166.fontBold12.stringWidth("Choose Option");

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) {
			var5 = class166.fontBold12.stringWidth(SoundSystem.method211(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}

		var3 += 8;
		var4 = menuOptionsCount * 15 + 22;
		var5 = var1 - var3 / 2;
		if (var5 + var3 > GameEngine.canvasWidth) {
			var5 = GameEngine.canvasWidth - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var2;
		if (var4 + var2 > WorldMapArea.canvasHeight) {
			var6 = WorldMapArea.canvasHeight - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		class245.menuX = var5;
		Decimator.menuY = var6;
		class60.menuWidth = var3;
		class167.menuHeight = menuOptionsCount * 15 + 22;
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		Actor.scene.menuOpen(class473.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "90"
	)
	final void method384(boolean var1) {
		VarpDefinition.method903(rootInterface, GameEngine.canvasWidth, WorldMapArea.canvasHeight, var1);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "1004570109"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : ArchiveLoader.widgetDefinition.method1785(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = GameEngine.canvasWidth;
			var4 = WorldMapArea.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		SecureRandomCallable.alignWidgetSize(var1, var3, var4, false);
		class154.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "846162072"
	)
	final void method387() {
		UserComparator5.invalidateWidget(clickedWidget);
		++WorldMapLabelSize.widgetDragDuration;
		if (field419 && field420) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field532) {
				var1 = field532;
			}

			if (var1 + clickedWidget.width > field532 + clickedWidgetParent.width) {
				var1 = field532 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field537) {
				var2 = field537;
			}

			if (var2 + clickedWidget.height > field537 + clickedWidgetParent.height) {
				var2 = field537 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field536;
			int var4 = var2 - field529;
			int var5 = clickedWidget.dragZoneSize;
			if (WorldMapLabelSize.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field532 + clickedWidgetParent.scrollX;
			int var7 = var2 - field537 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class177.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						class177.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var11 = class429.getWidgetFlags(var9);
						int var10 = var11 >> 17 & 7;
						int var12 = var10;
						Widget var15;
						if (var10 == 0) {
							var15 = null;
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var15 = var9;
									break;
								}

								var9 = ArchiveLoader.widgetDefinition.method1785(var9.parentId);
								if (var9 == null) {
									var15 = null;
									break;
								}

								++var13;
							}
						}

						if (var15 != null) {
							PacketBufferNode var14 = ViewportMouse.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
							var14.packetBuffer.writeShortAddLE(clickedWidget.childIndex);
							var14.packetBuffer.writeShortAddLE(draggedOnWidget.itemId);
							var14.packetBuffer.writeShortAddLE(clickedWidget.itemId);
							var14.packetBuffer.writeInt(clickedWidget.id);
							var14.packetBuffer.writeIntME(draggedOnWidget.id);
							var14.packetBuffer.writeShortAddLE(draggedOnWidget.childIndex);
							packetWriter.addNode(var14);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field536, field529 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					Strings.method1959(field536 + widgetClickX, widgetClickY + field529);
				}

				clickedWidget = null;
			}

		} else {
			if (WorldMapLabelSize.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					Strings.method1959(field536 + widgetClickX, field529 + widgetClickY);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(B)Lvn;",
		garbageValue = "-106"
	)
	@Export("username")
	public Username username() {
		return VarpDefinition.localPlayer != null ? VarpDefinition.localPlayer.username : null;
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-161718870"
	)
	void method389(int var1) {
		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.field2657, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "255"
	)
	void method390(int var1) {
		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.field2652, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	@ObfuscatedSignature(
			descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.accountHash;
	}

//	@Export("init")
//	@ObfuscatedName("init")
	//lol idk
	public final void init() {
		if (this.checkHost()) {
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (var2 != null) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase("true")) {
							isMembersWorld = true;
						} else {
							isMembersWorld = false;
						}
						break;
					case 4:
						if (clientType == -1) {
							clientType = Integer.parseInt(var2);
						}
						break;
					case 5:
						worldProperties = Integer.parseInt(var2);
						break;
					case 6:
						int var4 = Integer.parseInt(var2);
						Language var5;
						if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
							var5 = Language.Language_valuesOrdered[var4];
						} else {
							var5 = null;
						}

						WorldMapCacheName.clientLanguage = var5;
						break;
					case 7:
						class129.field1245 = class33.method121(Integer.parseInt(var2));
						break;
					case 8:
						if (var2.equalsIgnoreCase("true")) {
						}
						break;
					case 9:
						class106.field1139 = var2;
						break;
					case 10:
						class28.field84 = (StudioGame)class356.findEnumerated(Varcs.method632(), Integer.parseInt(var2));
						if (class28.field84 == StudioGame.oldscape) {
							FriendLoginUpdate.loginType = LoginType.oldscape;
						} else {
							FriendLoginUpdate.loginType = LoginType.field4162;
						}
						break;
					case 11:
						class391.field3702 = var2;
						break;
					case 12:
						worldId = Integer.parseInt(var2);
					case 13:
					case 16:
					case 18:
					case 19:
					case 20:
					case 23:
					case 24:
					default:
						break;
					case 14:
						class403.field3747 = Integer.parseInt(var2);
						break;
					case 15:
						gameBuild = Integer.parseInt(var2);
						break;
					case 17:
						HealthBarDefinition.field1525 = var2;
						break;
					case 21:
						field450 = Integer.parseInt(var2);
						break;
					case 22:
						class134.field1307 = var2;
						break;
					case 25:
						int var3 = var2.indexOf(".");
						if (var3 == -1) {
							field449 = Integer.parseInt(var2);
						} else {
							field449 = Integer.parseInt(var2.substring(0, var3));
							Integer.parseInt(var2.substring(var3 + 1));
						}
					}
				}
			}

			DynamicObject.method458();
			class183.worldHost = this.getCodeBase().getHost();
			class356.field3198 = new JagNetThread();
			String var6 = class129.field1245.name;
			byte var7 = 0;
			if ((worldProperties & class529.field4221.rsOrdinal()) != 0) {
				class28.field83 = "beta";
			}

			try {
				class30.method110("oldschool", class28.field83, var6, var7, 23);
			} catch (Exception var8) {
				class315.RunException_sendStackTrace((String)null, var8);
			}

			class193.client = this;
			RuneLiteMenuEntry.client = (RSClient) (Object) this;
			RunException.field4391 = clientType;
			class53.initCredentials();
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.https = true;
			}

			if (field448 == -1) {
				if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
					field448 = 0;
				} else {
					field448 = 5;
				}
			}

			this.startThread(765, 503, 220, 1);
		}
	}

	protected void finalize() throws Throwable {
		class321.field2853.remove(this);
		super.finalize();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lcy;",
		garbageValue = "673134129"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1761793571"
	)
	static int method377(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lng;IB)I",
		garbageValue = "-9"
	)
	static final int method386(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = ArchiveLoader.widgetDefinition.method1785(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!ArchiveDiskActionHandler.ItemDefinition_get(var11).isMembersOnly || isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = VarpDefinition.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = ArchiveLoader.widgetDefinition.method1785(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!ArchiveDiskActionHandler.ItemDefinition_get(var11).isMembersOnly || isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = runEnergy;
					}

					if (var6 == 12) {
						var7 = weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class332.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (VarpDefinition.localPlayer.x >> 7) + Projectile.baseX;
					}

					if (var6 == 19) {
						var7 = (VarpDefinition.localPlayer.y >> 7) + GameEngine.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
