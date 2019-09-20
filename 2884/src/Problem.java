import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int min = scanner.nextInt();
		
		if(min < 45) {
			hour--;
			
			if(hour == -1) {
				hour = 23;
			}
			
			min = 60 + min - 45;
		}
		else {
			min -= 45;
		}
		
		System.out.println(hour + " " + min);
		
	}

}
