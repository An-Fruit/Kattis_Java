import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class alexandbarb {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		int k = f.nextInt();
		int a = f.nextInt();
		int b = f.nextInt();
		
		System.out.print(k % (a + b) < a ? "Barb" : "Alex");

		f.close();
	}

	public static void main(String[] args) throws Exception {
		new alexandbarb().run();
	}

}