import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class test {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);
		
		while(true) {
			String s = f.next();
			if(s.equals("stop")) break;
			System.out.println(Pattern.matches("[/W/D]", s));
		}

		f.close();
	}

	public static void main(String[] args) throws Exception {
		new test().run();
	}

}
