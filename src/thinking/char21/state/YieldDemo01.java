package thinking.char21.state;
/**
@author sgc
@version 2020年8月26日 下午4:58:20
@Description 
Yield礼让 ： 重回就绪状态 等待调用 与其他线程同时等待调用
 **/
public class YieldDemo01 {
	public static void main(String[] args) {
		MyYield a = new MyYield();
		MyYield b = new MyYield();
		new Thread(a,"A--").start();
		new Thread(b,"B--").start();
	}
}

class MyYield implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"start");
		Thread.yield();//礼让 回到就绪状态
		System.out.println(Thread.currentThread().getName()+"end");
	}
		
}