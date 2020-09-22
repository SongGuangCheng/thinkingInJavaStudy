package thinking.char21.state;
/**
@author sgc
@version 2020年8月26日 下午5:14:25
@Description 
join合并线程 插队线程
join是成员方法 需要实例调用
 **/
public class BlockJoin01 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(()->{
			for (int i = 0; i < 100; i++) {
				System.out.println("lambda---"+i);
			}
		}
	);
		thread.start();
		
		
	for (int i = 0; i < 100; i++) {
		if(i==30){
			thread.join();//插队 main被堵塞
		}
		System.out.println("main---"+i);
	}
	}
}
