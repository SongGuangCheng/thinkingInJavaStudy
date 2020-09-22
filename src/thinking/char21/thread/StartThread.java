package thinking.char21.thread;
/**
@author sgc
@version 2020年8月26日 下午2:12:59
@Description 创建线程的两种方式 第一种
1、继承thread类 重写run方法
2、实现runnable接口 实现run方法
 **/
public class StartThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("一边听歌");
		}
	}
	
	public static void main(String[] args) {
		//创建子类对象
		StartThread st = new StartThread();
		//调用start方法 将run方法交由cpu去调度 相当于两条路同时走 
		//一边执行run方法 一遍继续执行main中的方法 不受程序员控制
		st.start();//不保证立即执行
		//如果直接调用run方法那么相当于普通方法调用 会以单线程的形式执行
		//先执行完run方法 再开始执行main中后年的呢方法
		st.run();
		for (int i = 0; i < 20; i++) {
			System.out.println("一边coding");
		}
	}
}
