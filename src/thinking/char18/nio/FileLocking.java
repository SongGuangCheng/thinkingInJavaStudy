package thinking.char18.nio;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
@author sgc
@version 2020年9月2日 上午10:35:00
@Description 对文件进行加锁操作，防止其他线程访问该文件
通过调用FileChannel的tryLock()或者lock()来获取整个文件的FileLock，tryLock是非阻塞的拿不到锁就返回，
lock（）是阻塞式的直到拿到锁才返回。没有参数则对整个文件加锁，哪怕加锁后文件变大如此。
FileLock.release()可以释放锁，或者关闭通道或者lock线程中断都可以释放锁。
 **/
public class FileLocking {
	 public static void main(String[] args) throws Exception {
		    FileOutputStream fos= new FileOutputStream("file.txt");
		    FileLock fl = fos.getChannel().tryLock();
		    if(fl != null) {
		      System.out.println("Locked File");
		      TimeUnit.MILLISECONDS.sleep(100);
		      fl.release();
		      System.out.println("Released Lock");
		    }
		    fos.close();
		  }
}
