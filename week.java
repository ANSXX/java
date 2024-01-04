import java.util.*;
public class week{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day)
        {
            case 1: System.out.println("its monday bitch");
            break;
            case 2: System.out.println("its tuesday bitch");
            break;
            case 3: System.out.println("its wedday bitch");
            break;
            case 4: System.out.println("its thrusday bitch");
            break;
            case 5: System.out.println("its friday bitch");
            break;
            case 6: System.out.println("its saturday bitch");
            break;
            case 7: System.out.println("its sunday bitch");
            break;
            default:System.out.println("error bitch enter the number between 1-7");
            break;
        }
        sc.close();
    }
}