package thinking.char21.test;

import java.lang.Thread.State;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
@author sgc
@version 2020年8月31日 下午9:51:31
@Description volatile不保证原子性
使用AtomicInteger原子类 保证原子性
这些类的底层都和操作系统有关
 **/
public class VolatileTest02 {
	//private static volatile int num = 0;
	private volatile static AtomicInteger num = new AtomicInteger();//默认为0
	
	public static void  add() {
		//num++;//不是最小执行单位 反编译可以看出 执行了多步操作
		num.getAndIncrement();//+1 CAS 效率很高
		
	}
	
	public static void main(String[] args) {
		//理论上应该为2万
		for (int i = 0; i < 20; i++) {
			new Thread(()->{
				for (int j = 0; j < 1000; j++) {
					add();
				}
			}).start();
		}
		
		while (Thread.activeCount()>2) {//jvm默认两个线程 main 和 gc
			Thread.yield();//保证上面线程执行完
		}
		System.out.println(num);

		
	}
}

