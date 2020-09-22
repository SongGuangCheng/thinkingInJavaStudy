package thinking.char18.io1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

import javax.imageio.stream.FileImageInputStream;

/**
@author sgc
@version 2020年8月24日 上午11:14:32
@Description 对象流
1.写出后读取
2.读取顺序要与写出顺序一致
3.不是所有的对象都可以序列化Serializable
 **/
public class ObjectTest02 {
	public static void main(String[] args) throws IOException, Exception {
		//写出到文件
		ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("obj.txt")));
		oos.writeUTF("一剑霜寒十四州");
		oos.writeInt(18);
		oos.writeDouble(11.1);
		//对象
		oos.writeObject("满堂花醉三千客");
		oos.writeObject(new Date());
		oos.writeObject(new Employee("马云", 500.0));
		oos.flush();
		oos.close();
		//读取到文件
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("obj.txt")));
		String msg = ois.readUTF();
		int i = ois.readInt();
		double d = ois.readDouble();
		Object o = ois.readObject();
		Object date = ois.readObject();
		Object emp = ois.readObject();
		if(o instanceof String){
			String strObj = (String)o;
			System.out.println(o);
		}
		if(date instanceof Date){
			Date dateObj = (Date)date;		
			System.out.println(date);		
		}
		if(emp instanceof Employee){
			Employee empObj = (Employee)emp;
			System.out.println(empObj.getName()+"==>"+empObj.getSalary());
		}
		ois.close();
	}
}
