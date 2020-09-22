package thinking.char21.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
@author sgc
@version 2020年9月4日 下午1:47:17
@Description 
 **/
public class TestAtomic {
	public static void main(String[] args) {
		AtomicInteger aInteger = new AtomicInteger(88);
		System.out.println(aInteger);
		//期望 更新
		aInteger.compareAndSet(88, 66);
		System.out.println(aInteger);
	}
}
