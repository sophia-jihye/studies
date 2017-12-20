package studies.algorithms.graph.deepFirstSearch;

public class Graph {
	GraphType g;

	public Graph() {
		g = new GraphType();
	}

	public void createGraph() {
		g.n = 0;

		for (int i = 0; i < g.MAXVERTEX; i++) {
			g.visited[i] = false;
			g.adjList[i] = null;
		}
	}

	public void insertVertex(int v) {
		if ((g.n + 1) > g.MAXVERTEX) {
			System.out.println("그래프의 정점의 갯수 초과!");
			return;
		}

		g.n++;
	}

	public void insertEdge(int u, int v) {
		GraphNode node;

		if (u >= g.n || v >= g.n) {
			System.out.println("그래프에 없는 정점!");
			return;
		}
		node = new GraphNode();
		node.vertex = v;
		node.link = g.adjList[u];
		g.adjList[u] = node;
	}

	public void printAdjList() {
		GraphNode tmp;

		for (int i = 0; i < g.n; i++) {
			System.out.println("\n\t 정점 " + (char) (i + 65) + "의 인접 리스트");
			tmp = g.adjList[i];

			while (tmp != null) {
				System.out.print(" -> " + (char) (tmp.vertex + 65));
				tmp = tmp.link;
			}
		}
	}

	public void depthFirstSearch(int v) {
		GraphNode tmp;
		Stack stack = new Stack();
		stack.top = null;
		stack.push(v);

		g.visited[v] = true;
		System.out.print(" " + (char) (v + 65));

		while (stack.top != null) {
			tmp = g.adjList[v];

			while (tmp != null) {
				if (!g.visited[tmp.vertex]) {
					stack.push(tmp.vertex);
					g.visited[tmp.vertex] = true;
					System.out.print(" " + (char) (tmp.vertex + 65));
					v = tmp.vertex;
					tmp = g.adjList[v];
				} else
					tmp = tmp.link;
			}
			v = stack.pop();
		}
	}
}

class GraphType {
	final int MAXVERTEX = 10;

	int n;
	GraphNode adjList[];
	boolean visited[];

	public GraphType() {
		adjList = new GraphNode[MAXVERTEX];
		visited = new boolean[MAXVERTEX];
	}

}

class GraphNode {
	int vertex;
	GraphNode link;

}

class StackNode {
	int data;
	StackNode link;

	public StackNode(int data) {
		this.data = data;
	}
}

class Stack {
	StackNode top;

	public void push(int data) {
		StackNode tmp = new StackNode(data);
		tmp.link = top;
		top = tmp;
	}

	public int pop() {
		int data;
		StackNode tmp = top;

		if (top == null) {
			System.out.println("Stack is Empty!!");
			return 0;
		} else {
			data = tmp.data;
			top = tmp.link;
			tmp = null;
			return data;
		}
	}

}
