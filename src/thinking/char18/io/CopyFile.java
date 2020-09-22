package thinking.char18.io;

import java.io.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
@author sgc
@version 2020年8月22日 下午3:09:17
@Description 复制一个文件 将读写合二为一
try（定义流）{}catch（）{} 可以自动关闭流
 **/
public class CopyFile {
	public void myCopy(String source,String des) {

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
	public void myBufferedCopy(String source,String des) {

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
		
		//复制txt
		public void myCopyTxt(String source,String des) {

			//创建源
			File file = new File(source);
			File destFile = new File(des);
			
			try (//选择流 
					BufferedReader  is = new BufferedReader(new FileReader(file));
					BufferedWriter os = new BufferedWriter(new FileWriter(destFile,true));){
				String next = null;
				while((next=is.readLine())!=null){
					//二、写入数据	
					os.write(next);
					os.newLine();
				}
				os.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		new CopyFile().myCopy("JDKAPI.zip", "JDK-copy.zip");
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
		long t3 = System.currentTimeMillis();
		new CopyFile().myBufferedCopy("JDKAPI.zip", "JDK-copy.zip");
		long t4 = System.currentTimeMillis();
		System.out.println(t4-t3);
		
		}
}
