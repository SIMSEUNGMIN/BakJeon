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
		
		int n = 0; //����
		int m = 0; //�и�
		
		if(count%2 == 0) { //¦���� �и� �� ŭ
			n = 1;
			m = count;
			
			for(int i = 1; i < input; i++) {
				n++;
				m--;
			}
			
		}else { //Ȧ��
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