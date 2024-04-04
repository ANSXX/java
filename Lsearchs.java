import java.util.*;
public class Lsearchs{
    public static int Lsearch(int num[],int search){
        for(int i=0;i<num.length;i++){
            if(num[i] == search){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = scan.nextInt();
        int[] num= new int[n];
        System.out.println("enter the array");
        for(int i = 0;i<n;i++){
            num[i] = scan.nextInt();
        }
        System.out.println("search the value");
        int search = scan.nextInt();
        scan.close();
        System.out.print("your array is:- ");
        for(int i = 0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        int index = Lsearch(num,search);
        if(index == -1){
            System.out.println("\nNot found");
        }
        else{
            System.out.println("\nValue is at index:- "+(index+1));
        }
    }
   
}