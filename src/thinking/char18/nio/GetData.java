package thinking.char18.nio;

import java.nio.ByteBuffer;

/**
@author sgc
@version 2020年9月2日 上午9:41:44
@Description 基本类型插入获取
rewind:重绕此缓冲区。将位置设置为 0 并丢弃标记
在一系列通道写入或获取 操作之前调用此方法（假定已经适当设置了限制）。例如： 
 out.write(buf);    // Write remaining data
 buf.rewind();      // Rewind buffer
 buf.get(array);    // Copy data into array
 **/
public class GetData {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(1024);

        int i = 0;
        //limit是可以读写的边界，当position到达limit时，
        //就表示将ByteBuffer中的内容读完，或者将ByteBuffer写满了。
        while(i++ < bb.limit()){
            if(bb.get() != 0){
                System.out.println("nonzero");
            }
        }
        System.out.println("i= " + i);
        bb.rewind();
        // 存储和读取一个字符数组
        bb.asCharBuffer().put("Howdy!");
        char c;
        while ((c = bb.getChar()) != 0){
            System.out.print(c + " ");
        }
        bb.rewind();

        // 存储和读取short
        bb.asShortBuffer().put((short)471142);
        System.out.println(bb.getShort());
        bb.rewind();

        // 存储和读取int
        bb.asIntBuffer().put(99471142);
        System.out.println(bb.getInt());
        bb.rewind();

        // 存储和读取long
        bb.asLongBuffer().put(99471142);
        System.out.println(bb.getLong());
        bb.rewind();

        // 存储和读取float
        bb.asFloatBuffer().put(99471142);
        System.out.println(bb.getFloat());
        bb.rewind();

        // 存储和读取double
        bb.asDoubleBuffer().put(99471142);
        System.out.println(bb.getDouble());
        bb.rewind();
    }
}
