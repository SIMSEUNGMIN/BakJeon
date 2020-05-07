import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem_2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i < input; i++)
			numbers.add(Integer.parseInt(br.readLine()));
		
		//»ðÀÔ Á¤·Ä
		for(int i = 1; i < input; i++) {
			int key = numbers.get(i);
			for(int j = i-1; j >= 0; j--) {
				int temp = numbers.get(j);
				if(key < temp) {
					numbers.set(j+1, temp);
					numbers.set(j, key);
				}
			}
		}
		
		for(Integer temp : numbers) 
			System.out.println(temp);
	}

}
