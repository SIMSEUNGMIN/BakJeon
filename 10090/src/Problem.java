import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class Problem {
	
	static long inversionCount = 0;
	static int[] array;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		bf.readLine();

		array = Arrays.stream((bf.readLine()).split(" ")).mapToInt(Integer::parseInt).toArray();
		
		//Sort 실행
		inversion(0, array.length);
		
		System.out.print(inversionCount);

	}

	private static void inversion(int start, int end) { //[start, end)
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
			//뒷 배열의 원소가 앞 배열의 원소보다 같거나 클 경우(앞 배열의 원소가 sortList배열로 들어감)
			if(array[indexFirst] <= array[indexSecond]){
				//뒷 배열이 큰 건 당연하기 때문에 inversion 증가 X
				sortedList[sortedListCount++] = array[indexFirst++];
			}
			//앞 배열의 원소가 뒷 배열의 원소보다 클 경우 (inversion수와 뒷 배열의 원소가 sortList배열로 들어감)
			else{
				//자기 자신 + 뒤에 남은 개수 더해서 inversion에 추가
				inversionCount += mid-indexFirst;
				sortedList[sortedListCount++] = array[indexSecond++];
			}
		}
		
		//앞 배열이 남았을 경우
		while(indexFirst < mid) {
			sortedList[sortedListCount++] = array[indexFirst++];
		}
		
		while(indexSecond < end) {
			sortedList[sortedListCount++] = array[indexSecond++];
		}
		
		
		
		for(int i = start; i < end; i++) {
			array[i] = sortedList[i-start];
		}
		
		//System.out.println(Arrays.toString(array));

	}

}
