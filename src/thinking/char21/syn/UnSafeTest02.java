package thinking.char21.syn;
/**
@author sgc
@version 2020年8月27日 上午9:39:56
@Description 线程不安全：账户余额为0 仍可取款
 **/
public class UnSafeTest02 {
	public static void main(String[] args) {
		Account account = new Account("马云的账户", 100);
		DrawingMoney dw1 = new DrawingMoney("A", account, 80);
		DrawingMoney dw2 = new DrawingMoney("B", account, 90);
		dw1.start();
		dw2 .start();
	}
}



//模拟取款
class DrawingMoney extends Thread{
	Account account;
	int drawingMoney;
	int packetMoney;//口袋中的钱
	
	public DrawingMoney(String name,Account account, int drawingMoney) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}

	@Override
	public void run() {
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