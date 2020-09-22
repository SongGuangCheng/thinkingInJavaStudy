package thinking.char21.syn;



/**
@author sgc
@version 2020年8月27日 上午9:25:40
@Description 线程安全：在并发时保证数据的准确性。效率尽可能的高
synchronize关键字
1、同步方法
2、同步块
 **/
public class SynBlockTest03 {
	public static void main(String[] args) {
		//一份资源
		SynWeb12306 w = new SynWeb12306();
		//多个代理
		new Thread(w,"码畜").start();
		new Thread(w,"码农").start();
		new Thread(w,"程序员").start();
	}
}

class SynWeb12306 implements Runnable{
	private int ticketNums = 10;
	private boolean flag = true;
	@Override
	public void run() {
		while (true) {
			test05();
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
	
	//同步块 要保证锁的目标不变
		public void test02() {
			synchronized(this){
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
		
		//同步块中要放引用类型 锁ticketNums 锁不住 因为ticketNums一直在变 而锁对象是对象不变 只是属性在变
		public void test03() {
			synchronized((Integer)ticketNums){
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
		
		//同步块 要保证锁合理的范围（不是代码的范围，是数据的合理性） 
		public void test04() {
			synchronized(this){
				if(ticketNums<=0){
					flag = false;
					return ;
				}
			}	
				try {
					Thread.sleep(200);//模拟延迟200ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//没锁下面这一行代码 数据不完整
				System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);	
		}

		//同步块 要保证锁的目标不变
		public void test05() {
			//双重锁定doublecheck 提高效率
			if(ticketNums<=0){//考虑的是没票的情况 此时不用等待下面的锁
				flag = false;
				return ;
			}
			synchronized(this){
				if(ticketNums<=0){//考虑的是最后一张票
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
}