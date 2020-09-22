package thinking.char18.nio;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
@author sgc
@version 2020年9月2日 上午10:01:21
@Description 
Buffer类一共有四个变量，被称之为状态变量
    capacity：容量，必须初始化的值（因为底层是数组）
    limit：上界，缓冲区的临界区，即最多可读到哪个位置
    position：下标，当前读取到的位置(例如当前读出第5个元素，则读完后，position为6)
    mark：标记，备忘位置
	flip( ) 将lim设置为pos,再将pos设置到开始（0）。read()之后要调用flip()，因为read之后pos再数据末尾，
			flip之后读取范围就是pos到lim,不会超过缓冲器存有数据的范围。
	clean（）将pos设置 为0，limit设置为缓冲器大小capacity。write之后要调用clean（）这相当于清空了缓冲器，	
			可以从头开始写入数据，当前位置有数据会直接覆盖。
	rewind( ) 间pos设置为0，其他不变，它可以重新获得数据。
	remaining( ) 返回 lim - pos 结果，-1 说明操作文件数据到了末尾。也可使用 hasRemaining( )
 **/
public class IntBuffDemo {
	 private static final int BSIZE = 1024;

	    public static void main(String[] args) {
	        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
	        IntBuffer ib = bb.asIntBuffer();
	        // 保存int数组
	        ib.put(new int[]{10, 20, 1, 4, 41});
	        System.out.println(ib.get(2));
	        ib.put(3, 1231);

	        ib.flip();
	        while (ib.hasRemaining()){
	            int i = ib.get();
	            System.out.println(i);
	        }
	    }
}
