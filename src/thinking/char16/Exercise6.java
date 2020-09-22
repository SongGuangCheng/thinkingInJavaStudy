package thinking.char16;

import java.util.Arrays;
import java.util.Random;

/**
@author sgc
@version 2020年8月17日 上午11:12:31
@Description 
 **/
public class Exercise6 {
	public BerylliumSphere[][] getArray(int a,int b) {
		Random random = new Random();
		BerylliumSphere[][] arr = new BerylliumSphere[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				arr[i][j] = new BerylliumSphere();
			}
		}
		return arr;
	}
	
	public void print(BerylliumSphere[][] arr) {
		System.out.println(Arrays.deepToString(arr));
	}
	
	public static void main(String[] args) {
		Exercise6 exercise6 = new Exercise6();
		BerylliumSphere arr[][] = exercise6.getArray(2, 2);
		exercise6.print(arr);
	}
}
