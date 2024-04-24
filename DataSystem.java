import java.io.*;
import java.util.*;

public class DataSystem {

    public static String Data(int m) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name");
        String Name = scan.nextLine();
        System.out.println("Enter the Surname");
        String SurName = scan.nextLine();
        System.out.println("Enter the RollNo");
        int RollNo = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the ID");
        String ID = scan.nextLine();
        System.out.println("Enter the CGPA");
        float CGPA = scan.nextFloat();
        return String.format("%-10d %-10s %-10s %-10d %-10s %-10f", m, Name,SurName, RollNo, ID, CGPA);
    }    
    private static void addData(List<String> data) 
    {
        int serialNumber = data.size() + 1;
        String newData = Data(serialNumber);
        data.add(newData);
        System.out.println("Data added successfully!");
    }

    private static void modifyData(List<String> data) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the serial number of the data you want to modify:");
        int serialNumber = scan.nextInt();
        scan.nextLine(); // Consume newline character
        if (serialNumber > 0 && serialNumber <= data.size()) {
            String modifiedData = Data(serialNumber);
            data.set(serialNumber - 1, modifiedData);
            System.out.println("Data modified successfully!");
        } else {
            System.out.println("Invalid serial number!");
        }
    }

    private static void removeData(List<String> data) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the serial number of the data you want to remove:");
        int serialNumber = scan.nextInt();
        scan.nextLine();
        if (serialNumber > 0 && serialNumber <= data.size()) {
            data.remove(serialNumber - 1);
            System.out.println("Data removed successfully!");
        } else {
            System.out.println("Invalid serial number!");
        }
    }

    private static void printData(List<String> data) {
        if (data.isEmpty()) {
            System.out.println("No data available.");
        } else {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-14s | %-10.4s |\n", "Serial No", "Name"," Surname", "RollNo", "ID", "CGPA");
            System.out.println("-----------------------------------------------------------------------------------");
            for (String line : data) {
                String[] parts = line.split("\\s+");
                System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-14s | %-10.4s |\n", parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
            }
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }
    
    private static List<String> loadDataFromFile() {
        List<String> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error loading data from file: " + e.getMessage());
        }
        return data;
    }

    private static void saveDataToFile(List<String> data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt"))) {
            for (String line : data) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }

    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        List<String> data = loadDataFromFile(); 
        
        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Data");
            System.out.println("2. Modify Data");
            System.out.println("3. Remove Data");
            System.out.println("4. Print Data");
            System.out.println("5. Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            
            switch (choice) {
                case 1:
                    addData(data);
                    break;
                case 2:
                    modifyData(data);
                    break;
                case 3:
                    removeData(data);
                    break;
                case 4:
                    printData(data);
                    break;
                case 5:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    
        saveDataToFile(data);
        scan.close();
    }
}
