package thinking.char21.state;
/**
@author sgc
@version 2020年8月26日 下午4:23:04
@Description 
终止线程
1.线程正常执行完毕--》次数限制
2.外部干涉--》 加入标识 ：标志线程体是否可以运行
  
 **/
public class TerminateThread implements Runnable{
	//加入标识 标志线程体是否可以运行
	private boolean flag = true;
	private String name;
	private int i = 0;
	public TerminateThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// 关联标识 true运行 false停止 
		while(flag) {
			System.out.println(name+"-->"+i++);
		}
	}

	//关闭线程
	public void terminate() {
		flag = false;
	}
	
	public static void main(String[] args) {
		TerminateThread tt = new TerminateThread("C罗");
		Thread thread = new Thread(tt);
		thread.start();
		for (int i = 0; i < 100; i++) {
			if(i==88){
				tt.terminate();
				System.out.println("线程终止");
			}
			System.out.println("main-->"+i);
		}
	}
}
