package thinking.char21.syn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.plaf.SliderUI;

/**
@author sgc
@version 2020年8月27日 上午9:59:45
@Description 线程安全的容器内部实现了加锁  CopyOnWriteArrayList 操作容器
 **/
public class UnSafeTest03 {
		public static void main(String[] args) throws InterruptedException {
			CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
			for (int i = 0; i < 10; i++) {
				new Thread(()->{
					list.add(Thread.currentThread().getName());//执行完释放lock锁 下一个进程开始执行
					System.out.println(list);
				},String.valueOf(i)).start();
			}
		}	
}
