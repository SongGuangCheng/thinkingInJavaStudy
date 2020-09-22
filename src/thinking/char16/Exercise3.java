package thinking.char16;

import java.util.Arrays;
import java.util.Random;

/**
@author sgc
@version 2020年8月17日 上午10:38:29
@Description 
 **/
public class Exercise3 {
	public int[][] getArray(int a,int b,int c,int d) {
		Random random = new Random();
		int[][] arr = new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				arr[i][j] = random.nextInt(d-c)+c;
			}
		}
		return arr;
	}
	
	public void print(int[][] arr) {
		System.out.println(Arrays.deepToString(arr));
	}
	
	public static void main(String[] args) {
		Exercise3 exercise3 = new Exercise3();
		int arr[][] = exercise3.getArray(2, 3, 10, 20);
		exercise3.print(arr);
	}
}
