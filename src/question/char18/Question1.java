package question.char18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
@author sgc
@version 2020年8月22日 下午3:54:12
@Description 1）按照行进行读取文件并存储到List容器中
采用BufferedReader的readLine方法
 **/
public class Question1 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("1.txt")));
		String len;
		List<String> list = new ArrayList<String>();
		while ((len=reader.readLine())!=null) {
			list.add(len);
		}
		for (String string : list) {
			System.out.println(string);
		}
		reader.close();
	}
}
