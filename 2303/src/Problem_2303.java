import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2303 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int member = Integer.parseInt(br.readLine());
		
		String[][] cards = new String[member+1][5];
		
		for(int i = 1; i <= member; i++) {
			String[] temp = br.readLine().split(" ");
			for(int j = 0; j < temp.length; j++) {
				cards[i][j] = temp[j];
			}
		}		
		
		int[] maxs = new int[member+1];
		int max = 0;
		
		for(int mem = 1; mem <= member; mem++) {
			max = 0;
			int temp = 0;
			for(int i = 0; i < 5; i++) {
				for(int j = i + 1; j < 5; j++) {
					for(int k = j + 1; k < 5; k++) {
						int temp1 = Integer.parseInt(cards[mem][i]);
						int temp2 = Integer.parseInt(cards[mem][j]);
						int temp3 = Integer.parseInt(cards[mem][k]);
						temp = temp1 + temp2 + temp3;
						String tempS = temp + "";
						temp = Integer.parseInt(tempS.charAt(tempS.length()-1) + "");
								
						if(temp > max) {
							max = temp;
						}
					}
				}
			}
			
			maxs[mem] = max;
		}
		
		int index = 0;
		max = 0;
		for(int i = 1; i < maxs.length; i++) {
			int temp = maxs[i];
			
			if(temp >= max) {
				index = i;
				max = temp;
			}
		}
		
		System.out.println(index);
	}

}
