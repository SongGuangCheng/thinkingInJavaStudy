package thinking.char16;

import java.util.Arrays;

/**
@author sgc
@version 2020年8月20日 上午11:10:09
@Description 
 **/
public class MyTest implements Comparable<Integer>{
	public static void main(String[] args) {
		   int a[][]=new int[][] {{0},{1,2,3,5,4}};
		    
		   int b[][]=new int[][] {{0},{1,2,3,5,4}};
		    
		   int c[]=new int[] {1,2,3,5,4};
		    
		   int d[]=new int[] {1,2,3,5,4};
		   System.out.println(Arrays.deepEquals(a,b));
		   System.out.println(Arrays.equals(c,d));
			/*int[] a = {1,2,4,5,6};
			int[] a1 = {1,2,4};
			int[] b = {4,4,7};
			Arrays.copyOf(a, 3);
			System.out.println(Arrays.toString(a));
			System.arraycopy(a, 0, b, 1, 1);
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.equals(a, a1));*/
			
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
