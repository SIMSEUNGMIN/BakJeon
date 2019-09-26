import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem {
	
	static int input;
	static int result;
	static int[] col;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//한 열과 한 행에는 하나의 퀸만 존재 가능
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		input = Integer.parseInt(bf.readLine());
	
		result = 0;
		
		//1부터 시작하기 위해서 한 칸 더 만들어줌
		col = new int[input+1];
		
		// (1,1), (1,2), (1,3) 순으로 시작
		for(int i = 1; i <= input; i++) {
			col[1] = i;
			
			//다음 행 검색(왜냐하면 현재 행은 더이상 놓일 수 없기 때문)
			//행 검색은 이렇게 됨 (1,1), (2,1), (3,1)순으로 감
			startDFS(2);
		}
		
		//경우의 수 출력
		System.out.println(result);
		
	}
	
	static void startDFS(int cur) {
		
		//현재 행이 input값과 같을 경우 체스 판을 벗어난 상태
		//체스판을 벗어난 상태는 그 전까지 잘 해왔다는 표시이기 때문에 하나의 방법이 될 수 있음
		if(cur > input) {
			result++;
		}
		//그게 아닐 경우 이제 현재의 행을 확인
		//퀸이 놓일 수 있는지 확인함
		else {
			for(int i = 1; i <= input; i++) {
				//현재의 위치를 다시 재설정
				col[cur] = i;
				
				//현재의 행이 퀸이 놓일 수 있는 행인지 확인
				if(isPossible(cur)) {
					//놓일 수 있다면 그 다음 행을 확인하러 감
					startDFS(cur+1);
				}
				//놓일 수 없는 행이라고 한다면 ??????????????
				else {
					col[cur] = 0;
				}
			}
		}
	}

	private static boolean isPossible(int cur) {
		
		//행 위로 올라감
		//같은 열인 경우에는 같은 값을 가지게 되므로
		//(원래 퀸은 같은 열에서는 하나 밖에 존재할 수 없다)
		for(int i = 1; i < cur; i++) {
			
			//행 기준이므로 다른 행인데 같은 열에 있다면
			//퀸은 놓일 수 없음
			if(col[i] == col[cur]) {
				return false;
			}
			
			//그리고 대각선으로 값이 같다면 퀸은 놓일 수 없음
			//행과 행의 거리 열과 열의 거리가 같다면 두 퀸은 대각선에 놓인 것이기 때문에 배치 불가능
			if(Math.abs(col[i] - col[cur]) == Math.abs(i - cur)) {
				return false;
			}
		}
		
		return true;
	}
	
}
