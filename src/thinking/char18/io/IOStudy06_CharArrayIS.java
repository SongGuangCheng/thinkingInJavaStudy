package thinking.char18.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
@author sgc
@version 2020年8月22日 下午4:24:06
@Description 字节数组输入流
1.创建源 
2.选择流
3.操作
4.释放资源 字节数组流 可以不释放 由gc处理
 **/
public class IOStudy06_CharArrayIS {
	public static void main(String[] args) {
		//1.创建源
		byte[] src = "talk is cheap show me the code".getBytes();
		//2.选择流
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(src);
			//3.操作
			byte[] flush = new byte[3];//每次读取三个字节
			int temp = -1;
			while((temp=is.read(flush))!=-1){
				System.out.println(new String(flush));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//4.释放资源 字节数组流 可以不释放 由gc处理
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
