import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޸� �ʰ��� ���µ� ��� ã�ƾ� ������ �𸣰ڴ�.
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int count = 0;
		
		int end = 666;
		
		while(count != number) {
			
			String[] endSplit = Integer.toString(end).split("");
			
			//�޸� �ʰ��� �߻��� �κ�
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
