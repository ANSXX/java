import java.util.Scanner;
public class primeRange {
    public static boolean isPrime(int p)
    {
        if(p==2)
        {
            return true;
        }
        for(int i=2; i<=Math.sqrt(p);i++)
        {
            if(p%i==0 )
            {
                return false;
            }
        }
        return true;
    }
    public static void inPrime(int n)
    {
         for(int i=1; i<=n;i++)
        {
            if(isPrime(i)==true)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        inPrime(n);
        scn.close();
    }
}

