import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem {
	
	static int inversionCount = 0;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		String[] array = new String[input];
		
		for(int i = 0; i < input; i++) {
			array[i] = Integer.toString(scanner.nextInt());
		}
	
		//Sort ����
		inversion(array);
		
		System.out.println(inversionCount);

	}

	private static String[] inversion(String[] array) {
		
		// TODO Auto-generated method stub
		if(array.length == 1) {
			return array;
		}
		else{
			int mid = array.length / 2;
			
			String[] first = Arrays.copyOfRange(array, 0, mid);
			String[] second = Arrays.copyOfRange(array, mid, array.length);
			
			return  mergeInversion(inversion(first), inversion(second));
		}
	}
	
	private static String[] mergeInversion(String[] first, String[] second) {
		
		String[] sortedList = new String[first.length + second.length];
		
		int sortedListCount = 0;
	
		int indexFirst = 0;
		int indexSecond = 0;
		
		//���� ����
		int remindFirst = first.length;
		int remindSecond = second.length;
		
		while(remindFirst != 0 && remindSecond != 0) {
			//�� �迭�� ���Ұ� �� �迭�� ���Һ��� Ŭ ��� (inversion���� �� �迭�� ���Ұ� sortList�迭�� ��)
			if(Integer.parseInt(first[indexFirst]) > Integer.parseInt(second[indexSecond])) {
				//�ڱ� �ڽ� + �ڿ� ���� ���� ���ؼ� inversion�� �߰�
				inversionCount += remindFirst;
				sortedList[sortedListCount++] = second[indexSecond++];
				remindSecond--;
			}
			//�� �迭�� ���Ұ� �� �迭�� ���Һ��� ���ų� Ŭ ���(�� �迭�� ���Ұ� sortList�迭�� ��)
			else {
				//�� �迭�� ū �� �翬�ϱ� ������ inversion ���� X
				sortedList[sortedListCount++] = first[indexFirst++];
				remindFirst--;
			}
		}
		
		//�� �� �ϳ��� 0�̶�� �������� �迭 �ڷ� �ű�
		if(remindFirst == 0 && remindSecond != 0) {
			//�� �迭�� ������ ��� �� �迭�� ���� ���Ұ� 0�� �� ������ sortedList�� ���Ҹ� ����
			while(remindSecond != 0) {
				sortedList[sortedListCount++] = second[indexSecond++];
				remindSecond--;
			}
		}
		//�� �迭�� ������ ���
		else if(remindFirst != 0 && remindSecond == 0){
			while(remindFirst != 0) {
				sortedList[sortedListCount++] = first[indexFirst++];
				remindFirst--;
			}
		}
		
		//System.out.println(Arrays.toString(sortedList));
		
		return sortedList;
	}

}
