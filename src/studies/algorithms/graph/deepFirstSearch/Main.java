package studies.algorithms.graph.deepFirstSearch;

public class Main {
	public static void main(String[] args) {

		final int 동수 = 0;
		final int 지민 = 1;
		final int 민석 = 2;
		final int 정희 = 3;
		final int 수정 = 4;
		final int 지율 = 5;

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

	}
}
