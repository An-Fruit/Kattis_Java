import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Accounting {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		FastReader f = new FastReader();
		HashMap<Integer, Integer> numap = new HashMap<>();
		
		f.nextInt();
		int q = f.nextInt();
		
		int set = 0;
		while(q-- > 0) {
			String[] line = f.nextLine().trim().split(" ");
			if(line[0].equals("SET")) {
				numap.put(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			}
			else if(line[0].equals("RESTART")) {
				set = Integer.parseInt(line[1]);
				numap = new HashMap<>();
			}
			else {
				int temp = Integer.parseInt(line[1]);
				if(numap.get(temp) != null) {
					System.out.println(numap.get(temp));
				}
				else {
					System.out.println(set);
				}
			}
		}

	}

	public static void main(String[] args) throws Exception {
		new Accounting().run();
	}

	class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}





