import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int min = scanner.nextInt();
		int max = scanner.nextInt();
		
		//1은 소수가 아니다
		if(min == 1) {
			min = 2;
		}
		
		for(int i = min; i <= max; i++) {
			
			int count = (int)Math.sqrt(i);
			
			boolean result = false;
			
			for(int j = 2; j <= count; j++) {
				if(i % j == 0) {
					result = true;
					break;
				}
			}
			
			if(result == false) {
				System.out.println(i);
			}
		}
	}

}
