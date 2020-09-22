package thinking.char18.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
@author sgc
@version 2020年8月31日 上午11:19:01
@Description 转化数据
 **/
public class BufferToText {
	 private static final int BSIZE = 1024;

	    public static void main(String[] args) throws IOException {
	        FileChannel fc = new FileOutputStream("data2.txt").getChannel();
	        fc.write(ByteBuffer.wrap("Some text".getBytes()));
	        fc.close();

	        fc = new FileInputStream("data2.txt").getChannel();
	        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
	        fc.read(buff);
	        buff.flip();
	        // 不起效
	        System.out.println("第一次：" + buff.asCharBuffer());

	        /**
	          * 用系统默认编码进行解码
	          */
	        buff.rewind();
	        String encoding = System.getProperty("file.encoding");
	        System.out.println("第二次：" + "Decoded using " + encoding 
	        		+ ": " + Charset.forName(encoding).decode(buff));


	        /**
	         *  在写入时 对将要写入的内容进行编码
	         */
	        fc = new FileOutputStream("data2.txt").getChannel();
	        fc.write(ByteBuffer.wrap("Some Text ".getBytes("UTF-16BE")));
	        //byteBuffer.asCharBuffer()  默认以 UTF-16BE 来编码 
	        fc.close();

	        // 重新读取
	        fc = new FileInputStream("data.txt").getChannel();
	        buff.clear();
	        fc.read(buff);
	        buff.flip();
	        System.out.println("第三次：" + buff.asCharBuffer());

	        /**
	         *  使用buff.asCharBuffer().put 写入
	         */
	        // 使用CharBuffer 写入
	        fc = new FileOutputStream("data2.txt").getChannel();
	        buff = ByteBuffer.allocate(24);
	        buff.asCharBuffer().put("Some text");
	        fc.write(buff);
	        fc.close();

	        fc = new FileInputStream("data2.txt").getChannel();
	        buff.clear();
	        fc.read(buff);
	        buff.flip();
	        System.out.println("第四次：" + buff.asCharBuffer());
	    }
}
