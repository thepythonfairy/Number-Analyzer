public class Number{
    private int value;
    
    public Number(int v){
       value = v;
    }
    
    public boolean isOdd(){
       return value % 2 != 0;
    }
    
    public boolean isPerfect(){
        int sum = 0;
        for(int i = 1; i <= value / 2; i++){
            if (value % i == 0){
                sum += i;
            }
         }
         return sum == value;
     }
     
     public String toString(){
          return "" + value;
     }
}