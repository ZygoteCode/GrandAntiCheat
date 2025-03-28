package it.zygotecode.grandanticheat.utils.hitbox;


public enum EnumAxisDirection {
   POSITIVE(1, "Towards positive"),
   NEGATIVE(-1, "Towards negative");

   private final int c;
   private final String d;

   private EnumAxisDirection(int i, String s) {
      this.c = i;
      this.d = s;
   }

   public int a() {
      return this.c;
   }

   public String toString() {
      return this.d;
   }
}
