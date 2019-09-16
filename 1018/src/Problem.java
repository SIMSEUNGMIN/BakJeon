import java.util.Arrays;
import java.util.Scanner;

public class Problem {
	
	static String[][] white = {
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"}
	};
	
	static String[][] black = {
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"},
			{"B","W","B","W","B","W","B","W"},
			{"W","B","W","B","W","B","W","B"},
	};
	
	
	public static void main(String[] args) {
		//1. 두 가지 경우에 따른 보드판을 만들어둠
		//2. 들어오는 값의 가능한 8*8 사이즈를 전부 돌려서 각각의 보드판과 차이를 비교
		//3. 최솟값 출력
		
		Scanner scanner = new Scanner(System.in);
		
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		String[][] input = new String[m][n];
		
		for(int row = 0; row < m; row++) {
			String tmp = scanner.next();
			for(int col = 0; col < n; col++) {
				input[row][col] = tmp.split("")[col];
			}
		}
		
		int min = 64;
	
		for(int row = 0; row+7 < m; row++) {
			for(int col = 0; col+7 < n; col++) {
				int b = checkB(input, row, col);
				int w = checkW(input, row, col);
				
				if((b <= w) && (b < min)) {
					min = b;
				}
				else if((w < b) && (w < min)) {
					min = w;
				}
			}
		}
		
		System.out.println(min);
	}
	
	public static int checkB(String[][] input, int row, int col) {
		int count = 0;
		
		for(int r = 0; r < 8; r++) {
			for(int c = 0; c < 8; c++) {
				if(!black[r][c].equals(input[row+r][col+c])) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static int checkW(String[][] input, int row, int col) {
		int count = 0;
		
		for(int r = 0; r < 8; r++) {
			for(int c = 0; c < 8; c++) {
				if(!white[r][c].equals(input[row+r][col+c])) {
					count++;
				}
			}
		}
		
		return count;
	}
	
}
