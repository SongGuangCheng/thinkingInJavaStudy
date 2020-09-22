package thinking.char18.file;

import java.io.File;

/**
@author sgc
@version 2020年8月24日 下午5:43:33
@Description 
 **/
public class MyTest {
	public static void main(String[] args) {
		File file = new File("D:/filedemo");
		File[] files = file.listFiles();
		String[] strings  = file.list();
		for (File f : files) {
			System.out.println(f);
		}
		System.out.println("---------------------------");
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
