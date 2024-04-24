import java.util.*;
import java.io.*;

public class CollegeDatabase {
    private static final String DATA_DIRECTORY = "department/";

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Choose an option:");
            System.out.print("\n1. Add Student Data ");
            System.out.print(" 2. Remove Student Data ");
            System.out.print(" 3. Edit Student Data ");
            System.out.print(" 4. Print Student Data ");
            System.out.print(" 5. Create Department ");
            System.out.println(" 6. Exit\n");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addOrEditData(scanner, "add");
                    break;
                case 2:
                    removeData(scanner);
                    break;
                case 3:
                    addOrEditData(scanner, "edit");
                    break;
                case 4:
                    printData(scanner);
                    break;
                case 5:
                    createDepartment(scanner);
                    break;
                case 6:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        scanner.close();
    }

    private static void addOrEditData(Scanner scanner, String mode) {
        String department = selectDepartment(scanner);
        if (department == null) return;

        String section = selectSection(scanner, department);
        if (section == null) return;

        String filePath = DATA_DIRECTORY + department + "/" + section + "_a.txt";
        if (mode.equals("edit")) {
            editData(scanner, filePath);
        } else {
            addData(scanner, filePath);
        }
    }

    private static void removeData(Scanner scanner) {
        String department = selectDepartment(scanner);
        if (department == null) return;

        String section = selectSection(scanner, department);
        if (section == null) return;

        String filePath = DATA_DIRECTORY + department + "/" + section + "_a.txt";
        removeDataFromFile(scanner, filePath);
    }

    private static String selectDepartment(Scanner scanner) {
        System.out.println("Select Department:");
        File departmentDirectory = new File(DATA_DIRECTORY);
        String[] departments = departmentDirectory.list();
        if (departments == null || departments.length == 0) {
            System.out.println("No departments found.");
            return null;
        }
        for (int i = 0; i < departments.length; i++) {
            System.out.println((i + 1) + ". " + departments[i]);
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        return departments[choice - 1];
    }

    private static String selectSection(Scanner scanner, String department) {
        System.out.println("Select Section:");
        File sectionDirectory = new File(DATA_DIRECTORY + department + "/");
        String[] sections = sectionDirectory.list();
        if (sections == null || sections.length == 0) {
            System.out.println("No sections found.");
            return null;
        }
        for (int i = 0; i < sections.length; i++) {
            System.out.println((i + 1) + ". " + sections[i].replace("_a.txt", ""));
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        return sections[choice - 1].replace("_a.txt", "");
    }

    private static void addData(Scanner scanner, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            System.out.println("Enter the data to add:");
            String newData = scanner.nextLine();
            writer.println(newData);
            System.out.println("Data added successfully!");
        } catch (IOException e) {
            System.err.println("Error adding data to file: " + e.getMessage());
        }
    }

    private static void editData(Scanner scanner, String filePath) {
        // Implement edit functionality if needed
        System.out.println("Edit functionality not implemented yet.");
    }

    private static void removeDataFromFile(Scanner scanner, String filePath) {
        try {
            List<String> lines = new ArrayList<>();
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
            fileScanner.close();

            System.out.println("Enter the index of the data to remove:");
            int indexToRemove = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (indexToRemove > 0 && indexToRemove <= lines.size()) {
                lines.remove(indexToRemove - 1);

                PrintWriter writer = new PrintWriter(new FileWriter(filePath));
                for (String line : lines) {
                    writer.println(line);
                }
                writer.close();

                System.out.println("Data removed successfully!");
            } else {
                System.out.println("Invalid index!");
            }
        } catch (IOException e) {
            System.err.println("Error removing data from file: " + e.getMessage());
        }
    }

    private static void printData(Scanner scanner) {
        String department = selectDepartment(scanner);
        if (department == null) return;

        String section = selectSection(scanner, department);
        if (section == null) return;

        String filePath = DATA_DIRECTORY + department + "/" + section + "_a.txt";
        printDataFromFile(filePath);
    }

    private static void printDataFromFile(String filePath) {
        try (Scanner fileScanner = new Scanner(new File(filePath))) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    private static void createDepartment(Scanner scanner) {
        System.out.println("Enter the name of the new department:");
        String newDepartment = scanner.nextLine();
        String newDepartmentPath = DATA_DIRECTORY + newDepartment;
        File newDepartmentDir = new File(newDepartmentPath);
        if (newDepartmentDir.exists()) {
            System.out.println("Department already exists.");
        } else {
            if (newDepartmentDir.mkdir()) {
                System.out.println("Department created successfully at: " + newDepartmentPath);
            } else {
                System.out.println("Failed to create department. Check permissions or disk space.");
            }
        }
    }    
}
