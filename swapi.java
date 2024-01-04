public class swapi
{
    public static void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("value of a is : "+a);
        System.out.println("value of b is : "+b);
    }
    public static int product(int a,int b)
    {
        int product = a * b;
        return product;
    }
    public static void main(String args[])
    {
        int a=3, b=5;
        swap(a, b);
        int prod = product(a, b);
        System.out.println("value is : "+prod);
    }
}