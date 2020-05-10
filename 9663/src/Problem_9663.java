import java.util.Scanner;

public class Problem_9663 {
	static int col[];
	static int input;
	static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		for(int i = 1; i <= input;i++) { //행을 담음
			col = new int[16]; //전체 좌표를 담을 곳
			col[1] = i; //col[열]=행
			
			dfs(2); //2열로 이동
		}
		
		System.out.println(ans);
	}

	private static void dfs(int newcol) {
		// TODO Auto-generated method stub
		if(newcol > input) {
			ans++;
		}
		else {
			for(int i = 1; i <= input; i++) { //행
				col[newcol] = i; //현재 위치 저장
				
				if(isPossible(newcol)) {
					//괜찮은 열이면 다음 열로 이동
					dfs(newcol+1);
				}
				else {
					col[newcol] = -1; //현재 칸은 쓸모 없는 칸
				}
				
			}
		}
	}

	private static boolean isPossible(int col2) {
		// TODO Auto-generated method stub
		for(int i = 1; i < col2; i++) {
			//이전 열의 같은 행에 존재하는지 확인
			if(col[i] == col[col2]) {
				return false;
			}
			
			if(Math.abs(col[i] - col[col2]) == Math.abs(i-col2)) {
				//완벽히 대각선에 있는 경우(정사각형일 때만 해당)
				return false;
			}
		}
		
		return true;
	}

}
