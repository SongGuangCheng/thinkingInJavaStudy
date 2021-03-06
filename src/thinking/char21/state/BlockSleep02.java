package thinking.char21.state;





/**
@author sgc
@version 2020年8月26日 下午4:38:11
@Description sleep模拟休息
 **/
public class BlockSleep02 {
	
	public static void main(String[] args) {
		Racer racer = new Racer();
		new Thread(racer,"tortoise").start();
		new Thread(racer,"rabbit").start();
	}
}

class Racer implements Runnable{
	private String winner;

	@Override
	public void run() {
		for (int step = 0; step <= 100; step++) {
			//模拟睡觉
			if("rabbit".equals(Thread.currentThread().getName())&&step%10==0){
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"-->"+step);
			//比赛是否结束
			boolean flag = gameOver(step);
			if (flag) {
				break;
			}
		}
	}
	
	public boolean gameOver(int step) {
		if(winner!=null){
			return true;
		}else {
			if(step == 100){
				winner = Thread.currentThread().getName();
				System.out.println("winner is "+winner);
				return true;
			}
		}
		return false;
	}

}
