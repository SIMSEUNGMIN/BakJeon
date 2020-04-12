import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1526_1 {
	
	static int result;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		//항상 4 또는 7을 더할 수 있다.
		find(4, input);
		find(7, input);
		
		System.out.println(result);
	}
	
	static void find(int number, int input) {
		if(number > input) return;
		result = Math.max(number, result);
		find(number*10 + 4, input);
		find(number*10 + 7, input);
	}

}
