package studies.algorithms.cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {

	private static final float hashTableLoadFactor = 0.75f;
	private LinkedHashMap<K, V> map;
	private int cacheSize;

	public LRUCache(int cacheSize) {
		this.cacheSize = cacheSize;
		int hashTableCapacity = (int) Math
				.ceil(cacheSize / hashTableLoadFactor) + 1;
		map = new LinkedHashMap<K, V>(hashTableCapacity, hashTableLoadFactor,
				true) {
			// (an anonymous inner class)
			private static final long serialVersionUID = 1;

			@Override
			protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
				return size() > LRUCache.this.cacheSize;
			}
		};
	}

	/**
	 * The retrieved entry becomes the MRU (most recently used) entry.
	 */
	public synchronized V get(K key) {
		return map.get(key);
	}

	/**
	 * If the cache is full, the LRU (least recently used) entry is dropped.
	 */
	public synchronized void put(K key, V value) {
		map.put(key, value);
	}

	public synchronized void clear() {
		map.clear();
	}

	public synchronized int usedEntries() {
		return map.size();
	}

	public synchronized Collection<Map.Entry<K, V>> getAll() {
		return new ArrayList<Map.Entry<K, V>>(map.entrySet());
	}

	@Override
	public String toString() {
		return "LRUCache1 [map=" + map + "]";
	}

}
