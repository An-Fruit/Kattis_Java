import java.util.*;

public class shortestPathNegativeWeight {
	class Pos{
		int x, y;
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}
	int[][] adj;
	boolean[][] shdw;
	
	public void run() {
		Scanner f = new Scanner(System.in);
		int n = f.nextInt();
		int m = f.nextInt();
		int q = f.nextInt();
		int s = f.nextInt();
		
		for(boolean[] jim : shdw) {
			Arrays.fill(jim, false);
		}
		Set<Integer> reachable = new HashSet<>();
		while(m-- > 0) {
			int u = f.nextInt();
			int v = f.nextInt();
			int w = f.nextInt();
			adj[u][v] = w;
			reachable.add(u);
			reachable.add(v);
		}
		while(q-- > 0) {
			int find = f.nextInt();
			
			
			
		}
	}
	public static void main(String[] args) {
		new shortestPathNegativeWeight().run();
		
	}
}
