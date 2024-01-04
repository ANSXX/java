import java.util.*;
public class funct
{
    public static int printHw()
    {
        System.out.println("hello world");
        return 0;
    }
    public static int calcSum(int num1,int num2)//parameters or formaal parameters
    {
        int sum = num1+num2;
        System.out.println("sum is : "+sum);
        return sum;
    }
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("enter the 2nd number : ");
        int b = sc.nextInt();
        sc.close();
        calcSum(a,b);//actual parameters or arguments
    }
}