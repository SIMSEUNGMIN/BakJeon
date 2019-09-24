package DFS_Array;

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph newGraph = new Graph(5);
		
		newGraph.addEdge(0, 1);
		newGraph.addEdge(0, 2);
		newGraph.addEdge(0, 4);
		newGraph.addEdge(1, 2);
		newGraph.addEdge(2, 3);
		newGraph.addEdge(2, 4);
		newGraph.addEdge(3, 4);
		
		newGraph.DFS(0);
		
	}
	
	static class Graph{
		private int v; //노드의 개수
		private int[][] graphArray;
		
		Graph(int newV){
			this.v = newV;
			this.graphArray = new int[this.v][this.v];
			
			//초기화
			for(int row = 0; row < this.v; row++) {
				for(int col = 0; col < this.v; col++) {
					this.graphArray[row][col] = -1;
				}
			}
		}
		
		//노드 연결 v->w, w->v
		public void addEdge(int givenV, int givenW) {
			if((givenV < this.v) && (givenW < this.v)) {
				this.graphArray[givenV][givenW] = 1;
				this.graphArray[givenW][givenV] = 1;
			}
		}
		
		//DFS용 함수
		public void startDFS(int v, boolean[] visited) {
			//현재 노드 방문 -> 방문 표시
			visited[v] = true;
			System.out.println(v + " ");
			
			//현재 노드의 인접한 모든 노드를 가져옴
			for(int i = 0; i < this.v; i++) {
				//현재 노드와 이어져있고 방문하지 않았다면 다시 검색
				if(this.graphArray[v][i] != -1 && !visited[i]) {
					startDFS(i, visited);
				}
			}
		}
		
		//주어진 노드를 root로 DFS 시작
		public void DFS(int start) {
			
			//노드의 방문 여부 판단 (초기값은 false)
			boolean visited[] = new boolean[this.v];
			
			startDFS(start, visited);
		}
	}

}
