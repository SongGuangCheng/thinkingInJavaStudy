package question.char18;

import java.io.*;

/**
@author sgc
@version 2020年8月25日 下午6:01:41
@Description 比较inputstream与bufferedinputstream的不同，哪种效率高
 **/
/**
 * @author 11388
 *
 */
public class Question7 {
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		TestInputStream("1.txt");
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
		
		long t3 = System.currentTimeMillis();
		TestBufferInputStream("1.txt");
		long t4 = System.currentTimeMillis();
		System.out.println(t4-t3);
	}
	
	public static void TestInputStream(String url) {
		try (InputStream is = new FileInputStream(new File(url))){
					
					for (int i = 0; i < 100000; i++) {
						is.read();
					}				
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
	
	
	public static void TestBufferInputStream(String src) {
		try(BufferedInputStream is = new BufferedInputStream(
				new FileInputStream(new File(src)));) {
			byte[] b = new byte[2];
			for (int i = 0;i<100000;i++) {
				is.read(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	
	}
	
	
}
