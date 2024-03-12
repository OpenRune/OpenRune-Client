import java.util.Date;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("aq")
	final ThreadGroup field51;
	@ObfuscatedName("aw")
	final AtomicInteger field52;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("this$0")
	@ObfuscatedName("this$0")
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field52 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field51 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field51, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field52.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1028466501"
	)
	static Date method50() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}
}
