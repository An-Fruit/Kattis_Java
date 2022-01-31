import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class gettingGold
{
	char[][] mat;
	int[][] shadow;
	int cnt;
	public void go(int r,int c,int steps)
	{
		
		
		if(r < mat.length && c < mat[r].length && r >= 0 && c >= 0 && mat[r][c] != 'T' && mat[r][c] != '#' && steps <= shadow[r][c]  )
		{
			char sub = mat[r][c];
			if(mat[r][c] == 'G')
			{
				cnt++;
				shadow[r][c] = steps;
				return;
			}
			
			shadow[r][c] = steps;
			
			go(r,c - 1,steps + 1);
			go(r,c + 1, steps + 1);
			go(r - 1,c,steps + 1);
			go(r + 1,c,steps + 1);
			//restores previous state so we don't change the entire matrix into something unrecognizable
			mat[r][c] = sub;
		}
		
		
	}
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		cnt = 0;
		int cols = file.nextInt();
		int rows = file.nextInt();
		mat = new char[rows][cols];
		shadow = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			mat[i] = file.next().toCharArray();
		}
		for(int[] bob : shadow) {
			for(int num : bob) {
				num = Integer.MAX_VALUE;
			}
		}
		//System.out.println(Arrays.deepToString(mat));
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				if(mat[r][c] == 'P') {
					go(r, c, 0);
				}
			}
		}
		System.out.print(cnt);
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new gettingGold().run();
	}	
	
}
