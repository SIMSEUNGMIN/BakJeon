import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1225 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] first = st.nextToken().split("");
		String[] second = st.nextToken().split("");
		
		long sum = 0;
		
		for(int i = 0; i < first.length; i++) {
			for(int j = 0; j < second.length; j++) {
				sum += Integer.parseInt(first[i]) * Integer.parseInt(second[j]);
			}
		}
		
		System.out.println(sum);
		
	}

}
