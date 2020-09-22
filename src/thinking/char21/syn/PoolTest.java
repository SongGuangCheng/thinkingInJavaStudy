package thinking.char21.syn;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
@author sgc
@version 2020年8月31日 下午8:36:28
@Description 线程池
 **/
public class PoolTest {
	public static void main(String[] args) throws Exception {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		ICallable task = new ICallable();
		//执行提交
		//pool.execute(runnable);
		Future<String> r1 = pool.submit(task);
		Future<String> r2 = pool.submit(task);
		Future<String> r3 = pool.submit(task);
		//获取返回值
		String s1 = r1.get();
		String s2 = r2.get();
		String s3 = r3.get();
		//输出
		System.out.println(s1);
		//关闭线程池
		pool.shutdown();
	}
}

class ICallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("执行了callable");
		return "callable返回值";
	}
	
}