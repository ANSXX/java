import java.util.*;
public class transverseArray{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int r=0,c=0;
        System.out.println("enter the row and column for an Array");
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] array= new int[r][c];
        // int n = sc.nextInt();
        for(int i=0; i<r;i++)
        {
            for(int j=0; j<c;j++)
            {
                System.out.println("enter the array values "+i+","+j);
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("Your Array is:- ");
        for(int i=0; i<r;i++)
        {
            for(int j=0; j<c;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("Transpose of Your Array is:- ");
        for(int i=0; i<r;i++)
        {
            for(int j=0; j<c;j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println();

        }
        
        sc.close();
    }
}