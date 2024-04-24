class MinNbDiv{
  public static int count(int n){
    int number = 0;
    int count = 0;
    while(count!=n){
      count = 0;
      number++;
      for(int i=1;i<=number;i++)
      {
        if(number%i==0)
        {
          count++;
        }
      }
    }
    return number;
  }
  public static void main(String[] args){
    int num =6;
    System.out.println(count(num));
  }
}