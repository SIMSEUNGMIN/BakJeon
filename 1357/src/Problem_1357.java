import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1357 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String first = st.nextToken();
		String second = st.nextToken();
		
		String temp = (Integer.parseInt(rev(first)) + Integer.parseInt(rev(second))) + "";
		
		System.out.println(Integer.parseInt(rev(temp)));
		
	}
	
	public static String rev(String i) {
		return (new StringBuffer(i)).reverse().toString();
	}

}
