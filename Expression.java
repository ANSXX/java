import java.lang.*;
import java.util.Scanner;
public class Expression {
    public static void main(String [] args)
    {
        int s1,s2,s3;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the side 1: ");
        s1 = scan.nextInt();
        System.out.print("Enter the side 2: ");
        s2 = scan.nextInt();
        System.out.print("Enter the side 3: ");
        s3 = scan.nextInt();
        float s =((s1+s2+s3)/2f);
        double area =  Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("area of triangle is: "+area);
    }
}
