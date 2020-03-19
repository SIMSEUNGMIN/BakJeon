import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		
		String[] stringA = br.readLine().split(" ");
		String[] stringB = br.readLine().split(" ");
		
		int[] arrayA = new int[number];
		int[] arrayB = new int[number];
		
		int[] visitedB = new int[number];
		
		for(int i = 0; i < number; i++) {
			arrayA[i] = Integer.parseInt(stringA[i]);
			arrayB[i] = Integer.parseInt(stringB[i]);
		}
		
		//Ascending
		Arrays.sort(arrayA);
		
		int sum = 0;
		
		for(int a = 0; a < number; a++) {
			int max = -1;
			int cur = -1;
			for(int b = 0; b < number; b++) { //find the max value
				if(max < arrayB[b] && visitedB[b] != -1) {
					max = arrayB[b];
					cur = b;
				}
			}
			visitedB[cur] = -1; //already passed
			//calculate the sum
			sum += arrayA[a] * arrayB[cur];
		}
		
		System.out.println(sum);
		
	}

}
