package studies.algorithms.main;

import java.util.Map;

import studies.algorithms.cache.LRUCache;
import studies.algorithms.heap.MaxHeap;
import studies.algorithms.heap.MinHeap;

public class Main {
	public static void main(String[] args) {

		final String lru = "LRU";
		final String minHeapTest = "MINHEAP";
		final String maxHeapTest = "MAXHEAP";

		String testNm = minHeapTest;

		if (testNm.equals(lru)) {

			LRUCache<String, String> c = new LRUCache<String, String>(3);
			c.put("1", "one"); // 1
			c.put("2", "two"); // 2 1
			c.put("3", "three"); // 3 2 1
			System.out.println(c);

			c.put("4", "four"); // 4 3 2
			System.out.println(c);

			if (c.get("2") == null)
				throw new Error(); // 2 4 3
			System.out.println(c);

			c.put("5", "five"); // 5 2 4
			System.out.println(c);

			c.put("4", "second four"); // 4 5 2
			System.out.println(c);

			// Verify cache content.
			if (c.usedEntries() != 3)
				throw new Error();
			if (!c.get("4").equals("second four"))
				throw new Error();
			if (!c.get("5").equals("five"))
				throw new Error();
			if (!c.get("2").equals("two"))
				throw new Error();
			// List cache content.
			for (Map.Entry<String, String> e : c.getAll()) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}

		} else if (testNm.equals(minHeapTest)) {

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
