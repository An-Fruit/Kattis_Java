import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class cardTrick
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			int depth = file.nextInt();
			int[] cards = new int[depth];
			for(int i = 0; i < depth; i++) {
				cards[i] = i + 1;
			}
			
			
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new cardTrick().run();
	}	
	
}
