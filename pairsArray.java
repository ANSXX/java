public class pairsArray {
    public static void printPair(int n[]){
        int k = 0;
        for(int i=0;i<n.length;i++){
            int curr = n[i];
            for(int j=i+1; j<n.length;j++){
                System.out.print("("+curr+","+n[j]+")");
                k++;
            }
            System.out.println();
        }
        System.out.println("total no of pair is "+k);
    }
    public static void main(String [] args){
        int n[]= {1,2,3,4,5};
        printPair(n);
        
    }
    
}
