package question.lastweek;
/**
@author sgc
@version 2020年9月4日 下午4:07:15
@Description volatile是线程不安全的
 **/
public class Question02 {
	public static volatile int num = 0;
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				for (int j = 0; j < 100; j++) {
					num++;
				}
			}).start();
		}
		Thread.sleep(5000);
		System.out.println(num);
	}
}
