import java.util.*;
public class news
{
    public static void main(String args[])
    {
       int a = 5,i,b=1;
       for(i=1;i<=a;i++)
       {
            b*=i;
       }
       System.out.println("the factorial of "+a+ " is " +b);
       Scanner m = new Scanner(System.in); 
       int marks = m.nextInt();
       m.close();
       String bass = (marks >=33)?"pass":"fail";
       System.out.println(bass);
    }
}