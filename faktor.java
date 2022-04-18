import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class faktor {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		int a = f.nextInt();
		int b = f.nextInt();
		System.out.print(a * (b - 1) + 1);

		f.close();
	}

	public static void main(String[] args) throws Exception {
		new faktor().run();
	}

}