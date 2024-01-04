public class dowhile2
{
    public static void main(String args [])
    {
        int c = 0,j=5;
        do
        {
            do
            {
                System.out.print("* ");
                c++;
            }
            while(j>=c);
            System.out.println(" ");
            j--;
        }
        while(j>=c);
    }
}