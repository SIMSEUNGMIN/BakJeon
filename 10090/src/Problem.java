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
		
		//Sort 실행
		inversion(array, 0, array.length);
		
		System.out.println(inversionCount);

	}

	private static String[] inversion(String[] array, int start, int end) {
		
		// TODO Auto-generated method stub
		if((end-start) == 1) {
			String[] tmp = new String[]{array[start]};
			return tmp;
		}
		else{
			int mid = (end+start) / 2;
			
			String[] left = inversion(array, start, mid);
			String[] right = inversion(array, mid, end);
			return  mergeInversion(left, right);
		}
	}
	
	private static String[] mergeInversion(String[] first, String[] second) {
		
		String[] sortedList = new String[first.length+second.length];
		
		int sortedListCount = 0;
	
		int indexFirst = 0;
		int indexSecond = 0;
		
		//남은 개수
		int remindFirst = first.length;
		int remindSecond = second.length;
		
		while(remindFirst != 0 && remindSecond != 0) {
			//앞 배열의 원소가 뒷 배열의 원소보다 클 경우 (inversion수와 뒷 배열의 원소가 sortList배열로 들어감)
			if(Integer.parseInt(first[indexFirst]) > Integer.parseInt(second[indexSecond])) {
				//자기 자신 + 뒤에 남은 개수 더해서 inversion에 추가
				inversionCount += remindFirst;
				sortedList[sortedListCount++] = second[indexSecond++];
				remindSecond--;
			}
			//뒷 배열의 원소가 앞 배열의 원소보다 같거나 클 경우(앞 배열의 원소가 sortList배열로 들어감)
			else {
				//뒷 배열이 큰 건 당연하기 때문에 inversion 증가 X
				sortedList[sortedListCount++] = first[indexFirst++];
				remindFirst--;
			}
		}
		
		//둘 중 하나라도 0이라면 나머지는 배열 뒤로 옮김
		if(remindFirst == 0 && remindSecond != 0) {
			//뒷 배열이 남았을 경우 뒷 배열의 남은 원소가 0이 될 때까지 sortedList에 원소를 넣음
			while(remindSecond != 0) {
				sortedList[sortedListCount++] = second[indexSecond++];
				remindSecond--;
			}
			return sortedList;
		}
		//앞 배열이 남았을 경우
		else if(remindFirst != 0 && remindSecond == 0){
			while(remindFirst != 0) {
				sortedList[sortedListCount++] = first[indexFirst++];
				remindFirst--;
			}
			return sortedList;
		}
		
		//System.out.println(Arrays.toString(sortedList));
		return sortedList;
	}

}
