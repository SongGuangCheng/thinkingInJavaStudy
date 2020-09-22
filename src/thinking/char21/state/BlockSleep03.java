package thinking.char21.state;

import java.text.SimpleDateFormat;
import java.util.Date;





/**
@author sgc
@version 2020年8月26日 下午4:38:11
@Description sleep模拟倒计时
 **/
public class BlockSleep03 {
	
	public static void main(String[] args) throws InterruptedException {
		//倒计时
		Date endDate = new Date(System.currentTimeMillis()+10000);
		Long end = endDate.getTime();
		while (true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(endDate));
			Thread.sleep(1000);
			endDate = new Date(endDate.getTime()-1000);
			if(end-10000>endDate.getTime()){
				break;
			}
		}
	}
}


