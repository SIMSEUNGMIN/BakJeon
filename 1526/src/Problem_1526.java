import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1526 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i = input; i >= 4; i--) {
			String[] temp = (i + "").split("");
			
			int j = 0;
			for(j = 0; j < temp.length; j++) {
				if((!temp[j].equals("4")) && (!temp[j].equals("7"))) {
					break;
				}
			}
			
			if(j == temp.length) {
				System.out.println(i);
				return;
			}
			
		}
	}

}
