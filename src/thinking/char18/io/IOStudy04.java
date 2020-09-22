package thinking.char18.io;

import java.io.*;

/**
@author sgc
@version 2020年8月22日 下午3:59:17
@Description 字符输入流
 **/
public class IOStudy04 {
	public static void main(String[] args) {
		File file = new File("IOTest");
		Reader reader = null;
		try {
			reader = new FileReader(file);
			char[] c = new char[(int) file.length()];
			reader.read(c,0,c.length);
			System.out.println(new String(c,0,c.length));
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=reader){
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		}
		
	}
}
