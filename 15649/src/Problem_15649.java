import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_15649 {
	static int num;
	static int len;
	static boolean[] check = new boolean[9];
	static int[] ans = new int[9];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		num = Integer.parseInt(st.nextToken());
		len = Integer.parseInt(st.nextToken());
		
		dfs(0);
	}

	private static void dfs(int count) {
		if(count == len) { //종료되는 조건
			System.out.print(ans[0]);
			for(int i = 1; i < len; i++) {
				System.out.print(" ");
				System.out.print(ans[i]);
			}
			System.out.println();
		}
		else {
			for(int i = 1; i <= num; i++) {
				if(!check[i]) {
					check[i] = true;
					ans[count] = i;
					dfs(count+1);
					check[i] = false;
				}
			}
		}
	}

}
