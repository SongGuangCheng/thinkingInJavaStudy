package question.char21;


/**
@author sgc
@version 2020年9月2日 下午5:38:31
@Description 手动构造一个死锁，并分析
死锁：过多的同步可能会导致相互不释放资源
从而相互等待 一般发生于同步中持有多个对象的锁
避免：不要在同一个代码中持有多的对象的锁 （不要锁套锁）
 **/
public class Question3 {
	public static void main(String[] args) {
		Markup markup1 = new Markup(1, "大丫");
		Markup markup2 = new Markup(2, "小丫");
		markup1.start();
		markup2.start();
	}
}

//口红
class Lipstack{
	
}

//镜子
class Mirror{
	
}

//化妆
class Markup extends Thread{
	int chose;
	String name;
	
	static Lipstack lipstack = new Lipstack();
	static Mirror mirror = new Mirror();
	
	
	
	public Markup(int chose, String name) {
		super();
		this.chose = chose;
		this.name = name;
	}

	@Override
	public void run() {
		markup();
	}
	
	public void markup() {
		if (chose == 1) {
			synchronized (lipstack) {
				System.out.println(this.name+"涂口红");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (mirror) {
					System.out.println(this.name+"照镜子");
				}
			}
/*			synchronized (mirror) {
				System.out.println(this.name+"照镜子");
			}*/
		}else if (chose == 2) {
				synchronized (mirror) {
					System.out.println(this.name+"照镜子");
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (lipstack) {
						System.out.println(this.name+"涂口红");
					}
				}
/*				synchronized (lipstack) {
					System.out.println(this.name+"涂口红");
				}*/
			}
		
	}
}
