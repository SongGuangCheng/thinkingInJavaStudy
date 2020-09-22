package thinking.char18.io1;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.print.attribute.SetOfIntegerSyntax;

/**
@author sgc
@version 2020年8月24日 下午2:25:05
@Description 打印流
 **/
public class PrintTest01_printStream {
	public static void main(String[] args) throws IOException {
		//打印流System.out
		PrintStream ps = System.out;
		ps.print("hello");
		ps.print(9527);
		
		ps = new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream("print.txt")),true);//设置true可以不用刷新
		ps.print("打印流");
		ps.print(8848);
		ps.close();
		
		//重定向输出端
		System.setOut(ps);
		System.out.println("输出到文件中了");
		//重定向回控制台
		System.setOut(new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("i am backing...");

	}
}
