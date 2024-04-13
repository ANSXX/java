class computer{
    public int getMeAPen(int n){
        return n;
        
    }
    public String playMusic(){
        return "Music playing";
    }
}

class calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
class Demo{

    public static void main(String args[])
    {
        computer inComputer = new computer();
        String str = inComputer.playMusic();
        int n = inComputer.getMeAPen(10);
        
        System.out.println(str+" "+n);
        
        calculator c = new calculator();
        int a = c.add(1, 2, 3);

        System.out.println(a);
    }

}