package thinking.char18.work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
@author sgc
@version 2020年8月25日 下午3:10:57
@Description 写一个校验文件md5的工具类
 **/
public class Md5Utils {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		/*String s = "hello world";
		System.out.println(getMd5(s));*/
		System.out.println(getFileMd5("1.txt"));
	}
	
	//获取字符串md5加密
	public static String getMd5(String source) throws NoSuchAlgorithmException {
		//1.获取MessageDigest对象
		MessageDigest digest = MessageDigest.getInstance("md5");
		//2.执行加密操作
		byte[] bytes = source.getBytes();
		//在md5算法这 得到的目标字节数组的特点：长度固定为16  
		//获得密文
		byte[] targetBytes = digest.digest(bytes);
		//3.声明字符数组
        char [] characters = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //4.遍历targetBytes
        StringBuilder builder = new StringBuilder();
        // 把密文转换成十六进制的字符串形式
        for (byte b : targetBytes) {
			//5.取出b的高四位的值
        	//先把高四位通过右移操作移到低四位
        	int high = (b >> 4) & 15;
            //6.取出b的低四位的值
            int low = b & 15;
            //7.以high为下标从characters中取出对应的十六进制字符
            char highChar = characters[high];
            //8.以low为下标从characters中取出对应的十六进制字符
            char lowChar = characters[low];

            builder.append(highChar).append(lowChar);
		}
		return builder.toString();
	}
	
	//获取文件md5加密
	public static String getFileMd5(String src) throws NoSuchAlgorithmException {
		//0.获取文件内容
		File file = new File(src);
		String source = null;
		try(BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));) {
			byte[] b = new byte[(int) file.length()];
			is.read(b);
			source = new String(b);
			//System.out.println(source);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		//1.获取MessageDigest对象
		MessageDigest digest = MessageDigest.getInstance("md5");
		//2.执行加密操作
		byte[] bytes = source.getBytes();
		//在md5算法这 得到的目标字节数组的特点：长度固定为16  
		//获得密文
		byte[] targetBytes = digest.digest(bytes);
		//3.声明字符数组
        char [] characters = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //4.遍历targetBytes
        StringBuilder builder = new StringBuilder();
        // 把密文转换成十六进制的字符串形式
        for (byte b : targetBytes) {
			//5.取出b的高四位的值
        	//先把高四位通过右移操作移到低四位
        	int high = (b >> 4) & 15;
            //6.取出b的低四位的值
            int low = b & 15;
            //7.以high为下标从characters中取出对应的十六进制字符
            char highChar = characters[high];
            //8.以low为下标从characters中取出对应的十六进制字符
            char lowChar = characters[low];

            builder.append(highChar).append(lowChar);
		}
		return builder.toString();
	}


}
