import java.util.*;
public class testRun
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 1st number: ");
        int a = scan.nextInt();
        System.out.println("enter the 2nd number: ");
        int b = scan.nextInt();
        System.out.println("enter the 3rd number: ");
        int c = scan.nextInt();
        if (a == b || b == a ||b == c) {
            int max = Math.max(Math.max(a, b), c);
            System.out.println("The greatest number is: " + max);
        } else {
            int max = Math.max(Math.max(a, b), c);
            System.out.println("The greatest number is: " + max);
        }
        scan.close();   
    }
}