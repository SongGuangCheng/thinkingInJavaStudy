package thinking.char21.syn;
/**
@author sgc
@version 2020年8月27日 上午10:29:08
@Description 
 **/
public class Account extends Thread{
		String name;
		int money;
		
		public Account(String name, int money) {
			super();
			this.name = name;
			this.money = money;
		}
}
