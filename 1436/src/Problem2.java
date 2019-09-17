import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다른 방법으로 풀어봄

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int count = 0;

		int end = 666;

		while(count != number) {

			String endString = Integer.toString(end);


			if(endString.contains("666")) {
				count ++;
			}

			end++;

		}

		System.out.println((end-1));

	}

}