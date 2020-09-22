package thinking.char18.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
@author sgc
@version 2020年8月24日 上午9:18:09
@Description 字节输入缓冲流
 **/
public class IOStudy09_BufferedIS {
	public static void main(String[] args) {
		File file = new File("IOTest");
		InputStream is = null;
		try {
			is = new BufferedInputStream(new FileInputStream(file));
			byte[] flush = new byte[1024];//缓存容器
			int len = -1;
			while((len=is.read(flush))!=-1){
				//字节数组==》字符串（解码）
				String string = new String(flush,0,len);
				System.out.println(string);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			if (null!=file) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
