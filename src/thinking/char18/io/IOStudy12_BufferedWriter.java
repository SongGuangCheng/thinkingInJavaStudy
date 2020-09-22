package thinking.char18.io;

import java.io.*;

/**
@author sgc
@version 2020年8月22日 下午3:59:17
@Description 字符输入流
 **/
public class IOStudy12_BufferedWriter {
	public static void main(String[] args) {
		File file = new File("destWriter");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			String msg = "满堂花醉三千客\n";
			char[] c = new char[(int) file.length()];
			c = msg.toCharArray();
			//三种写入方式
			writer.write(c);
			writer.write("一剑霜寒十四州");
			writer.newLine();//换行
			writer.append("卢本伟").append("牛逼");
			writer.flush();
			//System.out.println(new String(c,0,c.length));
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=writer){
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	
		}
		
	}
}
