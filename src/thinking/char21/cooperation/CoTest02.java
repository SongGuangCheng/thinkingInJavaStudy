package thinking.char21.cooperation;
/**
@author sgc
@version 2020年8月30日 下午3:36:26
@Description 
协作模型：生产者消费者实现方式二：信号灯法
借助标志位
 **/
public class CoTest02 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		new Player(tv).start();
		new Watcher(tv).start();
	}
}
//生产者 演员
class Player extends Thread{
	Tv tv;
	
	public Player(Tv tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if(i%2 == 0){
				tv.play("奇葩说");
			}else {
				tv.play("百家讲坛");
			}
		}
	}
}
//消费者 观众
class Watcher extends Thread{
	Tv tv;
	
	public Watcher(Tv tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			tv.watch();
		}
	}
}
//同一个资源 电视
class Tv{
	String voice;
	//信号灯
	//T表示演员表演 观众等待
	//F表示观众观看 演员等待
	boolean flag = true;
	//表演
	public synchronized void play(String voice) {
		//演员等待
		if (!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("表演了："+voice);	
		this.voice = voice;
		//唤醒
		this.notifyAll();
		//切换标志
		this.flag = !this.flag;
	}
	//观看
	public synchronized void watch() {
		//观众等待
		if (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("听到了："+voice);
		//唤醒
				this.notifyAll();
				//切换标志
				this.flag = !this.flag;
	}
}