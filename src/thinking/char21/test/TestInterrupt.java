package thinking.char21.test;
import java.util.concurrent.TimeUnit;

/**
@author sgc
@version 2020年9月1日 下午2:51:13
@Description 测试打断阻塞 interrupt sleep
sleep join被打断后会自动的将打断标记设为假
对于未阻塞的线程，interrupt()只是造成[中断标志位]=true，线程本身运行状态不受影响。
对于阻塞的线程，interrupt()会中断阻塞状态，使其转换成非阻塞状态，并清除[中断标志位]，线程本身还在继续运行。

当线程正在sleep方法处休眠阻塞，调用它的Thread对象的interrupt方法，
代码将会抛出InterruptedException异常，进入InterruptedException代码块中执行。

 **/
public class TestInterrupt {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			System.out.println("sleep...");		
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("中断sleep");
			}
		},"t1");
		t1.start();
		
		Thread.sleep(1000);
		System.out.println("interrupt...");
		t1.interrupt();
		System.out.println("打断标记--》"+t1.isInterrupted());
	}
}
