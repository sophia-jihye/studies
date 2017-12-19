package studies.algorithms.graph.arrayListBasic;

import java.util.ArrayList;
import java.util.Arrays;

import studies.utils.PrintUtil;

public class Main {
	public static void main(String[] args) {

		final String arrayGraph = "ARRAY";
		final String arrayListGraph = "ARRAYLIST";
		final String weightedArrayListGraph = "WEIGHTLIST";

		String testNm = arrayGraph;

		if (testNm.equals(arrayGraph)) {
			int numOfVertex = 5;

			int[][] aGraph = new int[numOfVertex][numOfVertex];

			// 가중치가 없을 경우 1, 가중치가 있을 경우 해당 가중치 입력
			int from = 0;
			int to = 1;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 0;
			to = 3;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 1;
			to = 2;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 2;
			to = 3;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 3;
			to = 4;
			aGraph[from][to] = aGraph[to][from] = 1;

			from = 4;
			to = 0;
			aGraph[from][to] = aGraph[to][from] = 1;

			PrintUtil.printTwoDepthArray(aGraph);

		} else if (testNm.equals(arrayListGraph)) {
			
			int numOfVertex = 5;
			
			ArrayList<ArrayList<Integer>> alGraph = new<ArrayList<Integer>> ArrayList();
			
			// 빈 list 생성
			for (int i = 0; i < numOfVertex; i++) {
				alGraph.add(new<Integer> ArrayList()); 
			}

			// 양방향 그래프
			int from = 0;
			int to = 1;
			alGraph.get(from).add(to);
			alGraph.get(to).add(from);

			from = 0;
			to = 3;
			alGraph.get(from).add(to);
			alGraph.get(to).add(from);

			from = 1;
			to = 2;
			alGraph.get(from).add(to);
			alGraph.get(to).add(from);

			from = 2;
			to = 3;
			alGraph.get(from).add(to);
			alGraph.get(to).add(from);

			from = 3;
			to = 4;
			alGraph.get(from).add(to);
			alGraph.get(to).add(from);

			from = 4;
			to = 0;
			alGraph.get(from).add(to);
			alGraph.get(to).add(from);

			System.out.println(alGraph);
		} else if (testNm.equals(weightedArrayListGraph)) {

			int numOfVertex = 5;

			ArrayList<Edge> walGraph = new<Edge> ArrayList();

			// 빈 edge 생성
			for (int i = 0; i < numOfVertex; i++) {
				walGraph.add(new<Integer, Integer> Edge());
			}

			// 단방향 그래프
			walGraph.get(0).setEdge(1, 1);
			walGraph.get(0).setEdge(3, 1);
			walGraph.get(1).setEdge(2, 1);
			walGraph.get(2).setEdge(3, 1);
			walGraph.get(3).setEdge(4, 1);
			walGraph.get(4).setEdge(0, 1);

			System.out.println(walGraph);
		}

	}
}
