import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class recount
{
	Map<String, Integer> votes = new HashMap<>();
	public void run() throws Exception
	{
		boolean kill = false;
		int count = 0;
		ArrayList<Integer> vCount = new ArrayList<>();
		Scanner file = new Scanner(System.in);
		while(!kill) {
			count++;
			String name = file.nextLine().trim();
			if(name.equals("***")) {
				kill = true;
			}
			if(!votes.containsKey(name)) {
				votes.put(name, 0);
			}
			else {
				votes.put(name, votes.get(name) + 1);
			}
			
			
		}
		for(String ex : votes.keySet()) {
			vCount.add(votes.get(ex));
		}
		int min = Integer.MIN_VALUE;
		for(int i = 0; i < vCount.size(); i++) {
			if(vCount.get(i) > min) {
				min = vCount.get(i);
			}
		}
		int dupeCnt = 0;
		for(String a : votes.keySet()) {
			if (votes.get(a) == min) {
				dupeCnt++;
			}
		}
		if(dupeCnt > 1) {
			System.out.println("Runoff!");
		}
		else {
			for(String b : votes.keySet()) {
				if(votes.get(b) == min) {
					System.out.println(b);
					break;
				}
			}
		}
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new recount().run();
	}	
	
}