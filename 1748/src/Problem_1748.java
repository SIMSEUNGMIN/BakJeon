import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1748 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		
		int count = st.length();
		
		int input = Integer.parseInt(st);

		int result = 0;

		if(count < 2) {
			result = input;
			System.out.println(result);
			return;
		}
		else {
			result = ((input - ((int)Math.pow(10, count-1)) + 1) * count);
		}

		for(int i = 1; i < count; i++) {
			result += (9 * ((int)Math.pow(10, i-1)) * i);
		}

		System.out.println(result);

	}
}

