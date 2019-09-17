import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메모리 초과가 떴는데 어디서 찾아야 할지를 모르겠다.
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int count = 0;
		
		int end = 666;
		
		while(count != number) {
			
			String[] endSplit = Integer.toString(end).split("");
			
			//메모리 초과가 발생한 부분
			for(int i = 0; i < endSplit.length - 2; i++) {
				if(endSplit[i].equals("6") && endSplit[i+1].equals("6") && endSplit[i+2].equals("6")) {
					count ++;
					break;
				}
			}
			
			end += 1;
			
			endSplit = null;
		}
		
		System.out.println((end-1));

	}

}
