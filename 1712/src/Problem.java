import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		int base = Integer.parseInt(input[0]);
		int made = Integer.parseInt(input[1]);
		int notebook = Integer.parseInt(input[2]);
		
		int minus = notebook - made;
		
		if(minus <= 0) {
			System.out.println(-1);
		}
		else {
			System.out.println((base/minus) + 1);
		}
		
	}

}
