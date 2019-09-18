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
			//�� �������� ��� �ִ�  ����
		}
		else {
			hanoiRecursively(input-1, start, end, mid);
			//�� ���� ������ ������ ó������ 2��°�� �ű��
			str.append(start + " " + end + "\n");
			hanoiRecursively(input-1, mid, start, end);
			//�� �������� ����ִ� ������ �Ű����� �� 2��° ������ ���������� �ű��.
		}
	}

}
