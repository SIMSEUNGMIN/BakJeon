import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1676 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int two = 0;
		int five = 0;
		
		for(int i = 2; i <= input; i++) {
			int temp = i;
			
			while((temp%2) == 0) {
				two++;
				temp /= 2;
			}
			
			while((temp%5 == 0)) {
				five++;
				temp /= 5;
			}
		}
		
		System.out.println(Math.min(five, two));
	}

}
