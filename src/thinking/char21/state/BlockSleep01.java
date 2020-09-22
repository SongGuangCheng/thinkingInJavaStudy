package thinking.char21.state;



/**
@author sgc
@version 2020年8月26日 下午4:38:11
@Description sleep模拟网络延迟 放大发生异常的可能性
 **/
public class BlockSleep01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//一份资源
		Web12306 w = new Web12306();
		//多个代理
		new Thread(w,"码畜").start();
		new Thread(w,"码农").start();
		new Thread(w,"程序员").start();
	}
}


class Web12306 implements Runnable{
	private int ticketNums = 100;
	@Override
	public void run() {
		while (true) {
			if(ticketNums<0){
				break;
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
