package thinking.char16;

import java.util.Arrays;

/**
@author sgc
@version 2020年8月17日 上午10:19:45
@Description 
 **/
public class Exercise2 {
	public BerylliumSphere[] getBerylliumSphere(int i) {
		BerylliumSphere[] bs = new BerylliumSphere[i];
		for (int j = 0; j < bs.length; j++) {
			bs[j] = new BerylliumSphere();
		}
		System.out.println(Arrays.toString(bs));
		return bs;
	}
	public static void main(String[] args) {
		Exercise2 exercise2 = new Exercise2();
		exercise2.getBerylliumSphere(3);
		
	}
}
