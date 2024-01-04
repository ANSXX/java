import java.util.*;
public class tenMultiple 
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        scn.close();
        {   
            System.out.println("enter the number");
            do
            {
                int a= scn.nextInt();
                if(a%10==0)
                {
                    continue;
                }
                System.out.println("your no is "+a);
            }
            while(true);
        }
    }
}
