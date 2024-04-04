public class updowncast {
    public static void main(String[] args){
        int i = 25;
        float f = 12.5F;
        short s = 20;
        byte b = 10;

//        b = (byte)s;

        int num = 42;
        String str = "Hello";
        int x = 5;
        int y= 10;
        System.out.printf("the sum of %d and %x is %d%n",x,y,x+y);
        System.out.printf("Name: %s, Age: %d%n", "John", 30);
        System.out.format("The name is %s and the string is %s%n","james bond", str);
        System.out.format("The name is %s and the string is %s %n","james bond", str);

        System.out.printf("%(7d",x);

    }
}
