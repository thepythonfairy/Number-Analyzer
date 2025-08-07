import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer( String s )
	{
          list = new ArrayList<>();
          String [] values = s.split(",");
          
          for(String val : values){
             list.add(new Number(Integer.parseInt(val.trim())));
          }
	}

	public int countOdds()
	{
		int count = 0;
          
          for(Number num : list){
              if(num.isOdd()){
                 count++;
              }
          }
          return count;
	}

	public int countEvens()
	{
		int count = 0;
          
          for(Number num : list){
             if(!num.isOdd()){
                count++;
             }
           }
           return count;
	}

	public int countPerfects()
	{	
		int count = 0;
          
          for(Number num : list){
              if(num.isPerfect()){
                 count++;
              }
          }
          return count;
	}
	
	public String toString( )
	{
		return list.toString();
	}
}