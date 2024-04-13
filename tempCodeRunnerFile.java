import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.in("enter the range of the array");
        int arr_size = scan.nextInt();
        int array = 0;
        for(int i = 0; i<=arr_size;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i <= arr_size; i++){
            System.out.print(array[i]);
        }
}
}