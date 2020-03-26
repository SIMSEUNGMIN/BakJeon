import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_1193 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int count = 1;
		
		do {
			input -= count;
			count++;
		}while(input > 0);
		
		count--;
		input += count;
		
//		System.out.println(count);
		
		int n = 0; //분자
		int m = 0; //분모
		
		if(count%2 == 0) { //짝수면 분모가 더 큼
			n = 1;
			m = count;
			
			for(int i = 1; i < input; i++) {
				n++;
				m--;
			}
			
		}else { //홀수
			n = count;
			m = 1;
			
			for(int i = 1; i < input; i++) {
				n--;
				m++;
//				System.out.println(n + "/" + m);
			}
		}
		
		System.out.println(n + "/" + m);
		
	}

}