import java.util.Arrays;

public class Solutions {
    public static boolean isArrayOfAllPossibilities(int[] arr) {
        int n = arr.length;
        
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                return false;
            }
        }
        
        return true;
    }
}
