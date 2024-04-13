class Calculatorc
{
    int a;
    
    public int add(int a, int b)
    {
        return a+b; 
    }
}

public class ob 
{
    public static void main (String args[])
    {
        int num1 = 4;
        int num2 =5;
        
        Calculatorc calc = new Calculatorc();
    
        System.out.println(calc.add(num1, num2));
    }
}
