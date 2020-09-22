package thinking.char18.io1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
@author sgc
@version 2020年8月24日 上午11:14:32
@Description 数据流
1.写出后读取
2.读取顺序要与写出顺序一致
 **/
public class DataTest {
	public static void main(String[] args) throws IOException {
		//写出
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(bos));
		dos.writeUTF("一剑霜寒十四州");
		dos.writeInt(18);
		dos.writeDouble(11.1);
		dos.flush();
		byte[] datas = bos.toByteArray();//任何类型都可以转字节数组
		//读取
		ByteArrayInputStream bis = new ByteArrayInputStream(datas);
		DataInputStream dis = new DataInputStream(new BufferedInputStream(bis));
		String msg = dis.readUTF();
		int i = dis.readInt();
		double d = dis.readDouble();
		System.out.println(msg);
	}
}
