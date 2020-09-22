package thinking.char18.io1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
@author sgc
@version 2020年8月24日 上午10:51:40
@Description 
 **/
public class ConvertTest02 {
	public static void main(String[] args) {
		try(BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));
				BufferedWriter writer = 
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("baidu.html")));) {
			String msg;
			while ((msg=reader.readLine())!=null) {
				//System.out.println(msg);
				writer.write(msg);
				writer.newLine();
			}
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
