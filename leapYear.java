import java.lang.*;
import java.util.*;

public class leapYear
{
    public static void main(String args[])
    {
        Scanner cYear = new Scanner(System.in);
        System.out.println("enter emoji");
        String emoji = cYear.nextLine();
        System.out.println(emoji);
        System.err.println("Enter the year you want to check");
        int year = cYear.nextInt();
        int pYear = 0 ,nYear = 0;
        if ((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println("year "+year+" is a leap year");
        } 
        else{
            System.out.println("not a leap year ");
            for(int i=year;i<year+4;i++){
                nYear = i;
                if((nYear % 4 == 0 && nYear % 100 != 0) || nYear % 400 == 0)
                {
                    // System.out.println("Your next leap year is in " +nYear+" in "+(nYear-year)+" year");
                    break;
                }
            }
            for(int i=year;i<year+4;i--){
                pYear = i;
                if((pYear % 4 == 0 && pYear % 100 != 0) || pYear % 400 == 0)
                {
                    // System.out.println("previous leap year was in " +pYear +" in "+(year-pYear)+" year ago");
                    break;
                }
            }
            if(year-pYear<nYear-year)
            {
                if(year-pYear==1)
                {
                    System.out.println("closest leap year is in "+pYear+"("+(year-pYear)+" year ago)");
                }
                else
                System.out.println("closest leap year is in "+pYear+"("+(year-pYear)+" years ago)");
            }
            else{
                if(nYear-year==1){
                    System.out.println("closest leap year is in "+nYear+"("+(nYear-year)+" year left)");
                }
                else
                System.out.println("closest leap year is in "+nYear+"("+(nYear-year)+" years left)");
            }
        }
    }
}