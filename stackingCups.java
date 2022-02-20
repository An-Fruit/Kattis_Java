import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Character.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class stackingCups{
	public void run() throws Exception{
		Map<Integer, List<String>> map = new TreeMap<>();
	    Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		while(times-- > 0){
			String [] strings = file.nextLine().trim().split(" ");
			try{
				int a = Integer.parseInt(strings[0]);
				if(map.get(a) == null){
					map.put(a, new ArrayList<>());
				}
				map.get(a).add(strings[1]);
			}
			catch(Exception e) {
				int a = 2 * Integer.parseInt(strings[1]);
				if(map.get(a) == null){
					map.put(a, new ArrayList<>());
				}
				map.get(a).add(strings[0]);
			}
		}
		file.close();
		for(int num : map.keySet()){
			for(String s : map.get(num)){
				System.out.println(s);
			}
		}



	}
	public static void main(String[] args) throws Exception{

	new stackingCups().run();

	}
}