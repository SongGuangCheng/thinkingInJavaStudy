package thinking.char21.syn;

import java.util.ArrayList;
import java.util.List;

/**
@author sgc
@version 2020年8月27日 上午9:59:45
@Description 线程不安全 操作容器
 **/
public class SynContainer {
		public static void main(String[] args) throws InterruptedException {
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < 10; i++) {
				new Thread(()->{
					list.add(Thread.currentThread().getName());

					System.out.println(list);
				},String.valueOf(i)).start();
			}

		}
}
