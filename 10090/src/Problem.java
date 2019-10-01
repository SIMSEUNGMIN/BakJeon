import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Problem {
	
	static int inversionCount;
	static int[] array;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		bf.readLine();

		array = Arrays.stream((bf.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
		
		inversionCount = 0;
		
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
		
		int[] sortedList = new int[end-start];
		
		int sortedListCount = 0;
	
		int indexFirst = start;
		int indexSecond = mid;
		
		while(indexFirst < mid && indexSecond < end) {
			//�� �迭�� ���Ұ� �� �迭�� ���Һ��� Ŭ ��� (inversion���� �� �迭�� ���Ұ� sortList�迭�� ��)
			if(array[indexFirst] > array[indexSecond]) {
				//�ڱ� �ڽ� + �ڿ� ���� ���� ���ؼ� inversion�� �߰�
				inversionCount += mid-indexFirst;
				sortedList[sortedListCount++] = array[indexSecond++];
			}
			//�� �迭�� ���Ұ� �� �迭�� ���Һ��� ���ų� Ŭ ���(�� �迭�� ���Ұ� sortList�迭�� ��)
			else {
				//�� �迭�� ū �� �翬�ϱ� ������ inversion ���� X
				sortedList[sortedListCount++] = array[indexFirst++];
			}
		}
		
		//�� �� �ϳ��� 0�̶�� �������� �迭 �ڷ� �ű�
		if(indexSecond < end) {
			//�� �迭�� ������ ��� �� �迭�� ���� ���Ұ� 0�� �� ������ sortedList�� ���Ҹ� ����
			while(indexSecond != end) {
				sortedList[sortedListCount++] = array[indexSecond++];
			}
		}
		//�� �迭�� ������ ���
		else {
			while(indexFirst != mid) {
				sortedList[sortedListCount++] = array[indexFirst++];
			}
		}
		
		for(int i = start; i < end; i++) {
			array[i] = sortedList[i-start];
		}
		
		//System.out.println(Arrays.toString(array));
	}

}
