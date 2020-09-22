package thinking.char18.io;

import java.io.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
@author sgc
@version 2020年8月22日 下午4:24:06
@Description 字节数组输出流
1.创建源 不用创建源 可以用toByteArray方法获取
2.选择流 注意要使用子类自己的方法 不能用接口定义  不关联源
3.操作
4.释放资源 字节数组流 可以不释放 由gc处理
 **/
public class IOStudy07_CharArrayOS {
	public static void main(String[] args) {
		//1.创建源 通过字节数组输出流toByteArray方法获取
		byte[] src = null;
		//2.选择流
		ByteArrayOutputStream os = null;//
		try {
			os = new ByteArrayOutputStream();
			//3.操作
			String msg = "show me the code";
			byte[] b = msg.getBytes();//字符串==》字节数组（编码）
			os.write(b);
			src = os.toByteArray();
			System.out.println(new String(src));
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//4.释放资源 字节数组流 可以不释放 由gc处理
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
