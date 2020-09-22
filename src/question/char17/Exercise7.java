package question.char17;

import java.util.*;

/**
@author sgc
@version 2020年8月19日 下午11:17:59
@Description 多线程访问时，如何保证集合数据的同步
 **/
public class Exercise7 {	
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<String>();
		List<String> syncList =  Collections.synchronizedList(list);
		for (int i = 0; i < 10; i++) {
			new Thread(()->{
				syncList.add(Thread.currentThread().getName());
				System.out.println(syncList);
			},String.valueOf(i)).start();
		}

	}
}
