import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class NumberAnalyzerFileRunner
{
	public static void main( String args[] ) throws Exception
	{
		//Scanner for the data file numbers.dat
          Scanner file = new Scanner(new File("numbers.dat"));
          int count = Integer.parseInt(file.nextLine().trim());
         
		//loop to read in the data
          while(file.hasNextLine()){
          //read in each line of data
                String data = file.nextLine();
                //make a new NumberAnalyzer
                NumberAnalyzer analyzer = new NumberAnalyzer(data);
                
                //call all methods
                out.println(analyzer);
                out.println("odd count = " + analyzer.countOdds());
                out.println("even count = " + analyzer.countEvens());
                out.println("perfect Count = " + analyzer.countPerfects());
                out.println();
           }
           file.close();
     }
}