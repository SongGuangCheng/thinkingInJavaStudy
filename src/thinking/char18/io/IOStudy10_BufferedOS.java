package thinking.char18.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
@author sgc
@version 2020年8月24日 上午9:22:19
@Description 
 **/
public class IOStudy10_BufferedOS {
	public static void main(String[] args) {
		File file = new File("dest.txt");
		
		OutputStream os = null;
		try {
			os = new BufferedOutputStream(new FileOutputStream(file,true));
			String text = "java is number one";
			byte[] b = text.getBytes();
			os.write(b);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=os){
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
