package thinking.char16;

import java.util.Arrays;




/**
@author sgc
@version 2020年8月17日 下午3:07:29
@Description 
 **/	
public class Exercise12 {
	public static void main(String[] args) {
		double[] d = new double[5];
		
		CountingGenerator generator = new CountingGenerator();
		thinking.char16.CountingGenerator.Double d1 = generator.new Double();
		for (int i = 0; i < d.length; i++) {
			d[i] = d1.next();
		}
		System.out.println(Arrays.toString(d));
	}
}

class CountingGenerator{
	public  class Double implements Generator<java.lang.Double>
	{
		private double value = 0.0;
		public java.lang.Double next() {
			double result = value;
			value += 1.0;
			return result;
		}
	}
	static char[] chars = ("abcdefghigklmnopqrstuvwxyz"+"abcdefghigklmnopqrstuvwxyz".toUpperCase()).toCharArray();
	public  class Character implements Generator<java.lang.Character>
	{
		int index = -1;
		public java.lang.Character next() {
			index = (index + 1) % chars.length;
			return chars[index];
		}
	}
}

interface Generator<T>{
	T next();
}