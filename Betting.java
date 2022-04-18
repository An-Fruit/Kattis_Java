import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Betting {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		int a = f.nextInt();
		System.out.printf("%.10f%n", 100/(double)a);
		System.out.printf("%.10f%n", 100/(100-(double)a));

		f.close();
	}

	public static void main(String[] args) throws Exception {
		new Betting().run();
	}

}
