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
		
		//Sort 실행
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
			//앞 배열의 원소가 뒷 배열의 원소보다 클 경우 (inversion수와 뒷 배열의 원소가 sortList배열로 들어감)
			if(array[indexFirst] > array[indexSecond]) {
				//자기 자신 + 뒤에 남은 개수 더해서 inversion에 추가
				inversionCount += mid-indexFirst;
				sortedList[sortedListCount++] = array[indexSecond++];
			}
			//뒷 배열의 원소가 앞 배열의 원소보다 같거나 클 경우(앞 배열의 원소가 sortList배열로 들어감)
			else {
				//뒷 배열이 큰 건 당연하기 때문에 inversion 증가 X
				sortedList[sortedListCount++] = array[indexFirst++];
			}
		}
		
		//둘 중 하나라도 0이라면 나머지는 배열 뒤로 옮김
		if(indexSecond < end) {
			//뒷 배열이 남았을 경우 뒷 배열의 남은 원소가 0이 될 때까지 sortedList에 원소를 넣음
			while(indexSecond != end) {
				sortedList[sortedListCount++] = array[indexSecond++];
			}
		}
		//앞 배열이 남았을 경우
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
