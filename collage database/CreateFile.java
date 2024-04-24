import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Enter file name (or type 'exit' to quit):");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                continueProgram = false;
                break;
            }

            File file = new File(input+".txt");

            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully!");
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        scan.close();
    }
}
