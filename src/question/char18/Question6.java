package question.char18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
@author sgc
@version 2020年8月25日 下午4:50:58
@Description 6）从网上下载一个文件(歌曲，文档)
 **/
public class Question6 {
	public static void main(String[] args) {
		//String url = "https://physics.nankai.edu.cn/_upload/article/files/f1/69/c61a06c54f02b1cad416e2809b8d/276747a1-a4e1-442a-a78b-30e70f8e63fb.pdf" ;
//		downLoad(url,"downloadPDF.pdf");
		//downLoad1(url,"downloadPDF1.pdf");
		String url = "http://music.163.com/song/media/outer/url?id=316277";
		downLoad1(url, "D:/ioTest/1.mp3");
	}
	
	//利用FIleUtils工具类下载
	public static void downLoad(String url,String dest) {
		try {
			FileUtils.copyURLToFile(new URL(url), new File(dest));
			System.out.println("下载完成");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//原生下载
	public static void downLoad1(String url,String dest) {
	
		try(BufferedInputStream is = new BufferedInputStream(
				new URL(url).openStream());
				BufferedOutputStream os = new BufferedOutputStream(
						new FileOutputStream(new File(dest)));) {
			byte[] b = new byte[1024];
			int len = -1;
			while ((len=is.read(b))!=-1) {
				os.write(b);
			}
			System.out.println("下载完成");
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
}




