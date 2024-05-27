public class printSubarray {
   public printSubarray() {
   }

   public static void printPair(int[] var0) {
      int var1 = 0;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         for(int var3 = var2; var3 < var0.length; ++var3) {
            for(int var4 = var2; var4 <= var3; ++var4) {
               System.out.print(var0[var4] + " ");
            }

            ++var1;
            System.out.println();
         }

         System.out.println();
      }

      System.out.println("total no of pairs " + var1);
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{2, 3, 4, 5};
      printPair(var1);
   }
}
