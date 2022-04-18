import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class keystrokes {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		String a = f.next();
		f.close();
		int aind = 0;
		int loopind = 0;
		ArrayList<Character> word = new ArrayList<>();
		while(aind != a.length()) {
			if(a.charAt(aind) == 'L') {
				--loopind;
			}
			else if(a.charAt(aind) == 'R') {
				++loopind;
			}
			else if(a.charAt(aind) == 'B') {
				word.remove(loopind - 1);
				--loopind;
			}
			else {
				word.add(loopind, a.charAt(aind));
				++loopind;
			}
			aind++;
			
		}
		for(char c : word) {
			System.out.print(c);
		}
		
		
	}
	

	public static void main(String[] args) throws Exception {
		new keystrokes().run();
	}

}
