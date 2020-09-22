package question.char18;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.io.FileUtils;

/**
@author sgc
@version 2020年9月2日 下午3:34:05
@Description 
 **/
public class Test {
	public static void main(String[] args) {
		//文件上传
		FileService.upFile("C:/Users/11388/Pictures/idea_bg.jpg", "idea_bg_copy.jpg");
		//文件下载
		FileService.downFile("https://dss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2909143767,3737099215&fm=26&gp=0.jpg","download/down1.jpg");
		//md5校验
		FileService.getFileMd5("download/down1.jpg");
		//压缩传输
		FileService.transferZip("D:/filedemo/demo1/2Pro.pdf",
				"D:/filedemo/demo1/2Pro.zip","D:/filedemo/demo1/a/2Pro.zip");
	}
}

class FileService{
	
	//文件上传
	public static void upFile(String s1,String s2) {
		try {
			FileUtils.copyFileToDirectory(new File(s1),new File("uploads"));
			System.out.println("上传成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//文件下载
	public static void downFile(String s1,String s2) {
		try {
			FileUtils.copyURLToFile(new URL(s1),new File(s2));
			System.out.println("下载成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//md5校验 传入文件
	public static String getFileMd5(String src) {
		String md5 = null; 
		try {
			md5 = new Md5Utils().getFileMd5(src);		
			System.out.println("md5校验码--》"+md5);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return md5;
	}
	
	//传输压缩
	public static void transferZip(String src,String zipDest,String transDest) {
		new ZipUtil().zipFile(src,zipDest);
		try {
			FileUtils.copyFile(new File(zipDest),new File(transDest));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}