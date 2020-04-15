import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2443 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int temp = 1;
		
		for(int i = input; i >= 1; i--) {
			for(int j = 0; j < input-i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < 2 * input - temp; k++) {
				System.out.print("*");
			}
			
			temp += 2;
			
			System.out.println();
		}
	}

}
