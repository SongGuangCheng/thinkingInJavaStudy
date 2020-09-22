package thinking.char21.thread;
/**
@author sgc
@version 2020年8月26日 下午4:05:04
@Description lambda 简化线程 前提是线程中只能有一个方法
 **/
public class LambdaThread {
	
	public static void main(String[] args) {
		//省略Runnable以及run方法 会自动推导出来
		new Thread(()-> {
			System.out.println("我是run方法");
			}
		).start();
	}
}
