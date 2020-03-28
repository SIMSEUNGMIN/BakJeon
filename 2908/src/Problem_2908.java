import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int first = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		int second = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		
		if(first >= second) {
			System.out.println(first);
		}
		else {
			System.out.println(second);
		}
		
		
	}

}
