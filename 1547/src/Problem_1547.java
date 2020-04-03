import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1547 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		int[] cups = new int[4];
		
		cups[1] = 1;
		
		for(int i = 0; i < number; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			int temp = cups[first];
			cups[first] = cups[second];
			cups[second] = temp;
			
		}
		
		for(int i = 1; i < 4; i++) {
			if(cups[i] == 1) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(-1);
		
	}

}
