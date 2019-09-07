import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int card = scanner.nextInt();
		int number = scanner.nextInt();
		
		int[] cards = new int[card];
		
		int max = 0;
		
		for(int i = 0; i < card; i ++) {
			cards[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < card; i++) {
			for(int j = i+1; j < card; j++) {
				for (int k = j+1; k < card; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					
					if((max <= sum) && (sum <= number)) {
						max = sum;
					}
					
					if(max == number) {
						System.out.println(max);
						return;
					}
				}
			}
		}
		
		System.out.println(max);
	}

}
