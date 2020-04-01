import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1233 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		int third = Integer.parseInt(st.nextToken());
		
		int[] cases = new int[(first+second+third)+1];

		for(int i = 1; i <= first; i++) {
			for(int j = 1; j <= second; j++) {
				for(int x = 1; x <= third; x++) {
					cases[i+j+x]++;
				}
			}
		}
		
		int maxCase = 0;
		int max = 0;
		
		for(int i = 0; i < cases.length; i++) {
			if(maxCase < cases[i]) {
				maxCase = cases[i];
				max = i;
			}
		}
		
		System.out.println(max);
	}

}
