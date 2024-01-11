//Write a Java program to find the number of days in a month.
import java.util.*;
public class daysOfMonth
{
    public static boolean leapYear(int year){
        return((year%4 == 0 && year%100!= 0) || (year % 400 ==0));
    }
    public static int monthDays(int year,int month){
        if(month<1 || month>12){
            return -1;
        }
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2: return leapYear(year)? 29 : 28;
            default : 
            return 31;
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the year");
        int year = scan.nextInt();
        System.out.println("enter the month");
        int month = scan.nextInt();
        
        int daysOfMonth = monthDays(year, month);

        if (daysOfMonth != -1) {
            System.out.println("Number of days in the specified month: " + daysOfMonth);
        } else {
            System.out.println("Invalid input. Please enter a valid month (1-12).");
        }
        scan.close();
    }
}