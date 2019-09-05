import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		int[] split  = new int[input.length()];

		for(int i = 0; i < input.length(); i++) {
			split[i] = (int)input.charAt(i);
		}

		int[] count = new int[26];

		int max = 0;
		
		char answer = ' ';

		for(int i = 0; i < 24; i++) {
			count[i] = 0;
		}

		for(int i = 0; i < split.length; i++) {
			if((65 <= split[i]) && (split[i] <= 90)) {
				count[split[i] - 65]++;
			}
			else {
				count[split[i] - 97]++;
			}
		}
		
		answer = (char)(max + 65);

		for(int i = 1; i < count.length; i++) {
			if(count[max] == count[i]) {
				answer = '?';
			}
			else if(count[max] < count[i]) {
				answer = (char)(i + 65);
				max = i;
			}
		}
		
		System.out.print(answer);

	}

}
