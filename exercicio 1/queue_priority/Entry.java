package queue_priority;

public interface Entry<K, V> {
	public K getKey();

	public V getValue();
}