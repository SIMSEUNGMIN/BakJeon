import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Integer> stack = new ArrayList<>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(bf.readLine());
		
		String[] input = new String[number];
		
		for(int i = 0; i < number; i++) {
			input[i]= bf.readLine();
		}
		
		for(int i = 0; i < number; i++) {
			String[] tmp = input[i].split(" ");
			selectFunction(tmp, stack);
		}
	}

	private static void selectFunction(String[] input, ArrayList<Integer> stack) {
		
		if(input[0].equals("push")) {
			stack.add(Integer.parseInt(input[1]));
		}
		else if(input[0].equals("pop")) {
			if(!(stack.size() == 0)) {
				System.out.println(stack.get(stack.size()-1));
				stack.remove(stack.size()-1);
			}
			else {
				System.out.println(-1);
			}
		}
		else if(input[0].equals("size")) {
			System.out.println(stack.size());
		}
		else if(input[0].equals("empty")) {
			if(stack.size() == 0) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		else if(input[0].equals("top")) {
			
			if(!(stack.size() == 0)) {
				System.out.println(stack.get(stack.size()-1));
			}
			else {
				System.out.println(-1);
			}
		}
	}
}
