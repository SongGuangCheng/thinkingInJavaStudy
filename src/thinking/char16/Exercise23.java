package thinking.char16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
@author sgc
@version 2020年8月17日 下午6:14:22
@Description 
 **/
public class Exercise23 {
	public static void main(String[] args) {
		Integer[] integers = {23,4,2,5,12,5,33};
		Arrays.sort(integers,Collections.reverseOrder());
	     for(int i = 0; i < integers.length; i ++) {
             System.out.print(integers[i] + " ");
        }
	}
	

}
