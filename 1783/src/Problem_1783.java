import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_1783 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");

		int row = Integer.parseInt(input[0]);
		int col = Integer.parseInt(input[1]);


		if(row == 1) {
			System.out.println(1);
			return;
		}

		if(row == 2) {
			System.out.println(Math.min(4, (col+1)/2));
			return;
		}

		if(col < 7) {
			System.out.println(Math.min(4, col));
		}
		else {
			System.out.println(col-2);
		}
	}

}



