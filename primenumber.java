import java.util.*;
public class primenumber
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int i;
        scn.close();
        boolean isPrime= true;
        for(i=2; i<=number-1;i++)
        {
            if(number%i==0)
            {
                isPrime=false;
            }
        }
        if(isPrime==true)
        {
            System.out.println("your number is a prime");
        }
        else
        {
            System.out.println("your number is not a prime");
        }
    }
}