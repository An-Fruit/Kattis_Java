import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Character.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class weakestVertices{

	public void run() throws Exception{
	    Scanner file = new Scanner(System.in);
        while(true){
            int sz = file.nextInt();
            if(sz == -1) break;
            int[][] mat = new int[sz][sz];
            //construct matrix
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[i].length; j++){
                    mat[i][j] = file.nextInt();
                }
            }
            //traverse matrix & record weak vertices
            Set<Integer> strong = new TreeSet<>();
            Set<Integer> weak = new TreeSet<>();
            String print = "";
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[i].length; j++){
                    for(int k = 0; k < mat[j].length; k++){
                        if(mat[i][j] == 1 && mat[j][k] == 1 && mat[k][i] == 1){
                            strong.add(i);
                        }
                    }
                }
            }
            //print weak vertices
            for(int i = 0; i < mat.length; i++){
                if(!strong.contains(i)) weak.add(i);
            }
            for(int num : weak){
                print += num + " ";
            }
            System.out.println(print.trim());

        }

	}
	public static void main(String[] args) throws Exception{

	new weakestVertices().run();

	}
}
