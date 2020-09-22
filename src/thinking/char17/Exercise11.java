package thinking.char17;

import java.util.PriorityQueue;
import java.util.Random;

/**
@author sgc
@version 2020年8月18日 下午6:04:22
@Description 
 **/
public class Exercise11 {
	public static void main(String[] args) {
		PriorityQueue<A> queue = new PriorityQueue<A>();
		for (int i = 0; i < 10; i++) {
			queue.offer(new A());
		}
		System.out.println(queue);
		
		for (int j = 0; j < queue.size(); j++)
			 
            System.out.print(queue.remove() + ", ");
	}
}

class A implements Comparable<A>{
	Random random = new Random();
	Integer a = random.nextInt(100);
	
	@Override
	public int compareTo(A o) {
		return this.a>o.a?1:(this.a==o.a?0:-1);
	}
	
	 public String toString() {
	        return a.toString();
	    }
	
}