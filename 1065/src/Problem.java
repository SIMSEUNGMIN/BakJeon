import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		int number = scanner.nextInt();
		
		if(number <= 99) {
			System.out.print(number);
		}
		else {
			
			if(number == 1000){
				number = 999;
			}
			
			result = 99 + getResult(number);
			
			System.out.println(result);
		}
	}
	
	public static int getResult(int number) {
		
		int count = 0;
		
		for(int i = 100; i <= number; i++) {
			String tmp = Integer.toString(i);
			String[] str = tmp.split("");
			
			int sub2 = Integer.parseInt(str[2]) - Integer.parseInt(str[1]);
			int sub1 = Integer.parseInt(str[1]) - Integer.parseInt(str[0]);
			
			if(sub2 == sub1) {
				count++;
			}
		}
		
		return count;
	}

}
