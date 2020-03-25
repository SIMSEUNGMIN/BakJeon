import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_1541 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String[] fomula = input.split("\\-");
		
		int result = 0;
		
		for(int i = 0; i < fomula.length; i++) {
			int tempI = 0;
			
			if(fomula[i].contains("+")) {
				String[] temp = fomula[i].split("\\+");
				
				for(int j = 0; j < temp.length; j++) {
					tempI += Integer.parseInt(temp[j]);
				}
			}
			else {
				tempI = Integer.parseInt(fomula[i]);
			}
			
			if(i == 0) {
				result += tempI;
			}
			else {
				result -= tempI;
			}
		}
		
		System.out.println(result);
	}

}
