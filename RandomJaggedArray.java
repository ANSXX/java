public class RandomJaggedArray{
    public static void main(String args[]){
        int r = (int) (Math.random() * 10);
        int num[][] = new int[r][];
        for(int i=0; i<num.length; i++)
        {
            int n = (int) (Math.random() * 10);
            num[i] = new int[n];
        }

        for(int i= 0; i<num.length; i++)
        {
            for(int j = 0; j < num[i].length; j++)
            {
                num[i][j] = (int) (Math.random()*10);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}