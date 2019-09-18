import java.util.Scanner;

public class Problem {
	
	static int count = 0;
	static StringBuilder str = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		hanoiRecursively(input, 1, 2, 3);
		
		System.out.println(count);
		System.out.println(str);
	}

	private static void hanoiRecursively(int input, int start, int mid, int end) {
		// TODO Auto-generated method stub
		
		count++;
		
		if(input == 1) {
			str.append(start + " " + end + "\n");
			//맨 마지막에 깔려 있는  원판
		}
		else {
			hanoiRecursively(input-1, start, end, mid);
			//그 외의 나머지 원판을 처음에는 2번째로 옮기고
			str.append(start + " " + end + "\n");
			hanoiRecursively(input-1, mid, start, end);
			//맨 마지막에 깔려있는 원판이 옮겨졌을 시 2번째 원판을 마지막으로 옮긴다.
		}
	}

}
