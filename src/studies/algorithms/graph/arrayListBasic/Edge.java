package studies.algorithms.graph.arrayListBasic;

public class Edge<W, V> {
	private V vertax; // edge 끝 부분에 있는 vertex의 번호
	private W weight; // edge에 부여된 가중치

	public Edge() {
		super();
	}

	public void setEdge(V vertax, W weight) {
		this.vertax = vertax;
		this.weight = weight;
	}

	public V getVertax() {
		return vertax;
	}

	public void setVertax(V vertax) {
		this.vertax = vertax;
	}

	public W getWeight() {
		return weight;
	}

	public void setWeight(W weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Edge [vertax=" + vertax + ", weight=" + weight + "]\n";
	}

}
