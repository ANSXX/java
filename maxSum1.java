public class maxSum1 {
   public static void printPair(int[] num) {
      int currSum = 0;
      int maxSum = Integer.MIN_VALUE;


      for(int i = 0; i < num.length; i++) {
         int start = i;
         for(int j =i ; j < num.length; j++) {
            int end = j;
            currSum = 0;
            for(int k = start; k <= end; k++) {
               currSum += num[k];
            }
            System.out.println(currSum);
            if(maxSum< currSum){
               maxSum = currSum;
            }
         }
      }

      System.out.println("max sum " + maxSum);
   }

   public static void main(String[] var0) {
      int[] numbers = new int[]{2, 4, 6, 8, 10};
      printPair(numbers);
   }
}
