package thinking.char21.syn;

import java.util.ArrayList;
import java.util.List;

/**
@author sgc
@version 2020年8月27日 上午9:59:45
@Description 线程安全 锁容器对象
 **/
public class SynBlockTest02 {
		public static void main(String[] args) throws InterruptedException {
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < 10; i++) {
				new Thread(()->{
					synchronized (list) {
						list.add(Thread.currentThread().getName());
						System.out.println(list);
					}
			},String.valueOf(i)).start();
			}		
			//多线程会与main方法同时执行
			//应延缓输出时间 等上面执行完 在输出
			//Thread.sleep(5000);
			//System.out.println(list.size());
	}
}
