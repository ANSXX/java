public class pattern
{
    public static void main (String args[])
    {
        int i,j,line=4;
        char ch = 'A';
        for(i=1;i<=line;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}