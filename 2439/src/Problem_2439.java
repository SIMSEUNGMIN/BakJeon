import java.util.Scanner;

public class Problem_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 0; j < input-i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
