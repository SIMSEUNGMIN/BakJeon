import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_3052 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] number = new int[10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			int temp = Integer.parseInt(br.readLine())%42;
			number[i] = temp;
		}
		
		for(int i = 0; i < 10; i++) {
			int j = 0;
			for(j = i+1; j < 10; j++) {
				if(number[i] == number[j]) {
					break;
				}
			}
			
			if(j == 10) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
