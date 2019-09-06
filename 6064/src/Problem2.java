import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder result = new StringBuilder();
		int line = scanner.nextInt();
		
		for(int i = 0; i < line; i++) {
			int M  = scanner.nextInt();
			int N = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			result.append(Integer.toString(checkTheYear(M, N, x, y)) + "\n");
		}
		
		System.out.println(result);
	}
	
	public static int checkTheYear(int M, int N, int x, int y) {
		
		int curX = 1;
		int curY = 1;
		
		int i = 1;
		
		while(i < M*N) {
			
			if((curX == x) && (curY == y)) {
				return i;
			}
			
			if(curX == x) {
				curY = (curY + M)%N;

				if(curY == 0) {
					curY = N;
				}
				i += M;
			}
			else {
				if((curX < M) && (curY < N)) {
					curX++;
					curY++;
				}
				else if((curX < M) && (curY == N)) {
					curX++;
					curY = 1;
				}
				else if((curX == M) && (curY < N)) {
					curX = 1;
					curY ++;
				}
				
				i++;
			}
		}

		return -1;
	}

}
