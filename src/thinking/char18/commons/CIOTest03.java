package thinking.char18.commons;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
@author sgc
@version 2020年8月24日 下午3:45:07
@Description 读取文件
 **/
public class CIOTest03 {
	public static void main(String[] args) throws IOException {
		//读取文件
		String msg = FileUtils.readFileToString(new File("dest1.txt"),"UTF-8");
		System.out.println(msg);
		byte[] bs = FileUtils.readFileToByteArray(new File("dest.txt"));
		System.out.println(bs.length);
		
		//逐行读取
		List<String> lines = FileUtils.readLines(new File("IOTest"),"UTF-8");
		for (String string : lines) {
			System.out.println(string);
		}
	}
}
