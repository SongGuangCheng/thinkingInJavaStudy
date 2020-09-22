package question.char18;

import java.io.*;

import org.apache.commons.io.FileUtils;


/**
@author sgc
@version 2020年8月25日 下午2:39:42
@Description 3）把文件从一个位置复制到另一个位置，
并说明IO流处理时标准的异常处理方法 try catch finally
4)写一个字符流与字节流复制文件的方法，体验不同之处:
   1.字节流不需要刷新缓冲区，字符流需要刷新缓冲区
   2.字节流可以复制图片，字符流无法复制图片
 **/
public class Question3 {
	public static void main(String[] args) throws IOException {
		copy1("cool.jpg", "cool-copy1..jpg");
		copy2("cool.jpg", "cool-copy2..jpg");
		//直接用工具类复制
		FileUtils.copyFile(new File("cool.jpg"), new File("cool1.jpg"));
	}
	
	//以字节方式复制
	public static void copy1(String src,String dest) {
		try(BufferedInputStream is = new BufferedInputStream(
				new FileInputStream(new File(src)));
				BufferedOutputStream os = new BufferedOutputStream(
						new FileOutputStream(new File(dest)));) {
			byte[] b = new byte[1024];
			int len = -1;
			while ((len=is.read(b))!=-1) {
				//System.out.println(new String(b,0,len));//指定读取个数 避免读出空格
				os.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	//以字符方式复制
	public static void  copy2(String src,String dest) {
		try(BufferedReader br = new BufferedReader(
				new FileReader(new File(src)));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(new File(dest),true));) {
			String len = null;
			while ((len=br.readLine())!=null) {
				bw.write(len);	
			}
			bw.flush();;
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	
}
