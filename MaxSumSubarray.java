public class MaxSumSubarray {
    public static int maxSubarraySum(int n[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += n[k];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static void printPair(int n[]) {
        int tp = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(n[k] + " ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of pairs: " + tp);
    }

    public static void main(String[] args) {
        int n[] = {2, 4, 6, 8, 10};
        System.out.println("All subarrays:");
        printPair(n);
        
        int maxSum = maxSubarraySum(n);
        System.out.println("\rMaximum sum of subarrays: " + maxSum);
    }
}
