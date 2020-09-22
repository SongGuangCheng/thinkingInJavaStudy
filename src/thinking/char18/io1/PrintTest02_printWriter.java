package thinking.char18.io1;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.print.attribute.SetOfIntegerSyntax;

/**
@author sgc
@version 2020年8月24日 下午2:25:05
@Description 打印流 printWriter
 **/
public class PrintTest02_printWriter {
	public static void main(String[] args) throws IOException {
		//打印流System.out
		PrintWriter pw = new PrintWriter(
				new BufferedOutputStream(
						new FileOutputStream("print.txt")),true);//设置true可以不用刷新
		pw.print("打印流");
		pw.print(8848);
		pw.close();
	}
}
