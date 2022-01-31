import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class alphabetSpam
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		String mail = file.next();
		double whiteSpace = 0;
		double lowerCase = 0;
		double upperCase = 0;
		double symbol = 0;
		boolean b = false;
		for(int i = 0; i < mail.length(); i++) {
			char c = mail.charAt(i);
			if(c==95) {
				whiteSpace++;
			}
			else if(c >= 97 && c <= 122) {
				lowerCase++;
			}
			else if(c >= 65 && c <= 90) {
				upperCase++;
			}
			else {
				symbol++;
			}
		}
		double w = whiteSpace/mail.length();
		double l = lowerCase/mail.length();
		double u = upperCase/mail.length();
		double s = symbol/mail.length();
		System.out.printf("%.16f\n", w);
		System.out.printf("%.16f\n", l);
		System.out.printf("%.16f\n", u);
		System.out.printf("%.16f\n", s);
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new alphabetSpam().run();
	}	
	
}
