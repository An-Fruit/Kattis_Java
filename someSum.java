import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class someSum
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
		int consecutive = file.nextInt();
		if(consecutive == 1) {
			System.out.println("Either");
		}
		else if(consecutive == 2) {
			System.out.println("Odd");
		}
		else if (consecutive == 3) {
			System.out.println("Either");
		}
		else if (consecutive == 4) {
			System.out.println("Even");
		}
		else if (consecutive == 5) {
			System.out.println("Either");
		}
		else if (consecutive == 6) {
			System.out.println("Odd");
		}
		else if (consecutive == 7) {
			System.out.println("Either");
		}
		else if (consecutive == 8) {
			System.out.println("Even");
		}
		else if(consecutive == 9) {
			System.out.println("Either");
		}
		else {
			System.out.println("Odd");
		}
		
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new someSum().run();
	}	
	
}
