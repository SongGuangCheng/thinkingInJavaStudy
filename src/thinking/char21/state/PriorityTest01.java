package thinking.char21.state;
/**
@author sgc
@version 2020年8月26日 下午5:30:26
@Description 
优先级 1-10  优先级只是调用的概率

1.MAX_PRIORITY 10
2.MIN_PRIORITY 1
3.NORM_PRIORITY 5 默认
 **/
public class PriorityTest01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		MyPriority myPriorityp = new MyPriority();
		Thread thread1 = new Thread(myPriorityp,"t1");
		Thread thread2 = new Thread(myPriorityp,"t2");
		Thread thread3 = new Thread(myPriorityp,"t3");
		Thread thread4 = new Thread(myPriorityp,"t4");
		Thread thread5 = new Thread(myPriorityp,"t5");
		Thread thread6 = new Thread(myPriorityp,"t6");
		//设置优先级 设置要在启动前
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(2);
		thread4.setPriority(Thread.MIN_PRIORITY);
		thread5.setPriority(3);
		thread6.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
	}
}

class MyPriority implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
		Thread.yield();
	}
	
}