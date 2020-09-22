package question.char18;

import java.io.*;


/**
@author sgc
@version 2020年8月25日 下午1:35:54
@Description 测试上面列出的流进行读写
 **/
public class Question2 {
	File file = new File("1.txt");
	File file1 = new File("2.txt");
	File file2 = new File("3.txt");
	public static void main(String[] args) {
		//new Question2().test1();
		//new Question2().test2();
		//new Question2().test3();
		//new Question2().test4();
		//new Question2().test5();
		new Question2().test6();
	}
	
	//测试BufferedInputStream嵌套FileInputStream
	public void test1()  {
		try(BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));) {
			byte[] b = new byte[1024];
			int len = -1;
			while ((len=is.read(b))!=-1) {
				System.out.println(new String(b,0,len));//指定读取个数 避免读出空格
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	//测试BufferedOutputStream嵌套FileOutputStream 
	public void test2()  {
		try(BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(file1,true));) {
			String s = "talk is cheap,show me the code";
			byte[] b = s.getBytes();
			os.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	//测试BufferedReader嵌套FileReader 可以使用BufferedReader的readLine按行读取
	public void test3()  {
		try(BufferedReader br = new BufferedReader(new FileReader(file));) {
			char[] c = new char[(int) file.length()];
			br.read(c);
			System.out.println(new String(c,0,c.length));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	//测试BufferedOutputStream嵌套FileOutputStream 
		public void test4()  {
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file1,true));) {
				bw.write("满堂花醉三千客");
				bw.newLine();
				bw.append("一剑霜寒十四州\n").append("可以继续追加");
				bw.flush();//注意需要刷新 不然默认长度达不到 写入不进去
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		//测试转换输入流 InputStreamReader以字符流的形式操作字节流（纯文本）
		public void test5()  {
			try(BufferedReader is = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(file)));) {
				char[] c = new char[(int) file.length()];
				String len = null;
				while ((len=is.readLine())!=null) {
					System.out.println(len);//指定读取个数 避免读出空格
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		//测试转换输出流 InputStreamReader以字符流的形式操作字节流（纯文本）
				public void test6()  {
					try(BufferedWriter bw = new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream(file1)));) {
						bw.write("以字符流的形式操作字节流");
						bw.newLine();
						bw.append("注意使用flush强制刷新");
						bw.flush();
					} catch (IOException e) {
						e.printStackTrace();
					}	
				}
}
