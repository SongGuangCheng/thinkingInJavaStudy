package thinking.char21.concurrent;

import java.util.concurrent.CountDownLatch;

/**
@author sgc
@version 2020年8月31日 下午5:19:46
@Description CountDownLatch计数器
 **/
public class CountDownLatchTest {
	public static void main(String[] args) throws InterruptedException {
		//指定初始值为6
		CountDownLatch countDownLatch = new CountDownLatch(6);
		
		for (int i = 1; i <= 5; i++) {
			new Thread(()->{
				System.out.println(Thread.currentThread().getName()+"----go");
				countDownLatch.countDown();//次数-1
			}).start();
		}
		
		countDownLatch.await();//等待计数器归零，再向下执行
		System.out.println("都走完了");
	}
}
