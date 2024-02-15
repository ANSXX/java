import java.util.Scanner;

public class expression2 {
    public static void main(String []args){
        int l,b,h;
        int volume;
        System.out.println("enter the length breadth and height of a cuboid");
        Scanner scan = new Scanner(System.in);
        l = scan.nextInt();
        b = scan.nextInt();
        h = scan.nextInt();
        volume = l*b*h;
        System.out.println("volume of cuboid is: "+volume);
        int sarea = 2*(l*h+l*b+b*h);
        System.out.println("surface area of cuboid is: "+sarea);

    }
}
