import java.util.*;
import java.math.BigInteger;
class arrayH {
    public static void main(String args[] ) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        
        int arr_size = scan.nextInt();        
        BigInteger sum = BigInteger.ZERO;
        for(int i = 0; i < arr_size;i++)
        {
            BigInteger num = scan.nextBigInteger();
            sum= sum.add(num);
        }
        System.out.println(sum);
    }
}