package thinking.char18.io1;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
@author sgc
@version 2020年8月25日 下午9:48:04
@Description 
 **/
public class ZipDemo01 {
	public static void main(String[] args) {
		//zipFiles();
		unZip();
	}
	
	//压缩文件
	public static void  zipFile() {
		try(	FileInputStream fis = new FileInputStream("dest.txt");
				FileOutputStream fos = new FileOutputStream("cool.zip");
				//压缩流
				ZipOutputStream zos = new ZipOutputStream(fos);) {
		
			//放入下一个条目
			ZipEntry entry = new ZipEntry("dest111.txt");//压缩之后的名字
			zos.putNextEntry(entry);
			
			int len = -1;
			byte[] b = new byte[1024];
			while ((len=fis.read(b))!=-1) {
				zos.write(b,0,len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("压缩完毕");
	}
	
	//压缩多个文件
	public static void  zipFiles() {
		try{
			FileInputStream fis = new FileInputStream("dest.txt");
			FileOutputStream fos = new FileOutputStream("cool.zip");
			//压缩流
			ZipOutputStream zos = new ZipOutputStream(fos);
			//放入下一个条目
			ZipEntry entry = new ZipEntry("dest.txt");
			zos.putNextEntry(entry);
			int len = -1;
			byte[] b = new byte[1024];
			while ((len=fis.read(b))!=-1) {
				zos.write(b,0,len);
			}
            zos.closeEntry();
            fis.close();
			
			//放入第二个文件
			FileInputStream fis1 = new FileInputStream("cool.jpg");
			//放入下一个条目
			ZipEntry entry1 = new ZipEntry("cool.jpg");
			zos.putNextEntry(entry1);
			while ((len=fis1.read(b))!=-1) {
				zos.write(b,0,len);
			}
            zos.closeEntry();
            zos.close();
            fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("压缩完毕");
	}
	
	
	//解压缩
    public static void unZip() {
        try {
            ZipInputStream zis = new ZipInputStream(new FileInputStream("cool.zip"));
            ZipEntry entry = null;
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((entry = zis.getNextEntry()) != null) {
                FileOutputStream fos = new FileOutputStream("D:/unzip/" + entry.getName());
                while ((len = zis.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
            }
            zis.close();
            System.out.println("解压缩完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
