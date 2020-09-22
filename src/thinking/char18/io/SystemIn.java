package thinking.char18.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
@author sgc
@version 2020年8月27日 下午5:14:11
@Description 
 **/
public class SystemIn {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String string;
		while ((string=reader.readLine())!=null&&string.length()!=0) {
			System.out.println(string);
		}
	}
}
