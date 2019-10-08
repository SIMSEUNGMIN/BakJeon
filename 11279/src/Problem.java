import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> maxHeap = new ArrayList<>();
		
		//ù ���� ������� ���� �Ŷ� �̸� �־��
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
			//heap�� ������� ��
			if(maxHeap.size() == 1) {
				System.out.println(0);
			}
			//������� ���� ��� ���� ū �� ���, �� ���� ����
			else{
				System.out.println(maxHeap.get(1));
				maxHeap.set(1, maxHeap.get(maxHeap.size()-1));
				maxHeap.remove(maxHeap.size()-1);
				maxHeapify(maxHeap, 1);
			}
		}
		//0�� �ƴ� ��� �׳� �߰�
		else {
			maxHeap.add(input);
			//�θ�� ���ؼ� ��� �ø�
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
		//���� ������ �ڽĳ�带 Ȯ���ϸ鼭 heap�� ���¸� ���糪��
		int max = cur;
		
		int left = 0;
		int right = 0;
		
		boolean isRight = false;
		
		//�ڽ��� �����ϴ��� Ȯ��
		//���� �ڽ��� ���ٸ� �� �� �ʿ� �����Ƿ� ����
		if(cur * 2 < maxHeap.size()) {
			left = cur * 2;
		}
		else {
			return;
		}
		
		//������ �ڽ��� �����ϴ��� Ȯ��
		if((cur * 2 + 1) < maxHeap.size()) {
			right = cur * 2 + 1;
			isRight = true;
		}
		
		//���� ����� ������ ���� �ڽĳ���� ���� ũ�ٸ� max�� ����
		if(maxHeap.get(left) > maxHeap.get(max)) {
			max = left;
		}
		
		//���� ����� ������ ������ �ڽĳ���� ���� ũ�ٸ� max�� ����
		if(isRight &&
				maxHeap.get(right) > maxHeap.get(max)) {
			max = right;
		}
		
		//���� cur�� max�� ���� ���� �ʴٸ� �ڽ� ��带 Ȯ���� �ʿ䰡 ����
		//���� ���� ��ġ�� �ٲٰ� �ִ� ũ���� �ڽĳ�� �������� �ٽ� maxHeapify
		if(max != cur) {
			int tmp = maxHeap.get(max);
			maxHeap.set(max, maxHeap.get(cur));
			maxHeap.set(cur, tmp);
			maxHeapify(maxHeap, max);
		}
	}

}
