public class Merging {
    public static void main(String [] args){
        byte a = 72,b = 80;
        byte c;
        c = (byte)(a>>3);

        c = (byte)(c|b);
        System.out.println((c&0b00001111)<<3);
        System.out.println((c&0b11110000));
    }
}
