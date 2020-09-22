package thinking.char21.thread;
/**
@author sgc
@version 2020年8月26日 下午2:34:53
@Description 
 **/
public class TDownLoader extends Thread{
	private String url;//远程路径
	private String name;//存储名字
	
	public TDownLoader(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	
	@Override
	public void run() {
		// 线程体
		super.run();
		WebDownLoader wd = new WebDownLoader();
		wd.download(url, name);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		TDownLoader td1 = new TDownLoader("https://t9.baidu.com/it/u=583874135,70653437&fm=79&app=86&size=h300&n=0&g=4n&f=jpeg?sec=1599029236&t=54fa6721b722c18c48700418f7734475","p1.jpg");
		TDownLoader td2 = new TDownLoader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598434516945&di=00a5ea916608e96f54cae8ee9155eef3&imgtype=0&src=http%3A%2F%2Ft9.baidu.com%2Fit%2Fu%3D1307125826%2C3433407105%26fm%3D79%26app%3D86%26f%3DJPEG%3Fw%3D5760%26h%3D3240","p2.jpg");
		TDownLoader td3 = new TDownLoader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598434516945&di=e4f92c1f75e9c99940fde5f3b8d27308&imgtype=0&src=http%3A%2F%2Ft9.baidu.com%2Fit%2Fu%3D4169540006%2C4220376401%26fm%3D79%26app%3D86%26f%3DJPEG%3Fw%3D1000%26h%3D1500","p3.jpg");
		//启动三个线程
		td1.start();
		td2.start();
		td3.start();
	}
}
