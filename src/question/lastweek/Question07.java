package question.lastweek;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
@author sgc
@version 2020年9月4日 下午4:32:18
@Description 比较效率 复制
 **/
public class Question07 {
	public static void myCopy(String source,String des) {

		//创建源
		File file = new File(source);
		File destFile = new File(des);
		
		try (//选择流 
				InputStream  is = new FileInputStream(file);
				OutputStream os = new FileOutputStream(destFile,true);){
			
			byte[]  b = new byte[1024];
			int len = -1;
			while ((len=is.read(b))!=-1) {
				//二、写入数据	
				os.write(b,0,len);
			}
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//缓冲流
	public static void myBufferedCopy(String source,String des) {

		//创建源
		File file = new File(source);
		File destFile = new File(des);
		
		try (//选择流 
				InputStream  is = new BufferedInputStream(new FileInputStream(file));
				OutputStream os = new BufferedOutputStream(new FileOutputStream(destFile,true));){
			
			byte[]  b = new byte[1024];
			int len = -1;
			while((len=is.read(b))!=-1){
				//二、写入数据	
				os.write(b,0,len);
			}
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		myCopy("JDKAPI.zip", "JDK-copy.zip");
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
		long t3 = System.currentTimeMillis();
		myBufferedCopy("JDKAPI.zip", "JDK-copy.zip");
		long t4 = System.currentTimeMillis();
		System.out.println(t4-t3);
		
		}
}
