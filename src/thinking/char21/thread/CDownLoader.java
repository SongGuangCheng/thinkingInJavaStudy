package thinking.char21.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
@author sgc
@version 2020年8月26日 下午2:34:53
@Description 创建线程第三种方式 实现callable接口 
实现call方法 call方法可以有返回值 可以抛出异常 而run方法不可以
 **/
public class CDownLoader implements Callable<String>{
	private String url;//远程路径
	private String name;//存储名字
	
	public CDownLoader(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		WebDownLoader wd = new WebDownLoader();
		wd.download(url, name);
		System.out.println(name);
		return "call方法 可以有返回值 可以抛出异常";
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CDownLoader cd1 = new CDownLoader("https://t9.baidu.com/it/u=583874135,70653437&fm=79&app=86&size=h300&n=0&g=4n&f=jpeg?sec=1599029236&t=54fa6721b722c18c48700418f7734475","p1.jpg");
		CDownLoader cd2 = new CDownLoader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598434516945&di=00a5ea916608e96f54cae8ee9155eef3&imgtype=0&src=http%3A%2F%2Ft9.baidu.com%2Fit%2Fu%3D1307125826%2C3433407105%26fm%3D79%26app%3D86%26f%3DJPEG%3Fw%3D5760%26h%3D3240","p2.jpg");
		CDownLoader cd3 = new CDownLoader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598434516945&di=e4f92c1f75e9c99940fde5f3b8d27308&imgtype=0&src=http%3A%2F%2Ft9.baidu.com%2Fit%2Fu%3D4169540006%2C4220376401%26fm%3D79%26app%3D86%26f%3DJPEG%3Fw%3D1000%26h%3D1500","p3.jpg");
		//创建执行服务
		ExecutorService ser = Executors.newFixedThreadPool(3);
		//提交执行
		Future<String> result1 = ser.submit(cd1);
		Future<String> result2 = ser.submit(cd2);
		Future<String> result3 = ser.submit(cd3);
		//获取结果
		String s1 = result1.get();
		String s2 = result2.get();
		String s3 = result3.get();
		System.out.println(s1);
		//关闭服务
		ser.shutdownNow();
	}



}
