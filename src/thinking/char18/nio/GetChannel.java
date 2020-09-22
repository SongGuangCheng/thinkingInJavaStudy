package thinking.char18.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
@author sgc
@version 2020年8月31日 上午11:08:43
@Description 获取通道
 **/
public class GetChannel {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws IOException {
		FileChannel fc = new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text ".getBytes()));
		fc.close();
		fc = new RandomAccessFile("data.txt","rw").getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap("Some more ".getBytes()));
		fc.close();
		
		fc = new FileInputStream("data.txt").getChannel();
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		fc.read(bb);
		bb.flip();
		while (bb.hasRemaining()) {
			System.out.print((char)bb.get());
		}
	}
}
