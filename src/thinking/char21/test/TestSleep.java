package thinking.char21.test;

import java.util.concurrent.TimeUnit;

/**
@author sgc
@version 2020年9月1日 上午9:52:57
@Description 
 **/
public class TestSleep {
	public static void main(String[] args) {
		A a = new A();
		new Thread(()->{
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a.f1();
		}).start();
		
		new Thread(()->{
			a.f2();
		}).start();
	}
}

class A {

	public synchronized void f1() {
		System.out.println("A--start");
		System.out.println("A--end");
	}
	
	public synchronized void f2() {
		System.out.println("B--start");
		
		System.out.println("B--end");
	}
}
