package thinking.char21.test;

import java.util.concurrent.TimeUnit;

/**
@author sgc
@version 2020年9月1日 上午11:05:38
@Description 
 **/
public class TestSynchronize {
	public static void main(String[] args) {
		Syn syn = new Syn();
		Syn syn1 = new Syn();
		new Thread(()->{
			syn.f1();
		}).start();
		
		new Thread(()->{
			syn1.f2();
		}).start();
	}

}

class Syn{
	public static synchronized void f1() {
		System.out.println("1111111111");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1111111111");
	}
	
	public static synchronized void f2() {
		System.out.println("2222222222");
	}
}