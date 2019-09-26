import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		int[] number = new int[input];
		
		boolean[] isDecimal = new boolean[input];
		
		int count = 0;
		
		for(int cnt = 0; cnt < input; cnt++) {
			number[cnt] = scanner.nextInt();
		}
		
		for(int cnt = 0; cnt < input; cnt++) {
			
			if(number[cnt] != 1) {
				isDecimal[cnt] = true;
			}
		}
		
		for(int cnt = 0; cnt < input; cnt++) {
			for(int check = 2; check <= Math.sqrt(number[cnt]); check++) {
				if(number[cnt]%check == 0) {
					isDecimal[cnt] = false;
					break;
				}
			}
		}
		
		for(int cnt = 0; cnt < input; cnt++) {
			if(isDecimal[cnt] == true) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
