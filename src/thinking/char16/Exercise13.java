package thinking.char16;

import java.util.Arrays;


/**
@author sgc
@version 2020年8月17日 下午3:54:33
@Description 
 **/
public class Exercise13 {
	public static void main(String[] args) {
		String[] strings = new String[7];
		CountingGenerator generator = new CountingGenerator();
		thinking.char16.CountingGenerator.Character c = generator.new Character();
		for (int i = 0; i < strings.length; i++) {
			strings[i] = String.valueOf(c.next());
		}
		System.out.println(Arrays.toString(strings));
	}
	
}
