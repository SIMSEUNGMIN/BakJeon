import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem_1292 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		int[] table = new int[end + 1];
		
		int count = 1;
		int cur = 1;
		
		while(count < table.length) {
			for(int i = 1; i <= cur; i++) {
				table[count++] = cur; 
				
				if(count >= table.length) {
					break;
				}
			}
			
			cur++;
		}
		
		int sum = 0;
		
		for(int i = start; i <= end; i++) {
			sum += table[i];
		}
		
		System.out.println(sum);
	}

}
