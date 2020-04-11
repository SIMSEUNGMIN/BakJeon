import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1453 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] pcs = new int[101];
		
		int number = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < number; i++) {
			int cur = Integer.parseInt(st.nextToken());
			
			if(pcs[cur] == 0) {
				pcs[cur] = 1;
			}
			else {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
