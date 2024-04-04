import java.util.*;
public class factorial2 {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = 1;    
        for(int i=n;i>0;i--)
        {
            factorial*=i;
        }
        System.out.println(factorial);
        scan.close();
    }
}

