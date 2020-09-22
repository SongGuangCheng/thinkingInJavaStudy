package thinking.char21.syn;

import java.util.concurrent.locks.ReentrantLock;

/**
@author sgc
@version 2020年8月31日 下午8:23:02
@Description 测试lock锁
 **/
public class LockTest01 {
	public static void main(String[] args) {
		TestLock testLock = new TestLock();
		new Thread(testLock).start();
		new Thread(testLock).start();
		new Thread(testLock).start();
		
	}
}

class TestLock implements Runnable{
	int ticketnum = 10;
	private final ReentrantLock lock = new ReentrantLock();
	
	@Override
	public void run() {
		try {
			lock.lock();
			while (true) {
				if (ticketnum>0) {
					System.out.println(ticketnum--);
				}else {
					break;
				}
			}
		}finally{
			lock.unlock();
		}
		
	
	}
	
}