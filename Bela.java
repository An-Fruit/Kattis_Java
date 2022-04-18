import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Bela {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);
		HashMap<Character, Integer> dommap = new HashMap<>();
		HashMap<Character, Integer> map = new HashMap<>();
		dommap.put('A', 11);
		dommap.put('K',4);
		dommap.put('Q', 3);
		dommap.put('J', 20);
		dommap.put('T', 10);
		dommap.put('9', 14);
		dommap.put('8', 0);
		dommap.put('7',0);
		
		map.put('A', 11);
		map.put('K',4);
		map.put('Q', 3);
		map.put('J', 2);
		map.put('T', 10);
		map.put('9', 0);
		map.put('8', 0);
		map.put('7',0);
		
		int hands = f.nextInt();
		char suit = f.next().charAt(0);
		int sum = 0;
		for(int i = 0; i < hands * 4; i++) {
			char[] card = f.next().toCharArray();
			if(card[1] == suit) {
				sum += dommap.get(card[0]);
			}
			else {
				sum += map.get(card[0]);
			}
		}
		System.out.print(sum);

		f.close();
	}

	public static void main(String[] args) throws Exception {
		new Bela().run();
	}

}
