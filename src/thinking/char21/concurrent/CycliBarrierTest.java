package thinking.char21.concurrent;

import java.util.concurrent.CyclicBarrier;

/**
@author sgc
@version 2020年8月31日 下午5:29:11
@Description CyclicBarrier 可以理解为加法计数器
 **/
public class CycliBarrierTest {
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
			System.out.println("召唤神龙");
		});//参数2是达到7个线程后要执行的任务
		
		for (int i = 1; i <= 7; i++) {
			final int temp = i;//lamdba表达式中只能用final常量
			new Thread(()->{
				System.out.println(Thread.currentThread().getName()+"拿到了第"+temp+"个龙珠");
				try {
					cyclicBarrier.await();//等待七个线程执行完成 
					System.out.println(1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}).start();
		}
	}
}
