import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if((a == b) && (b == c) && (c == a)) {
			System.out.print(a);
		}
		else if(((a <= b) && (b <= c)) || ((c <= b) && (b <= a))) {
			System.out.print(b);
		}
		else if(((a <= c) && (c <= b)) || ((b <= c) && (c <= a))) {
			System.out.print(c);
		}
		else {
			System.out.print(a);
		}
	}
}
