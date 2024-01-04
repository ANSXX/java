import java.util.*;
public class arrayBasic
{
    public static void printArray(int arr[],int length)
    {
        System.out.println("your array is: ");
        System.out.print("{ ");
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("}\n");
    }
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the array length: ");
        int length = scn.nextInt();
        int arr[] =new int [length];
        int testArray[]=new int[64];

        System.out.println("enter the array values: ");
        for(int i=0; i< length; i++)
        {
            System.out.println("enter array no"+(i+1)+": ");
            testArray[i]=scn.nextInt();
        }
        float sum=0, avrage;
        for(int j=0;j<length;j++)
        {
            sum += arr[j];
        }
        avrage = sum/length;
        System.out.println("the avrage of array is: "+avrage);
        
        printArray(arr,length);
        scn.close();
        System.out.println("your array length is: "+ testArray.length);
    } 
}