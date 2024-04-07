public class Ma{
    public static int maxSubarraySum(int n[]){
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer
        for(int i=0;i<n.length;i++){
            for(int j = i;j<n.length;j++)
            {
                int currentSum = 0;
                for(int k = i;k<=j;k++){
                    currentSum += n[k];
                }
                // Update maxSum if the currentSum is greater
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum; // Return the maximum sum found
    }
    public static void main(String [] args){
        int n[]= {2,4,6,8,10};
        int maxSum = maxSubarraySum(n);
        System.out.println("Maximum sum of subarrays: " + maxSum);
    }
}
