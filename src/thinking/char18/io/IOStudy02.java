package thinking.char18.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
@author sgc
@version 2020年8月22日 下午2:32:56
@Description read(byte[])按字节数组读取读取
 **/
public class IOStudy02 {
	public static void main(String[] args) {
		File file = new File("IOTest");
		InputStream is = null;
		try {
			is = new FileInputStream(file);
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
