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
		private int v; //����� ����
		private int[][] graphArray;
		
		Graph(int newV){
			this.v = newV;
			this.graphArray = new int[this.v][this.v];
			
			//�ʱ�ȭ
			for(int row = 0; row < this.v; row++) {
				for(int col = 0; col < this.v; col++) {
					this.graphArray[row][col] = -1;
				}
			}
		}
		
		//��� ���� v->w, w->v
		public void addEdge(int givenV, int givenW) {
			if((givenV < this.v) && (givenW < this.v)) {
				this.graphArray[givenV][givenW] = 1;
				this.graphArray[givenW][givenV] = 1;
			}
		}
		
		//DFS�� �Լ�
		public void startDFS(int v, boolean[] visited) {
			//���� ��� �湮 -> �湮 ǥ��
			visited[v] = true;
			System.out.println(v + " ");
			
			//���� ����� ������ ��� ��带 ������
			for(int i = 0; i < this.v; i++) {
				//���� ���� �̾����ְ� �湮���� �ʾҴٸ� �ٽ� �˻�
				if(this.graphArray[v][i] != -1 && !visited[i]) {
					startDFS(i, visited);
				}
			}
		}
		
		//�־��� ��带 root�� DFS ����
		public void DFS(int start) {
			
			//����� �湮 ���� �Ǵ� (�ʱⰪ�� false)
			boolean visited[] = new boolean[this.v];
			
			startDFS(start, visited);
		}
	}

}
