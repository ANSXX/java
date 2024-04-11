class Duck
{
    public static int printArray(int a[]){
        for(int x:a){
            System.out.print(x+" ");
        }
        return 0;
    }
    public static void main (String[] args)
    {
        int[] arrary = {123,124,125,126,127};
        printArray(arrary);
    }
}