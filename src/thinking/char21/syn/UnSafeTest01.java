package thinking.char21.syn;


/**
@author sgc
@version 2020年8月27日 上午9:25:40
@Description 线程不安全：数据有负数 相同值
 **/
public class UnSafeTest01 {
	public static void main(String[] args) {
		//一份资源
		UnSafeWeb12306 w = new UnSafeWeb12306();
		//多个代理
		new Thread(w,"码畜").start();
		new Thread(w,"码农").start();
		new Thread(w,"程序员").start();
	}
}

class UnSafeWeb12306 implements Runnable{
	private int ticketNums = 10;
	private boolean flag = true;
	@Override
	public void run() {
		while (true) {
			test01();
		}
	}

	public void test01() {

		if(ticketNums<0){
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