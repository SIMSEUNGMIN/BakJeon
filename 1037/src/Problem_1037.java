import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem_1037 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] real = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int i = 0;
		while(st.hasMoreTokens()) {
			real[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		Arrays.sort(real);
		
		System.out.println(real[0] * real[n-1]);
	}

}
