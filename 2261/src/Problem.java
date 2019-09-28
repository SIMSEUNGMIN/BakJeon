import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem {
	
	static int min = 0;

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(bf.readLine());
		
		List<Point> array = new LinkedList<>();
		
		for(int i = 0; i < input; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			array.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		//X좌표 기준으로 오름차순 정렬
		Collections.sort(array, new PointComparatorX());
		
		//정렬된 array로 Closest_pair구한 결과 출력
		System.out.print((int)closestPair(array, 0, array.size()));
	}

	private static int closestPair(List<Point> array, int start, int end) {
		
		List<Point> tmpArray = new LinkedList<>();
		
		if((end - start) <= 3) {
			
			switch(end-start) {
				case 2:
					//두 점 사이가 가장 최솟값
					min = distance(array, 0, 1);
					return min;
				case 3:
					int[] tmpDistance = new int[3];
					
					//점들 사이의 거리
					//0번 째 값과 1번 째 값
					tmpDistance[0] = distance(array, 0, 1);
					//1번 째 값과 2번 째 값
					tmpDistance[1] = distance(array, 1, 2);
					//2번 째 값과 0번 째 값
					tmpDistance[2] = distance(array, 0, 2);
					
					//거리를 오름차순으로 정렬
					Arrays.sort(tmpDistance);
					min = tmpDistance[0];
					
					return min;
				default:
					return min;
			}
		}
		//점의 개수가 4개 이상일 때
		else {
			//배열을 반으로 쪼개서 왼쪽과 오른쪽으로 나눈 뒤
			//왼쪽과 오른쪽에서 각각 나온 최솟값 중에서 더 작은 값을 반환함
			int mid = (start + end) /2;
			min = Math.min(closestPair(array, start, mid), closestPair(array, mid, end));
			
			//구하고 나서 최솟값보다 작은 점들을 배열에서 제외
			for(int i = start; i < end; i++) {
				if(((end/2 - min) <= array.get(i).x) && (array.get(i).x <= (end/2 + min))) {
					tmpArray.add(array.get(i));
				}
			}
			
			//Y 오름차순 기준 sorting
			Collections.sort(tmpArray, new PointComparatorY());
			
			//window 내부의 최단 거리를 구함
			for(int one = 0; one < tmpArray.size()-1; one++) {
				for(int two = one + 1; two < tmpArray.size(); two++) {
					int tmp = tmpArray.get(one).y - tmpArray.get(two).y;
					
					if(tmp*tmp < min) {
						int tmpD = distance(tmpArray, one, two);
						if(tmpD < min) {
							min = tmpD;
						}
					}
					else {
						break;
					}
				}
			}
		}
		
		return min;
	}
	
	private static int distance(List<Point> array, int left, int right) {
		return (int) (Math.pow((array.get(left).x - array.get(right).x), 2) 
				+ Math.pow((array.get(left).y - array.get(right).y), 2));
	}
}

class PointComparatorX implements Comparator<Point>{
	
	@Override
	public int compare(Point left, Point right) {
		// X에 대해서 오름 차순
		if(left.x > right.x) {
			return 1;
		}
		
		return -1;
	}
}

class PointComparatorY implements Comparator<Point>{
	
	@Override
	public int compare(Point left, Point right) {
		// Y에 대해서 오름 차순
		if(left.y > right.y) {
			return 1;
		}
		
		return -1;
	}
}

class Point {
	public int x;
	public int y;
	
	public Point(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
}