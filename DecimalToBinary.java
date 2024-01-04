public class DecimalToBinary 
{
    public static void decToBin(int n)
    {
        int pow = 0;
        int binNum = 0;
        while(n>0)
        {
            int rem = n%2;
            binNum = binNum + ( rem * (int)Math.pow(10,pow));
        }
    }
    public static void main(String args[])
    {
        decToBin(2);
    }
}