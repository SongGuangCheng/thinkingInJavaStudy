package thinking.char18.io;

import java.io.*;

/**
 * @author sgc
 * @version 2020年8月22日 下午4:59:09
 * @Description 1.图片读取到字节数组 2.字节数组写到文件
 **/
public class IOStudy08 {
	public static void main(String[] args) {
		byte[] datas = fileToByteArray("cool.jpg");
		System.out.println(datas.length);
		byteArrayToFile(datas,"NewCool.jpg");
	}
	// 1.图片读取到字节数组
	public static byte[] fileToByteArray(String src) {

		// 1、创建源
		File file = new File(src);
		byte[] src1 = null;
		// 2、选择流
		InputStream is = null;
		ByteArrayOutputStream os = null;
		byte[] b = null;
		try {
			is = new FileInputStream(file);
			os = new ByteArrayOutputStream();
			// 3、操作——读取
			b = new byte[(int) file.length()];
			is.read(b);
			os.write(b);
			src1 = os.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			// 4.释放资源
			try {
				if (is != null) {
					os.close();
					is.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return src1;
	}
	
	//2.将字符数组放到文件
	public static void byteArrayToFile(byte[] src,String filePath) {


		File file = new File(filePath);
		
		OutputStream os = null;
		try {
			os = new FileOutputStream(file,true);
			os.write(src);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=os){
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	
		
	
	}
}
