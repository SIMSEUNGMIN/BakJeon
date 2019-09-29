import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Problem {
	
	static int inversionCount = 0;
	static String[] array;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		bf.readLine();

		array = (bf.readLine()).split(" ");
		
		//Sort ����
		inversion(0, array.length);
		
		System.out.println(inversionCount);

	}

	private static void inversion(int start, int end) {
		int mid = (start + end) / 2;
		
		if((end - start) != 1) {
			inversion(start, mid);
			inversion(mid, end);
			mergeInversion(start, mid, end);
		}
	}
	
	private static void mergeInversion(int start, int mid, int end) {
		
		String[] sortedList = new String[array.length];
		
		int sortedListCount = 0;
	
		int indexFirst = start;
		int indexSecond = mid;
		
		//���� ����
		int remindFirst = mid-start;
		int remindSecond = end-mid;
		
		while(remindFirst != 0 && remindSecond != 0) {
			//�� �迭�� ���Ұ� �� �迭�� ���Һ��� Ŭ ��� (inversion���� �� �迭�� ���Ұ� sortList�迭�� ��)
			if(Integer.parseInt(array[indexFirst]) > Integer.parseInt(array[indexSecond])) {
				//�ڱ� �ڽ� + �ڿ� ���� ���� ���ؼ� inversion�� �߰�
				inversionCount += remindFirst;
				sortedList[sortedListCount++] = array[indexSecond++];
				remindSecond--;
			}
			//�� �迭�� ���Ұ� �� �迭�� ���Һ��� ���ų� Ŭ ���(�� �迭�� ���Ұ� sortList�迭�� ��)
			else {
				//�� �迭�� ū �� �翬�ϱ� ������ inversion ���� X
				sortedList[sortedListCount++] = array[indexFirst++];
				remindFirst--;
			}
		}
		
		//�� �� �ϳ��� 0�̶�� �������� �迭 �ڷ� �ű�
		if(remindSecond != 0) {
			//�� �迭�� ������ ��� �� �迭�� ���� ���Ұ� 0�� �� ������ sortedList�� ���Ҹ� ����
			while(remindSecond != 0) {
				sortedList[sortedListCount++] = array[indexSecond++];
				remindSecond--;
			}
		}
		//�� �迭�� ������ ���
		else if(remindFirst != 0){
			while(remindFirst != 0) {
				sortedList[sortedListCount++] = array[indexFirst++];
				remindFirst--;
			}
		}
		
		for(int i = start; i < end; i++) {
			array[i] = sortedList[i-start];
		}
		
		//System.out.println(Arrays.toString(array));

	}

}
