package thinking.char18.commons;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
@author sgc
@version 2020年8月24日 下午3:57:33
@Description 写出文件
 **/
public class CIOTest04 {
	public static void main(String[] args) throws IOException {
		//写出文件
		FileUtils.write(new File("dest.txt"), "于杀戮之中盛放","UTF-8");
		FileUtils.writeStringToFile(new File("dest.txt"), "亦如黎明中的花朵\r\n","UTF-8");
		FileUtils.writeByteArrayToFile(new File("dest.txt"),"我是你爸爸\r\n".getBytes("UTF-8"),true);
		//写出列表
		List<String> data =  new ArrayList<String>();
		data.add("tom");
		data.add("jackma");
		data.add("crush");
		FileUtils.writeLines(new File("dest.txt"), data,"---",true);
	}
}
