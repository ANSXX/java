import java.util.Scanner;
public class hellonew{
        public static void main (String[] args){
                Scanner scan = new Scanner(System.in);
                System.out.println("enter your age: ");
                int n = scan.nextInt();
                if(n>=18)
                {
                        System.out.println("do you have votercard? Y/N ");
                        String s = scan.next();
                        if(s.equalsIgnoreCase("Y"))
                        {
                                System.out.println("you can vote");
                        }
                        else {
                                System.out.println("you can't vote");
                        }
                }
                else {
                        System.out.println("You can't vote");
                }
        }
}