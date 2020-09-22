package thinking.char21.concurrent;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
@author sgc
@version 2020年9月1日 下午4:44:17
@Description 测试定时任务
 **/
public class TestScheduledThreadPoolExecutor {

	private static class TestTask implements Runnable {
		private String TAG = "";

		public TestTask(String tag) {
			TAG = tag;
		}

		@Override
		public void run() {
			System.out.println(TAG + "\t" + System.currentTimeMillis());
		}
	}

	public static void main(String[] args) {
		ScheduledThreadPoolExecutor mScheduledThreadPoolExecutor 
			= new ScheduledThreadPoolExecutor(2);//核心池大小corePoolSize：表示线程池维护线程的最少数量
			//这个参数2就是核心线程池的数量

		int time = 3; // 延迟3秒执行

		TestTask zhang = new TestTask("zhang");
		TestTask phil = new TestTask("phil");


		mScheduledThreadPoolExecutor.schedule(zhang, time, TimeUnit.SECONDS);

		// 再上一个任务的3秒后执行
		mScheduledThreadPoolExecutor.schedule(phil, time * 2, TimeUnit.SECONDS);

	}
}
