import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");

		
		for(int i = 0; i < input.length; i++) {
			int index = i;
			int max = Integer.parseInt(input[i]);
					
			for(int j = i+1; j < input.length; j++) {
				int temp = Integer.parseInt(input[j]);
				if(temp > max) {
					index = j;
					max = temp;
				}
			}
			
			input[index] = input[i];
			input[i] = max + "";
		}
		
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
		}
	}

}
