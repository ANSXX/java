import java.util.*;
public class factorial {
    public static int facto (int n)
    {
        int f=1;
        for(int i=1;i<= n; i++)
        {
            f= f*i;
        }
        return f;
    }
    public static int binCoff(int n, int r)
    {
        int n_fact=facto(n);
        int r_fact=facto(r);
        int nmr_fact=facto(n-r);
        int binCoff = n_fact/(r_fact*nmr_fact);
        return binCoff;
    }  
    public static void main(String args[])
    {
        int n=5,r=2;
        Scanner scn = new Scanner(System.in);
        int f=facto(n);
        System.out.println("factorial of a number "+n+" is "+f);
        scn.close();
        int bco = facto(n)/(facto(r)*facto(n-r));
        System.out.println("answer by using already exisisting function on direct print : \n"+facto(n)/(facto(r)*facto(n-r)));
        System.out.println("answer by using already exisisting function : \n"+bco);
        System.out.println("answer by creating a new function : \n"+binCoff(5,2));
    }
}
