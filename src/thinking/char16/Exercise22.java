package thinking.char16;

import java.util.Arrays;

/**
@author sgc
@version 2020年8月17日 下午5:51:36
@Description 
 **/
public class Exercise22 {
	public static void main(String[] args) {
		int[] a = {23,4,14,64,8};
		Arrays.sort(a);
	     for(int i = 0; i < a.length; i ++) {
              System.out.print(a[i] + " ");
         }
		int index = Arrays.binarySearch(a,23);
		System.out.println(index);
	}
}
