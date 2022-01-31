import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class SumofSquaredDigits
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
	
		int times = file.nextInt();
		
		for(int i = 0; i < times; i++) {
			int k = file.nextInt();
			int base = file.nextInt();
			String num = file.next();
			num = Integer.toString(Integer.parseInt(num, base), 10);
			int ssd = 0;
			for(int l = 0; l < num.length(); l++) {
				ssd += Math.pow(Integer.parseInt(num.substring(l,l+1)), num.length() - l);
			}
			System.out.println(k + " " + ssd);
			
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new SumofSquaredDigits().run();
	}	
	
}
