import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		String[] split = input.split(" ");
		
		int count = 0;
		
		for(int i = 0; i < split.length; i++) {
			if(!split[i].equals("")) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
