package studies.algorithms.heap;

public class MinHeap {

	private int[] heap;
	private int size;
	private int maxsize;

	private static final int FRONT = 1;

	public MinHeap(int maxsize) {
		this.maxsize = maxsize;
		this.size = 0;
		heap = new int[this.maxsize + 1];
		heap[0] = Integer.MIN_VALUE;
	}

	private int parent(int pos) {
		return pos / 2;
	}

	private int leftChild(int pos) {
		return (2 * pos);
	}

	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	private void swap(int fpos, int spos) {
		int tmp;
		tmp = heap[fpos];
		heap[fpos] = heap[spos];
		heap[spos] = tmp;
	}

	private void minHeapify(int pos) {
		if (!isLeaf(pos)) {
			if (heap[pos] > heap[leftChild(pos)]
					|| heap[pos] > heap[rightChild(pos)]) {
				if (heap[leftChild(pos)] < heap[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				} else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}

	public void insert(int element) {
		heap[++size] = element;
		int current = size;

		while (heap[current] < heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	public void print() {
		for (int i = 1; i <= size / 2; i++) {
			System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : "
					+ heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]);
			System.out.println();
		}
	}

	public void minHeap() {
		for (int pos = (size / 2); pos >= 1; pos--) {
			minHeapify(pos);
		}
	}

	public int remove() {
		int popped = heap[FRONT];
		heap[FRONT] = heap[size--];
		minHeapify(FRONT);
		return popped;
	}

}
