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
			
			//endSplit를 null 해도 배열은 여전히 살아있기 때문에 힢 영역에서 메모리를 잡아먹고 있다.
			//이 떄문에 메모리 초과가 발생하게 되는 것이다.
			endSplit = null;
		}
		
		System.out.println((end-1));

	}

}
