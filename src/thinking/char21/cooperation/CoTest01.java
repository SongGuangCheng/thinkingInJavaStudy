package thinking.char21.cooperation;
/**
@author sgc
@version 2020年8月30日 下午2:45:29
@Description 
协作模型：生产者消费者实现方式一：管程法
借助缓冲区
**/
public class CoTest01 {
	public static void main(String[] args) {
		SynContainer container = new SynContainer();
		new Productor(container).start();
		new Counsumer(container).start();
	}
}

//生产者
class Productor extends Thread{
	SynContainer container;
	
	public Productor(SynContainer container) {
		this.container = container;
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("生产第"+i+"个馒头");
			container.push(new Steamedbun(i));
		}
	}
}

//消费者
class Counsumer extends Thread{
	SynContainer container;
	
	public Counsumer(SynContainer container) {
		this.container = container;
	}
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("消费第"+container.pop().id+"个馒头");
		}
	}
}

//缓冲区
class SynContainer{
	Steamedbun[] buns = new Steamedbun[10];//缓存容器
	int count = 0;//计数器
	//存储 生产
	public synchronized void push(Steamedbun bun) {
		//何时生产 	容器中是否存在空间
		//没有空间 只能等待
		if (count == buns.length) {
			try {
				this.wait();//线程阻塞 消费者通知生产 解除阻塞
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//存在空间 可以生产
		buns[count] = bun;
		count++;
		//通知消费者存在数据 可以消费
		this.notifyAll();
	}
	//获取 消费
	public synchronized Steamedbun pop() {
		//何时消费 	容器中是否存在数据
		//没有数据 只有等待
		if (count == 0) {
			try {
				this.wait();//线程阻塞 生产者通知消费 解除阻塞
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//存在数据 可以消费
		count--;
		Steamedbun bun = buns[count];
		//通知生产者存在空间可以生产
		this.notifyAll();
		return bun;
	}
	
}

//馒头---数据
class Steamedbun{
	int id;

	public Steamedbun(int id) {
		super();
		this.id = id;
	}
	
}