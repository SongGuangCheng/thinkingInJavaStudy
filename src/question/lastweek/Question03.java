package question.lastweek;

import java.util.concurrent.atomic.AtomicInteger;



/**
@author sgc
@version 2020年9月4日 下午5:15:50
@Description 原子操作是线程安全的嘛
 **/
public class Question03 {
	
	public static void main(String[] args) throws InterruptedException {
		AtomicInteger ai = new AtomicInteger(0);
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				for (int j = 0; j < 100; j++) {
					ai.getAndIncrement();
				}
				
			}).start();
		}
		Thread.sleep(3000);
		System.out.println(ai);
	}
}
