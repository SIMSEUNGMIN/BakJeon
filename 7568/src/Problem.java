import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		List<Human> people = new LinkedList<Human>();
		
		for(int i = 0; i < number; i++) {
			int newWeight = scanner.nextInt();
			int newHeight = scanner.nextInt();
			
			Human newHuman = new Human(newWeight, newHeight, 1);
			
			people.add(newHuman);
			
			//System.out.println("무게 : " + people.get(i).getWeight());
		}
		
		for(int me = 0; me < number; me++) {
			int curWeight = people.get(me).getWeight();
			int curHeight = people.get(me).getHeight();
			
			//다른 사람과 덩치 비교
			for(int other = 0; other < number; other++) {
				if((curWeight < people.get(other).getWeight()) 
						&& (curHeight < people.get(other).getHeight())) {
					people.get(me).setRanking(people.get(me).getRanking() + 1);
				}
			}
		}
		
		//순위 출력
		for(int i = 0; i < number; i++) {
			System.out.println(people.get(i).getRanking());
		}
		
	}
}

class Human {
	private int weight;
	private int height;
	private int ranking;
	
	public Human(int newWeight, int newHeight, int newRanking) {
		this.weight = newWeight;
		this.height = newHeight;
		this.ranking = newRanking;
	}
	
	public void setWeight(int givenWeight) {
		this.weight = givenWeight;
	}
	
	public void setHeight(int givenHeight) {
		this.height = givenHeight;
	}
	
	public void setRanking(int givenRanking) {
		this.ranking = givenRanking;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getRanking() {
		return this.ranking;
	}
}
