import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_5586 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int jcount = 0;
		int icount = 0;
		
		for(int i = 0; i < input.length()-2; i++) {
			if(input.charAt(i) == 'J') {
				if(input.charAt(i+1) == 'O' && input.charAt(i+2) == 'I') {
					jcount++;
				}
			}
			else if(input.charAt(i) == 'I') {
				if(input.charAt(i+1) == 'O' && input.charAt(i+2) == 'I') {
					icount++;
				}
			}
		}
		
		System.out.println(jcount);
		System.out.println(icount);
	}

}
