import java.util.*;
public class SumOdd {
    public static void main(String [] args){
        int a,sum;
        System.out.print("Enter the number of first even number you want to add");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        sum = a(a+1);
        System.out.println(sum);
    }
}
