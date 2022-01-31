import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class oneChicken
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
			//read in the number at the top of the data file
		int numPeople = file.nextInt();
		int chicken = file.nextInt();
		int left = chicken - numPeople;
		if(Math.abs(left) == 1) {
			if(left >= 0) {
				System.out.println("Dr. Chaz will have " + left + " piece of chicken left over!");
			}
			else {
				System.out.println("Dr. Chaz needs " + Math.abs(left) + " more piece of chicken!");
			}
		}
		else {
			if(left >= 0) {
				System.out.println("Dr. Chaz will have " + left + " pieces of chicken left over!");
			}
			else {
				System.out.println("Dr. Chaz needs " + Math.abs(left) + " more pieces of chicken!");
			}
		}
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new oneChicken().run();
	}	
	
}
