import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1159 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		
		int[] alphabet = new int[26];
		
		for(int i = 0; i < number; i++) {
			String input = br.readLine();
			alphabet[(input.charAt(0) - 97)]++;
		}
		
		int count = 0;
		
		for(int i = 0; i < 26; i++) {
			if(alphabet[i] >= 5) {
				char temp = (char) (97 + i);
				System.out.print(temp);
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("PREDAJA");
		}
		
	}

}
