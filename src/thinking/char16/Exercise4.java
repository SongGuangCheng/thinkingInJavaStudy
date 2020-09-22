package thinking.char16;

import java.util.Arrays;
import java.util.Random;

/**
@author sgc
@version 2020年8月17日 上午11:01:11
@Description 
 **/
public class Exercise4 {
	public int[][][] getArray(int x,int y,int z,int c,int d) {
		Random random = new Random();
		int[][][] arr = new int[x][y][z];
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				for (int k = 0; k < arr.length; k++) {
					arr[i][j][k] = random.nextInt(d-c)+c;
					
				}
				
			}
		}
		return arr;
	}
	
	public void print(int[][][] arr) {
		System.out.println(Arrays.deepToString(arr));
	}
	
	public static void main(String[] args) {
		Exercise4 exercise4 = new Exercise4();
		int arr[][][] = exercise4.getArray(2, 3, 4, 10, 20);
		exercise4.print(arr);
	}
}

