import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int stdNum = 0;
		int[] students = null;
		double[] upper = null;
		
		count = scanner.nextInt();
		upper = new double[count];
		
		for(int i = 0; i < count; i++) {
			stdNum = scanner.nextInt();
			
			students = new int[stdNum];
			
			for(int student = 0; student < stdNum; student++) {
				students[student] = scanner.nextInt();
			}
		
			upper[i] = getUpperAverage(students);
		}
		
		for(int i = 0; i < upper.length; i++) {
			System.out.println(String.format("%.3f", upper[i]) + "%");
		}
	}
	
	public static double getUpperAverage(int[] students) {
		
		int sum = 0;
		double average = 0.0;
		double upperAverage = 0;
		
		int stdCount = 0;
		
		for(int i = 0; i < students.length; i++) {
			sum += students[i];
		}

		average = ((double)sum / (double)students.length);
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] > average) {
				stdCount++;
			}
		}
		
		upperAverage = (((double)stdCount / (double)students.length)) * 100;
		
		return Math.round(upperAverage*1000)/1000.0;
		
	}
}
