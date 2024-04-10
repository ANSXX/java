import java.util.*;
public class RandomNumber {
    private static final int MAX_NUMBER = 100;
    private static int randomNumber(int max)
    {
        return (int)(Math.random()*max);
    }
    private static void Hint(int num)
    {
        System.out.println("Hint the number is: "+(num%2==0?"even":"odd"));
    }
    public static void main(int userNum,int rNum){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.printf("I have choosed the number between 0 - %d can you gess it?",MAX_NUMBER);
        while (true) {
            try{
                i++;
                if(scan.hasNextInt())
                {
                    
                    int userNum = scan.nextInt();
                    if(randomNumber(MAX_NUMBER)<userNum)
                    {                
                        System.out.println("Choose the smaller number");
                        
                    }
                    else if(randomNumber(MAX_NUMBER)>userNum){
                        System.out.println("choose the grater number");
                        
                    }
                    else{
                        System.out.printf("YAY!! you guessed the right number in %d time ",i);
                        break;
                    }
                }
            }
            catch(InputMismatchException e){

                System.out.println("enter the number ");
                scan.next();
            }
        }
        scan.close();
    }
    }


    public static void main(String args[]){
        
}