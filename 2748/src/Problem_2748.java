import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2748 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		long[] array = new long[input+1];
		
		array[0] = 0;
		array[1] = 1;
		
		if(input == 0) {
			 System.out.println(array[0]);
			 return;
		}
		else if(input == 1) {
			System.out.println(array[1]);
			return;
		} 
		else {
			for(int i = 2; i <= input; i++) {
				array[i] = array[i-1] + array[i-2];
			}
			
			System.out.println(array[input]);
			return;
		}	
	}
}
