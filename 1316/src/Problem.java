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
			//과거랑 현재가 같다면 이것은 반복되는 문자라는 뜻
			//반복되지 않으면 다른 문자이므로 다른 문자로 바뀔 때마다
			//이전의 문자를 group으로 넣고 카운트를 올린다.
			//그리고 현재 문자를 이전 문자로 바꾼다.
			if(pre == string.charAt(i));
			
			if(pre != string.charAt(i)) {
				//그룹 안에 있다면 카운트 올림
				if(find(group, pre+"")) {
					findAndCount(group,pre+"");
				}
				else {
					//그룹 안에 없으면 새로 넣고 카운트 1로 만듦
					Count newCount = new Count(pre+"", 1);
					group.add(newCount);
				}
				
				pre = string.charAt(i);
			}
			
			if(i == string.length()-1) { //맨 마지막 글자의 경우
				if(find(group, string.charAt(i)+"")) {
					findAndCount(group, string.charAt(i)+"");
				}
				else {
					//그룹 안에 없으면 새로 넣고 카운트 1로 만듦
					Count newCount = new Count(string.charAt(i)+"", 1);
					group.add(newCount);
				}
			}
		}
		
		for(int i = 0; i < group.size(); i++){
			//모든 숫자가 1이면 groupword
			
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
		//pre와 같은 문자를 찾은 다음 카운트를 올림
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

