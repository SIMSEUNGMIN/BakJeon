import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		scanner.nextLine();
		
		String inString = new String();
		
		int sum = 0;
		
		for(int i = 0; i < input; i++) {
			inString = scanner.nextLine();
			sum = sum + checkTheGroup(inString);
		}
		
		System.out.println(sum);
	}

	public static int checkTheGroup(String string) {

		List<Count> group = new LinkedList<Count>();
		
		char pre = string.charAt(0);
		
		for(int i = 0; i < string.length(); i++) {
			//���Ŷ� ���簡 ���ٸ� �̰��� �ݺ��Ǵ� ���ڶ�� ��
			//�ݺ����� ������ �ٸ� �����̹Ƿ� �ٸ� ���ڷ� �ٲ� ������
			//������ ���ڸ� group���� �ְ� ī��Ʈ�� �ø���.
			//�׸��� ���� ���ڸ� ���� ���ڷ� �ٲ۴�.
			if(pre == string.charAt(i));
			
			if(pre != string.charAt(i)) {
				//�׷� �ȿ� �ִٸ� ī��Ʈ �ø�
				if(find(group, pre+"")) {
					findAndCount(group,pre+"");
				}
				else {
					//�׷� �ȿ� ������ ���� �ְ� ī��Ʈ 1�� ����
					Count newCount = new Count(pre+"", 1);
					group.add(newCount);
				}
				
				pre = string.charAt(i);
			}
			
			if(i == string.length()-1) { //�� ������ ������ ���
				if(find(group, string.charAt(i)+"")) {
					findAndCount(group, string.charAt(i)+"");
				}
				else {
					//�׷� �ȿ� ������ ���� �ְ� ī��Ʈ 1�� ����
					Count newCount = new Count(string.charAt(i)+"", 1);
					group.add(newCount);
				}
			}
		}
		
		for(int i = 0; i < group.size(); i++){
			//��� ���ڰ� 1�̸� groupword
			
//			System.out.println("str : " + group.get(i).getStr() + ", count : " + group.get(i).getCount());
			
			if(group.get(i).getCount() != 1) {
				return 0;
			}
		}
		
		return 1;
	}

	private static boolean find(List<Count> group, String pre) {
		
		for(int i = 0; i < group.size(); i++) {
			if(group.get(i).getStr().equals(pre)){
				return true;
			}
		}
		
		return false;
	}

	private static void findAndCount(List<Count> group, String pre) {
		//pre�� ���� ���ڸ� ã�� ���� ī��Ʈ�� �ø�
		for(int i = 0; i < group.size(); i++) {
//			System.out.println(i + " : " + group.get(i).getStr());
			if(group.get(i).getStr().equals(pre)){
				group.get(i).setCount(group.get(i).getCount()+1);
			}
		}
		
	}

	static class Count {
		private String str = new String();
		private int count;
		
		public Count(String newStr, int newCount) {
			this.str = newStr;
			this.count = newCount;
		}
		
		public void setStr(String newStr) {
			this.str = newStr;
		}
		
		public void setCount(int newInt) {
			this.count = newInt;
		}
		
		public String getStr() {
			return this.str;
		}
		
		public int getCount() {
			return this.count;
		}
	}

}

