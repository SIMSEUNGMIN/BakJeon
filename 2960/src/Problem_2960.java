import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_2960 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = Integer.parseInt(st.nextToken());
		int sel = Integer.parseInt(st.nextToken());
		
		int[] arrayM = new int[max+1];
		
		for(int i = 0; i < arrayM.length; i++) {
			arrayM[i] = 0;
		}
		
		int count = 0;
		
		for(int i = 2; i <= max; i++) {
			if(arrayM[i] != 1) {
				for(int j = i; j <= max; j+=i) {
					if(arrayM[j] != 1) {
						arrayM[j] = 1;
						count++;
						
						if(count == sel) {
							System.out.println(j);
							return;
						}
					}
				}
			}
			
		}
	}

}