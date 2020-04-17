import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_2864 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] first = st.nextToken().split("");
		String[] second = st.nextToken().split("");
		
		int maxFirst = 0;
		int minFirst = 0;
		
		int maxSecond = 0;
		int minSecond = 0;
		
		for(int i = 0; i < first.length; i++) {
			int length = first.length;
			int temp = Integer.parseInt(first[i]);
			if(temp == 6 || temp == 5) {
				maxFirst += 6 * (int)Math.pow(10, length - i - 1);
				minFirst += 5 * (int)Math.pow(10, length - i -1);
			}
			else {
				maxFirst += temp * (int)Math.pow(10, length - i -1);
				minFirst += temp * (int)Math.pow(10, length - i -1);
			}
		}
		
		for(int i = 0; i < second.length; i++) {
			int length = second.length;
			int temp = Integer.parseInt(second[i]);
			if(temp == 6 || temp == 5) {
				maxSecond += 6 * (int)Math.pow(10, length - i - 1);
				minSecond += 5 * (int)Math.pow(10, length - i-1);
			}
			else {
				maxSecond += temp * (int)Math.pow(10, length - i -1);
				minSecond += temp * (int)Math.pow(10, length - i -1);
			}
		}
		
		System.out.println((minFirst + minSecond) + " " + (maxFirst + maxSecond));
	}

}
