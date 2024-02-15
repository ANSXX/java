import java.util.*;
public class patterns
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of row you want to print ");
        int number = scan.nextInt();
        for(int i = 1; i<= number;i++) {
            int p=0;
            while(p<number){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + p + " ");
                }
                p++;
            }
            System.out.println(" ");
        }
        scan.close();
    }

}