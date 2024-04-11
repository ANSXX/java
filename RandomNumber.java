import java.util.*;

public class RandomNumber {
    private static class GuessingGame {
        private static final int MAX_NUMBER = 100;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int targetNumber = generateRandomNumber(MAX_NUMBER);
            int attempts = 0;
            
            System.out.println("Welcome to the Guessing Game!");
            System.out.println("I've picked a number between 0 and " + MAX_NUMBER + ". Try to guess it!");

            while (true) {
                attempts++;
                int userGuess = getUserGuess(scanner);
                
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the right number in " + attempts + " attempts.");
                    break;
                } else {
                    provideHint(targetNumber);
                    promptNextGuess(userGuess, targetNumber);
                }
            }
            
            scanner.close();
        }

        private static int generateRandomNumber(int max) {
            return (int) (Math.random() * (max + 1));
        }

        private static int getUserGuess(Scanner scanner) {
            System.out.print("Enter your guess: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next(); // Consume invalid input
            }
            return scanner.nextInt();
        }

        private static void provideHint(int targetNumber) {
            System.out.println("Hint: The number is " + (targetNumber % 2 == 0 ? "even" : "odd"));
        }

        private static void promptNextGuess(int userGuess, int targetNumber) {
            if (userGuess < targetNumber) {
                System.out.println("Choose a greater number.");
            } else {
                System.out.println("Choose a smaller number.");
            }
        }
    }

    public static void main(String args[]) {
        GuessingGame.main(args);
    }
}
