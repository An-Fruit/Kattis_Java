import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class methodic_multiplication
{
	public int countChar(String str, char c)
	{
	    int count = 0;

	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == c)
	            count++;
	    }

	    return count;
	}
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		String a = file.next();
		String b = file.next();
		String s = "";
		int acnt;
		int bcnt;
		if(a.equals("0") || b.equals("0")) System.out.println("0");
		else {
			acnt = countChar(a, 'S');
			bcnt = countChar(b, 'S');
			for(int i = 0; i < (bcnt * acnt); i++) {
				s += "S(";
				if(i == (bcnt * acnt) - 1) s += "0";
			}
			for(int i = 0; i < (bcnt * acnt); i++) {
				s += ")";
			}
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new methodic_multiplication().run();
	}	
	
}
