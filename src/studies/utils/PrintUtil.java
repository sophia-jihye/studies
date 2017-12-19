package studies.utils;

public class PrintUtil {

	private static PrintUtil instance = new PrintUtil();

	private PrintUtil() {
	}

	public static PrintUtil getInstance() {
		return instance;
	}

	public static void printTwoDepthArray(int[][] aGraph) {
		for (int i = 0; i < aGraph.length; i++) {
			for (int j = 0; j < aGraph[i].length; j++) {
				System.out.print(aGraph[i][j] + " ");
			}
			System.out.println();
		}
	}

}
