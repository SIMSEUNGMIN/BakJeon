import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		for(int number = 1; number <= input; number++) {
			String[] numberSplit = Integer.toString(number).split("");
			
			int sum = number;
			
			for(int i = 0; i < numberSplit.length; i++) {
				sum += Integer.parseInt(numberSplit[i]);
			}
			
			if(sum == input) {
				System.out.println(number);
				return;
			}
		}
		
		System.out.println("0");
	}

}
