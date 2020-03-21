import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_2875 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int w = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		//�ִ� ����
		int maxTeam = 0;
		
		if(w/2 < m)
			maxTeam = w/2;
		else maxTeam = m;
		
		//�� �ο��� �����ϴ��� ���� �ʴ��� Ȯ��
		n = n - (w - (maxTeam*2)) - (m - maxTeam);
		
		while(n > 0) {
			n = n - 3;
			maxTeam--;
		}
		
		System.out.println(maxTeam);
		
	}

}
