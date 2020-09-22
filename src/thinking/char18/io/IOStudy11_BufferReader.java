package thinking.char18.io;

import java.io.*;

/**
@author sgc
@version 2020年8月22日 下午3:59:17
@Description 字符缓冲流 注意存在新增方法readline 不要用多态定义
 **/
public class IOStudy11_BufferReader {
	public static void main(String[] args) {
		File file = new File("IOTest");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line=reader.readLine())!=null){
				System.out.println(line);
			}
			
			
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
