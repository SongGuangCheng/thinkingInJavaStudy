package thinking.char18.io1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
@author sgc
@version 2020年8月24日 下午2:49:17
@Description 
 **/
public class RandTest01 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(
				new File("src/sgc/io1/RandTest01.java"), "r");
		//随机读取  从ckage sgc.io1;开始读取
		raf.seek(2);
		//读取
		byte[] b = new byte[1024];
		int len = -1;
		while ((len=raf.read(b))!=-1) {
			System.out.println(new String(b,0,b.length));
		}
		raf.close();
	}
}
