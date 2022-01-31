import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class digitProduct
{
	public int multDigits(int n) {
		int r = 1;
		while(n > 0) {
			if(n % 10 != 0) {
				r *= n % 10;
			}
			n /= 10;
		}
		return r;
	}
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		int num = file.nextInt();
		int res = 1;
		while(num >= 10) {
			num = multDigits(num);
		}
		System.out.println(num);
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new digitProduct().run();
	}	
	
}
