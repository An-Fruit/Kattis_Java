import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class akcija {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		int times = f.nextInt();
		int[] nums = new int[times];
		for(int i = 0; i < times; i++) {
			nums[i] = f.nextInt();
		}
		Arrays.sort(nums);
		int sum = 0;
		for(int i = times - 1; i > times % 3; i-= 3) {
			sum += nums[i];
			sum += nums[i - 1];
		}
		for(int i = 0; i < times % 3; i++) {
			sum += nums[i];
		}
		
		System.out.print(sum);
		f.close();
	}

	public static void main(String[] args) throws Exception {
		new akcija().run();
	}

}
