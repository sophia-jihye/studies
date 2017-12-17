package studies.algorithms.graph.arrayListBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 인접 리스트 초기화
		ALGraph.nV = 5;
		ArrayList<ArrayList<Integer>> ad = new<ArrayList<Integer>> ArrayList();
		for (int i = 0; i < ALGraph.nV; i++) {
			ad.add(new<Integer> ArrayList()); // ad 리스트에 담을 리스트 초기화
		}

		ad.get(0).add(1); // 양방향 그래프이므로, vertex 1, 2 값 초기화
		ad.get(0).add(3);
		ad.get(1).add(2);
		ad.get(2).add(3);
		ad.get(3).add(4);
		ad.get(4).add(0);

		System.out.println(ad);
	}
}
