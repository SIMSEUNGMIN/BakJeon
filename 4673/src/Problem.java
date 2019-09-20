
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] result = new boolean[10001];
		
		for(int i = 1; i < 10000; i++) {
			result[i] = true;
		}
		
		for(int i = 1; i <= 10000; i++) {
			int sum = i;
			
			for(int j = 0; j < Integer.toString(i).length(); j++)
				sum += Integer.parseInt(Integer.toString(i).charAt(j)+"");
			
			if(sum <= 10000)
				result[sum] = false;
			
		}
		
		for(int i = 1; i <= 10000; i++) {
			if(result[i] == true)
				System.out.println(i);
		}
	}

}
