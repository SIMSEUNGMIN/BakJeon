import java.util.Scanner;

public class Problem_9663 {
	static int col[];
	static int input;
	static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		for(int i = 1; i <= input;i++) { //���� ����
			col = new int[16]; //��ü ��ǥ�� ���� ��
			col[1] = i; //col[��]=��
			
			dfs(2); //2���� �̵�
		}
		
		System.out.println(ans);
	}

	private static void dfs(int newcol) {
		// TODO Auto-generated method stub
		if(newcol > input) {
			ans++;
		}
		else {
			for(int i = 1; i <= input; i++) { //��
				col[newcol] = i; //���� ��ġ ����
				
				if(isPossible(newcol)) {
					//������ ���̸� ���� ���� �̵�
					dfs(newcol+1);
				}
				else {
					col[newcol] = -1; //���� ĭ�� ���� ���� ĭ
				}
				
			}
		}
	}

	private static boolean isPossible(int col2) {
		// TODO Auto-generated method stub
		for(int i = 1; i < col2; i++) {
			//���� ���� ���� �࿡ �����ϴ��� Ȯ��
			if(col[i] == col[col2]) {
				return false;
			}
			
			if(Math.abs(col[i] - col[col2]) == Math.abs(i-col2)) {
				//�Ϻ��� �밢���� �ִ� ���(���簢���� ���� �ش�)
				return false;
			}
		}
		
		return true;
	}

}
