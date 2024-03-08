import java.lang.String;
public class SwappingTwoNumbers {
    public static void swapNumber(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping your numbers are: "+a+" "+b);

    }
    public static void main(String [] args){
    int a = 32, b = 24;
    System.out.println("Before swapping your numbers are: "+a+" "+b);

    swapNumber(a, b);
    }
}
