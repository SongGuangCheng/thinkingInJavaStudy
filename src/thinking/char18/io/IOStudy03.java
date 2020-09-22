package thinking.char18.io;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
@author sgc
@version 2020年8月22日 下午2:54:13
@Description 
 **/
public class IOStudy03 {
	public static void main(String[] args) {
		File file = new File("dest.txt");
		
		OutputStream os = null;
		try {
			os = new FileOutputStream(file,true);
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
