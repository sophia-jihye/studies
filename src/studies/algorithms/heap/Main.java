package studies.algorithms.heap;

public class Main {
	public static void main(String[] args) {

		final String minHeapTest = "MINHEAP";
		final String maxHeapTest = "MAXHEAP";

		String testNm = minHeapTest;

		if (testNm.equals(minHeapTest)) {

			System.out.println("The Min Heap is ");
			MinHeap minHeap = new MinHeap(15);
			minHeap.insert(5);
			minHeap.insert(3);
			minHeap.insert(17);
			minHeap.insert(10);
			minHeap.insert(84);
			minHeap.insert(19);
			minHeap.insert(6);
			minHeap.insert(22);
			minHeap.insert(9);
			minHeap.minHeap();

			minHeap.print();
			System.out.println("The Min val is " + minHeap.remove());
			minHeap.print();

		} else if (testNm.equals(maxHeapTest)) {

			System.out.println("The Max Heap is ");
			MaxHeap maxHeap = new MaxHeap(15);
			maxHeap.insert(5);
			maxHeap.insert(3);
			maxHeap.insert(17);
			maxHeap.insert(10);
			maxHeap.insert(84);
			maxHeap.insert(19);
			maxHeap.insert(6);
			maxHeap.insert(22);
			maxHeap.insert(9);
			maxHeap.maxHeap();

			maxHeap.print();
			System.out.println("The max val is " + maxHeap.remove());
		}
	}
}
