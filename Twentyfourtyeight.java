import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Twentyfourtyeight {
	public void run() throws Exception {
		//Scanner f = new Scanner(new File("template.dat"));
		Scanner f = new Scanner(System.in);

		int[][] board = new int[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				board[i][j] = f.nextInt();
			}
		}
		
		int move = f.nextInt();

		f.close();
		//move left
		if(move == 0) {
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board.length; j++) {
					if(board[i][j] != 0) {
						int temp = board[i][j];
						
						int pos = i;
						//checks how far a piece can move left
						while(pos > 0) {
							if(board[pos][j] != 0 && pos != i) {
								if(board[pos][j] != temp) {
									break;
								}
							}
							pos--;
						}
						//merges pieces
						
						board[i][j] = board[pos][j];
						board[pos][j] = temp;
						
					}
					
				}
			}
		}
		
		//move up
		else if(move == 1) {
			
		}
		
		//move right
		else if(move == 2) {
			
		}
		
		//move down
		else if(move == 3) {
			
		}
	}

	public static void main(String[] args) throws Exception {
		new Twentyfourtyeight().run();
	}

}
