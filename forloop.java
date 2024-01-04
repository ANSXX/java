import java.util.*;
public class forloop
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int prev=0,cur=1,n,i;
        System.out.println(prev+"\n"+cur);
        for(i=2;i<=a;i++)
        {
            n=prev+cur;
            System.out.println(n);
            prev=cur;
            cur=n;
            scn.close();
        }
    }
}