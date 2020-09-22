package thinking.char18.file;

import java.io.File;

/**
@author sgc
@version 2020年8月22日 上午11:01:00
@Description 递归打印目录
 **/
public class DriDemo01 {
	public static void main(String[] args) {
		File file = new File("E:/kaifatools/eclipse/eclipse-jdk-tomcat/eclipse-jee-luna/workspace/IOStudy");
		printName(file);
		
		
	}
	
	public static void printName(File file) {
		if(null==file||!file.exists()){
			return;
		}else {
			if(file.isDirectory()){
				for (File src : file.listFiles()) {
					printName(src);;
				}
			}else {
				System.out.println(file.getName());
			}
		}
		
	}
}
