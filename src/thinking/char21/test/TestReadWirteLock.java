package thinking.char21.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
@author sgc
@version 2020年9月1日 下午5:59:27
@Description 测试ReadWriteLock读写锁
ReadWriteLock 类的使用场景：在多线程，“读多写少”的场景就推荐使用，可以提高线程的性能
 **/
public class  TestReadWirteLock<K, V> {
			private final Map<K,V> map;
			private final ReadWriteLock lock = new ReentrantReadWriteLock();

			
			public TestReadWirteLock(Map<K, V> map) {
				this.map = map;
			}
			
			public V put(K key,V value) {
				lock.writeLock().lock();
				try {
					return  map.put(key, value);
				} finally {
					lock.writeLock().unlock();
				}
			}
			
			public V get(Object key) {
				lock.readLock().lock();
				try {
					return map.get(key);
				} finally {
					lock.readLock().unlock();
				}
		}
			
	public static void main(String[] args) {
		Map map = new HashMap<Integer, String>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		map.put(4, "ddd");
		map.put(5, "eee");
		map.put(6, "aaa");
		map.put(7, "bbb");
		map.put(8, "ccc");
		map.put(9, "ddd");
		map.put(10, "eee");
		TestReadWirteLock<Integer,String> lock = new TestReadWirteLock<Integer, String>(map);
		
		for (int i = 0; i < 20; i++) {
			int temp = i;
			new Thread(()->{
				System.out.println(lock.get(temp));
			}).start();
		}
		
		for (int i = 10; i < 20; i++) {
			int temp = i;
			new Thread(()->{
				lock.put(temp,"abc");
			}).start();
		}
	}
}
