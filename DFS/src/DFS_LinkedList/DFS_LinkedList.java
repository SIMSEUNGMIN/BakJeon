package DFS_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DFS_LinkedList {

	public static void main(String[] args) {
		
		Graph newGraph = new Graph(4);
		
		newGraph.addEdge(0, 1);
		newGraph.addEdge(0, 2);
		newGraph.addEdge(1, 2);
		//newGraph.addEdge(2, 0);
		newGraph.addEdge(2, 3);
		newGraph.addEdge(3, 3);
		
		newGraph.DFS(2);
		

	}
}

class Graph{
	//정점 개수
	private int vertex;
	//연결된 정점을 넣어둘 LinkedList배열
	private List<Integer>[] graphList;
	
	public Graph(int newVertex) {
		this.vertex = newVertex;
		//LinkedList를 여러 개 생성
		this.graphList = new LinkedList[this.vertex];
		
		for(int i = 0; i < this.vertex; i++) {
			//각 LinkedList를 초기화
			this.graphList[i] = new LinkedList<Integer>(); 
		}	
	}

	//정점에 연결되어 있는 정점 지정
	public void addEdge(int start, int destination) {
		this.graphList[start].add(destination);
		this.graphList[destination].add(start);
	}
	
	public void startDFS(int start, boolean[] visited) {
		
		//들어온 정점은 방문한 것이니 true로 바꿈
		visited[start] = true;
		
		//순서 출력문
		System.out.print(start + " ");
		
		//현재 정점에 이어진 정점을 전부 돌면서
		//visited가 false인 정점을 상대로 재귀를 돌려
		//DFS를 진행함
		Iterator<Integer> i = this.graphList[start].listIterator();
		
		while(i.hasNext()) {
			int connect = i.next();
			
			//방문하지 않았으면 그 안으로 들어가서 다시 검색 (깊이 우선 탐색)
			if(!visited[connect]) {
				startDFS(connect, visited);
			}
		}
		
	}
	
	//주어진 점을 시작으로 DFS를 호출
	public void DFS(int start) {
		//방문 확인 용 배열(초기 값 : false)
		boolean[] visited = new boolean[this.vertex];
		
		startDFS(start, visited);
		
	}
	
}
