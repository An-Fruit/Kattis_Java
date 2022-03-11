import java.util.*;

public class aboveAverage {
	public static void main(String[] args) throws Exception{
		Scanner f = new Scanner(System.in);
		int times = f.nextInt();
		while(times-- > 0) {
			int n = f.nextInt();
			int sum = 0;
			int[] nums = new int[n];
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				nums[i] = f.nextInt();
				sum += nums[i];
			}
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] > sum/n) cnt++;
			}
			
			System.out.printf("%.3f", 100.0 * cnt/n);
			System.out.println("%");
		}
		f.close();
	}
}
