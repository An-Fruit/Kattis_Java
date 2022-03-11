import java.util.*;

public class realChallenge {

	public void run() throws Exception{
		Scanner file = new Scanner(System.in);
		long area = file.nextLong();
		System.out.print(Math.sqrt(area) * 4.0);
	}
	public static void main(String[] args) throws Exception{
		new realChallenge().run();
	}
}
