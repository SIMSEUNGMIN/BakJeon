import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_2953 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int maxSum = 0;
		
		for(int i = 1; i <= 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0;
			
			while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			if(maxSum < sum) {
				max = i;
				maxSum = sum;
			}
			
		}
		
		System.out.println(max + " " + maxSum);
	}

}
