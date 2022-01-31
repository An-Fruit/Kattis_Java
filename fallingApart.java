import java.util.*;


			//change the class name
public class fallingApart
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		ArrayList<Integer> nums = new ArrayList<>();
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			nums.add(file.nextInt());
		}
		Collections.sort(nums);
		int alice = 0, bob = 0;
		Collections.reverse(nums);
		for(int i = 0; i < nums.size(); i++) {
			if(i % 2 == 0) {
				alice += nums.get(i);
			}
			else {
				bob += nums.get(i);
			}
		}
		System.out.print(alice + " ");
		System.out.print(bob);
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new fallingApart().run();
	}	
	
}