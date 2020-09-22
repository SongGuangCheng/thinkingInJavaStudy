package question.char16;

import java.util.LinkedList;
import java.util.Queue;

/**
@author sgc
@version 2020年8月20日 下午4:03:28
@Description 队列Queue的使用及说明
 **/
public class Question7 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("php");
		queue.offer("is the best");
		queue.offer("language");
		queue.offer("in the world");
		System.out.println(queue);
		System.out.println("remove获取队头元素"+queue.remove());
		System.out.println(queue);
		/*
		 * E poll()
		 * 出队操作，从队首获取元素
		 * 获取该元素后它将从队列中被删除。
		 */
		System.out.println("poll获取队头元素"+queue.poll());
		/*
		 * E peek()
		 * 引用队首元素，但是不做出队操作。
		 */	
		System.out.println("获取队首元素"+queue.peek());
		System.out.println("element="+queue.element()); //返回第一个元素 
		System.out.println(queue);
	}
}
