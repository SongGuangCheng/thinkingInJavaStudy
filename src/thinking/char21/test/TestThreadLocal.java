package thinking.char21.test;
/**
@author sgc
@version 2020年9月3日 下午8:19:34
@Description 
 **/
public class TestThreadLocal {
	public static void main(String[] args) {
		AAA a = new AAA();
		//sBBB a = new BBB();
		for (int i = 0; i < 5; i++) {
			new Thread(()->{
				a.setS(Thread.currentThread().getName()+"的数据");
				System.out.println(Thread.currentThread().getName()+"得到了"+a.getS());
			}).start();
		}
	}
}

//线程不隔离的话 线程之间会互相干扰 如A线程得到B线程的变量
class AAA{
	private String s ;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}

//使用ThreadLocal类 绑定变量之后只能拿到绑定的变量 
class BBB{
	ThreadLocal<String> tl = new ThreadLocal<String>();
	private String s ; 

	public String getS() {
		return tl.get();
	}

	public void setS(String s) {
		tl.set(s);;
	}
	
}