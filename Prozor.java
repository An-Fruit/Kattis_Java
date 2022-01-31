import java.util.*;
import java.io.*;

			//change the class name
public class Prozor
{
	char[][] mat;
	//checks size * size matrix to see how many flies you squash
	public int check(int r, int c, int size) {
		int cnt = 0;
		for(int i = r; i < r + size; i++) {
			for(int j = c; j < c + size; j++) {
				if(mat[i][j] == '*') {
					cnt++;
				}
			}
		}
		return cnt;
	}
	public void run() throws Exception
	{
		
		//processing
		Scanner file = new Scanner(System.in);
		int rows = file.nextInt();
		int cols = file.nextInt();
		int size = file.nextInt();
		file.nextLine(); //clear newlines
		mat = new char[rows][cols];
		for(int m = 0; m < rows; m++)
		{
			mat[m] = file.nextLine().trim().toCharArray();
		}
		file.close();
		int r = 0, c = 0;
		int goal = Integer.MIN_VALUE;
		for(int i = 0; i < mat.length - size; i++) {
			for(int j = 0; j < mat[i].length - size; j++) {
				if(check(i, j, size) > goal) {
					r = i;
					c = j;
				}
			}
		}
		for(int i = c; i < c + size; i++) {
			mat[r][c] = '-';
			mat[r + size][c] = '-';
		}
		for(int i = r; r < r + size; i++) {
			mat[r][c] = '|';
			mat[r][c + size] = '|';
		}
		mat[r][c] = '+';
		mat[r + size][c + size] = '+';
		mat[r][c + size] = '+';
		mat[r + size][c] = '+';
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(j != mat[i].length - 1) {
					System.out.print(mat[i][j] + " ");
				}
				else {
					System.out.print(mat[i][j]);
				}
			}
			System.out.println();
		}
		//optimize
		
		
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Prozor().run();
	}	
	
}
