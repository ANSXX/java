//roots of quadratic equation;
import java.lang.*;
import java.util.Scanner;
public class Expression1 {
    public static void main(String [] args)
    {
        double r1,r2;
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(r1+" "+r2);
    }
}
