package question.char21;

import java.util.concurrent.TimeUnit;

/**
@author sgc
@version 2020年9月2日 下午5:38:39
@Description 写个无限创建线程，产生oom，并分析
 **/
public class Question4 {
	public static void main(String[] args) {
		while (true) {
			new Thread(()->{
				try {
					TimeUnit.HOURS.sleep(1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
			}).start();
		}
	}
}
