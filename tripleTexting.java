import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class tripleTexting
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		String str = file.next();
		int lengthOne = str.length()/3;
		String[] words = new String[3];
		words[0] = str.substring(0,lengthOne);
		words[1] = str.substring(lengthOne, lengthOne * 2);
		words[2] = str.substring(lengthOne * 2);
		int count = 0;
		for(int i = 0; i < 3; i++) {
			for(String check : words) {
				if(check.equals(words[i])) {
					count++;
				}
				
			}
			if(count > 1) {
				System.out.println(words[i]);
				break;
			}
		}
		
		
		
		
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new tripleTexting().run();
	}	
	
}