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
	//���� ����
	private int vertex;
	//����� ������ �־�� LinkedList�迭
	private List<Integer>[] graphList;
	
	public Graph(int newVertex) {
		this.vertex = newVertex;
		//LinkedList�� ���� �� ����
		this.graphList = new LinkedList[this.vertex];
		
		for(int i = 0; i < this.vertex; i++) {
			//�� LinkedList�� �ʱ�ȭ
			this.graphList[i] = new LinkedList<Integer>(); 
		}	
	}

	//������ ����Ǿ� �ִ� ���� ����
	public void addEdge(int start, int destination) {
		this.graphList[start].add(destination);
		this.graphList[destination].add(start);
	}
	
	public void startDFS(int start, boolean[] visited) {
		
		//���� ������ �湮�� ���̴� true�� �ٲ�
		visited[start] = true;
		
		//���� ��¹�
		System.out.print(start + " ");
		
		//���� ������ �̾��� ������ ���� ���鼭
		//visited�� false�� ������ ���� ��͸� ����
		//DFS�� ������
		Iterator<Integer> i = this.graphList[start].listIterator();
		
		while(i.hasNext()) {
			int connect = i.next();
			
			//�湮���� �ʾ����� �� ������ ���� �ٽ� �˻� (���� �켱 Ž��)
			if(!visited[connect]) {
				startDFS(connect, visited);
			}
		}
		
	}
	
	//�־��� ���� �������� DFS�� ȣ��
	public void DFS(int start) {
		//�湮 Ȯ�� �� �迭(�ʱ� �� : false)
		boolean[] visited = new boolean[this.vertex];
		
		startDFS(start, visited);
		
	}
	
}
