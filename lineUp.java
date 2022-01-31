import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class lineUp
{
	public void run() throws Exception
	{
		boolean decreasing = true;
		boolean increasing = true;
		ArrayList<String> names = new ArrayList<>();
		Scanner file = new Scanner(System.in);
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			names.add(file.next());
		}
		for(int i = 0; i < names.size() - 1; i++) {
			if(names.get(i).compareTo(names.get(i + 1)) > 0) {
				increasing = false;
			}
			else if(names.get(i).compareTo(names.get(i + 1)) < 0) {
				decreasing = false;
			}
		}
		if(increasing) {
			System.out.println("INCREASING");
		}
		else if(decreasing) {
			System.out.println("DECREASING");
		}
		else {
			System.out.println("NEITHER");
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new lineUp().run();
	}	
	
}
