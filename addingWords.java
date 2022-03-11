import java.util.*;

//problem link: https://open.kattis.com/problems/addingwords

public class addingWords {
	Map<String, Integer> vars;
	
	public void run() throws Exception{
		vars = new HashMap<String, Integer>();
		Scanner f = new Scanner(System.in);
		
		while(f.hasNext()) {
			String[] command = f.nextLine().trim().split(" ");
			if(command[0].equals("clear")) {
				//clear all variable definitions in case of clear command
				vars = new HashMap<>();
			}
			else if(command[0].equals("def")) {
				//put in variable definitions in case of def command
				vars.put(command[1], Integer.parseInt(command[2]));
			}
			else {
				//in case of calc command
				//what the output of the command should be
				String res = "";
				//integer equivalent to res
				int result = 0;
				Queue<Integer> num = new LinkedList<>();
				Queue<String> operator = new LinkedList<>();
				boolean alldef = true;
				//starts at two to ensure that the amount of operators is equal to the amount of numbers in the function
				for(int i = 2; i < command.length; i++) {
						//strings at even positions will always be operators
						if(i % 2 == 0) {
							operator.add(command[i]);
						}
						//in case of meeting non-operator
						else {
							//if the map contains the variable that we have iterated to, add it to the queue
							if(vars.get(command[i]) != null) {
								num.add(vars.get(command[i]));
							}
							//otherwise set res to unknown and break the loop
							else {
								alldef = false;
								res = "unknown";
								break;
							}
							
						}
												
				}					
				
				//if the first variable has been defined
				if(vars.get(command[1]) != null && alldef) {
					result = vars.get(command[1]);
					while(!num.isEmpty()) {
						String temps = operator.poll();
						int tempn = num.poll();
						if(temps.equals("+")) {							
							result += tempn;
						}
							
						else if(temps.equals("-")) {
							result -= tempn;
						}
					}
					
					
					boolean def = false;
					
					for(String s : vars.keySet()) {
						if(vars.get(s) == result) {
							res = s;
							def = true;
							break;
						}
					}
					
					if(!def) res = "unknown";
					
				}
				//if the first variable has not been defined
				else {
					res = "unknown";
				}
					
				
				
				
				//prints the output
				for(int i = 1; i < command.length; i++) {
					System.out.print(command[i] + " ");
				}
				
				System.out.print(res + "\n");
			}
				
				
			
				
			}
		f.close();
	
		}
		
	
	public static void main(String[] args) throws Exception{
		new addingWords().run();
		
	}
}
