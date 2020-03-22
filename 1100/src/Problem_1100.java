import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1100 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			String[] line = br.readLine().split("");
			for(int j = 0; j < 8; j++) {
				if(i == 0 || (i%2 == 0)) { //even line
					if(j%2 == 0 && line[j].equals("F"))
						count++;
				}
				else { //odd line
					if(j%2 != 0 && line[j].equals("F"))
						count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
