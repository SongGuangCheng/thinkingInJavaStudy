package thinking.char21.test;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
@author sgc
@version 2020年9月1日 下午2:51:13
@Description 测试打断正常运行 interrupt 
此时会将打断标志设为true 但是不会影响线程的正常运行
是否需要中断需要自己决定
 **/
public class TestInterrupt01 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			while (true) {
				boolean interrupt = Thread.currentThread().isInterrupted();
				if (interrupt) {
					System.out.println(Thread.currentThread().getName()+"被打断，退出循环");
					break;
				}
			}
		},"t1");
		t1.start();
		
		Thread.sleep(1000);
		
		System.out.println("interrupt...");
		t1.interrupt();
		System.out.println("打断标记--》"+t1.isInterrupted());
	}
}
