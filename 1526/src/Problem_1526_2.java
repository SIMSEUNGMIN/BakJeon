import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1526_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine());
		
		for(int i = input; i >= 4; i--) {
			boolean check = true;
			int num = i;
			
			while(num != 0) {
				if(num%10 == 4 || num%10 == 7) {
					num /= 10;
				}
				else {
					check = false;
					break;
				}
			}
			
			if(check) {
				System.out.println(i);
				return;
			}
		}
	}

}
