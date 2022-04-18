import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class oddEcho {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		int T = f.nextInt();
		for(int i = 0; i < T; i++) {
			String s = f.next();
			if(i % 2 == 0) {
				System.out.println(s);
			}
		}

		f.close();
	}

	public static void main(String[] args) throws Exception {
		new oddEcho().run();
	}

}
