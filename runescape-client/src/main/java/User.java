import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("User")
public class User implements Comparable {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lrp;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lrp;"
   )
   @Export("previousUsername")
   Username previousUsername;

   User() {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lov;I)I",
      garbageValue = "-1893146393"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.username.compareToTyped(var1.username);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Lrp;",
      garbageValue = "-1902661490"
   )
   @Export("getUsername")
   public Username getUsername() {
      return this.username;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "3"
   )
   @Export("getName")
   public String getName() {
      return this.username == null ? "" : this.username.getName();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-54"
   )
   @Export("getPreviousName")
   public String getPreviousName() {
      return this.previousUsername == null ? "" : this.previousUsername.getName();
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lrp;Lrp;I)V",
      garbageValue = "-1276649572"
   )
   @Export("set")
   void set(Username var1, Username var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.username = var1;
         this.previousUsername = var2;
      }
   }

   public int compareTo(Object var1) {
      return this.compareTo_user((User)var1);
   }
}
