package question.lastweek;

import java.io.UnsupportedEncodingException;

/**
@author sgc
@version 2020年9月4日 下午3:51:32
@Description 字符串- GBK编码 - U8解码 - U8 编码 -GBk解码
 **/
public class Question01 {
	public static void main(String[] args) throws Exception {
		String string = "你好";
		byte[] bytes = string.getBytes("GBK");//GBK编码
		String string2 = new String(bytes,"UTF-8");//U8解码
		System.out.println(string2);
		byte[] bytes2 = string2.getBytes("UTF-8");//U8 编码
		String string3 = new String(bytes2,"GBK");//GBk解码
		System.out.println(string3);
	}
}
