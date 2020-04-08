import java.util.Scanner;

public class Problem_2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int space = input-1;
		int star = 1;
		
		for(int i = 1; i <= input; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star += 2;
		}
		
		space += 2;
		star -= 4;
		
		for(int i = 0; i < input-1; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
			
			space++;
			star -= 2;
		}
	}

}
