package question.char17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
@author sgc
@version 2020年8月19日 下午10:12:04
@Description Queue相关容器的初始化及测试
 **/
public class Exercise3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		Queue<String> queue1 =  new PriorityQueue<String>();
		queue.add("hello");
		queue.add("world");
		queue.add("good");
		queue.add("night");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		queue1.offer("coding");
		queue1.offer("more");
		queue1.offer("speaking");
		queue1.offer("less");
		System.out.print(queue1.poll()+" ");
		System.out.print(queue1.poll()+" ");
		System.out.print(queue1.poll()+" ");
		System.out.print(queue1.poll()+" ");
		System.out.print(queue1.poll()+" ");
	}
}
