package thinking.char21.test;

import java.lang.Thread.State;
import java.util.concurrent.TimeUnit;

/**
@author sgc
@version 2020年8月31日 下午9:51:31
@Description volatile保证可见性 不保证原子性
线程自己存在工作空间 在操作num时会将其复制到自己的工作空间中
因为一直循环 所以不知道外部对num进行了修改
对变量添加volatile 可以保证可见性
 **/
public class VolatileTest01 {
	private static volatile int num = 0;
	public static void main(String[] args) {
			new Thread(()->{
				while (num == 0) {		}
				//一直执行
			}).start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		num = 1;
		System.out.println(num);//输出后因该停止运行
	}
}

