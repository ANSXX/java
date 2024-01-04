// import java.util.*;
public class overl
{
    public static int sum(int a, int b)
        {
            return a+b;
        }
    public static int sum(int a, int b,int c)
        {
            return a+b+c;
        }
    public static float sum(float a, float b)
        {
            return a+b;
        }
    public static float sum(float a, float b,float c)
        {
            return a+b+c;
        }
    public static void main(String args[])
    {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,2));
        System.out.println(sum(3.2f,4.8f));
        System.out.println(sum(3.2f,4.9f,1.9f));
    }
}
    