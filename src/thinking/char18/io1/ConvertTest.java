package thinking.char18.io1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
@author sgc
@version 2020年8月24日 上午10:25:49
@Description 转换流 inputstreamReader outputStreamWriter
作用：1.以字符流的形式操作字节流（纯文本）
2.指定字符集
 **/
public class ConvertTest {
	public static void main(String[] args) {
		//操作System.in System.out 	
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))){
			String msg = "";
			while (!msg.equals("exit")) {			
				msg = reader.readLine();//循环读取
				writer.write(msg);//循环写出
				writer.newLine();
				writer.flush();//强制刷新 不然但不到默认缓冲大小 无法写出
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
