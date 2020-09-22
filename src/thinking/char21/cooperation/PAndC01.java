package thinking.char21.cooperation;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
@author sgc
@version 2020年9月3日 下午3:44:26
@Description 使用lock锁condition 实现消费者生产者模式
 **/
public class PAndC01 {
	public static void main(String[] args) {
		Data2 data = new Data2();
		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				try {
					data.increment();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"A").start();
		
		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				try {
					data.decrement();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"B").start();
		
		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				try {
					data.decrement();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"C").start();
		
		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				try {
					data.decrement();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"D").start();
	}
}

//资源类
class Data {
	private int num = 0;
	
	//判断等待 业务 通知
	public synchronized void increment() throws InterruptedException {
		while(num!=0){//这里如果使用if判断可能会产生虚假唤醒 应该使用while不停地判断
			this.wait();
		}
		System.out.println(Thread.currentThread().getName()+"->"+(num++));
		this.notifyAll();
	}
	
	//判断等待 业务 通知
	public synchronized void decrement() throws InterruptedException {
		while(num==0){
			this.wait();
		}
		System.out.println(Thread.currentThread().getName()+"->"+(num--));
		this.notifyAll();
	}
}

//资源类 使用lock锁
class Data2 {
	private int num = 0;
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	//判断等待 业务 通知
	public void increment() throws InterruptedException {
		lock.lock();
		try {
			while(num!=0){//这里如果使用if判断可能会产生虚假唤醒 应该使用while不停地判断
				condition.await();
			}
			System.out.println(Thread.currentThread().getName()+"->"+(num++));
			condition.signalAll();
		} finally {
			lock.unlock();
		}
		
	}
	
	//判断等待 业务 通知
	public void decrement() throws InterruptedException {
		lock.lock();
		try {
			while(num==0){
				condition.await();
			}
			System.out.println(Thread.currentThread().getName()+"->"+(num--));
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	
	}
}