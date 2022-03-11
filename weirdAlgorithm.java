import java.util.*;
import java.io.*;

public class weirdAlgorithm {
	public void run() throws Exception{
		
				Scanner r = new Scanner(System.in);
				long x = r.nextLong();
				while (x != 1) {
					System.out.print(x + " ");
					if (x % 2 == 0) {
						x /= 2;
					} else {
						x = 3 * x + 1;
					}
				}
				System.out.println(x);
			
		
	}
	public static void main(String[] args) throws Exception{
		new weirdAlgorithm().run();
	}
 }
