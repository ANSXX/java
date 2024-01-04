import java.util.*;

public class chinlagame {
    public static void main(String args[]) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("who is playing sir/ mam / friend or student");
        String choose;
        choose = sc.nextLine();
        if (choose.equals("sir") || choose.equals("mam"))
        {
        String answer;
        System.out.println("Hello " +choose+ " how are you? would you like to start the game (yes/no)");
        answer = sc.nextLine();

        if (answer.equals("yes")) {
            int numberOfTries = 0;
            int maxtry = 10;
            int randvalue = rand.nextInt(100);
            System.out.println("lets start the game guess the number:- ");
            
            while (numberOfTries < maxtry) {
                int guess = sc.nextInt();
                numberOfTries++;
                if (guess == randvalue && guess == 1) {
                    System.out.println("amazing you have guessed right in first try");
                    break;
                } else if (guess == randvalue && guess >= 5) {
                    System.out.println("congrats sir you have gussed in " + numberOfTries + " tries");
                    break;
                } else if (guess < randvalue) {
                    System.out.println("Your guess is too low! ");
                } else if (guess > randvalue) {
                    System.out.println("Your guess is too high! ");
                }
            }
            if (numberOfTries >= maxtry) {
                System.out.println("sorry " +choose+" !! you ran out of luck :( " + randvalue);
            }
        } 
        else if (answer.equals("no"))
        {
            System.out.println("sorry to see you go :'( ");
        }
        else {
            System.out.println("choose the correct option:- ");
        }
        sc.close();
        }
        else
        {
        String answer;
        System.out.println("aur bade bhai kaise ho game start kare? (jaroor/nai)");
        answer = sc.nextLine();

        if (answer.equals("jaroor")) {
            int numberOfTries = 0;
            int maxtry = 10;
            int randvalue = rand.nextInt(100);
            System.out.println("toh chaliye shuru karte hai:- " + randvalue);
            
            while (numberOfTries < maxtry) {
                int guess = sc.nextInt();
                numberOfTries++;
                if (guess == randvalue && guess == 1) {
                    System.out.println("are bade bhai tumne to moj kardi! sirf " + numberOfTries + " guess me hi jeet gai");
                    break;
                } else if (guess == randvalue && guess >= 5) {
                    System.out.println("sabash bemte tumne apne baap ka naam roshan kardiya " + guess + " guess me hi jeet gai");
                    break;
                } else if (guess < randvalue) {
                    System.out.println("choti soch wale no to bada soch le");
                } else if (guess > randvalue) {
                    System.out.println("aukat me aa bhadwe");
                }
            }
            if (numberOfTries >= maxtry) {
                System.out.println("chala ja bsdk kal aana fir " + randvalue);
            }
        } 
        else if (answer.equals("nai"))
        {
            System.out.println("toh yha apni maa chudane aaya hai bsdk??");
        }
        else {
            System.out.println("aakh ke andhe wo option tere baap ne diya hai ya teri maa ne ");
        }
        sc.close();
        }
    }
}
