package thinking.char21.syn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
@author sgc
@version 2020年8月31日 下午8:47:56
@Description 线程安全的list
 **/
public class CopyOnWriteArrayListTest {
	public static void main(String[] args) throws InterruptedException {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		for (int i = 0; i < 10000; i++) {
			new Thread(()->{
					list.add(Thread.currentThread().getName());
			}).start();
		}
		//多线程会与main方法同时执行
		//应延缓输出时间 等上面执行完 在输出
		Thread.sleep(5000);
		System.out.println(list.size());
	}
}
