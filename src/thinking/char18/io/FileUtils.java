package thinking.char18.io;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
@author sgc
@version 2020年8月22日 下午5:37:16
@Description 
 **/
public class FileUtils {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("dest.txt");
			OutputStream os = new FileOutputStream("dest-copy.txt");
			myCopy(is,os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void myCopy(InputStream is,OutputStream os) {
		try {
			byte[]  b = new byte[1024];
			int len = -1;
			while((len=is.read(b))!=-1){
				os.write(b,0,len);
			}
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			close(is,os);
		}
		
	
	}
	
	
	public static void close(Closeable... ios) {
		for (Closeable c : ios) {
			try {
				c.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
