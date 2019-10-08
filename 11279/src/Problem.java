import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> maxHeap = new ArrayList<>();
		
		//첫 값은 사용하지 않을 거라 미리 넣어둠
		maxHeap.add(-100);
		
		int number = Integer.parseInt(bf.readLine());
		
		int[] input = new int[number];
		
		for(int i = 0; i < number; i++) {
			input[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i = 0; i < number; i++) {
			selectMenu(input[i], maxHeap);
		}
	}

	private static void selectMenu(int input, ArrayList<Integer> maxHeap) {
		// TODO Auto-generated method stub
		if(input == 0) {
			//heap이 비어있을 때
			if(maxHeap.size() == 1) {
				System.out.println(0);
			}
			//비어있지 않을 경우 가장 큰 값 출력, 그 값을 삭제
			else{
				System.out.println(maxHeap.get(1));
				maxHeap.set(1, maxHeap.get(maxHeap.size()-1));
				maxHeap.remove(maxHeap.size()-1);
				maxHeapify(maxHeap, 1);
			}
		}
		//0이 아닐 경우 그냥 추가
		else {
			maxHeap.add(input);
			//부모랑 비교해서 계속 올림
			int cur = maxHeap.size()-1;
			
			while(cur/2 != 0 &&
					maxHeap.get(cur) > maxHeap.get(cur/2)) {
				int tmp = maxHeap.get(cur/2);
				maxHeap.set(cur/2, maxHeap.get(cur));
				maxHeap.set(cur, tmp);
				
				cur = cur/2;
			}
		}
	}

	private static void maxHeapify(ArrayList<Integer> maxHeap, int cur) {
		//들어온 값부터 자식노드를 확인하면서 heap의 형태를 갖춰나감
		int max = cur;
		
		int left = 0;
		int right = 0;
		
		boolean isRight = false;
		
		//자식이 존재하는지 확인
		//왼쪽 자식이 없다면 더 돌 필요 없으므로 종료
		if(cur * 2 < maxHeap.size()) {
			left = cur * 2;
		}
		else {
			return;
		}
		
		//오른쪽 자식이 존재하는지 확인
		if((cur * 2 + 1) < maxHeap.size()) {
			right = cur * 2 + 1;
			isRight = true;
		}
		
		//현재 노드의 값보다 왼쪽 자식노드의 값이 크다면 max값 변경
		if(maxHeap.get(left) > maxHeap.get(max)) {
			max = left;
		}
		
		//현재 노드의 값보다 오른쪽 자식노드의 값이 크다면 max값 변경
		if(isRight &&
				maxHeap.get(right) > maxHeap.get(max)) {
			max = right;
		}
		
		//따라서 cur과 max의 값이 같지 않다면 자식 노드를 확인할 필요가 있음
		//따라서 값의 위치를 바꾸고 최대 크기인 자식노드 기준으로 다시 maxHeapify
		if(max != cur) {
			int tmp = maxHeap.get(max);
			maxHeap.set(max, maxHeap.get(cur));
			maxHeap.set(cur, tmp);
			maxHeapify(maxHeap, max);
		}
	}

}
