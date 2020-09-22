package thinking.char18.nio;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
@author sgc
@version 2020年9月2日 上午10:26:50
@Description 内存映射文件:
可以创建和操作那些太大而不能放入内存的文件。
获得通道后调用map() 产生MappedByteBuffer,
这是一个特殊的直接缓冲器它是继承自ByteBuffer，有ByteBuffer所有方法。
可以像使用ByteBuffer一样使用它，只不过一般用它来映射大文件
map（）方法必须指定映射文件的开始位置和长度。
 **/
public class LargeMappedFiles {
	  static int length = 0x8FFFFFF; // 128 MB
	  public static void main(String[] args) throws Exception {
	    MappedByteBuffer out =
	      new RandomAccessFile("test.dat", "rw").getChannel()
	      .map(FileChannel.MapMode.READ_WRITE, 0, length);
	    for(int i = 0; i < length; i++)
	      out.put((byte)'x');
	    System.out.print("Finished writing");
	    for(int i = length/2; i < length/2 + 6; i++)
	      System.out.println((char)out.get(i));
	  }
}