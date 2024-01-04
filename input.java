import java.util.*;
public class input
{
    public static void main(String args[])
    {
        // this is pre defined
        {
            int aa=10;
            int bb=20;
            int sum1= aa+bb;
            System.out.println(sum1);
        }
        //this is user defined
        {
            Scanner kuchbhi = new Scanner(System.in);
            {
                System.out.print("enter the value 1:- ");
                int a= kuchbhi.nextInt();
                System.out.print("enter the value 2:- ");
                int b= kuchbhi.nextInt();  
                int sum= a+b;
                System.out.println("your ans is:- " +sum );
                System.out.print("verify status ");
                boolean bol= kuchbhi.nextBoolean();
                System.out.println("status :- " +bol);
            }
            kuchbhi.close();
        }
    }
}