package thinking.char21.state;
/**
@author sgc
@version 2020年8月26日 下午5:45:40
@Description 守护线程 jvm不需要等到守护线程执行结束

 **/
public class DaemonTest01 {
	public static void main(String[] args) {
		God god = new God();
		You you = new You();
		Thread godThread = new Thread(god);
		Thread youThread = new Thread(you);
		//将用户线程设置守护线程
		godThread.setDaemon(true);
		
		godThread.start();
		youThread.start();
	}
}

class God implements Runnable{

	@Override
	public void run() {
		while (true) {
		System.out.println("god bless you");
		}
	}
	
}


class You implements Runnable{

	@Override
	public void run() {
		for (int i = 0;i<100;i++) {
		System.out.println("live is short"+i);
		}
	}	
}