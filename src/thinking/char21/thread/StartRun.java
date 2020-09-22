package thinking.char21.thread;
/**
@author sgc
@version 2020年8月26日 下午2:12:59
@Description 创建线程的两种方式 第二种
1、继承thread类 重写run方法
2、实现runnable接口 实现run方法  推荐 避免单继承局限性 方便共享资源	
	使用的时候需要创建 Thread对象(Runnable对象).start();
 **/
public class StartRun implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("一边听歌");
		}
	}
	
	public static void main(String[] args) {
		//创建实现类对象
		//StartRun st = new StartRun();
		//创建Thread代理类对象 将st丢进去
		//Thread t = new Thread(st);
		//t.start();//不保证立即执行
		//合并以上三步骤
		new Thread(new StartRun()).start();
		for (int i = 0; i < 20; i++) {
			System.out.println("一边coding");
		}
	}
}
