import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < 8; i++) {
			input = input.replace(croatia[i], "s");
		}
		
		System.out.println(input.length());
	}

}

