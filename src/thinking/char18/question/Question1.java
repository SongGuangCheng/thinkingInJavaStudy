package thinking.char18.question;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
@author sgc
@version 2020年9月1日 下午8:41:34
@Description bufferedInputstreamd和fileinputstream设置byte[8kb]为相同大小 速度一样吗
 **/
public class Question1 {
	public static void main(String[] args) {
		Long t1 = System.currentTimeMillis();
		byByte();
		Long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
		
		
		Long t3 = System.currentTimeMillis();
		byBuffered();
		Long t4 = System.currentTimeMillis();
		System.out.println(t4-t3);
	}
	
public static void byByte() {
		File file = new File("D:/GameDownload/LOL_V4.1.6.0_FULL.7z.003");
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			byte[] flush = new byte[2*1024];//缓存容器
			int len = -1;
			while((len=is.read(flush))!=-1){
				//字节数组==》字符串（解码）
				//String string = new String(flush,0,len);
				//System.out.println(string);
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}finally{
			if (null!=file) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

public static void byBuffered() {
		File file = new File("D:/GameDownload/LOL_V4.1.6.0_FULL.7z.003");
		BufferedInputStream is = null;
		try {
			is = new BufferedInputStream(new FileInputStream(file),2*1024);
			
			int len = -1;
			while((len=is.read())!=-1){
				
			};
		} catch (IOException e) {			
			e.printStackTrace();
		}finally{
			if (null!=file) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
