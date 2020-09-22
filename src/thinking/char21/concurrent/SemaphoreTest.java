package thinking.char21.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
@author sgc
@version 2020年8月31日 下午5:39:43
@Description Semaphore信号量
作用：多个共享资源互斥的使用 并发限流 控制最大的线程数
Semaphore  可以允许若干个任务同时访问资源
 **/
public class SemaphoreTest {
	public static void main(String[] args) {
		//线程数量 有三个车位
		Semaphore semaphore = new Semaphore(3);
		
		for (int i = 1; i <= 6; i++) {
				new Thread(()->{
					try {
						semaphore.acquire();//获得 满了则等待
						System.out.println(Thread.currentThread().getName()+"抢到了车位");
						TimeUnit.SECONDS.sleep(2);
						System.out.println(Thread.currentThread().getName()+"离开了车位");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						semaphore.release();//释放 唤醒等待线程
					}
				}).start();
		}
	}
}
