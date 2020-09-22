package thinking.char21.syn;



/**
@author sgc
@version 2020年8月27日 上午9:25:40
@Description 线程安全：在并发时保证数据的准确性。效率尽可能的高
synchronize关键字
1、同步方法
2、同步块
 **/
public class SynTest01 {
	public static void main(String[] args) {
		//一份资源
		SafeWeb12306 w = new SafeWeb12306();
		//多个代理
		new Thread(w,"码畜").start();
		new Thread(w,"码农").start();
		new Thread(w,"程序员").start();
	}
}

class SafeWeb12306 implements Runnable{
	private int ticketNums = 10;
	private boolean flag = true;
	@Override
	public void run() {
		while (true) {
			test01();
		}
	}

	//同步方法 锁的是对象的资源
	public synchronized void test01() {

		if(ticketNums<=0){
			flag = false;
			return ;
		}
		try {
			Thread.sleep(200);//模拟延迟200ms
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
	
	}
}