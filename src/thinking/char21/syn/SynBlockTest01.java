package thinking.char21.syn;
/**
@author sgc
@version 2020年8月27日 上午9:39:56
@Description 线程安全：锁同步块
 **/
public class SynBlockTest01 {
	public static void main(String[] args) {
		Account account = new Account("马云的账户", 100);
		SynDrawing dw1 = new SynDrawing("A", account, 80);
		SynDrawing dw2 = new SynDrawing("B", account, 90);
		dw1.start();
		dw2 .start();
	}
}



//模拟取款
class SynDrawing extends Thread{
	Account account;
	int drawingMoney;
	int packetMoney;//口袋中的钱
	
	public SynDrawing(String name,Account account, int drawingMoney) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}

	@Override
	public void run() {
		test01();
	}
	
	//目标锁定account对象
	public  void test01() {
		//提高效率 避免继续不满足条件时 还继续等待锁释放  重视这种代码
		if(account.money<=0){
			return;
		}
		//锁同步块
		synchronized(account){//传入要锁的具体目标
			if (account.money-drawingMoney<0) {
				return ;
			} 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.money -= drawingMoney;
			packetMoney += drawingMoney;
			System.out.println(this.getName()+"账户的钱为--->"+account.money);
			System.out.println(this.getName()+"口袋的钱为--->"+packetMoney);
		
		}
	
	}
}