import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class sodaSlurper
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
			//read in the number at the top of the data file
		int empty = file.nextInt();
		int found = file.nextInt();
		int price = file.nextInt();
		int count = 0;
		int sum = empty + found;
		while(sum/price > 0) {
			int place = sum/price;
			count += place;
			sum -= (place * price);
			sum += place;
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new sodaSlurper().run();
	}	
	
}
