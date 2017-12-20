package studies.algorithms.graph.deepFirstSearch;

public class Main {
	public static void main(String[] args) {

		final String arrayGraph = "ARRAY";
		final String graphSample = "GRAPH";

		String testNm = graphSample;

		final int 동수 = 0;
		final int 지민 = 1;
		final int 민석 = 2;
		final int 정희 = 3;
		final int 수정 = 4;
		final int 지율 = 5;

		if (testNm.equals(arrayGraph)) {

			ArrayGraphDto aGraphDto = new ArrayGraphDto(6);
			int[][] aGraph = aGraphDto.getaGraph();

			int from = 동수;
			int to = 지민;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 동수;
			to = 지율;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 지민;
			to = 민석;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 민석;
			to = 정희;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 민석;
			to = 수정;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 정희;
			to = 수정;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 민석;
			to = 지율;
			aGraph[from][to] = aGraph[to][from] = 1;

			// 1번부터 탐색 시작
			aGraphDto.dfs(동수);

		} else if (testNm.equals(graphSample)) {
			Graph graph = new Graph();
			graph.createGraph();

			for (int i = 0; i < 7; i++)
				graph.insertVertex(i);

			graph.insertEdge(0, 2);
			graph.insertEdge(0, 1);
			graph.insertEdge(1, 4);
			graph.insertEdge(1, 3);
			graph.insertEdge(1, 0);
			graph.insertEdge(2, 4);
			graph.insertEdge(2, 0);
			graph.insertEdge(3, 6);
			graph.insertEdge(3, 1);
			graph.insertEdge(4, 6);
			graph.insertEdge(4, 2);
			graph.insertEdge(4, 1);
			graph.insertEdge(5, 6);
			graph.insertEdge(6, 5);
			graph.insertEdge(6, 4);
			graph.insertEdge(6, 3);

			System.out.print("Graph의 인접 리스트: ");
			graph.printAdjList();

			System.out.println("\n\n Depth First Search:");
			graph.depthFirstSearch(0);

		}
	}
}
