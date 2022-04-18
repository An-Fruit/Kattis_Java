import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class keylogger {
	Map<String, Character> map = new HashMap<>(); 
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		map.put("clank", 'a');
		map.put("bong", 'b');
		map.put("click", 'c');
		map.put("tap", 'd');
		map.put("poing", 'e');
		map.put("clonk", 'f');
		map.put("clack", 'g');
		map.put("ping", 'h');
		map.put("tip", 'i');
		map.put("cloing", 'j');
		map.put("tic", 'k');
		map.put("cling", 'l');
		map.put("bing", 'm');
		map.put("pong", 'n');
		map.put("clang", 'o');
		map.put("pang", 'p');
		map.put("clong", 'q');
		map.put("tac", 'r');
		map.put("boing", 's');
		map.put("boink", 't');
		map.put("cloink", 'u');
		map.put("rattle", 'v');
		map.put("clock", 'w');
		map.put("toc", 'x');
		map.put("clink", 'y');
		map.put("tuc", 'z');
		
		Scanner f = new Scanner(System.in);

		int times = f.nextInt();
		boolean isCaps = false;
		boolean isShift = false;
		boolean add = true;
		int capCnt = 0;
		String s = "";
		while(times -- > 0) {
			String noise = f.next();
			if(noise.equals("bump")) { 
				if(capCnt % 2 == 0) {
					isCaps = true;
				}
				else {
					isCaps = false;
				}
				capCnt++;
				add = false;
			}
			
			if(noise.equals("dink")) {
				isShift = true;
				add = false;
			}
			
			if(noise.equals("thumb")) {
				isShift = false;
				add = false;
			}
			
			if(noise.equals("pop") && s.length() > 0) {
				s = s.substring(0,s.length() - 1);
				add = false;
			}
			
			
			if(noise.equals("whack")) s += ' ';
			
			else if(!isCaps && add) {
				if(!isShift) {
					s += (char)map.get(noise);
				}
				else {
					s += (char)(map.get(noise) - 32);
				}
			}
			else if (isCaps && add){
				if(!isShift) {
					s += (char)(map.get(noise) - 32);
				}
				else {
					s += (char)map.get(noise);
				}
			}
			add = true;
			
		}
		
		System.out.print(s);

		f.close();
	}

	public static void main(String[] args) throws Exception {
		new keylogger().run();
	}

}