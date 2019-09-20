import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		System.out.println(factorial(input));
	}

	private static int factorial(int input) {
		// TODO Auto-generated method stub
		if(input == 1) {
			return 1;
		}
		
		return input * factorial(input-1);
	}

}
