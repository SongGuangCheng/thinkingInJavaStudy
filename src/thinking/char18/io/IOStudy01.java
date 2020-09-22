package thinking.char18.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
@author sgc
@version 2020年8月22日 下午2:06:12
@Description read一个一个读取
 **/
public class IOStudy01 {
	public static void main(String[] args) {
		//1、创建源
		File file = new File("IOTest");
		//2、选择流
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			//3、操作——读取
			int temp;
			while((temp=is.read())!=-1){
				System.out.print((char)temp);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//4.释放资源
		try {
			if(is!=null){
				is.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
