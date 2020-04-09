import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_1408 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] cur = br.readLine().split(":");
		String[] start = br.readLine().split(":");
		
		String hours = (Integer.parseInt(start[0]) - Integer.parseInt(cur[0])) + "";
		String min = (Integer.parseInt(start[1]) - Integer.parseInt(cur[1])) + "";
		String sec = (Integer.parseInt(start[2]) - Integer.parseInt(cur[2])) + "";
		
		if(Integer.parseInt(sec) < 0) {
			sec = (Integer.parseInt(sec) + 60) + "";
			min = (Integer.parseInt(min) - 1) + "";
		}
		
		if(Integer.parseInt(min) < 0) {
			min = (Integer.parseInt(min) + 60) + "";
			hours = (Integer.parseInt(hours) - 1) + "";
		}
		
		if(Integer.parseInt(hours) < 0) {
			hours = (Integer.parseInt(hours) + 24) + "";
		}
		
		if(Integer.parseInt(hours) < 10) {
			hours = "0" + hours;
		}
		
		if(Integer.parseInt(min) < 10) {
			min = "0" + min;
		}
		
		if(Integer.parseInt(sec) < 10) {
			sec = "0" + sec;
		}
		System.out.println(hours + ":" + min + ":" + sec);
		
		
	}

}
