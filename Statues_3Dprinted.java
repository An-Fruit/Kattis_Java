import java.util.*;

			//change the class name
public class Statues_3Dprinted
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
			//read in the number at the top of the data file
		int statues = file.nextInt(); 
		int printers = 1;
		int days = 1;
		while(printers < statues) {
			printers *= 2;
			days++;
		}
		System.out.println(days);
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Statues_3Dprinted().run();
	}	
	
}
