import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_1003 {
	
	static int[] result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCount = Integer.parseInt(br.readLine());
		
		int[] testCase = new int[testCount];
		
		for(int i = 0; i < testCount; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < testCount; i++) {
			int cur = testCase[i];
			
			if(cur == 0) {
				System.out.println("1 0");
			}
			else if(cur == 1) {
				System.out.println("0 1");
			}
			else {
				result = new int[cur+1];
				result[0] = 0;
				result[1] = 1;
				fibonacci(cur);
				System.out.println(result[cur-1] + " " + result[cur]);
			}
		}

	}

	private static int fibonacci(int input) {
		if(input <= 1) {
			return result[input];
		}
		else {
			if(result[input] > 0) return result[input];
		}
	
		return result[input] = fibonacci(input-1) + fibonacci(input-2);
	}

}
