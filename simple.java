import java.util.Scanner;
public class simple
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount :- ");
		int p = sc.nextInt();
		System.out.println("enter the rate of intrest :- ");
		int r = sc.nextInt();
		System.out.println("enter the Total time :- ");
		int t = sc.nextInt();
		int sum = (p*r*t)/100;
		System.out.println(sum);
		sc.close();
	}
}