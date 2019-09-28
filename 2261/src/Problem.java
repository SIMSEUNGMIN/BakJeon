import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem {
	
	static int min = 0;

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(bf.readLine());
		
		Point[] array = new Point[input];
		
		for(int i = 0; i < input; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			array[i] = (new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		//X좌표 기준으로 오름차순 정렬
		xSort(array);
		
		//정렬된 array로 Closest_pair구한 결과 출력
		System.out.print((int)closestPair(array, 0, array.length-1));
	}

	private static int closestPair(Point[] array, int start, int end) {
		
		Point[] tmpArray = new Point[end-start+1];
		int[] tmpDistance;
		
		int count = 0;
		
		if((end - start + 1) <= 3) {
			
			switch(end-start+1) {
				case 2:
					//두 점 사이가 가장 최솟값
					min = distance(array, 0, 1);
					return min;
				case 3:
					tmpDistance = new int[3];
					
					//점들 사이의 거리
					//0번 째 값과 1번 째 값
					tmpDistance[0] = distance(array, 0, 1);
					//1번 째 값과 2번 째 값
					tmpDistance[1] = distance(array, 1, 2);
					//2번 째 값과 0번 째 값
					tmpDistance[2] = distance(array, 0, 2);
					
					//거리들 중 최솟값을 구해서 return
					min = tmpDistance[0];
					
					for(int i = 1; i < tmpDistance.length; i++) {
						if(tmpDistance[i] < min) {
							min = tmpDistance[i];
						}
					}
					return min;
				default:
					return min;
			}
		}
		//점의 개수가 4개 이상일 때
		else {
			//배열을 반으로 쪼개서 왼쪽과 오른쪽으로 나눈 뒤
			//왼쪽과 오른쪽에서 각각 나온 최솟값 중에서 더 작은 값을 반환함
			min = Math.min(closestPair(array, 0, (array.length/2)-1), closestPair(array, (array.length/2), (array.length-1)));
		}
		
		//구하고 나서 최솟값보다 작은 점들을 배열에서 제외
		for(int i = start; i <= end; i++) {
			if((array.length/2 - min) <= array[i].getX()) {
				tmpArray[count++] = array[i];
			}
		}
		
		//arrayForY만 가지고 sorting
		ySort(tmpArray, 0 , count-1);
		
		//window 내부의 최단 거리를 구함
		for(int one = 0; one < count-1; one++) {
			for(int two = one + 1; two < count; two++) {
				int tmp = distance(tmpArray, one, two);
				if(tmp < min) {
					min = tmp;
				}
			}
		}
		
		return min;
	}
	
	private static int distance(Point[] array, int left, int right) {
		return (int) (Math.pow((array[left].getX() - array[right].getX()), 2) 
				+ Math.pow((array[left].getY() - array[right].getY()), 2));
	}

	private static void xSort(Point[] array) {
		//두번째부터 시작
		for(int cur = 1; cur < array.length; cur++) {
			Point curKey = array[cur];
			
			//현재 cur의 원소 이전 원소를 전부 돌면서 적절한 위치를 찾음
			for(int pre = cur-1; pre >= 0; pre--) {
				
				//cur의 원소보다 pre의 원소가 큰 경우 위치 변경
				if(array[pre].getX() > curKey.getX()) {
					array[pre+1] = array[pre];
					array[pre] = curKey;
				}
			}
		}	
	}
	
	private static void ySort(Point[] arrayForY, int start, int end) {
		//두번째부터 시작
		for(int cur = 1; cur <= end; cur++) {
			Point curKey = arrayForY[cur];

			//현재 cur의 원소 이전 원소를 전부 돌면서 적절한 위치를 찾음
			for(int pre = cur-1; pre >= 0; pre--) {

				//cur의 원소보다 pre의 원소가 큰 경우 위치 변경
				if(arrayForY[pre].getY() > curKey.getY()) {
					arrayForY[pre+1] = arrayForY[pre];
					arrayForY[pre] = curKey;
				}
			}
		}	
		
	}

}

class Point{
	private int x;
	private int y;
	
	public Point(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	
	public void setX(int givenX) {
		this.x = givenX;
	}
	
	public void setY(int givenY) {
		this.y = givenY;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}