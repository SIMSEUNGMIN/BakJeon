import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem {
	
	static int input;
	static int result;
	static int[] col;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//�� ���� �� �࿡�� �ϳ��� ���� ���� ����
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		input = Integer.parseInt(bf.readLine());
	
		result = 0;
		
		//1���� �����ϱ� ���ؼ� �� ĭ �� �������
		col = new int[input+1];
		
		// (1,1), (1,2), (1,3) ������ ����
		for(int i = 1; i <= input; i++) {
			col[1] = i;
			
			//���� �� �˻�(�ֳ��ϸ� ���� ���� ���̻� ���� �� ���� ����)
			//�� �˻��� �̷��� �� (1,1), (2,1), (3,1)������ ��
			startDFS(2);
		}
		
		//����� �� ���
		System.out.println(result);
		
	}
	
	static void startDFS(int cur) {
		
		//���� ���� input���� ���� ��� ü�� ���� ��� ����
		//ü������ ��� ���´� �� ������ �� �ؿԴٴ� ǥ���̱� ������ �ϳ��� ����� �� �� ����
		if(cur > input) {
			result++;
		}
		//�װ� �ƴ� ��� ���� ������ ���� Ȯ��
		//���� ���� �� �ִ��� Ȯ����
		else {
			for(int i = 1; i <= input; i++) {
				//������ ��ġ�� �ٽ� �缳��
				col[cur] = i;
				
				//������ ���� ���� ���� �� �ִ� ������ Ȯ��
				if(isPossible(cur)) {
					//���� �� �ִٸ� �� ���� ���� Ȯ���Ϸ� ��
					startDFS(cur+1);
				}
				//���� �� ���� ���̶�� �Ѵٸ� ??????????????
				else {
					col[cur] = 0;
				}
			}
		}
	}

	private static boolean isPossible(int cur) {
		
		//�� ���� �ö�
		//���� ���� ��쿡�� ���� ���� ������ �ǹǷ�
		//(���� ���� ���� �������� �ϳ� �ۿ� ������ �� ����)
		for(int i = 1; i < cur; i++) {
			
			//�� �����̹Ƿ� �ٸ� ���ε� ���� ���� �ִٸ�
			//���� ���� �� ����
			if(col[i] == col[cur]) {
				return false;
			}
			
			//�׸��� �밢������ ���� ���ٸ� ���� ���� �� ����
			//��� ���� �Ÿ� ���� ���� �Ÿ��� ���ٸ� �� ���� �밢���� ���� ���̱� ������ ��ġ �Ұ���
			if(Math.abs(col[i] - col[cur]) == Math.abs(i - cur)) {
				return false;
			}
		}
		
		return true;
	}
	
}
