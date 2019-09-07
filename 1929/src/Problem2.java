import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int min = scanner.nextInt();
		int max = scanner.nextInt();
		
		boolean[] result = new boolean[max];
		
		for(int i = 0; i < max; i++) {
			result[i] = true;
		}
		
		//1은 소수가 아니다.
		result[0] = false;
		
		//min미만 값 초기화
		for(int i = 1; i < min-1; i++) {
			result[i] = false;
		}
		
		//제곱근 값 구하기
		int middle = (int)Math.sqrt(max);
		
		for(int i = 2; i <= middle; i++) {
			int j = i;
			
			j = 2 * j;
			
			while(j <= max) {
				result[j-1] = false;
				j += i;
			}
		}
		
		for(int i = 0; i < max; i++) {
			if(result[i] == true) {
				System.out.println(i+1);
			}
		}
	}

}
