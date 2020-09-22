package thinking.char21.state;
/**
@author sgc
@version 2020年8月26日 下午5:03:43
@Description 
 **/
public class YieldDemo02 {
	public static void main(String[] args) {
		new Thread(()->{
			for (int i = 0; i < 100; i++) {
				System.out.println("lambda---"+i);
			}
		}
	).start();
		
		
	for (int i = 0; i < 100; i++) {
		if(i%20==0){
			Thread.yield();//main线程礼让
		}
		System.out.println("main---"+i);
	}
	}
}
