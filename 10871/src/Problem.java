import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int line = scanner.nextInt();
		int num = scanner.nextInt();
		
		int[] nums = new int[line];
		
		for(int i = 0; i < line; i++) {
			nums[i] = scanner.nextInt();
		}
		
		int count = 0;
		
		for(int i = 0; i < line; i++) {
			if(nums[i] < num) {
				
				if(count == 0) {
					System.out.print(nums[i]);
					count++;
				}
				else
					System.out.print(" " + nums[i]);
			}
		}
	}
}
