public class whileloop
{
    public static void main(String args[])
    {
        int a =54321;
        int rev = 0;
        while(a>0)
        {
            int ld = a%10;
            rev = (rev*10) + ld;
            a = a/10;
        }
        System.out.println(rev);
    }
}