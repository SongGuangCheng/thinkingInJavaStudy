package thinking.char18.commons;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
@author sgc
@version 2020年8月24日 下午3:23:04
@Description 
 **/
public class CIOTest01 {
	public static void main(String[] args) {
		//目录大小
		long len = FileUtils.sizeOf(new File("E:/kaifatools/eclipse/eclipse-jdk-tomcat/eclipse-jee-luna/workspace/IOStudy"));
		System.out.println(len);
		//文件大小
		len = FileUtils.sizeOf(new File("src/sgc/commons/CIOTest01.java"));
		System.out.println(len);
	}
}
