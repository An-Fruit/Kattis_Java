import java.util.Scanner;

public class methodMultiplication {
	public void run() throws Exception{
		Scanner f = new Scanner(System.in);
		String a = f.next();
		String b = f.next();
		f.close();
		if(a.length() == 1 || b.length() == 1) System.out.print(0);
		else {
			int alen = (a.length() - 1) / 3;
			int blen = (b.length() - 1) / 3;
			
			int len = alen * blen;
			for(int i = 0; i < len; i++) {
				System.out.print("S(");
			}
			System.out.print("0");
			for(int i = 0; i < len; i++) {
				System.out.print(")");
			}
		}
		
		
	}
	public static void main(String[] args) throws Exception{
		new methodMultiplication().run();
	}
}
