public class reverseArray {
    public static void revArray(int array[]){
        int start = 0, end = array.length-1;
        while(start<end){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String [] args){
        int num[]= {2,4,6,8,10};
        
        revArray(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
