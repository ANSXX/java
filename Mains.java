import java.util.*;

public class Mains {
    public void helper_function() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<Integer> sum = new ArrayList<>();
        for (int l = 0; l < T; l++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < a.length; i++) {
                ArrayList<Integer> path = new ArrayList<>();
                int j = i;
                int temp = 0;
                while (a[j] < a.length && a[j] != -1 && a[j] != i && !path.contains(j)) {
                    path.add(j);
                    temp += j;
                    j = a[j];
                    if (a[j] == i) {
                        temp += j;
                        break;
                    }
                }
                if (j < a.length && i == a[j]) {
                    sum.add(temp);
                }
            }
        }
        sc.close();
        if (sum.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(Collections.max(sum));
        }
    }

    public static void main(String[] args) {
        Mains m = new Mains();
        m.helper_function();
    }
}
