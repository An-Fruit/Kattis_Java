import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class EbAltoSax {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		int T = f.nextInt();
		Map<Character, ArrayList<Integer>> map = new HashMap<>();
		map.put('c', new ArrayList<Integer>(Arrays.asList(2,3,4,7,8,9,10)));
		map.put('d', new ArrayList<Integer>(Arrays.asList(2,3,4,7,8,9)));
		map.put('e', new ArrayList<Integer>(Arrays.asList(2,3,4,7,8)));
		map.put('f', new ArrayList<Integer>(Arrays.asList(2,3,4,7)));
		map.put('g', new ArrayList<Integer>(Arrays.asList(2,3,4)));
		map.put('a', new ArrayList<Integer>(Arrays.asList(2,3)));
		map.put('b', new ArrayList<Integer>(Arrays.asList(2)));
		map.put('C', new ArrayList<Integer>(Arrays.asList(3)));
		map.put('D', new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,8,9)));
		map.put('E', new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,8)));
		map.put('F', new ArrayList<Integer>(Arrays.asList(1,2,3,4,7)));
		map.put('G', new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
		map.put('A', new ArrayList<Integer>(Arrays.asList(1,2,3)));
		map.put('B', new ArrayList<Integer>(Arrays.asList(1,2)));
		while(T-- > 0) {
			char[] cars = f.next().toCharArray();
			int[] nums = new int[10];
			for(int num : map.get(cars[0])) {
				nums[num] += 1;
			}
			for(int i = 1; i < cars.length; i++) {
				
			}
		}

		f.close();
	}

	public static void main(String[] args) throws Exception {
		new EbAltoSax().run();
	}

}
