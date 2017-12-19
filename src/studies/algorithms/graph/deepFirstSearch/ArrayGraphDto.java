package studies.algorithms.graph.deepFirstSearch;

public class ArrayGraphDto {

	private int numOfVertex;
	private int[][] aGraph;
	private boolean[] visit;

	public ArrayGraphDto() {
	}

	public ArrayGraphDto(int numOfVertex) {
		this.numOfVertex = numOfVertex;
		aGraph = new int[numOfVertex][numOfVertex]; // 변수 초기화
		visit = new boolean[numOfVertex]; // 변수 초기화
	}

	public int getNumOfVertex() {
		return numOfVertex;
	}

	public void setNumOfVertex(int numOfVertex) {
		this.numOfVertex = numOfVertex;
	}

	public int[][] getaGraph() {
		return aGraph;
	}

	public void setaGraph(int[][] aGraph) {
		this.aGraph = aGraph;
	}

	public boolean[] getVisit() {
		return visit;
	}

	public void setVisit(boolean[] visit) {
		this.visit = visit;
	}

	public void dfs(int i) {

		visit[i] = true;
		System.out.print(i + " ");

		for (int j = 1; j < numOfVertex; j++) {
			if (aGraph[i][j] == 1 && visit[j] == false) {
				dfs(j);
			}
		}
	}

}
