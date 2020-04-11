import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_1475 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split("");
		
		int[] number = new int[9];
		
		for(int i = 0; i < input.length; i++) {
			int cur = Integer.parseInt(input[i]);
			
			if(cur == 9) {
				number[6]++;
			}
			else {
				number[cur]++;
			}
		}
		
		if(number[6]%2 != 0) {
			number[6] = number[6]/2 + 1;
		}
		else {
			number[6] = number[6]/2;
		}
		
		int max = 0;
		
		for(int i = 0; i < number.length; i++) {
			if(max < number[i]) {
				max = number[i];
			}
		}
		
		System.out.println(max);
	}

}
