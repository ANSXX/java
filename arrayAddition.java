
//Wap to print addition of two user given matrix


import java.util.*;
public class arrayAddition
{
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        int r3=0,r1=0,r2=0,c1=0,c2=0;
        {
            System.out.println("enter the row and colum for array 1");
            r1 = num.nextInt();
            c1 = num.nextInt();
            System.out.println("enter the row and colum for array 2");
            r2 = num.nextInt();
            c2 = num.nextInt();
            if(r1==r2&&c1==c2){
                int[][] arr1 = new int[r1][c1];
                int[][] arr2 = new int[r2][c2];
                int[][] res= new int[r1][c1];
                System.out.println("enter the values of arr 1");
                for(int i=0;i<r1;i++)
                {
                    for(int j=0;j<c1;j++)
                    {
                        System.out.println("enter the value for array ["+i+","+j+"]");
                        arr1[i][j] = num.nextInt();
                    }
                }
                System.out.println("enter the values of arr 2");
                for(int i=0;i<r2;i++)
                {
                    for(int j=0;j<c2;j++)
                    {
                        System.out.println("enter the value for array ["+i+","+j+"]");
                        arr2[i][j] = num.nextInt();
                    }
                }
                System.out.print("\n");
                for(int i=0;i<arr1.length;i++)
                {
                    for(int j=0;j<arr1[0].length;j++)
                    {
                        res[i][j]=arr1[i][j]+arr2[i][j];
                        // same for multiplication we just change the operator
                        // res[i][j]=arr1[i][j]+arr2[i][j];
                    }
                }
                for(int i = 0;i < res.length;i++)
                {
                    for(int j = 0;j < res[0].length;j++)
                    {
                        System.out.print(res[i][j]+" ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                
            }
            else{
                System.out.println("Not possible!!");
            }
        }
    }
}