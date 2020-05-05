import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1107 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int channel = Integer.parseInt(br.readLine());
		int wrong = Integer.parseInt(br.readLine());
		boolean[] button = new boolean[10];

		if(wrong == 0) { //���峭 ��ư�� ���� ���
			for(int i = 0; i < button.length; i++)
				button[i] = false;
		}
		else {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int token = st.countTokens();
			for(int i = 0; i < token; i++)
				button[Integer.parseInt(st.nextToken())] = true; //����
		}
		
		int ans = Math.abs(channel-100);

		for(int i = 0; i < 1000000; i++) { //��ü ä�� ����
			boolean check = true;
			int count = (i+"").length();
			int temp = i;

			for(int j = 0; j < count; j++) { //���� ä���� ���� �������� �Ǵ�
				int remind = temp % 10;	
				
				if(button[remind]) {
					check = false;
					break;
				}
				
				temp = temp / 10;
			}
			
			if(check) {
				int min = Math.abs(channel-i) + count;
				if(min < ans) {
//					System.out.println(i);
					ans = min;
				}
					
			}	

		}

		System.out.println(ans);
	}

}
