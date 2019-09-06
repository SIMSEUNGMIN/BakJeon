import java.util.Scanner;

public class Problem {

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
			
			//System.out.println(result);	
		}
		
		System.out.println(result);
	}
	
	public static int checkTheYear(int M, int N, int x, int y) {
		
		int count = 1;
		
		int curX = 1;
		int curY = 1;
		
		while((curX != M) || (curY != N)) {
			if((curX == x) && (curY == y)) {
				return count;
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
				
				count++;
			}
		}
		
		return -1;
	}

}
