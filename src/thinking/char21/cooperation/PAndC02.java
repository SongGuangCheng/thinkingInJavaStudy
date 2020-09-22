package thinking.char21.cooperation;

import java.awt.print.Printable;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
@author sgc
@version 2020年9月3日 下午4:17:17
@Description 实现精确通知
A执行完调用B B执行完调用C
 **/
public class PAndC02 {
	public static void main(String[] args) {
		Data3 data3 = new Data3();
		new Thread(()->{
			for (int i = 0; i < 5; i++) {
				try {
					data3.printA();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			},"A").start();
		new Thread(()->{for (int i = 0; i < 5; i++) {
			try {
				data3.printB();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}},"B").start();
		new Thread(()->{for (int i = 0; i < 5; i++) {
			try {
				data3.printC();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}},"C").start();
	}
}

class Data3{
	private Lock lock = new ReentrantLock();
	private Condition condition1 = lock.newCondition();
	private Condition condition2 = lock.newCondition();
	private Condition condition3 = lock.newCondition();
	private int num = 1;//1A 2B 3C
	
	public void printA() throws InterruptedException {
		lock.lock();
		try {
			while (num!=1) {
				condition1.await();
			}
			num = 2;
			System.out.println(Thread.currentThread().getName()+"->"+num);
			condition2.signal();
		} finally {
			lock.unlock();
		}
	}
	
	public void printB() throws InterruptedException {

		lock.lock();
		try {
			while (num!=2) {
				condition2.await();
			}
			num = 3;
			System.out.println(Thread.currentThread().getName()+"->"+num);
			condition3.signal();
		} finally {
			lock.unlock();
		}
	
	}
	
	public void printC() throws InterruptedException {

		lock.lock();
		try {
			while (num!=3) {
				condition3.await();
			}
			num = 1;
			System.out.println(Thread.currentThread().getName()+"->"+num);
			condition1.signal();
		} finally {
			lock.unlock();
		}
	
	}
}