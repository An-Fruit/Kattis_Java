import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Bijele {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		//1 1 2 2 2 8
		int[] a = new int[6];
		String[] s = f.nextLine().trim().split(" ");
		for(int t = 0; t < s.length; t++) {
			a[t] = Integer.parseInt(s[t]);
		}
		f.close();
		for(int i1 = 0; i1 < a.length; i1++) {
			switch(i1) {
			case 0: System.out.print((1 - a[0]) + " ");
					break;
			case 1: System.out.print((1 - a[1]) + " ");
					break;
			case 2:	System.out.print((2 - a[2]) + " ");
					break;
			case 3: System.out.print((2 - a[3]) + " ");
					break;
			case 4: System.out.print((2 - a[4]) + " ");
					break;
			case 5: System.out.print(8 - a[5]);
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new Bijele().run();
	}

}
