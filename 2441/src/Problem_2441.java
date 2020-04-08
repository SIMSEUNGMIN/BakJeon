import java.util.Scanner;

public class Problem_2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int space = 0;
		int star = input;
		
		for(int i = 1; i <= input; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for(int k = star; k > 0; k--) {
				System.out.print("*");
			}
			
			System.out.println();
			
			space++;
			star--;
		}
	}

}
