import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class aDifferentProblem {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		while(f.hasNext()) {
			long a = f.nextLong();
			long b = f.nextLong();
			System.out.println((long)Math.abs(a - b));
		}

		f.close();
	}

	public static void main(String[] args) throws Exception {
		new aDifferentProblem().run();
	}

}
