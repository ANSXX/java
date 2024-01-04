import java.util.Scanner;
public class primeFunction
{
    public static boolean prime(int p)
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
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = scn.nextInt();
        scn.close();
        if(prime(n) == false)
        {
            System.out.println("your number is not a prime number");
        }
        else
        {
            System.out.println("your number is a prime number");
        }        
    }
}