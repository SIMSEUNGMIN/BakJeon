import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1871 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine());

		String[][] numbers = new String[input][2];

		for(int i = 0; i < input; i++) {
			String[] temp = br.readLine().split("-");
			numbers[i][0] = temp[0];
			numbers[i][1] = temp[1];
		}

		for(int i = 0; i < input; i++) {
			String[] temp = numbers[i][0].split("");
			int sum = 0;
			for(int j = 2; j >= 0; j--) {
				sum += (temp[2-j].charAt(0) - 'A') * ((int)Math.pow(26, j));
			}
			
			if(Math.abs(Integer.parseInt(numbers[i][1]) - sum) <= 100) {
				System.out.println("nice");
			}
			else {
				System.out.println("not nice");
			}
		}
	}
}

